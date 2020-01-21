package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CORSRule extends js.Object {
  /**
    * Headers that are specified in the Access-Control-Request-Headers header. These headers are allowed in a preflight OPTIONS request. In response to any preflight OPTIONS request, Amazon S3 returns any requested headers that are allowed.
    */
  var AllowedHeaders: js.UndefOr[typings.awsSdk.s3Mod.AllowedHeaders] = js.native
  /**
    * An HTTP method that you allow the origin to execute. Valid values are GET, PUT, HEAD, POST, and DELETE.
    */
  var AllowedMethods: typings.awsSdk.s3Mod.AllowedMethods = js.native
  /**
    * One or more origins you want customers to be able to access the bucket from.
    */
  var AllowedOrigins: typings.awsSdk.s3Mod.AllowedOrigins = js.native
  /**
    * One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
    */
  var ExposeHeaders: js.UndefOr[typings.awsSdk.s3Mod.ExposeHeaders] = js.native
  /**
    * The time in seconds that your browser is to cache the preflight response for the specified resource.
    */
  var MaxAgeSeconds: js.UndefOr[typings.awsSdk.s3Mod.MaxAgeSeconds] = js.native
}

object CORSRule {
  @scala.inline
  def apply(
    AllowedMethods: AllowedMethods,
    AllowedOrigins: AllowedOrigins,
    AllowedHeaders: AllowedHeaders = null,
    ExposeHeaders: ExposeHeaders = null,
    MaxAgeSeconds: Int | Double = null
  ): CORSRule = {
    val __obj = js.Dynamic.literal(AllowedMethods = AllowedMethods.asInstanceOf[js.Any], AllowedOrigins = AllowedOrigins.asInstanceOf[js.Any])
    if (AllowedHeaders != null) __obj.updateDynamic("AllowedHeaders")(AllowedHeaders.asInstanceOf[js.Any])
    if (ExposeHeaders != null) __obj.updateDynamic("ExposeHeaders")(ExposeHeaders.asInstanceOf[js.Any])
    if (MaxAgeSeconds != null) __obj.updateDynamic("MaxAgeSeconds")(MaxAgeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSRule]
  }
}

