package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpHeaderConditionConfig extends js.Object {
  
  /**
    * The name of the HTTP header field. The maximum size is 40 characters. The header name is case insensitive. The allowed characters are specified by RFC 7230. Wildcards are not supported. You can't use an HTTP header condition to specify the host header. Use HostHeaderConditionConfig to specify a host header condition.
    */
  var HttpHeaderName: js.UndefOr[HttpHeaderConditionName] = js.native
  
  /**
    * One or more strings to compare against the value of the HTTP header. The maximum size of each string is 128 characters. The comparison strings are case insensitive. The following wildcard characters are supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request, we search them in order until a match is found. If you specify multiple strings, the condition is satisfied if one of the strings matches the value of the HTTP header. To require that all of the strings are a match, create one condition per string.
    */
  var Values: js.UndefOr[ListOfString] = js.native
}
object HttpHeaderConditionConfig {
  
  @scala.inline
  def apply(): HttpHeaderConditionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpHeaderConditionConfig]
  }
  
  @scala.inline
  implicit class HttpHeaderConditionConfigOps[Self <: HttpHeaderConditionConfig] (val x: Self) extends AnyVal {
    
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
    def setHttpHeaderName(value: HttpHeaderConditionName): Self = this.set("HttpHeaderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpHeaderName: Self = this.set("HttpHeaderName", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: StringValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: ListOfString): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
