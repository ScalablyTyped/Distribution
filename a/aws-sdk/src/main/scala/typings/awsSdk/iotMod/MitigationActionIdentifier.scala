package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MitigationActionIdentifier extends js.Object {
  
  /**
    * The IAM role ARN used to apply this mitigation action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.native
  
  /**
    * The friendly name of the mitigation action.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.native
  
  /**
    * The date when this mitigation action was created.
    */
  var creationDate: js.UndefOr[Timestamp] = js.native
}
object MitigationActionIdentifier {
  
  @scala.inline
  def apply(): MitigationActionIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MitigationActionIdentifier]
  }
  
  @scala.inline
  implicit class MitigationActionIdentifierOps[Self <: MitigationActionIdentifier] (val x: Self) extends AnyVal {
    
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
    def setActionArn(value: MitigationActionArn): Self = this.set("actionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionArn: Self = this.set("actionArn", js.undefined)
    
    @scala.inline
    def setActionName(value: MitigationActionName): Self = this.set("actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionName: Self = this.set("actionName", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
  }
}
