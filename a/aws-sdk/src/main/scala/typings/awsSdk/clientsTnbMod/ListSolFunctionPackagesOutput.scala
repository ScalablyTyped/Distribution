package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolFunctionPackagesOutput extends StObject {
  
  /**
    * Function packages. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network.
    */
  var functionPackages: ListSolFunctionPackageResources
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListSolFunctionPackagesOutput {
  
  inline def apply(functionPackages: ListSolFunctionPackageResources): ListSolFunctionPackagesOutput = {
    val __obj = js.Dynamic.literal(functionPackages = functionPackages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSolFunctionPackagesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSolFunctionPackagesOutput] (val x: Self) extends AnyVal {
    
    inline def setFunctionPackages(value: ListSolFunctionPackageResources): Self = StObject.set(x, "functionPackages", value.asInstanceOf[js.Any])
    
    inline def setFunctionPackagesVarargs(value: ListSolFunctionPackageInfo*): Self = StObject.set(x, "functionPackages", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
