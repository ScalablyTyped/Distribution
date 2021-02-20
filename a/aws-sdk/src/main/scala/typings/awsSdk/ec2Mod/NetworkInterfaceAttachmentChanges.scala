package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterfaceAttachmentChanges extends StObject {
  
  /**
    * The ID of the network interface attachment.
    */
  var AttachmentId: js.UndefOr[NetworkInterfaceAttachmentId] = js.native
  
  /**
    * Indicates whether the network interface is deleted when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
}
object NetworkInterfaceAttachmentChanges {
  
  @scala.inline
  def apply(): NetworkInterfaceAttachmentChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceAttachmentChanges]
  }
  
  @scala.inline
  implicit class NetworkInterfaceAttachmentChangesMutableBuilder[Self <: NetworkInterfaceAttachmentChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentId(value: NetworkInterfaceAttachmentId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentIdUndefined: Self = StObject.set(x, "AttachmentId", js.undefined)
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
  }
}
