package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAuditSuppressionResponse extends js.Object {
  
  var checkName: js.UndefOr[AuditCheckName] = js.native
  
  /**
    *  The description of the audit suppression. 
    */
  var description: js.UndefOr[AuditDescription] = js.native
  
  /**
    *  The epoch timestamp in seconds at which this suppression expires. 
    */
  var expirationDate: js.UndefOr[Timestamp] = js.native
  
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.native
  
  /**
    *  Indicates whether a suppression should exist indefinitely or not. 
    */
  var suppressIndefinitely: js.UndefOr[SuppressIndefinitely] = js.native
}
object DescribeAuditSuppressionResponse {
  
  @scala.inline
  def apply(): DescribeAuditSuppressionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditSuppressionResponse]
  }
  
  @scala.inline
  implicit class DescribeAuditSuppressionResponseOps[Self <: DescribeAuditSuppressionResponse] (val x: Self) extends AnyVal {
    
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
    def setCheckName(value: AuditCheckName): Self = this.set("checkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckName: Self = this.set("checkName", js.undefined)
    
    @scala.inline
    def setDescription(value: AuditDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: Timestamp): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = this.set("resourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceIdentifier: Self = this.set("resourceIdentifier", js.undefined)
    
    @scala.inline
    def setSuppressIndefinitely(value: SuppressIndefinitely): Self = this.set("suppressIndefinitely", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressIndefinitely: Self = this.set("suppressIndefinitely", js.undefined)
  }
}
