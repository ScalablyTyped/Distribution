package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleCondition extends js.Object {
  /**
    * The field in the HTTP request. The following are the possible values:    http-header     http-request-method     host-header     path-pattern     query-string     source-ip   
    */
  var Field: js.UndefOr[ConditionFieldName] = js.native
  /**
    * Information for a host header condition. Specify only when Field is host-header.
    */
  var HostHeaderConfig: js.UndefOr[HostHeaderConditionConfig] = js.native
  /**
    * Information for an HTTP header condition. Specify only when Field is http-header.
    */
  var HttpHeaderConfig: js.UndefOr[HttpHeaderConditionConfig] = js.native
  /**
    * Information for an HTTP method condition. Specify only when Field is http-request-method.
    */
  var HttpRequestMethodConfig: js.UndefOr[HttpRequestMethodConditionConfig] = js.native
  /**
    * Information for a path pattern condition. Specify only when Field is path-pattern.
    */
  var PathPatternConfig: js.UndefOr[PathPatternConditionConfig] = js.native
  /**
    * Information for a query string condition. Specify only when Field is query-string.
    */
  var QueryStringConfig: js.UndefOr[QueryStringConditionConfig] = js.native
  /**
    * Information for a source IP condition. Specify only when Field is source-ip.
    */
  var SourceIpConfig: js.UndefOr[SourceIpConditionConfig] = js.native
  /**
    * The condition value. You can use Values if the rule contains only host-header and path-pattern conditions. Otherwise, you can use HostHeaderConfig for host-header conditions and PathPatternConfig for path-pattern conditions. If Field is host-header, you can specify a single host name (for example, my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following characters.   A-Z, a-z, 0-9   - .   * (matches 0 or more characters)   ? (matches exactly 1 character)   If Field is path-pattern, you can specify a single path pattern (for example, /img/ *). A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following characters.   A-Z, a-z, 0-9   _ - . $ / ~ " ' @ : +   &amp; (using &amp;amp;)   * (matches 0 or more characters)   ? (matches exactly 1 character)  
    */
  var Values: js.UndefOr[ListOfString] = js.native
}

object RuleCondition {
  @scala.inline
  def apply(): RuleCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleCondition]
  }
  @scala.inline
  implicit class RuleConditionOps[Self <: RuleCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setField(value: ConditionFieldName): Self = this.set("Field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("Field", js.undefined)
    @scala.inline
    def setHostHeaderConfig(value: HostHeaderConditionConfig): Self = this.set("HostHeaderConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostHeaderConfig: Self = this.set("HostHeaderConfig", js.undefined)
    @scala.inline
    def setHttpHeaderConfig(value: HttpHeaderConditionConfig): Self = this.set("HttpHeaderConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpHeaderConfig: Self = this.set("HttpHeaderConfig", js.undefined)
    @scala.inline
    def setHttpRequestMethodConfig(value: HttpRequestMethodConditionConfig): Self = this.set("HttpRequestMethodConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpRequestMethodConfig: Self = this.set("HttpRequestMethodConfig", js.undefined)
    @scala.inline
    def setPathPatternConfig(value: PathPatternConditionConfig): Self = this.set("PathPatternConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathPatternConfig: Self = this.set("PathPatternConfig", js.undefined)
    @scala.inline
    def setQueryStringConfig(value: QueryStringConditionConfig): Self = this.set("QueryStringConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryStringConfig: Self = this.set("QueryStringConfig", js.undefined)
    @scala.inline
    def setSourceIpConfig(value: SourceIpConditionConfig): Self = this.set("SourceIpConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceIpConfig: Self = this.set("SourceIpConfig", js.undefined)
    @scala.inline
    def setValuesVarargs(value: StringValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: ListOfString): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
  
}

