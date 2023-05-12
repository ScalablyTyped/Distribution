package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSolNetworkPackageContentInput extends StObject {
  
  /**
    * Network package content type.
    */
  var contentType: js.UndefOr[PackageContentType] = js.undefined
  
  /**
    * Network package file.
    */
  var file: _Blob
  
  /**
    * Network service descriptor info ID.
    */
  var nsdInfoId: NsdInfoId
}
object PutSolNetworkPackageContentInput {
  
  inline def apply(file: _Blob, nsdInfoId: NsdInfoId): PutSolNetworkPackageContentInput = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], nsdInfoId = nsdInfoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSolNetworkPackageContentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSolNetworkPackageContentInput] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: PackageContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setFile(value: _Blob): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setNsdInfoId(value: NsdInfoId): Self = StObject.set(x, "nsdInfoId", value.asInstanceOf[js.Any])
  }
}
