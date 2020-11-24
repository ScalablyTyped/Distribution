package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTransitGatewayPrefixListReferenceResult extends js.Object {
  
  /**
    * Information about the deleted prefix list reference.
    */
  var TransitGatewayPrefixListReference: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayPrefixListReference] = js.native
}
object DeleteTransitGatewayPrefixListReferenceResult {
  
  @scala.inline
  def apply(): DeleteTransitGatewayPrefixListReferenceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayPrefixListReferenceResult]
  }
  
  @scala.inline
  implicit class DeleteTransitGatewayPrefixListReferenceResultOps[Self <: DeleteTransitGatewayPrefixListReferenceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransitGatewayPrefixListReference(value: TransitGatewayPrefixListReference): Self = this.set("TransitGatewayPrefixListReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayPrefixListReference: Self = this.set("TransitGatewayPrefixListReference", js.undefined)
  }
}
