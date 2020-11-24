package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSchemaFromJsonResponse extends js.Object {
  
  /**
    * The ARN of the schema to update.
    */
  var Arn: js.UndefOr[typings.awsSdk.clouddirectoryMod.Arn] = js.native
}
object PutSchemaFromJsonResponse {
  
  @scala.inline
  def apply(): PutSchemaFromJsonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSchemaFromJsonResponse]
  }
  
  @scala.inline
  implicit class PutSchemaFromJsonResponseOps[Self <: PutSchemaFromJsonResponse] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
  }
}
