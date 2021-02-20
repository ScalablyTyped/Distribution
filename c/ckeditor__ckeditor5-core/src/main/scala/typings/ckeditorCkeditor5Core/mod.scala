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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-core", "Command")
  @js.native
  class Command[T] protected () extends Observable {
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
    
    def add(commandName: String, command: Command[js.UndefOr[scala.Nothing]]): Unit = js.native
    
    def commands(): IterableIterator[Command[js.UndefOr[scala.Nothing]]] = js.native
    
    def destroy(): Unit = js.native
    
    def execute(commandName: String, commandParams: js.Any*): Unit = js.native
    
    def get(commandName: String): Command[js.UndefOr[scala.Nothing]] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[
        Iterator[js.Tuple2[String, Command[js.UndefOr[scala.Nothing]]], _, js.UndefOr[scala.Nothing]]
      ] = js.native
    
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
    var iterator: js.Function0[Iterator[Observablemessagestring, _, js.UndefOr[scala.Nothing]]] = js.native
    
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
  abstract class Plugin[T] protected () extends Observable {
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
  class PluginCollection[P /* <: Plugin[_] */] protected () extends StObject {
    def this(editor: Editor) = this()
    def this(editor: Editor, availablePlugins: js.Array[Instantiable1[/* editor */ Editor, P]]) = this()
    
    def destroy(): js.Promise[js.Array[P with Destroy]] = js.native
    
    def get(key: String): js.UndefOr[P] = js.native
    def get(key: Instantiable1[/* editor */ Editor, P]): js.UndefOr[P] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[
        Iterator[js.Tuple2[Instantiable1[/* editor */ Editor, P], P], _, js.UndefOr[scala.Nothing]]
      ] = js.native
    
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
    class Editor () extends Observable {
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
      
      val plugins: PluginCollection[Plugin[_]] = js.native
      
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
      @scala.inline
      def builtinPlugins_=(x: js.Array[Plugin[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builtinPlugins")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("@ckeditor/ckeditor5-core", "editor.Editor.create")
      @js.native
      def create(config: js.Object): js.Promise[_] = js.native
      
      /* static member */
      @JSImport("@ckeditor/ckeditor5-core", "editor.Editor.defaultConfig")
      @js.native
      def defaultConfig: js.Object = js.native
      @scala.inline
      def defaultConfig_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultConfig")(x.asInstanceOf[js.Any])
    }
    
    // core/editor/editorui
    @JSImport("@ckeditor/ckeditor5-core", "editor.EditorUI")
    @js.native
    class EditorUI protected () extends Emitter {
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
      
      // core/editor/utils/dataapimixin
      @JSImport("@ckeditor/ckeditor5-core", "editor.utils.DataApiMixin")
      @js.native
      val DataApiMixin: DataApi = js.native
      
      // core/editor/utils/elementapimixin
      @JSImport("@ckeditor/ckeditor5-core", "editor.utils.ElementApiMixin")
      @js.native
      val ElementApiMixin: ElementApi = js.native
      
      // core/editor/utils/attachtoform
      @JSImport("@ckeditor/ckeditor5-core", "editor.utils.attachToForm")
      @js.native
      def attachToForm(editor: Editor with ElementApi): Unit = js.native
      
      @js.native
      trait DataApi extends StObject {
        
        def getData(): String = js.native
        
        def setData(data: String): Unit = js.native
      }
      object DataApi {
        
        @scala.inline
        def apply(getData: () => String, setData: String => Unit): DataApi = {
          val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), setData = js.Any.fromFunction1(setData))
          __obj.asInstanceOf[DataApi]
        }
        
        @scala.inline
        implicit class DataApiMutableBuilder[Self <: DataApi] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setGetData(value: () => String): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
          
          @scala.inline
          def setSetData(value: String => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait ElementApi extends StObject {
        
        val sourceElement: HTMLElement = js.native
        
        def updateSourceElement(): Unit = js.native
      }
      object ElementApi {
        
        @scala.inline
        def apply(sourceElement: HTMLElement, updateSourceElement: () => Unit): ElementApi = {
          val __obj = js.Dynamic.literal(sourceElement = sourceElement.asInstanceOf[js.Any], updateSourceElement = js.Any.fromFunction0(updateSourceElement))
          __obj.asInstanceOf[ElementApi]
        }
        
        @scala.inline
        implicit class ElementApiMutableBuilder[Self <: ElementApi] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setSourceElement(value: HTMLElement): Self = StObject.set(x, "sourceElement", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUpdateSourceElement(value: () => Unit): Self = StObject.set(x, "updateSourceElement", js.Any.fromFunction0(value))
        }
      }
    }
    
    // core/editor/editorconfig
    @js.native
    trait EditorConfig extends StObject {
      
      var alignment: AlignmentConfig = js.native
      
      var autosave: AutosaveConfig = js.native
      
      var balloonToolbar: js.Array[String] = js.native
      
      var blockToolbar: js.Array[String] = js.native
      
      var ckfinder: CKFinderAdapterConfig = js.native
      
      var cloudServices: CloudServicesConfig = js.native
      
      var fontFamily: FontFamilyConfig = js.native
      
      var fontSize: FontSizeConfig = js.native
      
      var heading: HeadingConfig = js.native
      
      var highlight: HighlightConfig = js.native
      
      var image: ImageConfig = js.native
      
      var language: String = js.native
      
      var mediaEmbed: MediaEmbedConfig = js.native
      
      var plugins: js.Array[String | Plugin[Unit]] = js.native
      
      var removePlugins: js.Array[String] = js.native
      
      var toolbar: js.Array[String] | Items = js.native
      
      var typing: TypingConfig = js.native
    }
    object EditorConfig {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class EditorConfigMutableBuilder[Self <: EditorConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlignment(value: AlignmentConfig): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutosave(value: AutosaveConfig): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBalloonToolbar(value: js.Array[String]): Self = StObject.set(x, "balloonToolbar", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBalloonToolbarVarargs(value: String*): Self = StObject.set(x, "balloonToolbar", js.Array(value :_*))
        
        @scala.inline
        def setBlockToolbar(value: js.Array[String]): Self = StObject.set(x, "blockToolbar", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockToolbarVarargs(value: String*): Self = StObject.set(x, "blockToolbar", js.Array(value :_*))
        
        @scala.inline
        def setCkfinder(value: CKFinderAdapterConfig): Self = StObject.set(x, "ckfinder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCloudServices(value: CloudServicesConfig): Self = StObject.set(x, "cloudServices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontFamily(value: FontFamilyConfig): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontSize(value: FontSizeConfig): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeading(value: HeadingConfig): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHighlight(value: HighlightConfig): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImage(value: ImageConfig): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaEmbed(value: MediaEmbedConfig): Self = StObject.set(x, "mediaEmbed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlugins(value: js.Array[String | Plugin[Unit]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPluginsVarargs(value: (String | Plugin[Unit])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
        
        @scala.inline
        def setRemovePlugins(value: js.Array[String]): Self = StObject.set(x, "removePlugins", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemovePluginsVarargs(value: String*): Self = StObject.set(x, "removePlugins", js.Array(value :_*))
        
        @scala.inline
        def setToolbar(value: js.Array[String] | Items): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToolbarVarargs(value: String*): Self = StObject.set(x, "toolbar", js.Array(value :_*))
        
        @scala.inline
        def setTyping(value: TypingConfig): Self = StObject.set(x, "typing", value.asInstanceOf[js.Any])
      }
    }
    
    // core/editor/editorwithui
    @js.native
    trait EditorWithUI extends StObject {
      
      val element: HTMLElement | Null = js.native
      
      val ui: EditorUI = js.native
    }
    object EditorWithUI {
      
      @scala.inline
      def apply(ui: EditorUI): EditorWithUI = {
        val __obj = js.Dynamic.literal(ui = ui.asInstanceOf[js.Any])
        __obj.asInstanceOf[EditorWithUI]
      }
      
      @scala.inline
      implicit class EditorWithUIMutableBuilder[Self <: EditorWithUI] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementNull: Self = StObject.set(x, "element", null)
        
        @scala.inline
        def setUi(value: EditorUI): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait AlignmentConfig extends StObject
  
  @js.native
  trait AutosaveConfig extends StObject
  
  @js.native
  trait CKFinderAdapterConfig extends StObject
  
  @js.native
  trait CloudServicesConfig extends StObject
  
  @js.native
  trait ComponentFactory extends StObject
  
  @js.native
  trait EditorUIView extends StObject
  
  @js.native
  trait FontFamilyConfig extends StObject
  
  @js.native
  trait FontSizeConfig extends StObject
  
  @js.native
  trait HeadingConfig extends StObject
  
  @js.native
  trait HighlightConfig extends StObject
  
  @js.native
  trait ImageConfig extends StObject
  
  @js.native
  trait MediaEmbedConfig extends StObject
  
  @js.native
  trait TypingConfig extends StObject
}
