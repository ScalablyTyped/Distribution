package typings.awsSdk.metadataServiceMod

import typings.awsSdk.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataServiceOptions extends js.Object {
  /**
    * the hostname of the instance metadata service.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * a map of options to pass to the underlying HTTP request.
    */
  var httpOptions: js.UndefOr[Timeout] = js.native
  /**
    * the maximum number of retries to perform for timeout errors.
    */
  var maxRetries: js.UndefOr[Double] = js.native
  /**
    * A set of options to configure the retry delay on retryable errors. See AWS.Config for details.
    */
  var retryDelayOptions: js.UndefOr[js.Any] = js.native
}

object MetadataServiceOptions {
  @scala.inline
  def apply(): MetadataServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataServiceOptions]
  }
  @scala.inline
  implicit class MetadataServiceOptionsOps[Self <: MetadataServiceOptions] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setHttpOptions(value: Timeout): Self = this.set("httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpOptions: Self = this.set("httpOptions", js.undefined)
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    @scala.inline
    def setRetryDelayOptions(value: js.Any): Self = this.set("retryDelayOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryDelayOptions: Self = this.set("retryDelayOptions", js.undefined)
  }
  
}

