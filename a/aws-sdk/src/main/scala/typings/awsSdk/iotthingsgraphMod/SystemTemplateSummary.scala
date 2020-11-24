package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemTemplateSummary extends js.Object {
  
  /**
    * The ARN of the system.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The date when the system was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ID of the system.
    */
  var id: js.UndefOr[Urn] = js.native
  
  /**
    * The revision number of the system.
    */
  var revisionNumber: js.UndefOr[Version] = js.native
}
object SystemTemplateSummary {
  
  @scala.inline
  def apply(): SystemTemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemTemplateSummary]
  }
  
  @scala.inline
  implicit class SystemTemplateSummaryOps[Self <: SystemTemplateSummary] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setId(value: Urn): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setRevisionNumber(value: Version): Self = this.set("revisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionNumber: Self = this.set("revisionNumber", js.undefined)
  }
}
