package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcInterfaceAttachment extends StObject {
  
  /**
    * The name of the VPC interface to use for this output.
    */
  var VpcInterfaceName: js.UndefOr[string] = js.undefined
}
object VpcInterfaceAttachment {
  
  @scala.inline
  def apply(): VpcInterfaceAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcInterfaceAttachment]
  }
  
  @scala.inline
  implicit class VpcInterfaceAttachmentMutableBuilder[Self <: VpcInterfaceAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcInterfaceName(value: string): Self = StObject.set(x, "VpcInterfaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcInterfaceNameUndefined: Self = StObject.set(x, "VpcInterfaceName", js.undefined)
  }
}
