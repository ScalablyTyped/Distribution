package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTransitGatewayAttachmentPropagationsResult extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the propagation route tables.
    */
  var TransitGatewayAttachmentPropagations: js.UndefOr[TransitGatewayAttachmentPropagationList] = js.native
}
object GetTransitGatewayAttachmentPropagationsResult {
  
  @scala.inline
  def apply(): GetTransitGatewayAttachmentPropagationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayAttachmentPropagationsResult]
  }
  
  @scala.inline
  implicit class GetTransitGatewayAttachmentPropagationsResultOps[Self <: GetTransitGatewayAttachmentPropagationsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentPropagationsVarargs(value: TransitGatewayAttachmentPropagation*): Self = this.set("TransitGatewayAttachmentPropagations", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayAttachmentPropagations(value: TransitGatewayAttachmentPropagationList): Self = this.set("TransitGatewayAttachmentPropagations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayAttachmentPropagations: Self = this.set("TransitGatewayAttachmentPropagations", js.undefined)
  }
}
