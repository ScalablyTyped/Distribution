package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolFunctionPackageContentOutput extends StObject {
  
  /**
    * Indicates the media type of the resource.
    */
  var contentType: js.UndefOr[PackageContentType] = js.undefined
  
  /**
    * Contents of the function package.
    */
  var packageContent: js.UndefOr[_Blob] = js.undefined
}
object GetSolFunctionPackageContentOutput {
  
  inline def apply(): GetSolFunctionPackageContentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSolFunctionPackageContentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolFunctionPackageContentOutput] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: PackageContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setPackageContent(value: _Blob): Self = StObject.set(x, "packageContent", value.asInstanceOf[js.Any])
    
    inline def setPackageContentUndefined: Self = StObject.set(x, "packageContent", js.undefined)
  }
}
