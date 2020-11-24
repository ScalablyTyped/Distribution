package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainSuggestionsRequest extends js.Object {
  
  /**
    * A domain name that you want to use as the basis for a list of possible domain names. The top-level domain (TLD), such as .com, must be a TLD that Route 53 supports. For a list of supported TLDs, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. The domain name can contain only the following characters:   Letters a through z. Domain names are not case sensitive.   Numbers 0 through 9.   Hyphen (-). You can't specify a hyphen at the beginning or end of a label.    Period (.) to separate the labels in the name, such as the . in example.com.   Internationalized domain names are not supported for some top-level domains. To determine whether the TLD that you want to use supports internationalized domain names, see Domains that You Can Register with Amazon Route 53. 
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  
  /**
    * If OnlyAvailable is true, Route 53 returns only domain names that are available. If OnlyAvailable is false, Route 53 returns domain names without checking whether they're available to be registered. To determine whether the domain is available, you can call checkDomainAvailability for each suggestion.
    */
  var OnlyAvailable: Boolean = js.native
  
  /**
    * The number of suggested domain names that you want Route 53 to return. Specify a value between 1 and 50.
    */
  var SuggestionCount: Integer = js.native
}
object GetDomainSuggestionsRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, OnlyAvailable: Boolean, SuggestionCount: Integer): GetDomainSuggestionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], OnlyAvailable = OnlyAvailable.asInstanceOf[js.Any], SuggestionCount = SuggestionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainSuggestionsRequest]
  }
  
  @scala.inline
  implicit class GetDomainSuggestionsRequestOps[Self <: GetDomainSuggestionsRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyAvailable(value: Boolean): Self = this.set("OnlyAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionCount(value: Integer): Self = this.set("SuggestionCount", value.asInstanceOf[js.Any])
  }
}
