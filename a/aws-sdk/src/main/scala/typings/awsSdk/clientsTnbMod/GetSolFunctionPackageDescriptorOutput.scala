package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolFunctionPackageDescriptorOutput extends StObject {
  
  /**
    * Indicates the media type of the resource.
    */
  var contentType: js.UndefOr[DescriptorContentType] = js.undefined
  
  /**
    * Contents of the function package descriptor.
    */
  var vnfd: js.UndefOr[_Blob] = js.undefined
}
object GetSolFunctionPackageDescriptorOutput {
  
  inline def apply(): GetSolFunctionPackageDescriptorOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSolFunctionPackageDescriptorOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolFunctionPackageDescriptorOutput] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: DescriptorContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setVnfd(value: _Blob): Self = StObject.set(x, "vnfd", value.asInstanceOf[js.Any])
    
    inline def setVnfdUndefined: Self = StObject.set(x, "vnfd", js.undefined)
  }
}
