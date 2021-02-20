package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeElasticsearchDomainRequest extends StObject {
  
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
  implicit class UpgradeElasticsearchDomainRequestMutableBuilder[Self <: UpgradeElasticsearchDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformCheckOnly(value: Boolean): Self = StObject.set(x, "PerformCheckOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformCheckOnlyUndefined: Self = StObject.set(x, "PerformCheckOnly", js.undefined)
    
    @scala.inline
    def setTargetVersion(value: ElasticsearchVersionString): Self = StObject.set(x, "TargetVersion", value.asInstanceOf[js.Any])
  }
}
