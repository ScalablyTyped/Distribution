package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutOptedOutNumberRequest extends StObject {
  
  /**
    * The OptOutListName or OptOutListArn to add the phone number to.
    */
  var OptOutListName: OptOutListNameOrArn
  
  /**
    * The phone number to add to the OptOutList in E.164 format.
    */
  var OptedOutNumber: PhoneNumber
}
object PutOptedOutNumberRequest {
  
  inline def apply(OptOutListName: OptOutListNameOrArn, OptedOutNumber: PhoneNumber): PutOptedOutNumberRequest = {
    val __obj = js.Dynamic.literal(OptOutListName = OptOutListName.asInstanceOf[js.Any], OptedOutNumber = OptedOutNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOptedOutNumberRequest]
  }
  
  extension [Self <: PutOptedOutNumberRequest](x: Self) {
    
    inline def setOptOutListName(value: OptOutListNameOrArn): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setOptedOutNumber(value: PhoneNumber): Self = StObject.set(x, "OptedOutNumber", value.asInstanceOf[js.Any])
  }
}
