package typings.awsSdkClientS3Node.typesWebsiteConfigurationMod

import typings.awsSdkClientS3Node.typesErrorDocumentMod.ErrorDocument
import typings.awsSdkClientS3Node.typesIndexDocumentMod.IndexDocument
import typings.awsSdkClientS3Node.typesRedirectAllRequestsToMod.RedirectAllRequestsTo
import typings.awsSdkClientS3Node.typesRoutingRuleMod.RoutingRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebsiteConfiguration extends js.Object {
  
  /**
    * _ErrorDocument shape
    */
  var ErrorDocument: js.UndefOr[typings.awsSdkClientS3Node.typesErrorDocumentMod.ErrorDocument] = js.native
  
  /**
    * _IndexDocument shape
    */
  var IndexDocument: js.UndefOr[typings.awsSdkClientS3Node.typesIndexDocumentMod.IndexDocument] = js.native
  
  /**
    * _RedirectAllRequestsTo shape
    */
  var RedirectAllRequestsTo: js.UndefOr[typings.awsSdkClientS3Node.typesRedirectAllRequestsToMod.RedirectAllRequestsTo] = js.native
  
  /**
    * _RoutingRules shape
    */
  var RoutingRules: js.UndefOr[js.Array[RoutingRule] | Iterable[RoutingRule]] = js.native
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
    def setRoutingRules(value: js.Array[RoutingRule] | Iterable[RoutingRule]): Self = this.set("RoutingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingRules: Self = this.set("RoutingRules", js.undefined)
  }
}
