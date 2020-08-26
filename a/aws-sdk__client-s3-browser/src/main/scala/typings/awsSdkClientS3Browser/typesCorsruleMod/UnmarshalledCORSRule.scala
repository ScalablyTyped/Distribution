package typings.awsSdkClientS3Browser.typesCorsruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCORSRule extends CORSRule {
  /**
    * <p>Specifies which headers are allowed in a pre-flight OPTIONS request.</p>
    */
  @JSName("AllowedHeaders")
  var AllowedHeaders_UnmarshalledCORSRule: js.UndefOr[js.Array[String]] = js.native
  /**
    * <p>Identifies HTTP methods that the domain/origin specified in the rule is allowed to execute.</p>
    */
  @JSName("AllowedMethods")
  var AllowedMethods_UnmarshalledCORSRule: js.Array[String] = js.native
  /**
    * <p>One or more origins you want customers to be able to access the bucket from.</p>
    */
  @JSName("AllowedOrigins")
  var AllowedOrigins_UnmarshalledCORSRule: js.Array[String] = js.native
  /**
    * <p>One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).</p>
    */
  @JSName("ExposeHeaders")
  var ExposeHeaders_UnmarshalledCORSRule: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledCORSRule {
  @scala.inline
  def apply(AllowedMethods: js.Array[String], AllowedOrigins: js.Array[String]): UnmarshalledCORSRule = {
    val __obj = js.Dynamic.literal(AllowedMethods = AllowedMethods.asInstanceOf[js.Any], AllowedOrigins = AllowedOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCORSRule]
  }
  @scala.inline
  implicit class UnmarshalledCORSRuleOps[Self <: UnmarshalledCORSRule] (val x: Self) extends AnyVal {
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
    def setAllowedMethodsVarargs(value: String*): Self = this.set("AllowedMethods", js.Array(value :_*))
    @scala.inline
    def setAllowedMethods(value: js.Array[String]): Self = this.set("AllowedMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedOriginsVarargs(value: String*): Self = this.set("AllowedOrigins", js.Array(value :_*))
    @scala.inline
    def setAllowedOrigins(value: js.Array[String]): Self = this.set("AllowedOrigins", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedHeadersVarargs(value: String*): Self = this.set("AllowedHeaders", js.Array(value :_*))
    @scala.inline
    def setAllowedHeaders(value: js.Array[String]): Self = this.set("AllowedHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedHeaders: Self = this.set("AllowedHeaders", js.undefined)
    @scala.inline
    def setExposeHeadersVarargs(value: String*): Self = this.set("ExposeHeaders", js.Array(value :_*))
    @scala.inline
    def setExposeHeaders(value: js.Array[String]): Self = this.set("ExposeHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposeHeaders: Self = this.set("ExposeHeaders", js.undefined)
  }
  
}

