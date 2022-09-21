package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutOptedOutNumberResult extends StObject {
  
  /**
    * This is true if it was the end user who requested their phone number be removed. 
    */
  var EndUserOptedOut: js.UndefOr[PrimitiveBoolean] = js.undefined
  
  /**
    * The OptOutListArn that the phone number was removed from.
    */
  var OptOutListArn: js.UndefOr[String] = js.undefined
  
  /**
    * The OptOutListName that the phone number was removed from.
    */
  var OptOutListName: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.OptOutListName] = js.undefined
  
  /**
    * The phone number that was added to the OptOutList.
    */
  var OptedOutNumber: js.UndefOr[PhoneNumber] = js.undefined
  
  /**
    * The time that the phone number was added to the OptOutList, in UNIX epoch time format.
    */
  var OptedOutTimestamp: js.UndefOr[js.Date] = js.undefined
}
object PutOptedOutNumberResult {
  
  inline def apply(): PutOptedOutNumberResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutOptedOutNumberResult]
  }
  
  extension [Self <: PutOptedOutNumberResult](x: Self) {
    
    inline def setEndUserOptedOut(value: PrimitiveBoolean): Self = StObject.set(x, "EndUserOptedOut", value.asInstanceOf[js.Any])
    
    inline def setEndUserOptedOutUndefined: Self = StObject.set(x, "EndUserOptedOut", js.undefined)
    
    inline def setOptOutListArn(value: String): Self = StObject.set(x, "OptOutListArn", value.asInstanceOf[js.Any])
    
    inline def setOptOutListArnUndefined: Self = StObject.set(x, "OptOutListArn", js.undefined)
    
    inline def setOptOutListName(value: OptOutListName): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setOptOutListNameUndefined: Self = StObject.set(x, "OptOutListName", js.undefined)
    
    inline def setOptedOutNumber(value: PhoneNumber): Self = StObject.set(x, "OptedOutNumber", value.asInstanceOf[js.Any])
    
    inline def setOptedOutNumberUndefined: Self = StObject.set(x, "OptedOutNumber", js.undefined)
    
    inline def setOptedOutTimestamp(value: js.Date): Self = StObject.set(x, "OptedOutTimestamp", value.asInstanceOf[js.Any])
    
    inline def setOptedOutTimestampUndefined: Self = StObject.set(x, "OptedOutTimestamp", js.undefined)
  }
}
