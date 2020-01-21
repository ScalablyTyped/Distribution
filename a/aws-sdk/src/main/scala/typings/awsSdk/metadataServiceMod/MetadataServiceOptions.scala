package typings.awsSdk.metadataServiceMod

import typings.awsSdk.AnonTimeout
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
  var httpOptions: js.UndefOr[AnonTimeout] = js.native
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
  def apply(
    host: String = null,
    httpOptions: AnonTimeout = null,
    maxRetries: Int | Double = null,
    retryDelayOptions: js.Any = null
  ): MetadataServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (retryDelayOptions != null) __obj.updateDynamic("retryDelayOptions")(retryDelayOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataServiceOptions]
  }
}

