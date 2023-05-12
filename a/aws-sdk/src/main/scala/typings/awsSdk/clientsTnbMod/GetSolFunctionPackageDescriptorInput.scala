package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolFunctionPackageDescriptorInput extends StObject {
  
  /**
    * Indicates which content types, expressed as MIME types, the client is able to understand.
    */
  var accept: DescriptorContentType
  
  /**
    * ID of the function package.
    */
  var vnfPkgId: VnfPkgId
}
object GetSolFunctionPackageDescriptorInput {
  
  inline def apply(accept: DescriptorContentType, vnfPkgId: VnfPkgId): GetSolFunctionPackageDescriptorInput = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], vnfPkgId = vnfPkgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolFunctionPackageDescriptorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolFunctionPackageDescriptorInput] (val x: Self) extends AnyVal {
    
    inline def setAccept(value: DescriptorContentType): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setVnfPkgId(value: VnfPkgId): Self = StObject.set(x, "vnfPkgId", value.asInstanceOf[js.Any])
  }
}
