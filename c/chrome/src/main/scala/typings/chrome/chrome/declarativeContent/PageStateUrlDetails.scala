package typings.chrome.chrome.declarativeContent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageStateUrlDetails extends js.Object {
  /** Optional. Matches if the host name of the URL contains a specified string. To test whether a host name component has a prefix 'foo', use hostContains: '.foo'. This matches 'www.foobar.com' and 'foo.com', because an implicit dot is added at the beginning of the host name. Similarly, hostContains can be used to match against component suffix ('foo.') and to exactly match against components ('.foo.'). Suffix- and exact-matching for the last components need to be done separately using hostSuffix, because no implicit dot is added at the end of the host name.  */
  var hostContains: js.UndefOr[String] = js.native
  /** Optional. Matches if the host name of the URL is equal to a specified string.  */
  var hostEquals: js.UndefOr[String] = js.native
  /** Optional. Matches if the host name of the URL starts with a specified string.  */
  var hostPrefix: js.UndefOr[String] = js.native
  /** Optional. Matches if the host name of the URL ends with a specified string.  */
  var hostSuffix: js.UndefOr[String] = js.native
  /** Optional. Matches if the URL without query segment and fragment identifier matches a specified regular expression. Port numbers are stripped from the URL if they match the default port number. The regular expressions use the RE2 syntax.  */
  var originAndPathMatches: js.UndefOr[String] = js.native
  /** Optional. Matches if the path segment of the URL contains a specified string.  */
  var pathContains: js.UndefOr[String] = js.native
  /** Optional. Matches if the path segment of the URL is equal to a specified string.  */
  var pathEquals: js.UndefOr[String] = js.native
  /** Optional. Matches if the path segment of the URL starts with a specified string.  */
  var pathPrefix: js.UndefOr[String] = js.native
  /** Optional. Matches if the path segment of the URL ends with a specified string.  */
  var pathSuffix: js.UndefOr[String] = js.native
  /** Optional. Matches if the port of the URL is contained in any of the specified port lists. For example [80, 443, [1000, 1200]] matches all requests on port 80, 443 and in the range 1000-1200.  */
  var ports: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  /** Optional. Matches if the query segment of the URL contains a specified string.  */
  var queryContains: js.UndefOr[String] = js.native
  /** Optional. Matches if the query segment of the URL is equal to a specified string.  */
  var queryEquals: js.UndefOr[String] = js.native
  /** Optional. Matches if the query segment of the URL starts with a specified string.  */
  var queryPrefix: js.UndefOr[String] = js.native
  /** Optional. Matches if the query segment of the URL ends with a specified string.  */
  var querySuffix: js.UndefOr[String] = js.native
  /** Optional. Matches if the scheme of the URL is equal to any of the schemes specified in the array.  */
  var schemes: js.UndefOr[js.Array[String]] = js.native
  /** Optional. Matches if the URL (without fragment identifier) contains a specified string. Port numbers are stripped from the URL if they match the default port number.  */
  var urlContains: js.UndefOr[String] = js.native
  /** Optional. Matches if the URL (without fragment identifier) is equal to a specified string. Port numbers are stripped from the URL if they match the default port number.  */
  var urlEquals: js.UndefOr[String] = js.native
  /** Optional. Matches if the URL (without fragment identifier) matches a specified regular expression. Port numbers are stripped from the URL if they match the default port number. The regular expressions use the RE2 syntax.  */
  var urlMatches: js.UndefOr[String] = js.native
  /** Optional. Matches if the URL (without fragment identifier) starts with a specified string. Port numbers are stripped from the URL if they match the default port number.  */
  var urlPrefix: js.UndefOr[String] = js.native
  /** Optional. Matches if the URL (without fragment identifier) ends with a specified string. Port numbers are stripped from the URL if they match the default port number.  */
  var urlSuffix: js.UndefOr[String] = js.native
}

object PageStateUrlDetails {
  @scala.inline
  def apply(): PageStateUrlDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageStateUrlDetails]
  }
  @scala.inline
  implicit class PageStateUrlDetailsOps[Self <: PageStateUrlDetails] (val x: Self) extends AnyVal {
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
    def setHostContains(value: String): Self = this.set("hostContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostContains: Self = this.set("hostContains", js.undefined)
    @scala.inline
    def setHostEquals(value: String): Self = this.set("hostEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostEquals: Self = this.set("hostEquals", js.undefined)
    @scala.inline
    def setHostPrefix(value: String): Self = this.set("hostPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostPrefix: Self = this.set("hostPrefix", js.undefined)
    @scala.inline
    def setHostSuffix(value: String): Self = this.set("hostSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostSuffix: Self = this.set("hostSuffix", js.undefined)
    @scala.inline
    def setOriginAndPathMatches(value: String): Self = this.set("originAndPathMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginAndPathMatches: Self = this.set("originAndPathMatches", js.undefined)
    @scala.inline
    def setPathContains(value: String): Self = this.set("pathContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathContains: Self = this.set("pathContains", js.undefined)
    @scala.inline
    def setPathEquals(value: String): Self = this.set("pathEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathEquals: Self = this.set("pathEquals", js.undefined)
    @scala.inline
    def setPathPrefix(value: String): Self = this.set("pathPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathPrefix: Self = this.set("pathPrefix", js.undefined)
    @scala.inline
    def setPathSuffix(value: String): Self = this.set("pathSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathSuffix: Self = this.set("pathSuffix", js.undefined)
    @scala.inline
    def setPortsVarargs(value: (Double | js.Array[Double])*): Self = this.set("ports", js.Array(value :_*))
    @scala.inline
    def setPorts(value: js.Array[Double | js.Array[Double]]): Self = this.set("ports", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
    @scala.inline
    def setQueryContains(value: String): Self = this.set("queryContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryContains: Self = this.set("queryContains", js.undefined)
    @scala.inline
    def setQueryEquals(value: String): Self = this.set("queryEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryEquals: Self = this.set("queryEquals", js.undefined)
    @scala.inline
    def setQueryPrefix(value: String): Self = this.set("queryPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryPrefix: Self = this.set("queryPrefix", js.undefined)
    @scala.inline
    def setQuerySuffix(value: String): Self = this.set("querySuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuerySuffix: Self = this.set("querySuffix", js.undefined)
    @scala.inline
    def setSchemesVarargs(value: String*): Self = this.set("schemes", js.Array(value :_*))
    @scala.inline
    def setSchemes(value: js.Array[String]): Self = this.set("schemes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemes: Self = this.set("schemes", js.undefined)
    @scala.inline
    def setUrlContains(value: String): Self = this.set("urlContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlContains: Self = this.set("urlContains", js.undefined)
    @scala.inline
    def setUrlEquals(value: String): Self = this.set("urlEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlEquals: Self = this.set("urlEquals", js.undefined)
    @scala.inline
    def setUrlMatches(value: String): Self = this.set("urlMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlMatches: Self = this.set("urlMatches", js.undefined)
    @scala.inline
    def setUrlPrefix(value: String): Self = this.set("urlPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlPrefix: Self = this.set("urlPrefix", js.undefined)
    @scala.inline
    def setUrlSuffix(value: String): Self = this.set("urlSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlSuffix: Self = this.set("urlSuffix", js.undefined)
  }
  
}

