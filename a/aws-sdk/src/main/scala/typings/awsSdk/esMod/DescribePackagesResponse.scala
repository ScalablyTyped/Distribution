package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePackagesResponse extends StObject {
  
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * List of PackageDetails objects.
    */
  var PackageDetailsList: js.UndefOr[typings.awsSdk.esMod.PackageDetailsList] = js.native
}
object DescribePackagesResponse {
  
  @scala.inline
  def apply(): DescribePackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePackagesResponse]
  }
  
  @scala.inline
  implicit class DescribePackagesResponseMutableBuilder[Self <: DescribePackagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPackageDetailsList(value: PackageDetailsList): Self = StObject.set(x, "PackageDetailsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageDetailsListUndefined: Self = StObject.set(x, "PackageDetailsList", js.undefined)
    
    @scala.inline
    def setPackageDetailsListVarargs(value: PackageDetails*): Self = StObject.set(x, "PackageDetailsList", js.Array(value :_*))
  }
}
