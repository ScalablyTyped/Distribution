package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeElasticsearchDomainResponse extends StObject {
  
  var DomainName: js.UndefOr[typings.awsSdk.esMod.DomainName] = js.undefined
  
  /**
    *  This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not actually perform the Upgrade. 
    */
  var PerformCheckOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of Elasticsearch that you intend to upgrade the domain to.
    */
  var TargetVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
}
object UpgradeElasticsearchDomainResponse {
  
  inline def apply(): UpgradeElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeElasticsearchDomainResponse]
  }
  
  extension [Self <: UpgradeElasticsearchDomainResponse](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setPerformCheckOnly(value: Boolean): Self = StObject.set(x, "PerformCheckOnly", value.asInstanceOf[js.Any])
    
    inline def setPerformCheckOnlyUndefined: Self = StObject.set(x, "PerformCheckOnly", js.undefined)
    
    inline def setTargetVersion(value: ElasticsearchVersionString): Self = StObject.set(x, "TargetVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionUndefined: Self = StObject.set(x, "TargetVersion", js.undefined)
  }
}
