package typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalPipelineOptions
  extends StObject
     with PipelineOptions {
  
  /**
    * Options to configure request/response logging.
    */
  var loggingOptions: js.UndefOr[LogPolicyOptions] = js.undefined
}
object InternalPipelineOptions {
  
  inline def apply(): InternalPipelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalPipelineOptions]
  }
  
  extension [Self <: InternalPipelineOptions](x: Self) {
    
    inline def setLoggingOptions(value: LogPolicyOptions): Self = StObject.set(x, "loggingOptions", value.asInstanceOf[js.Any])
    
    inline def setLoggingOptionsUndefined: Self = StObject.set(x, "loggingOptions", js.undefined)
  }
}
