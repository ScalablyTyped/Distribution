package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainControllersResult extends StObject {
  
  /**
    * List of the DomainController objects that were retrieved.
    */
  var DomainControllers: js.UndefOr[typings.awsSdk.directoryserviceMod.DomainControllers] = js.undefined
  
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeDomainControllers retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.undefined
}
object DescribeDomainControllersResult {
  
  inline def apply(): DescribeDomainControllersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainControllersResult]
  }
  
  extension [Self <: DescribeDomainControllersResult](x: Self) {
    
    inline def setDomainControllers(value: DomainControllers): Self = StObject.set(x, "DomainControllers", value.asInstanceOf[js.Any])
    
    inline def setDomainControllersUndefined: Self = StObject.set(x, "DomainControllers", js.undefined)
    
    inline def setDomainControllersVarargs(value: DomainController*): Self = StObject.set(x, "DomainControllers", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
