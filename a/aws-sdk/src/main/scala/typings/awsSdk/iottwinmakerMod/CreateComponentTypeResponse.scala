package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComponentTypeResponse extends StObject {
  
  /**
    * The ARN of the component type.
    */
  var arn: TwinMakerArn
  
  /**
    * The date and time when the entity was created.
    */
  var creationDateTime: js.Date
  
  /**
    * The current state of the component type.
    */
  var state: State
}
object CreateComponentTypeResponse {
  
  inline def apply(arn: TwinMakerArn, creationDateTime: js.Date, state: State): CreateComponentTypeResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComponentTypeResponse]
  }
  
  extension [Self <: CreateComponentTypeResponse](x: Self) {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
