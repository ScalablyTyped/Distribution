package typings.cucumberCucumber

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberCucumber.libFormatterGetColorFnsMod.IColorFns
import typings.cucumberCucumber.libFormatterHelpersMod.EventDataCollector
import typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderSnippetSyntaxMod.SnippetInterface
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Formatter {
    def this(options: IFormatterOptions) = this()
    
    /* private */ /* CompleteClass */
    override val cleanup: Any = js.native
    
    /* protected */ /* CompleteClass */
    var colorFns: IColorFns = js.native
    
    /* protected */ /* CompleteClass */
    var cwd: String = js.native
    
    /* protected */ /* CompleteClass */
    var eventDataCollector: EventDataCollector = js.native
    
    /* CompleteClass */
    override def finished(): js.Promise[Unit] = js.native
    
    /* protected */ /* CompleteClass */
    override def log(buffer: String): Unit = js.native
    /* protected */ /* CompleteClass */
    override def log(buffer: js.typedarray.Uint8Array): Unit = js.native
    /* protected */ /* CompleteClass */
    @JSName("log")
    var log_Original: IFormatterLogFn = js.native
    
    /* protected */ /* CompleteClass */
    var printAttachments: Boolean = js.native
    
    /* protected */ /* CompleteClass */
    var snippetBuilder: typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default = js.native
    
    /* protected */ /* CompleteClass */
    var stream: Writable = js.native
    
    /* protected */ /* CompleteClass */
    var supportCodeLibrary: ISupportCodeLibrary = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber/lib/formatter", "default.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  trait FormatOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var colorsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var printAttachments: js.UndefOr[Boolean] = js.undefined
    
    var rerun: js.UndefOr[FormatRerunOptions] = js.undefined
    
    var snippetInterface: js.UndefOr[SnippetInterface] = js.undefined
    
    var snippetSyntax: js.UndefOr[String] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      inline def setColorsEnabled(value: Boolean): Self = StObject.set(x, "colorsEnabled", value.asInstanceOf[js.Any])
      
      inline def setColorsEnabledUndefined: Self = StObject.set(x, "colorsEnabled", js.undefined)
      
      inline def setPrintAttachments(value: Boolean): Self = StObject.set(x, "printAttachments", value.asInstanceOf[js.Any])
      
      inline def setPrintAttachmentsUndefined: Self = StObject.set(x, "printAttachments", js.undefined)
      
      inline def setRerun(value: FormatRerunOptions): Self = StObject.set(x, "rerun", value.asInstanceOf[js.Any])
      
      inline def setRerunUndefined: Self = StObject.set(x, "rerun", js.undefined)
      
      inline def setSnippetInterface(value: SnippetInterface): Self = StObject.set(x, "snippetInterface", value.asInstanceOf[js.Any])
      
      inline def setSnippetInterfaceUndefined: Self = StObject.set(x, "snippetInterface", js.undefined)
      
      inline def setSnippetSyntax(value: String): Self = StObject.set(x, "snippetSyntax", value.asInstanceOf[js.Any])
      
      inline def setSnippetSyntaxUndefined: Self = StObject.set(x, "snippetSyntax", js.undefined)
    }
  }
  
  trait FormatRerunOptions extends StObject {
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object FormatRerunOptions {
    
    inline def apply(): FormatRerunOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatRerunOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatRerunOptions] (val x: Self) extends AnyVal {
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  trait Formatter extends StObject {
    
    /* private */ val cleanup: Any
    
    /* protected */ var colorFns: IColorFns
    
    /* protected */ var cwd: String
    
    /* protected */ var eventDataCollector: EventDataCollector
    
    def finished(): js.Promise[Unit]
    
    /* protected */ def log(buffer: String): Unit
    /* protected */ def log(buffer: js.typedarray.Uint8Array): Unit
    /* protected */ @JSName("log")
    var log_Original: IFormatterLogFn
    
    /* protected */ var printAttachments: Boolean
    
    /* protected */ var snippetBuilder: typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default
    
    /* protected */ var stream: Writable
    
    /* protected */ var supportCodeLibrary: ISupportCodeLibrary
  }
  object Formatter {
    
    inline def apply(
      cleanup: Any,
      colorFns: IColorFns,
      cwd: String,
      eventDataCollector: EventDataCollector,
      finished: () => js.Promise[Unit],
      log: /* buffer */ String | js.typedarray.Uint8Array => Unit,
      printAttachments: Boolean,
      snippetBuilder: typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default,
      stream: Writable,
      supportCodeLibrary: ISupportCodeLibrary
    ): Formatter = {
      val __obj = js.Dynamic.literal(cleanup = cleanup.asInstanceOf[js.Any], colorFns = colorFns.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], eventDataCollector = eventDataCollector.asInstanceOf[js.Any], finished = js.Any.fromFunction0(finished), log = js.Any.fromFunction1(log), printAttachments = printAttachments.asInstanceOf[js.Any], snippetBuilder = snippetBuilder.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formatter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Formatter] (val x: Self) extends AnyVal {
      
      inline def setCleanup(value: Any): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
      
      inline def setColorFns(value: IColorFns): Self = StObject.set(x, "colorFns", value.asInstanceOf[js.Any])
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setEventDataCollector(value: EventDataCollector): Self = StObject.set(x, "eventDataCollector", value.asInstanceOf[js.Any])
      
      inline def setFinished(value: () => js.Promise[Unit]): Self = StObject.set(x, "finished", js.Any.fromFunction0(value))
      
      inline def setLog(value: /* buffer */ String | js.typedarray.Uint8Array => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setPrintAttachments(value: Boolean): Self = StObject.set(x, "printAttachments", value.asInstanceOf[js.Any])
      
      inline def setSnippetBuilder(value: typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default): Self = StObject.set(x, "snippetBuilder", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Writable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
    }
  }
  
  type IFormatterCleanupFn = js.Function0[js.Promise[Any]]
  
  type IFormatterLogFn = js.Function1[/* buffer */ String | js.typedarray.Uint8Array, Unit]
  
  trait IFormatterOptions extends StObject {
    
    def cleanup(): js.Promise[Any]
    @JSName("cleanup")
    var cleanup_Original: IFormatterCleanupFn
    
    var colorFns: IColorFns
    
    var cwd: String
    
    var eventBroadcaster: EventEmitter
    
    var eventDataCollector: EventDataCollector
    
    def log(buffer: String): Unit
    def log(buffer: js.typedarray.Uint8Array): Unit
    @JSName("log")
    var log_Original: IFormatterLogFn
    
    var parsedArgvOptions: FormatOptions
    
    var snippetBuilder: typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default
    
    var stream: Writable
    
    var supportCodeLibrary: ISupportCodeLibrary
  }
  object IFormatterOptions {
    
    inline def apply(
      cleanup: () => js.Promise[Any],
      colorFns: IColorFns,
      cwd: String,
      eventBroadcaster: EventEmitter,
      eventDataCollector: EventDataCollector,
      log: /* buffer */ String | js.typedarray.Uint8Array => Unit,
      parsedArgvOptions: FormatOptions,
      snippetBuilder: typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default,
      stream: Writable,
      supportCodeLibrary: ISupportCodeLibrary
    ): IFormatterOptions = {
      val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), colorFns = colorFns.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], eventBroadcaster = eventBroadcaster.asInstanceOf[js.Any], eventDataCollector = eventDataCollector.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), parsedArgvOptions = parsedArgvOptions.asInstanceOf[js.Any], snippetBuilder = snippetBuilder.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFormatterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFormatterOptions] (val x: Self) extends AnyVal {
      
      inline def setCleanup(value: () => js.Promise[Any]): Self = StObject.set(x, "cleanup", js.Any.fromFunction0(value))
      
      inline def setColorFns(value: IColorFns): Self = StObject.set(x, "colorFns", value.asInstanceOf[js.Any])
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setEventBroadcaster(value: EventEmitter): Self = StObject.set(x, "eventBroadcaster", value.asInstanceOf[js.Any])
      
      inline def setEventDataCollector(value: EventDataCollector): Self = StObject.set(x, "eventDataCollector", value.asInstanceOf[js.Any])
      
      inline def setLog(value: /* buffer */ String | js.typedarray.Uint8Array => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setParsedArgvOptions(value: FormatOptions): Self = StObject.set(x, "parsedArgvOptions", value.asInstanceOf[js.Any])
      
      inline def setSnippetBuilder(value: typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default): Self = StObject.set(x, "snippetBuilder", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Writable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
    }
  }
  
  type IFormatterStream = Writable
  
  trait IPublishConfig extends StObject {
    
    var token: String
    
    var url: String
  }
  object IPublishConfig {
    
    inline def apply(token: String, url: String): IPublishConfig = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPublishConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPublishConfig] (val x: Self) extends AnyVal {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
