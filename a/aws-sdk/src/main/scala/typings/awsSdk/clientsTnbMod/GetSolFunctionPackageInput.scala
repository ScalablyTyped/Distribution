package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolFunctionPackageInput extends StObject {
  
  /**
    * ID of the function package.
    */
  var vnfPkgId: VnfPkgId
}
object GetSolFunctionPackageInput {
  
  inline def apply(vnfPkgId: VnfPkgId): GetSolFunctionPackageInput = {
    val __obj = js.Dynamic.literal(vnfPkgId = vnfPkgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolFunctionPackageInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolFunctionPackageInput] (val x: Self) extends AnyVal {
    
    inline def setVnfPkgId(value: VnfPkgId): Self = StObject.set(x, "vnfPkgId", value.asInstanceOf[js.Any])
  }
}
