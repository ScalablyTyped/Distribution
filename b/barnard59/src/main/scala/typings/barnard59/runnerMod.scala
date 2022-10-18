package typings.barnard59

import typings.barnard59.barnard59Strings.debug
import typings.barnard59.barnard59Strings.error
import typings.barnard59.barnard59Strings.info
import typings.barnard59Core.libPipelineMod.default
import typings.barnard59Core.libStreamObjectMod.VariableMap
import typings.clownface.mod.GraphPointer
import typings.node.streamMod.Writable
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.winston.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runnerMod {
  
  @JSImport("barnard59/runner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ptr: GraphPointer[Term, DatasetCore[Quad, Quad]]): js.Promise[Runner] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ptr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Runner]]
  inline def default(ptr: GraphPointer[Term, DatasetCore[Quad, Quad]], args: Create): js.Promise[Runner] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ptr.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Runner]]
  
  trait Create extends StObject {
    
    var basePath: String
    
    var level: js.UndefOr[error | info | debug] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var outputStream: Writable
    
    var variables: js.UndefOr[VariableMap] = js.undefined
  }
  object Create {
    
    inline def apply(basePath: String, outputStream: Writable): Create = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], outputStream = outputStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Create]
    }
    
    extension [Self <: Create](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: error | info | debug): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setOutputStream(value: Writable): Self = StObject.set(x, "outputStream", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: VariableMap): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait Runner extends StObject {
    
    var finished: js.Promise[Any]
    
    var pipeline: default
  }
  object Runner {
    
    inline def apply(finished: js.Promise[Any], pipeline: default): Runner = {
      val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[Runner]
    }
    
    extension [Self <: Runner](x: Self) {
      
      inline def setFinished(value: js.Promise[Any]): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setPipeline(value: default): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    }
  }
}
