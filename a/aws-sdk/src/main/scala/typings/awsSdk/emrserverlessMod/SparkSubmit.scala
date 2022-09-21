package typings.awsSdk.emrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkSubmit extends StObject {
  
  /**
    * The entry point for the Spark submit job run.
    */
  var entryPoint: EntryPointPath
  
  /**
    * The arguments for the Spark submit job run.
    */
  var entryPointArguments: js.UndefOr[EntryPointArguments] = js.undefined
  
  /**
    * The parameters for the Spark submit job run.
    */
  var sparkSubmitParameters: js.UndefOr[SparkSubmitParameters] = js.undefined
}
object SparkSubmit {
  
  inline def apply(entryPoint: EntryPointPath): SparkSubmit = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkSubmit]
  }
  
  extension [Self <: SparkSubmit](x: Self) {
    
    inline def setEntryPoint(value: EntryPointPath): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointArguments(value: EntryPointArguments): Self = StObject.set(x, "entryPointArguments", value.asInstanceOf[js.Any])
    
    inline def setEntryPointArgumentsUndefined: Self = StObject.set(x, "entryPointArguments", js.undefined)
    
    inline def setEntryPointArgumentsVarargs(value: EntryPointArgument*): Self = StObject.set(x, "entryPointArguments", js.Array(value*))
    
    inline def setSparkSubmitParameters(value: SparkSubmitParameters): Self = StObject.set(x, "sparkSubmitParameters", value.asInstanceOf[js.Any])
    
    inline def setSparkSubmitParametersUndefined: Self = StObject.set(x, "sparkSubmitParameters", js.undefined)
  }
}
