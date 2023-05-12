package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolNetworkPackageInput extends StObject {
  
  /**
    * ID of the network service descriptor in the network package.
    */
  var nsdInfoId: NsdInfoId
}
object GetSolNetworkPackageInput {
  
  inline def apply(nsdInfoId: NsdInfoId): GetSolNetworkPackageInput = {
    val __obj = js.Dynamic.literal(nsdInfoId = nsdInfoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolNetworkPackageInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolNetworkPackageInput] (val x: Self) extends AnyVal {
    
    inline def setNsdInfoId(value: NsdInfoId): Self = StObject.set(x, "nsdInfoId", value.asInstanceOf[js.Any])
  }
}
