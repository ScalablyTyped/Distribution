package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldToMatch extends js.Object {
  /**
    * When the value of Type is HEADER, enter the name of the header that you want AWS WAF to search, for example, User-Agent or Referer. The name of the header is not case sensitive. When the value of Type is SINGLE_QUERY_ARG, enter the name of the parameter that you want AWS WAF to search, for example, UserName or SalesRegion. The parameter name is not case sensitive. If the value of Type is any other value, omit Data.
    */
  var Data: js.UndefOr[MatchFieldData] = js.native
  /**
    * The part of the web request that you want AWS WAF to search for a specified string. Parts of a request that you can search include the following:    HEADER: A specified request header, for example, the value of the User-Agent or Referer header. If you choose HEADER for the type, specify the name of the header in Data.    METHOD: The HTTP method, which indicated the type of operation that the request is asking the origin to perform. Amazon CloudFront supports the following methods: DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT.    QUERY_STRING: A query string, which is the part of a URL that appears after a ? character, if any.    URI: The part of a web request that identifies a resource, for example, /images/daily-ad.jpg.    BODY: The part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form. The request body immediately follows the request headers. Note that only the first 8192 bytes of the request body are forwarded to AWS WAF for inspection. To allow or block requests based on the length of the body, you can create a size constraint set. For more information, see CreateSizeConstraintSet.     SINGLE_QUERY_ARG: The parameter in the query string that you will inspect, such as UserName or SalesRegion. The maximum length for SINGLE_QUERY_ARG is 30 characters.    ALL_QUERY_ARGS: Similar to SINGLE_QUERY_ARG, but rather than inspecting a single parameter, AWS WAF will inspect all parameters within the query for the value or regex pattern that you specify in TargetString.  
    */
  var Type: MatchFieldType = js.native
}

object FieldToMatch {
  @scala.inline
  def apply(Type: MatchFieldType): FieldToMatch = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldToMatch]
  }
  @scala.inline
  implicit class FieldToMatchOps[Self <: FieldToMatch] (val x: Self) extends AnyVal {
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
    def setType(value: MatchFieldType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: MatchFieldData): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
  }
  
}

