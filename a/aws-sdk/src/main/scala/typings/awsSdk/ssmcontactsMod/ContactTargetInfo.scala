package typings.awsSdk.ssmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactTargetInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact.
    */
  var ContactId: js.UndefOr[SsmContactsArn] = js.undefined
  
  /**
    * A Boolean value determining if the contact's acknowledgement stops the progress of stages in the plan.
    */
  var IsEssential: typings.awsSdk.ssmcontactsMod.IsEssential
}
object ContactTargetInfo {
  
  inline def apply(IsEssential: IsEssential): ContactTargetInfo = {
    val __obj = js.Dynamic.literal(IsEssential = IsEssential.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactTargetInfo]
  }
  
  extension [Self <: ContactTargetInfo](x: Self) {
    
    inline def setContactId(value: SsmContactsArn): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setContactIdUndefined: Self = StObject.set(x, "ContactId", js.undefined)
    
    inline def setIsEssential(value: IsEssential): Self = StObject.set(x, "IsEssential", value.asInstanceOf[js.Any])
  }
}
