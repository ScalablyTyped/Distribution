package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolNetworkPackageDescriptorOutput extends StObject {
  
  /**
    * Indicates the media type of the resource.
    */
  var contentType: js.UndefOr[DescriptorContentType] = js.undefined
  
  /**
    * Contents of the network service descriptor in the network package.
    */
  var nsd: js.UndefOr[_Blob] = js.undefined
}
object GetSolNetworkPackageDescriptorOutput {
  
  inline def apply(): GetSolNetworkPackageDescriptorOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSolNetworkPackageDescriptorOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolNetworkPackageDescriptorOutput] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: DescriptorContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setNsd(value: _Blob): Self = StObject.set(x, "nsd", value.asInstanceOf[js.Any])
    
    inline def setNsdUndefined: Self = StObject.set(x, "nsd", js.undefined)
  }
}
