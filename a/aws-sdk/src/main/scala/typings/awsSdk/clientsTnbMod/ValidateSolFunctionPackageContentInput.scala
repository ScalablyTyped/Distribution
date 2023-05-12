package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateSolFunctionPackageContentInput extends StObject {
  
  /**
    * Function package content type.
    */
  var contentType: js.UndefOr[PackageContentType] = js.undefined
  
  /**
    * Function package file.
    */
  var file: _Blob
  
  /**
    * Function package ID.
    */
  var vnfPkgId: VnfPkgId
}
object ValidateSolFunctionPackageContentInput {
  
  inline def apply(file: _Blob, vnfPkgId: VnfPkgId): ValidateSolFunctionPackageContentInput = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], vnfPkgId = vnfPkgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateSolFunctionPackageContentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateSolFunctionPackageContentInput] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: PackageContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setFile(value: _Blob): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setVnfPkgId(value: VnfPkgId): Self = StObject.set(x, "vnfPkgId", value.asInstanceOf[js.Any])
  }
}
