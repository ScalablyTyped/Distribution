package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleCondition extends StObject {
  
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
    * The condition value. Specify only when Field is host-header or path-pattern. Alternatively, to specify multiple host names or multiple path patterns, use HostHeaderConfig or PathPatternConfig. If Field is host-header and you are not using HostHeaderConfig, you can specify a single host name (for example, my.example.com) in Values. A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following characters.   A-Z, a-z, 0-9   - .   * (matches 0 or more characters)   ? (matches exactly 1 character)   If Field is path-pattern and you are not using PathPatternConfig, you can specify a single path pattern (for example, /img/ *) in Values. A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following characters.   A-Z, a-z, 0-9   _ - . $ / ~ " ' @ : +   &amp; (using &amp;amp;)   * (matches 0 or more characters)   ? (matches exactly 1 character)  
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
  implicit class RuleConditionMutableBuilder[Self <: RuleCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: ConditionFieldName): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "Field", js.undefined)
    
    @scala.inline
    def setHostHeaderConfig(value: HostHeaderConditionConfig): Self = StObject.set(x, "HostHeaderConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostHeaderConfigUndefined: Self = StObject.set(x, "HostHeaderConfig", js.undefined)
    
    @scala.inline
    def setHttpHeaderConfig(value: HttpHeaderConditionConfig): Self = StObject.set(x, "HttpHeaderConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpHeaderConfigUndefined: Self = StObject.set(x, "HttpHeaderConfig", js.undefined)
    
    @scala.inline
    def setHttpRequestMethodConfig(value: HttpRequestMethodConditionConfig): Self = StObject.set(x, "HttpRequestMethodConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRequestMethodConfigUndefined: Self = StObject.set(x, "HttpRequestMethodConfig", js.undefined)
    
    @scala.inline
    def setPathPatternConfig(value: PathPatternConditionConfig): Self = StObject.set(x, "PathPatternConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathPatternConfigUndefined: Self = StObject.set(x, "PathPatternConfig", js.undefined)
    
    @scala.inline
    def setQueryStringConfig(value: QueryStringConditionConfig): Self = StObject.set(x, "QueryStringConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringConfigUndefined: Self = StObject.set(x, "QueryStringConfig", js.undefined)
    
    @scala.inline
    def setSourceIpConfig(value: SourceIpConditionConfig): Self = StObject.set(x, "SourceIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIpConfigUndefined: Self = StObject.set(x, "SourceIpConfig", js.undefined)
    
    @scala.inline
    def setValues(value: ListOfString): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: StringValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
