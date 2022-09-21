package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainChangeProgressResponse extends StObject {
  
  /**
    * Progress information for the configuration change that is requested in the DescribeDomainChangeProgress request. 
    */
  var ChangeProgressStatus: js.UndefOr[ChangeProgressStatusDetails] = js.undefined
}
object DescribeDomainChangeProgressResponse {
  
  inline def apply(): DescribeDomainChangeProgressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainChangeProgressResponse]
  }
  
  extension [Self <: DescribeDomainChangeProgressResponse](x: Self) {
    
    inline def setChangeProgressStatus(value: ChangeProgressStatusDetails): Self = StObject.set(x, "ChangeProgressStatus", value.asInstanceOf[js.Any])
    
    inline def setChangeProgressStatusUndefined: Self = StObject.set(x, "ChangeProgressStatus", js.undefined)
  }
}
