package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolNetworkPackageContentInput extends StObject {
  
  /**
    * The format of the package you want to download from the network package.
    */
  var accept: PackageContentType
  
  /**
    * ID of the network service descriptor in the network package.
    */
  var nsdInfoId: NsdInfoId
}
object GetSolNetworkPackageContentInput {
  
  inline def apply(accept: PackageContentType, nsdInfoId: NsdInfoId): GetSolNetworkPackageContentInput = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], nsdInfoId = nsdInfoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolNetworkPackageContentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolNetworkPackageContentInput] (val x: Self) extends AnyVal {
    
    inline def setAccept(value: PackageContentType): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setNsdInfoId(value: NsdInfoId): Self = StObject.set(x, "nsdInfoId", value.asInstanceOf[js.Any])
  }
}
