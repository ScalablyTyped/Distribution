package typings.cucumberCucumber

import typings.cucumberCucumber.anon.TypeofFormatter
import typings.cucumberCucumber.cucumberCucumberStrings.formatter
import typings.cucumberCucumber.cucumberCucumberStrings.syntax
import typings.cucumberCucumber.libFormatterHelpersEventDataCollectorMod.default
import typings.cucumberCucumber.libFormatterMod.FormatOptions
import typings.cucumberCucumber.libFormatterMod.IFormatterCleanupFn
import typings.cucumberCucumber.libFormatterMod.IFormatterLogFn
import typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderSnippetSyntaxMod.SnippetInterface
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.streamMod.Writable
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterBuilderMod {
  
  object default {
    
    @JSImport("@cucumber/cucumber/lib/formatter/builder", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(`type`: String, options: IBuildOptions): js.Promise[typings.cucumberCucumber.libFormatterMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.cucumberCucumber.libFormatterMod.default]]
    
    inline def getConstructorByType(`type`: String, cwd: String): js.Promise[TypeofFormatter] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstructorByType")(`type`.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TypeofFormatter]]
    
    inline def getStepDefinitionSnippetBuilder(param0: IGetStepDefinitionSnippetBuilderOptions): js.Promise[typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepDefinitionSnippetBuilder")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default]]
    
    inline def loadCustomClass(`type`: formatter | syntax, descriptor: String, cwd: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCustomClass")(`type`.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def loadFile(urlOrName: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFile")(urlOrName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def loadFile(urlOrName: URL): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFile")(urlOrName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def resolveConstructor(ImportedCode: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveConstructor")(ImportedCode.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  trait IBuildOptions extends StObject {
    
    def cleanup(): js.Promise[Any]
    @JSName("cleanup")
    var cleanup_Original: IFormatterCleanupFn
    
    var cwd: String
    
    var env: ProcessEnv
    
    var eventBroadcaster: EventEmitter
    
    var eventDataCollector: default
    
    def log(buffer: String): Unit
    def log(buffer: js.typedarray.Uint8Array): Unit
    @JSName("log")
    var log_Original: IFormatterLogFn
    
    var parsedArgvOptions: FormatOptions
    
    var stream: Writable
    
    var supportCodeLibrary: ISupportCodeLibrary
  }
  object IBuildOptions {
    
    inline def apply(
      cleanup: () => js.Promise[Any],
      cwd: String,
      env: ProcessEnv,
      eventBroadcaster: EventEmitter,
      eventDataCollector: default,
      log: /* buffer */ String | js.typedarray.Uint8Array => Unit,
      parsedArgvOptions: FormatOptions,
      stream: Writable,
      supportCodeLibrary: ISupportCodeLibrary
    ): IBuildOptions = {
      val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), cwd = cwd.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], eventBroadcaster = eventBroadcaster.asInstanceOf[js.Any], eventDataCollector = eventDataCollector.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), parsedArgvOptions = parsedArgvOptions.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBuildOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBuildOptions] (val x: Self) extends AnyVal {
      
      inline def setCleanup(value: () => js.Promise[Any]): Self = StObject.set(x, "cleanup", js.Any.fromFunction0(value))
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEventBroadcaster(value: EventEmitter): Self = StObject.set(x, "eventBroadcaster", value.asInstanceOf[js.Any])
      
      inline def setEventDataCollector(value: default): Self = StObject.set(x, "eventDataCollector", value.asInstanceOf[js.Any])
      
      inline def setLog(value: /* buffer */ String | js.typedarray.Uint8Array => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setParsedArgvOptions(value: FormatOptions): Self = StObject.set(x, "parsedArgvOptions", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Writable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGetStepDefinitionSnippetBuilderOptions extends StObject {
    
    var cwd: String
    
    var snippetInterface: js.UndefOr[SnippetInterface] = js.undefined
    
    var snippetSyntax: js.UndefOr[String] = js.undefined
    
    var supportCodeLibrary: ISupportCodeLibrary
  }
  object IGetStepDefinitionSnippetBuilderOptions {
    
    inline def apply(cwd: String, supportCodeLibrary: ISupportCodeLibrary): IGetStepDefinitionSnippetBuilderOptions = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGetStepDefinitionSnippetBuilderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGetStepDefinitionSnippetBuilderOptions] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setSnippetInterface(value: SnippetInterface): Self = StObject.set(x, "snippetInterface", value.asInstanceOf[js.Any])
      
      inline def setSnippetInterfaceUndefined: Self = StObject.set(x, "snippetInterface", js.undefined)
      
      inline def setSnippetSyntax(value: String): Self = StObject.set(x, "snippetSyntax", value.asInstanceOf[js.Any])
      
      inline def setSnippetSyntaxUndefined: Self = StObject.set(x, "snippetSyntax", js.undefined)
      
      inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
    }
  }
}
