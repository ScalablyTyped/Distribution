package typings.awsSdkClientS3Browser.typesGlacierJobParametersMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Bulk
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Expedited
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Standard_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlacierJobParameters extends js.Object {
  /**
    * <p>Glacier retrieval tier at which the restore will be processed.</p>
    */
  var Tier: Standard_ | Bulk | Expedited | String
}

object GlacierJobParameters {
  @scala.inline
  def apply(Tier: Standard_ | Bulk | Expedited | String): GlacierJobParameters = {
    val __obj = js.Dynamic.literal(Tier = Tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlacierJobParameters]
  }
}

