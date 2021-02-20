package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DissociatePackageRequest extends StObject {
  
  /**
    * Name of the domain that you want to associate the package with.
    */
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
  
  /**
    * Internal ID of the package that you want to associate with a domain. Use DescribePackages to find this value.
    */
  var PackageID: typings.awsSdk.esMod.PackageID = js.native
}
object DissociatePackageRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, PackageID: PackageID): DissociatePackageRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], PackageID = PackageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DissociatePackageRequest]
  }
  
  @scala.inline
  implicit class DissociatePackageRequestMutableBuilder[Self <: DissociatePackageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
  }
}
