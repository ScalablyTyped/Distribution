package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeElasticsearchDomainRequest extends js.Object {
  
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
  
  /**
    *  This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not actually perform the Upgrade. 
    */
  var PerformCheckOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The version of Elasticsearch that you intend to upgrade the domain to.
    */
  var TargetVersion: ElasticsearchVersionString = js.native
}
object UpgradeElasticsearchDomainRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, TargetVersion: ElasticsearchVersionString): UpgradeElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], TargetVersion = TargetVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeElasticsearchDomainRequest]
  }
  
  @scala.inline
  implicit class UpgradeElasticsearchDomainRequestOps[Self <: UpgradeElasticsearchDomainRequest] (val x: Self) extends AnyVal {
    
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
    def setTargetVersion(value: ElasticsearchVersionString): Self = this.set("TargetVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformCheckOnly(value: Boolean): Self = this.set("PerformCheckOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformCheckOnly: Self = this.set("PerformCheckOnly", js.undefined)
  }
}
