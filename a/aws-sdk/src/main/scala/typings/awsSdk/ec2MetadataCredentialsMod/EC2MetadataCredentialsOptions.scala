package typings.awsSdk.ec2MetadataCredentialsMod

import typings.awsSdk.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2MetadataCredentialsOptions extends js.Object {
  var httpOptions: js.UndefOr[Timeout] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
}

object EC2MetadataCredentialsOptions {
  @scala.inline
  def apply(httpOptions: Timeout = null, maxRetries: js.UndefOr[Double] = js.undefined): EC2MetadataCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2MetadataCredentialsOptions]
  }
}

