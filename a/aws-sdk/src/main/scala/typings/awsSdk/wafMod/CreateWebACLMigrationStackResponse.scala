package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

