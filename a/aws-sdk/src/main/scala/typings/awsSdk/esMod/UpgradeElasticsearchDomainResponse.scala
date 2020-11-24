package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeElasticsearchDomainResponse extends js.Object {
  
  var DomainName: js.UndefOr[typings.awsSdk.esMod.DomainName] = js.native
  
  /**
    *  This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not actually perform the Upgrade. 
    */
  var PerformCheckOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The version of Elasticsearch that you intend to upgrade the domain to.
    */
  var TargetVersion: js.UndefOr[ElasticsearchVersionString] = js.native
}
object UpgradeElasticsearchDomainResponse {
  
  @scala.inline
  def apply(): UpgradeElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeElasticsearchDomainResponse]
  }
  
  @scala.inline
  implicit class UpgradeElasticsearchDomainResponseOps[Self <: UpgradeElasticsearchDomainResponse] (val x: Self) extends AnyVal {
    
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
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    
    @scala.inline
    def setPerformCheckOnly(value: Boolean): Self = this.set("PerformCheckOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformCheckOnly: Self = this.set("PerformCheckOnly", js.undefined)
    
    @scala.inline
    def setTargetVersion(value: ElasticsearchVersionString): Self = this.set("TargetVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetVersion: Self = this.set("TargetVersion", js.undefined)
  }
}
