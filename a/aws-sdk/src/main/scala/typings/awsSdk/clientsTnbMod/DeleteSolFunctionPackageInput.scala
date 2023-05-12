package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSolFunctionPackageInput extends StObject {
  
  /**
    * ID of the function package.
    */
  var vnfPkgId: VnfPkgId
}
object DeleteSolFunctionPackageInput {
  
  inline def apply(vnfPkgId: VnfPkgId): DeleteSolFunctionPackageInput = {
    val __obj = js.Dynamic.literal(vnfPkgId = vnfPkgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSolFunctionPackageInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSolFunctionPackageInput] (val x: Self) extends AnyVal {
    
    inline def setVnfPkgId(value: VnfPkgId): Self = StObject.set(x, "vnfPkgId", value.asInstanceOf[js.Any])
  }
}
