package typings.awsSdkClientS3Node.typesWebsiteConfigurationMod

import typings.awsSdkClientS3Node.typesErrorDocumentMod.UnmarshalledErrorDocument
import typings.awsSdkClientS3Node.typesIndexDocumentMod.UnmarshalledIndexDocument
import typings.awsSdkClientS3Node.typesRedirectAllRequestsToMod.UnmarshalledRedirectAllRequestsTo
import typings.awsSdkClientS3Node.typesRoutingRuleMod.UnmarshalledRoutingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledWebsiteConfiguration extends WebsiteConfiguration {
  
  /**
    * _ErrorDocument shape
    */
  @JSName("ErrorDocument")
  var ErrorDocument_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledErrorDocument] = js.native
  
  /**
    * _IndexDocument shape
    */
  @JSName("IndexDocument")
  var IndexDocument_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledIndexDocument] = js.native
  
  /**
    * _RedirectAllRequestsTo shape
    */
  @JSName("RedirectAllRequestsTo")
  var RedirectAllRequestsTo_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledRedirectAllRequestsTo] = js.native
  
  /**
    * _RoutingRules shape
    */
  @JSName("RoutingRules")
  var RoutingRules_UnmarshalledWebsiteConfiguration: js.UndefOr[js.Array[UnmarshalledRoutingRule]] = js.native
}
object UnmarshalledWebsiteConfiguration {
  
  @scala.inline
  def apply(): UnmarshalledWebsiteConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledWebsiteConfiguration]
  }
  
  @scala.inline
  implicit class UnmarshalledWebsiteConfigurationOps[Self <: UnmarshalledWebsiteConfiguration] (val x: Self) extends AnyVal {
    
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
    def setErrorDocument(value: UnmarshalledErrorDocument): Self = this.set("ErrorDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDocument: Self = this.set("ErrorDocument", js.undefined)
    
    @scala.inline
    def setIndexDocument(value: UnmarshalledIndexDocument): Self = this.set("IndexDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexDocument: Self = this.set("IndexDocument", js.undefined)
    
    @scala.inline
    def setRedirectAllRequestsTo(value: UnmarshalledRedirectAllRequestsTo): Self = this.set("RedirectAllRequestsTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectAllRequestsTo: Self = this.set("RedirectAllRequestsTo", js.undefined)
    
    @scala.inline
    def setRoutingRulesVarargs(value: UnmarshalledRoutingRule*): Self = this.set("RoutingRules", js.Array(value :_*))
    
    @scala.inline
    def setRoutingRules(value: js.Array[UnmarshalledRoutingRule]): Self = this.set("RoutingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingRules: Self = this.set("RoutingRules", js.undefined)
  }
}
