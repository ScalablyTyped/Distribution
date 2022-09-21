package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionRequest extends StObject {
  
  /**
    * The name of the function whose code you are getting.
    */
  var Name: String
  
  /**
    * The function’s stage, either DEVELOPMENT or LIVE.
    */
  var Stage: js.UndefOr[FunctionStage] = js.undefined
}
object GetFunctionRequest {
  
  inline def apply(Name: String): GetFunctionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionRequest]
  }
  
  extension [Self <: GetFunctionRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStage(value: FunctionStage): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "Stage", js.undefined)
  }
}
