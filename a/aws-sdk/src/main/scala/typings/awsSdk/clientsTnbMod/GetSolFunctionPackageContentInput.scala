package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolFunctionPackageContentInput extends StObject {
  
  /**
    * The format of the package that you want to download from the function packages.
    */
  var accept: PackageContentType
  
  /**
    * ID of the function package.
    */
  var vnfPkgId: VnfPkgId
}
object GetSolFunctionPackageContentInput {
  
  inline def apply(accept: PackageContentType, vnfPkgId: VnfPkgId): GetSolFunctionPackageContentInput = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], vnfPkgId = vnfPkgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolFunctionPackageContentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolFunctionPackageContentInput] (val x: Self) extends AnyVal {
    
    inline def setAccept(value: PackageContentType): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setVnfPkgId(value: VnfPkgId): Self = StObject.set(x, "vnfPkgId", value.asInstanceOf[js.Any])
  }
}
