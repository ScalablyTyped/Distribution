package typings.barnard59Core

import typings.barnard59Core.streamObjectMod.VariableMap
import typings.clownface.mod.GraphPointer
import typings.rdfLoadersRegistry.mod.LoaderRegistry
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.winston.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipelineMod {
  
  @JSImport("barnard59-core/lib/factory/pipeline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ptr: GraphPointer[Term, DatasetCore[Quad, Quad]]): typings.barnard59Core.libPipelineMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ptr.asInstanceOf[js.Any]).asInstanceOf[typings.barnard59Core.libPipelineMod.default]
  inline def default(ptr: GraphPointer[Term, DatasetCore[Quad, Quad]], arg: CreatePipeline): typings.barnard59Core.libPipelineMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ptr.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[typings.barnard59Core.libPipelineMod.default]
  
  trait CreatePipeline extends StObject {
    
    var basePath: String
    
    var context: js.UndefOr[Any] = js.undefined
    
    var loaderRegistry: js.UndefOr[LoaderRegistry] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var variables: js.UndefOr[VariableMap] = js.undefined
  }
  object CreatePipeline {
    
    inline def apply(basePath: String): CreatePipeline = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreatePipeline]
    }
    
    extension [Self <: CreatePipeline](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setLoaderRegistry(value: LoaderRegistry): Self = StObject.set(x, "loaderRegistry", value.asInstanceOf[js.Any])
      
      inline def setLoaderRegistryUndefined: Self = StObject.set(x, "loaderRegistry", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setVariables(value: VariableMap): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
}
