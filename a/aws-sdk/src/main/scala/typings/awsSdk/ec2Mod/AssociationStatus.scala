package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationStatus extends StObject {
  
  /**
    * The state of the target network association.
    */
  var Code: js.UndefOr[AssociationStatusCode] = js.native
  
  /**
    * A message about the status of the target network association, if applicable.
    */
  var Message: js.UndefOr[String] = js.native
}
object AssociationStatus {
  
  @scala.inline
  def apply(): AssociationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationStatus]
  }
  
  @scala.inline
  implicit class AssociationStatusMutableBuilder[Self <: AssociationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: AssociationStatusCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
