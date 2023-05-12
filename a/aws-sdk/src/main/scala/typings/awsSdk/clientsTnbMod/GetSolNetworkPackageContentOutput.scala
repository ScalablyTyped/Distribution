package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolNetworkPackageContentOutput extends StObject {
  
  /**
    * Indicates the media type of the resource.
    */
  var contentType: js.UndefOr[PackageContentType] = js.undefined
  
  /**
    * Content of the network service descriptor in the network package.
    */
  var nsdContent: js.UndefOr[_Blob] = js.undefined
}
object GetSolNetworkPackageContentOutput {
  
  inline def apply(): GetSolNetworkPackageContentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSolNetworkPackageContentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolNetworkPackageContentOutput] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: PackageContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setNsdContent(value: _Blob): Self = StObject.set(x, "nsdContent", value.asInstanceOf[js.Any])
    
    inline def setNsdContentUndefined: Self = StObject.set(x, "nsdContent", js.undefined)
  }
}
