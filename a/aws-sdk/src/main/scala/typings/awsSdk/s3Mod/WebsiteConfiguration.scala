package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebsiteConfiguration extends js.Object {
  /**
    * The name of the error document for the website.
    */
  var ErrorDocument: js.UndefOr[typings.awsSdk.s3Mod.ErrorDocument] = js.native
  /**
    * The name of the index document for the website.
    */
  var IndexDocument: js.UndefOr[typings.awsSdk.s3Mod.IndexDocument] = js.native
  /**
    * The redirect behavior for every request to this bucket's website endpoint.  If you specify this property, you can't specify any other property. 
    */
  var RedirectAllRequestsTo: js.UndefOr[typings.awsSdk.s3Mod.RedirectAllRequestsTo] = js.native
  /**
    * Rules that define when a redirect is applied and the redirect behavior.
    */
  var RoutingRules: js.UndefOr[typings.awsSdk.s3Mod.RoutingRules] = js.native
}

object WebsiteConfiguration {
  @scala.inline
  def apply(): WebsiteConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsiteConfiguration]
  }
  @scala.inline
  implicit class WebsiteConfigurationOps[Self <: WebsiteConfiguration] (val x: Self) extends AnyVal {
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
    def setErrorDocument(value: ErrorDocument): Self = this.set("ErrorDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDocument: Self = this.set("ErrorDocument", js.undefined)
    @scala.inline
    def setIndexDocument(value: IndexDocument): Self = this.set("IndexDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexDocument: Self = this.set("IndexDocument", js.undefined)
    @scala.inline
    def setRedirectAllRequestsTo(value: RedirectAllRequestsTo): Self = this.set("RedirectAllRequestsTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectAllRequestsTo: Self = this.set("RedirectAllRequestsTo", js.undefined)
    @scala.inline
    def setRoutingRulesVarargs(value: RoutingRule*): Self = this.set("RoutingRules", js.Array(value :_*))
    @scala.inline
    def setRoutingRules(value: RoutingRules): Self = this.set("RoutingRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutingRules: Self = this.set("RoutingRules", js.undefined)
  }
  
}

