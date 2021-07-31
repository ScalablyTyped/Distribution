package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.Active
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PassThrough
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTracingConfigResponseMod {
  
  trait TracingConfigResponse extends StObject {
    
    /**
      * <p>The tracing mode.</p>
      */
    var Mode: js.UndefOr[Active | PassThrough | String] = js.undefined
  }
  object TracingConfigResponse {
    
    @scala.inline
    def apply(): TracingConfigResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracingConfigResponse]
    }
    
    @scala.inline
    implicit class TracingConfigResponseMutableBuilder[Self <: TracingConfigResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: Active | PassThrough | String): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    }
  }
  
  type UnmarshalledTracingConfigResponse = TracingConfigResponse
}
