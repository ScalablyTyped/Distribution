package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackagesResult extends StObject {
  
  /**
    *  If there are additional results, this is the token for the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The list of returned  PackageSummary  objects. 
    */
  var packages: js.UndefOr[PackageSummaryList] = js.undefined
}
object ListPackagesResult {
  
  inline def apply(): ListPackagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagesResult]
  }
  
  extension [Self <: ListPackagesResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPackages(value: PackageSummaryList): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: PackageSummary*): Self = StObject.set(x, "packages", js.Array(value :_*))
  }
}
