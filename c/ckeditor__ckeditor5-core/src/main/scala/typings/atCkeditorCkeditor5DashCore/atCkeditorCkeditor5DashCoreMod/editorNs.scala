package typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod

import typings.atCkeditorCkeditor5DashCore.Anon_Items
import typings.atCkeditorCkeditor5DashCore.Anon_Priority
import typings.atCkeditorCkeditor5DashCore.Anon_PriorityNumber
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.editorNs.Editor
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.editorNs.EditorUI
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.editorNs.utilsNs.DataApi
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.editorNs.utilsNs.ElementApi
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreStrings.destroyed
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreStrings.initializing
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreStrings.ready
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.controllerNs.DataController
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.controllerNs.EditingController
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.conversionNs.Conversion
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Model
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Config
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Emitter
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.FocusTracker
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Locale
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Observable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "editor")
@js.native
object editorNs extends js.Object {
  // core/editor/editor
  @js.native
  class Editor () extends Observable {
    def this(config: js.Object) = this()
    val commands: CommandCollection = js.native
    val config: Config = js.native
    val conversion: Conversion = js.native
    val data: DataController = js.native
    val editing: EditingController = js.native
    var isReadOnly: Boolean = js.native
    val keystrokes: EditingKeystrokeHandler = js.native
    val locale: Locale = js.native
    val model: Model = js.native
    val plugins: PluginCollection[Plugin[_]] = js.native
    var state: initializing | ready | destroyed = js.native
    def destroy(): js.Promise[Unit] = js.native
    def execute(commandName: String, commandParams: js.Any*): Unit = js.native
    def initPlugins(): js.Promise[Unit] = js.native
    def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Anon_Priority): Unit = js.native
    def on(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
    def once(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
    def t(str: String): String = js.native
    def t(str: String, values: js.Array[String]): String = js.native
  }
  
  // core/editor/editorconfig
  trait EditorConfig extends js.Object {
    var alignment: AlignmentConfig
    var autosave: AutosaveConfig
    var balloonToolbar: js.Array[String]
    var blockToolbar: js.Array[String]
    var ckfinder: CKFinderAdapterConfig
    var cloudServices: CloudServicesConfig
    var fontFamily: FontFamilyConfig
    var fontSize: FontSizeConfig
    var heading: HeadingConfig
    var highlight: HighlightConfig
    var image: ImageConfig
    var language: String
    var mediaEmbed: MediaEmbedConfig
    var plugins: js.Array[String | Plugin[Unit]]
    var removePlugins: js.Array[String]
    var toolbar: js.Array[String] | Anon_Items
    var typing: TypingConfig
  }
  
  // core/editor/editorui
  @js.native
  class EditorUI protected () extends Emitter {
    def this(editor: Editor, view: EditorUIView) = this()
    val componentFactory: ComponentFactory = js.native
    val editor: Editor = js.native
    val focusTracker: FocusTracker = js.native
    val view: EditorUIView = js.native
    def destroy(): Unit = js.native
    def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Anon_Priority): Unit = js.native
    def on(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
    def once(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
    def update(): Unit = js.native
  }
  
  // core/editor/editorwithui
  trait EditorWithUI extends js.Object {
    val element: HTMLElement | Null
    val ui: EditorUI
  }
  
  /* static members */
  @js.native
  object Editor extends js.Object {
    var builtinPlugins: js.Array[Plugin[_]] = js.native
    var defaultConfig: js.Object = js.native
    def create(config: js.Object): js.Promise[_] = js.native
  }
  
  @JSName("utils")
  @js.native
  object utilsNs extends js.Object {
    trait DataApi extends js.Object {
      def getData(): String
      def setData(data: String): Unit
    }
    
    trait ElementApi extends js.Object {
      val sourceElement: HTMLElement
      def updateSourceElement(): Unit
    }
    
    // core/editor/utils/dataapimixin
    val DataApiMixin: DataApi = js.native
    // core/editor/utils/elementapimixin
    val ElementApiMixin: ElementApi = js.native
    // core/editor/utils/attachtoform
    def attachToForm(editor: Editor with ElementApi): Unit = js.native
  }
  
}

