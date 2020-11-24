package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWebACLMigrationStackResponse extends js.Object {
  
  /**
    * The URL of the template created in Amazon S3. 
    */
  var S3ObjectUrl: typings.awsSdk.wafMod.S3ObjectUrl = js.native
}
object CreateWebACLMigrationStackResponse {
  
  @scala.inline
  def apply(S3ObjectUrl: S3ObjectUrl): CreateWebACLMigrationStackResponse = {
    val __obj = js.Dynamic.literal(S3ObjectUrl = S3ObjectUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebACLMigrationStackResponse]
  }
  
  @scala.inline
  implicit class CreateWebACLMigrationStackResponseOps[Self <: CreateWebACLMigrationStackResponse] (val x: Self) extends AnyVal {
    
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
    def setS3ObjectUrl(value: S3ObjectUrl): Self = this.set("S3ObjectUrl", value.asInstanceOf[js.Any])
  }
}
