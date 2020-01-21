package typings.awsSdkClientS3Node.typesCorsruleMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CORSRule extends js.Object {
  /**
    * <p>Specifies which headers are allowed in a pre-flight OPTIONS request.</p>
    */
  var AllowedHeaders: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>Identifies HTTP methods that the domain/origin specified in the rule is allowed to execute.</p>
    */
  var AllowedMethods: js.Array[String] | Iterable[String]
  /**
    * <p>One or more origins you want customers to be able to access the bucket from.</p>
    */
  var AllowedOrigins: js.Array[String] | Iterable[String]
  /**
    * <p>One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).</p>
    */
  var ExposeHeaders: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>The time in seconds that your browser is to cache the preflight response for the specified resource.</p>
    */
  var MaxAgeSeconds: js.UndefOr[Double] = js.undefined
}

object CORSRule {
  @scala.inline
  def apply(
    AllowedMethods: js.Array[String] | Iterable[String],
    AllowedOrigins: js.Array[String] | Iterable[String],
    AllowedHeaders: js.Array[String] | Iterable[String] = null,
    ExposeHeaders: js.Array[String] | Iterable[String] = null,
    MaxAgeSeconds: Int | Double = null
  ): CORSRule = {
    val __obj = js.Dynamic.literal(AllowedMethods = AllowedMethods.asInstanceOf[js.Any], AllowedOrigins = AllowedOrigins.asInstanceOf[js.Any])
    if (AllowedHeaders != null) __obj.updateDynamic("AllowedHeaders")(AllowedHeaders.asInstanceOf[js.Any])
    if (ExposeHeaders != null) __obj.updateDynamic("ExposeHeaders")(ExposeHeaders.asInstanceOf[js.Any])
    if (MaxAgeSeconds != null) __obj.updateDynamic("MaxAgeSeconds")(MaxAgeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSRule]
  }
}

