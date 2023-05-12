package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolNetworkPackagesOutput extends StObject {
  
  /**
    * Network packages. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
    */
  var networkPackages: ListSolNetworkPackageResources
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListSolNetworkPackagesOutput {
  
  inline def apply(networkPackages: ListSolNetworkPackageResources): ListSolNetworkPackagesOutput = {
    val __obj = js.Dynamic.literal(networkPackages = networkPackages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSolNetworkPackagesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSolNetworkPackagesOutput] (val x: Self) extends AnyVal {
    
    inline def setNetworkPackages(value: ListSolNetworkPackageResources): Self = StObject.set(x, "networkPackages", value.asInstanceOf[js.Any])
    
    inline def setNetworkPackagesVarargs(value: ListSolNetworkPackageInfo*): Self = StObject.set(x, "networkPackages", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
