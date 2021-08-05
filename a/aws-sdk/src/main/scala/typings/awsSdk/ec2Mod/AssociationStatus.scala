package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationStatus extends StObject {
  
  /**
    * The state of the target network association.
    */
  var Code: js.UndefOr[AssociationStatusCode] = js.undefined
  
  /**
    * A message about the status of the target network association, if applicable.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object AssociationStatus {
  
  inline def apply(): AssociationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationStatus]
  }
  
  extension [Self <: AssociationStatus](x: Self) {
    
    inline def setCode(value: AssociationStatusCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
