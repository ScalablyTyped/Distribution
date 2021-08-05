package typings.ckeditorCkeditor5Core

import org.scalablytyped.runtime.Instantiable1
import typings.ckeditorCkeditor5Core.anon.Destroy
import typings.ckeditorCkeditor5Core.anon.Items
import typings.ckeditorCkeditor5Core.anon.Observablemessagestring
import typings.ckeditorCkeditor5Core.anon.Priority
import typings.ckeditorCkeditor5Core.anon.`0`
import typings.ckeditorCkeditor5Core.ckeditorCkeditor5CoreStrings.destroyed
import typings.ckeditorCkeditor5Core.ckeditorCkeditor5CoreStrings.initializing
import typings.ckeditorCkeditor5Core.ckeditorCkeditor5CoreStrings.ready
import typings.ckeditorCkeditor5Core.mod.editor.Editor
import typings.ckeditorCkeditor5Engine.mod.controller.DataController
import typings.ckeditorCkeditor5Engine.mod.controller.EditingController
import typings.ckeditorCkeditor5Engine.mod.conversion.Conversion
import typings.ckeditorCkeditor5Engine.mod.model.Model
import typings.ckeditorCkeditor5Engine.mod.view.observer.KeyEventData
import typings.ckeditorCkeditor5Utils.mod.Config
import typings.ckeditorCkeditor5Utils.mod.Emitter
import typings.ckeditorCkeditor5Utils.mod.FocusTracker
import typings.ckeditorCkeditor5Utils.mod.KeystrokeHandler
import typings.ckeditorCkeditor5Utils.mod.Locale
import typings.ckeditorCkeditor5Utils.mod.Observable
import typings.std.HTMLElement
import typings.std.IterableIterator
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-core", "Command")
  @js.native
  class Command[T] protected ()
    extends StObject
       with Observable {
    def this(editor: Editor) = this()
    
    def destroy(): Unit = js.native
    
    val editor: Editor = js.native
    
    def execute(): Unit = js.native
    
    val isEnabled: Boolean = js.native
    
    def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Priority): Unit = js.native
    
    def on(event: String, callback: js.Function, options: `0`): Unit = js.native
    
    def once(event: String, callback: js.Function, options: `0`): Unit = js.native
    
    def refresh(): Unit = js.native
    
    val value: js.UndefOr[T] = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-core", "CommandCollection")
  @js.native
  class CommandCollection () extends StObject {
    
    def add(commandName: String, command: Command[Unit]): Unit = js.native
    
    def commands(): IterableIterator[Command[Unit]] = js.native
    
    def destroy(): Unit = js.native
    
    def execute(commandName: String, commandParams: js.Any*): Unit = js.native
    
    def get(commandName: String): Command[Unit] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Iterator[js.Tuple2[String, Command[Unit]], js.Any, Unit]] = js.native
    
    def names(): IterableIterator[String] = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-core", "EditingKeystrokeHandler")
  @js.native
  class EditingKeystrokeHandler protected () extends KeystrokeHandler {
    def this(editor: Editor) = this()
    
    val editor: Editor = js.native
    
    def set(keystroke: String, callback: String): Unit = js.native
    def set(keystroke: String, callback: String, options: `0`): Unit = js.native
    def set(
      keystroke: String,
      callback: js.Function2[/* keyEvtData */ KeyEventData, /* cancel */ js.Function0[Unit], Unit],
      options: `0`
    ): Unit = js.native
    def set(keystroke: js.Array[String | Double], callback: String): Unit = js.native
    def set(keystroke: js.Array[String | Double], callback: String, options: `0`): Unit = js.native
    def set(
      keystroke: js.Array[String | Double],
      callback: js.Function2[/* keyEvtData */ KeyEventData, /* cancel */ js.Function0[Unit], Unit],
      options: `0`
    ): Unit = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-core", "PendingActions")
  @js.native
  class PendingActions protected () extends Plugin[Unit] {
    def this(editor: Editor) = this()
    
    def add(message: String): Observablemessagestring = js.native
    
    var first: Null | Observablemessagestring = js.native
    
    val hasAny: Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Iterator[Observablemessagestring, js.Any, Unit]] = js.native
    
    def remove(action: Observablemessagestring): Unit = js.native
  }
  /* static members */
  object PendingActions {
    
    @JSImport("@ckeditor/ckeditor5-core", "PendingActions.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Core.ckeditorCkeditor5CoreStrings.PendingActions = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-core", "Plugin")
  @js.native
  abstract class Plugin[T] protected ()
    extends StObject
       with Observable {
    def this(editor: Editor) = this()
    
    var afterInit: js.UndefOr[js.Function0[Null | js.Promise[T]]] = js.native
    
    var destroy: js.UndefOr[js.Function0[Null | js.Promise[T]]] = js.native
    
    val editor: Editor = js.native
    
    var init: js.UndefOr[js.Function0[Null | js.Promise[T]]] = js.native
    
    def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Priority): Unit = js.native
    
    def on(event: String, callback: js.Function, options: `0`): Unit = js.native
    
    def once(event: String, callback: js.Function, options: `0`): Unit = js.native
  }
  /* static members */
  object Plugin {
    
    @JSImport("@ckeditor/ckeditor5-core", "Plugin.pluginName")
    @js.native
    val pluginName: js.UndefOr[String] = js.native
    
    @JSImport("@ckeditor/ckeditor5-core", "Plugin.requires")
    @js.native
    val requires: js.UndefOr[js.Array[Instantiable1[/* editor */ Editor, Plugin[Unit]]]] = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-core", "PluginCollection")
  @js.native
  class PluginCollection[P /* <: Plugin[js.Any] */] protected () extends StObject {
    def this(editor: Editor) = this()
    def this(editor: Editor, availablePlugins: js.Array[Instantiable1[/* editor */ Editor, P]]) = this()
    
    def destroy(): js.Promise[js.Array[P & Destroy]] = js.native
    
    def get(key: String): js.UndefOr[P] = js.native
    def get(key: Instantiable1[/* editor */ Editor, P]): js.UndefOr[P] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Iterator[js.Tuple2[Instantiable1[/* editor */ Editor, P], P], js.Any, Unit]] = js.native
    
    def load(plugins: js.Array[String | (Instantiable1[/* editor */ Editor, P])]): js.Promise[js.Array[P]] = js.native
    def load(
      plugins: js.Array[String | (Instantiable1[/* editor */ Editor, P])],
      removePlugins: js.Array[String | (Instantiable1[/* editor */ Editor, P])]
    ): js.Promise[js.Array[P]] = js.native
  }
  
  object editor {
    
    // core/editor/editor
    @JSImport("@ckeditor/ckeditor5-core", "editor.Editor")
    @js.native
    class Editor ()
      extends StObject
         with Observable {
      def this(config: js.Object) = this()
      
      val commands: CommandCollection = js.native
      
      val config: Config = js.native
      
      val conversion: Conversion = js.native
      
      val data: DataController = js.native
      
      def destroy(): js.Promise[Unit] = js.native
      
      val editing: EditingController = js.native
      
      def execute(commandName: String, commandParams: js.Any*): Unit = js.native
      
      def initPlugins(): js.Promise[Unit] = js.native
      
      var isReadOnly: Boolean = js.native
      
      val keystrokes: EditingKeystrokeHandler = js.native
      
      def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Priority): Unit = js.native
      
      val locale: Locale = js.native
      
      val model: Model = js.native
      
      def on(event: String, callback: js.Function, options: `0`): Unit = js.native
      
      def once(event: String, callback: js.Function, options: `0`): Unit = js.native
      
      val plugins: PluginCollection[Plugin[js.Any]] = js.native
      
      var state: initializing | ready | destroyed = js.native
      
      def t(str: String): String = js.native
      def t(str: String, values: js.Array[String]): String = js.native
    }
    object Editor {
      
      @JSImport("@ckeditor/ckeditor5-core", "editor.Editor")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("@ckeditor/ckeditor5-core", "editor.Editor.builtinPlugins")
      @js.native
      def builtinPlugins: js.Array[Plugin[js.Any]] = js.native
      inline def builtinPlugins_=(x: js.Array[Plugin[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builtinPlugins")(x.asInstanceOf[js.Any])
      
      /* static member */
      inline def create(config: js.Object): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
      
      /* static member */
      @JSImport("@ckeditor/ckeditor5-core", "editor.Editor.defaultConfig")
      @js.native
      def defaultConfig: js.Object = js.native
      inline def defaultConfig_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultConfig")(x.asInstanceOf[js.Any])
    }
    
    // core/editor/editorui
    @JSImport("@ckeditor/ckeditor5-core", "editor.EditorUI")
    @js.native
    class EditorUI protected ()
      extends StObject
         with Emitter {
      def this(editor: Editor, view: EditorUIView) = this()
      
      val componentFactory: ComponentFactory = js.native
      
      def destroy(): Unit = js.native
      
      val editor: Editor = js.native
      
      val focusTracker: FocusTracker = js.native
      
      def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Priority): Unit = js.native
      
      def on(event: String, callback: js.Function, options: `0`): Unit = js.native
      
      def once(event: String, callback: js.Function, options: `0`): Unit = js.native
      
      def update(): Unit = js.native
      
      val view: EditorUIView = js.native
    }
    
    object utils {
      
      @JSImport("@ckeditor/ckeditor5-core", "editor.utils")
      @js.native
      val ^ : js.Any = js.native
      
      // core/editor/utils/dataapimixin
      @JSImport("@ckeditor/ckeditor5-core", "editor.utils.DataApiMixin")
      @js.native
      val DataApiMixin: DataApi = js.native
      
      // core/editor/utils/elementapimixin
      @JSImport("@ckeditor/ckeditor5-core", "editor.utils.ElementApiMixin")
      @js.native
      val ElementApiMixin: ElementApi = js.native
      
      // core/editor/utils/attachtoform
      inline def attachToForm(editor: Editor & ElementApi): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachToForm")(editor.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      trait DataApi extends StObject {
        
        def getData(): String
        
        def setData(data: String): Unit
      }
      object DataApi {
        
        inline def apply(getData: () => String, setData: String => Unit): DataApi = {
          val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), setData = js.Any.fromFunction1(setData))
          __obj.asInstanceOf[DataApi]
        }
        
        extension [Self <: DataApi](x: Self) {
          
          inline def setGetData(value: () => String): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
          
          inline def setSetData(value: String => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
        }
      }
      
      trait ElementApi extends StObject {
        
        val sourceElement: HTMLElement
        
        def updateSourceElement(): Unit
      }
      object ElementApi {
        
        inline def apply(sourceElement: HTMLElement, updateSourceElement: () => Unit): ElementApi = {
          val __obj = js.Dynamic.literal(sourceElement = sourceElement.asInstanceOf[js.Any], updateSourceElement = js.Any.fromFunction0(updateSourceElement))
          __obj.asInstanceOf[ElementApi]
        }
        
        extension [Self <: ElementApi](x: Self) {
          
          inline def setSourceElement(value: HTMLElement): Self = StObject.set(x, "sourceElement", value.asInstanceOf[js.Any])
          
          inline def setUpdateSourceElement(value: () => Unit): Self = StObject.set(x, "updateSourceElement", js.Any.fromFunction0(value))
        }
      }
    }
    
    // core/editor/editorconfig
    trait EditorConfig extends StObject {
      
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
      
      var toolbar: js.Array[String] | Items
      
      var typing: TypingConfig
    }
    object EditorConfig {
      
      inline def apply(
        alignment: AlignmentConfig,
        autosave: AutosaveConfig,
        balloonToolbar: js.Array[String],
        blockToolbar: js.Array[String],
        ckfinder: CKFinderAdapterConfig,
        cloudServices: CloudServicesConfig,
        fontFamily: FontFamilyConfig,
        fontSize: FontSizeConfig,
        heading: HeadingConfig,
        highlight: HighlightConfig,
        image: ImageConfig,
        language: String,
        mediaEmbed: MediaEmbedConfig,
        plugins: js.Array[String | Plugin[Unit]],
        removePlugins: js.Array[String],
        toolbar: js.Array[String] | Items,
        typing: TypingConfig
      ): EditorConfig = {
        val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], autosave = autosave.asInstanceOf[js.Any], balloonToolbar = balloonToolbar.asInstanceOf[js.Any], blockToolbar = blockToolbar.asInstanceOf[js.Any], ckfinder = ckfinder.asInstanceOf[js.Any], cloudServices = cloudServices.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], mediaEmbed = mediaEmbed.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], removePlugins = removePlugins.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
        __obj.asInstanceOf[EditorConfig]
      }
      
      extension [Self <: EditorConfig](x: Self) {
        
        inline def setAlignment(value: AlignmentConfig): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        inline def setAutosave(value: AutosaveConfig): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
        
        inline def setBalloonToolbar(value: js.Array[String]): Self = StObject.set(x, "balloonToolbar", value.asInstanceOf[js.Any])
        
        inline def setBalloonToolbarVarargs(value: String*): Self = StObject.set(x, "balloonToolbar", js.Array(value :_*))
        
        inline def setBlockToolbar(value: js.Array[String]): Self = StObject.set(x, "blockToolbar", value.asInstanceOf[js.Any])
        
        inline def setBlockToolbarVarargs(value: String*): Self = StObject.set(x, "blockToolbar", js.Array(value :_*))
        
        inline def setCkfinder(value: CKFinderAdapterConfig): Self = StObject.set(x, "ckfinder", value.asInstanceOf[js.Any])
        
        inline def setCloudServices(value: CloudServicesConfig): Self = StObject.set(x, "cloudServices", value.asInstanceOf[js.Any])
        
        inline def setFontFamily(value: FontFamilyConfig): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
        
        inline def setFontSize(value: FontSizeConfig): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        inline def setHeading(value: HeadingConfig): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
        
        inline def setHighlight(value: HighlightConfig): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
        
        inline def setImage(value: ImageConfig): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        inline def setMediaEmbed(value: MediaEmbedConfig): Self = StObject.set(x, "mediaEmbed", value.asInstanceOf[js.Any])
        
        inline def setPlugins(value: js.Array[String | Plugin[Unit]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
        
        inline def setPluginsVarargs(value: (String | Plugin[Unit])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
        
        inline def setRemovePlugins(value: js.Array[String]): Self = StObject.set(x, "removePlugins", value.asInstanceOf[js.Any])
        
        inline def setRemovePluginsVarargs(value: String*): Self = StObject.set(x, "removePlugins", js.Array(value :_*))
        
        inline def setToolbar(value: js.Array[String] | Items): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
        
        inline def setToolbarVarargs(value: String*): Self = StObject.set(x, "toolbar", js.Array(value :_*))
        
        inline def setTyping(value: TypingConfig): Self = StObject.set(x, "typing", value.asInstanceOf[js.Any])
      }
    }
    
    // core/editor/editorwithui
    trait EditorWithUI extends StObject {
      
      val element: HTMLElement | Null
      
      val ui: EditorUI
    }
    object EditorWithUI {
      
      inline def apply(ui: EditorUI): EditorWithUI = {
        val __obj = js.Dynamic.literal(ui = ui.asInstanceOf[js.Any], element = null)
        __obj.asInstanceOf[EditorWithUI]
      }
      
      extension [Self <: EditorWithUI](x: Self) {
        
        inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
        
        inline def setElementNull: Self = StObject.set(x, "element", null)
        
        inline def setUi(value: EditorUI): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait AlignmentConfig extends StObject
  
  trait AutosaveConfig extends StObject
  
  trait CKFinderAdapterConfig extends StObject
  
  trait CloudServicesConfig extends StObject
  
  trait ComponentFactory extends StObject
  
  trait EditorUIView extends StObject
  
  trait FontFamilyConfig extends StObject
  
  trait FontSizeConfig extends StObject
  
  trait HeadingConfig extends StObject
  
  trait HighlightConfig extends StObject
  
  trait ImageConfig extends StObject
  
  trait MediaEmbedConfig extends StObject
  
  trait TypingConfig extends StObject
}
