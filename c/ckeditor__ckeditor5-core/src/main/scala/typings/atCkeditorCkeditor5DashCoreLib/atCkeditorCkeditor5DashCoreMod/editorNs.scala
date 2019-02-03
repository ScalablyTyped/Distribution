package typings
package atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "editor")
@js.native
object editorNs extends js.Object {
  // core/editor/editor
  @js.native
  class Editor ()
    extends atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Observable {
    def this(config: js.Object) = this()
    val commands: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.CommandCollection = js.native
    val config: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Config = js.native
    val conversion: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.conversionNs.Conversion = js.native
    val data: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.controllerNs.DataController = js.native
    val editing: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.controllerNs.EditingController = js.native
    var isReadOnly: scala.Boolean = js.native
    val keystrokes: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.EditingKeystrokeHandler = js.native
    val locale: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Locale = js.native
    val model: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Model = js.native
    val plugins: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.PluginCollection[atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.Plugin[_]] = js.native
    var state: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreLibStrings.initializing | atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreLibStrings.ready | atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreLibStrings.destroyed = js.native
    def destroy(): js.Promise[scala.Unit] = js.native
    def execute(commandName: java.lang.String, commandParams: js.Any*): scala.Unit = js.native
    def initPlugins(): js.Promise[scala.Unit] = js.native
    def t(str: java.lang.String): java.lang.String = js.native
    def t(str: java.lang.String, values: js.Array[java.lang.String]): java.lang.String = js.native
  }
  
  // core/editor/editorconfig
  trait EditorConfig extends js.Object {
    var alignment: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.AlignmentConfig
    var autosave: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.AutosaveConfig
    var balloonToolbar: js.Array[java.lang.String]
    var blockToolbar: js.Array[java.lang.String]
    var ckfinder: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.CKFinderAdapterConfig
    var cloudServices: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.CloudServicesConfig
    var fontFamily: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.FontFamilyConfig
    var fontSize: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.FontSizeConfig
    var heading: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.HeadingConfig
    var highlight: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.HighlightConfig
    var image: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.ImageConfig
    var language: java.lang.String
    var mediaEmbed: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.MediaEmbedConfig
    var plugins: js.Array[
        java.lang.String | atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.Plugin[scala.Unit]
      ]
    var removePlugins: js.Array[java.lang.String]
    var toolbar: js.Array[java.lang.String] | atCkeditorCkeditor5DashCoreLib.Anon_Items
    var typing: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.TypingConfig
  }
  
  // core/editor/editorui
  @js.native
  class EditorUI protected ()
    extends atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Emitter {
    def this(editor: Editor, view: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.EditorUIView) = this()
    val componentFactory: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.ComponentFactory = js.native
    val editor: Editor = js.native
    val focusTracker: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.FocusTracker = js.native
    val view: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.EditorUIView = js.native
    def destroy(): scala.Unit = js.native
    def update(): scala.Unit = js.native
  }
  
  // core/editor/editorwithui
  trait EditorWithUI extends js.Object {
    val element: stdLib.HTMLElement | scala.Null
    val ui: EditorUI
  }
  
  /* static members */
  @js.native
  object Editor extends js.Object {
    var builtinPlugins: js.Array[atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.Plugin[_]] = js.native
    var defaultConfig: js.Object = js.native
    def create(config: js.Object): js.Promise[_] = js.native
  }
  
  @JSName("utils")
  @js.native
  object utilsNs extends js.Object {
    trait DataApi extends js.Object {
      def getData(): java.lang.String
      def setData(data: java.lang.String): scala.Unit
    }
    
    trait ElementApi extends js.Object {
      val sourceElement: stdLib.HTMLElement
      def updateSourceElement(): scala.Unit
    }
    
    // core/editor/utils/dataapimixin
    val DataApiMixin: DataApi = js.native
    // core/editor/utils/elementapimixin
    val ElementApiMixin: ElementApi = js.native
    // core/editor/utils/attachtoform
    def attachToForm(
      editor: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.editorNs.Editor with ElementApi
    ): scala.Unit = js.native
  }
  
}

