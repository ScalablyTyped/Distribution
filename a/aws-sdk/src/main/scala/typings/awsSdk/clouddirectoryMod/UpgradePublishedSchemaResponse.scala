package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradePublishedSchemaResponse extends js.Object {
  
  /**
    * The ARN of the upgraded schema that is returned as part of the response.
    */
  var UpgradedSchemaArn: js.UndefOr[Arn] = js.native
}
object UpgradePublishedSchemaResponse {
  
  @scala.inline
  def apply(): UpgradePublishedSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradePublishedSchemaResponse]
  }
  
  @scala.inline
  implicit class UpgradePublishedSchemaResponseOps[Self <: UpgradePublishedSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUpgradedSchemaArn(value: Arn): Self = this.set("UpgradedSchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradedSchemaArn: Self = this.set("UpgradedSchemaArn", js.undefined)
  }
}
