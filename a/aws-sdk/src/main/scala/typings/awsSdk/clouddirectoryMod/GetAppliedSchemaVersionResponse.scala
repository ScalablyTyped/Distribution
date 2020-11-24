package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppliedSchemaVersionResponse extends js.Object {
  
  /**
    * Current applied schema ARN, including the minor version in use if one was provided.
    */
  var AppliedSchemaArn: js.UndefOr[Arn] = js.native
}
object GetAppliedSchemaVersionResponse {
  
  @scala.inline
  def apply(): GetAppliedSchemaVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppliedSchemaVersionResponse]
  }
  
  @scala.inline
  implicit class GetAppliedSchemaVersionResponseOps[Self <: GetAppliedSchemaVersionResponse] (val x: Self) extends AnyVal {
    
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
    def setAppliedSchemaArn(value: Arn): Self = this.set("AppliedSchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliedSchemaArn: Self = this.set("AppliedSchemaArn", js.undefined)
  }
}
