package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleLambdaFunctionDecisionAttributes extends StObject {
  
  /**
    * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the Lambda task.
    */
  var control: js.UndefOr[Data] = js.undefined
  
  /**
    * A string that identifies the Lambda function execution in the event history.
    */
  var id: FunctionId
  
  /**
    * The optional input data to be supplied to the Lambda function.
    */
  var input: js.UndefOr[FunctionInput] = js.undefined
  
  /**
    * The name, or ARN, of the Lambda function to schedule.
    */
  var name: FunctionName
  
  /**
    * The timeout value, in seconds, after which the Lambda function is considered to be failed once it has started. This can be any integer from 1-300 (1s-5m). If no value is supplied, than a default value of 300s is assumed.
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
}
object ScheduleLambdaFunctionDecisionAttributes {
  
  inline def apply(id: FunctionId, name: FunctionName): ScheduleLambdaFunctionDecisionAttributes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleLambdaFunctionDecisionAttributes]
  }
  
  extension [Self <: ScheduleLambdaFunctionDecisionAttributes](x: Self) {
    
    inline def setControl(value: Data): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setId(value: FunctionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInput(value: FunctionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setName(value: FunctionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "startToCloseTimeout", value.asInstanceOf[js.Any])
    
    inline def setStartToCloseTimeoutUndefined: Self = StObject.set(x, "startToCloseTimeout", js.undefined)
  }
}
