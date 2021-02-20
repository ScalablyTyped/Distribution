package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachNetworkInterfaceResult extends StObject {
  
  /**
    * The ID of the network interface attachment.
    */
  var AttachmentId: js.UndefOr[String] = js.native
  
  /**
    * The index of the network card.
    */
  var NetworkCardIndex: js.UndefOr[Integer] = js.native
}
object AttachNetworkInterfaceResult {
  
  @scala.inline
  def apply(): AttachNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachNetworkInterfaceResult]
  }
  
  @scala.inline
  implicit class AttachNetworkInterfaceResultMutableBuilder[Self <: AttachNetworkInterfaceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentId(value: String): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentIdUndefined: Self = StObject.set(x, "AttachmentId", js.undefined)
    
    @scala.inline
    def setNetworkCardIndex(value: Integer): Self = StObject.set(x, "NetworkCardIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkCardIndexUndefined: Self = StObject.set(x, "NetworkCardIndex", js.undefined)
  }
}
