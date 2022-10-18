package typings.barnard59Core

import typings.barnard59Core.barnard59CoreStrings.debug
import typings.barnard59Core.barnard59CoreStrings.error
import typings.barnard59Core.barnard59CoreStrings.info
import typings.barnard59Core.libFactoryPipelineMod.CreatePipeline
import typings.barnard59Core.libPipelineMod.default
import typings.barnard59Core.libRunMod.Run
import typings.clownface.mod.GraphPointer
import typings.rdfLoadersRegistry.mod.LoaderRegistry
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.winston.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("barnard59-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPipeline(ptr: GraphPointer[Term, DatasetCore[Quad, Quad]]): default = ^.asInstanceOf[js.Dynamic].applyDynamic("createPipeline")(ptr.asInstanceOf[js.Any]).asInstanceOf[default]
  inline def createPipeline(ptr: GraphPointer[Term, DatasetCore[Quad, Quad]], arg: CreatePipeline): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createPipeline")(ptr.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[default]
  
  @JSImport("barnard59-core", "defaultLoaderRegistry")
  @js.native
  val defaultLoaderRegistry: LoaderRegistry = js.native
  
  inline def defaultLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultLogger")().asInstanceOf[Logger]
  inline def defaultLogger(arg: DefaultLogger_): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultLogger")(arg.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  inline def run(pipeline: default): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(pipeline.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def run(pipeline: default, opts: Run): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(pipeline.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  trait DefaultLogger_ extends StObject {
    
    var console: js.UndefOr[Boolean] = js.undefined
    
    var errorFilename: js.UndefOr[String | Null] = js.undefined
    
    var filename: js.UndefOr[String | Null] = js.undefined
    
    var level: js.UndefOr[error | info | debug] = js.undefined
  }
  object DefaultLogger_ {
    
    inline def apply(): DefaultLogger_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultLogger_]
    }
    
    extension [Self <: DefaultLogger_](x: Self) {
      
      inline def setConsole(value: Boolean): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setErrorFilename(value: String): Self = StObject.set(x, "errorFilename", value.asInstanceOf[js.Any])
      
      inline def setErrorFilenameNull: Self = StObject.set(x, "errorFilename", null)
      
      inline def setErrorFilenameUndefined: Self = StObject.set(x, "errorFilename", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setLevel(value: error | info | debug): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
}
