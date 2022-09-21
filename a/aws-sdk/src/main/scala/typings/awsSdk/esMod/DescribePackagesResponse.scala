package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackagesResponse extends StObject {
  
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of PackageDetails objects.
    */
  var PackageDetailsList: js.UndefOr[typings.awsSdk.esMod.PackageDetailsList] = js.undefined
}
object DescribePackagesResponse {
  
  inline def apply(): DescribePackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePackagesResponse]
  }
  
  extension [Self <: DescribePackagesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPackageDetailsList(value: PackageDetailsList): Self = StObject.set(x, "PackageDetailsList", value.asInstanceOf[js.Any])
    
    inline def setPackageDetailsListUndefined: Self = StObject.set(x, "PackageDetailsList", js.undefined)
    
    inline def setPackageDetailsListVarargs(value: PackageDetails*): Self = StObject.set(x, "PackageDetailsList", js.Array(value*))
  }
}
