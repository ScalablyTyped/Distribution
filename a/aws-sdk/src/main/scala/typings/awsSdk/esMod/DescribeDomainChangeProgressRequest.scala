package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainChangeProgressRequest extends StObject {
  
  /**
    * The specific change ID for which you want to get progress information. This is an optional parameter. If omitted, the service returns information about the most recent configuration change. 
    */
  var ChangeId: js.UndefOr[GUID] = js.undefined
  
  /**
    * The domain you want to get the progress information about.
    */
  var DomainName: typings.awsSdk.esMod.DomainName
}
object DescribeDomainChangeProgressRequest {
  
  inline def apply(DomainName: DomainName): DescribeDomainChangeProgressRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainChangeProgressRequest]
  }
  
  extension [Self <: DescribeDomainChangeProgressRequest](x: Self) {
    
    inline def setChangeId(value: GUID): Self = StObject.set(x, "ChangeId", value.asInstanceOf[js.Any])
    
    inline def setChangeIdUndefined: Self = StObject.set(x, "ChangeId", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
