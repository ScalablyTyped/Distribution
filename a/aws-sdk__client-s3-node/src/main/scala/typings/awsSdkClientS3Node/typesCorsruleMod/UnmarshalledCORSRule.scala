package typings.awsSdkClientS3Node.typesCorsruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledCORSRule extends CORSRule {
  /**
    * <p>Specifies which headers are allowed in a pre-flight OPTIONS request.</p>
    */
  @JSName("AllowedHeaders")
  var AllowedHeaders_UnmarshalledCORSRule: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>Identifies HTTP methods that the domain/origin specified in the rule is allowed to execute.</p>
    */
  @JSName("AllowedMethods")
  var AllowedMethods_UnmarshalledCORSRule: js.Array[String]
  /**
    * <p>One or more origins you want customers to be able to access the bucket from.</p>
    */
  @JSName("AllowedOrigins")
  var AllowedOrigins_UnmarshalledCORSRule: js.Array[String]
  /**
    * <p>One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).</p>
    */
  @JSName("ExposeHeaders")
  var ExposeHeaders_UnmarshalledCORSRule: js.UndefOr[js.Array[String]] = js.undefined
}

object UnmarshalledCORSRule {
  @scala.inline
  def apply(
    AllowedMethods: js.Array[String],
    AllowedOrigins: js.Array[String],
    AllowedHeaders: js.Array[String] = null,
    ExposeHeaders: js.Array[String] = null,
    MaxAgeSeconds: Int | Double = null
  ): UnmarshalledCORSRule = {
    val __obj = js.Dynamic.literal(AllowedMethods = AllowedMethods.asInstanceOf[js.Any], AllowedOrigins = AllowedOrigins.asInstanceOf[js.Any])
    if (AllowedHeaders != null) __obj.updateDynamic("AllowedHeaders")(AllowedHeaders.asInstanceOf[js.Any])
    if (ExposeHeaders != null) __obj.updateDynamic("ExposeHeaders")(ExposeHeaders.asInstanceOf[js.Any])
    if (MaxAgeSeconds != null) __obj.updateDynamic("MaxAgeSeconds")(MaxAgeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCORSRule]
  }
}

