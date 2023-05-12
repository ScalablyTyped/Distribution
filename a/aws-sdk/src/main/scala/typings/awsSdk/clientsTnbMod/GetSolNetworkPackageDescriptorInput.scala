package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolNetworkPackageDescriptorInput extends StObject {
  
  /**
    * ID of the network service descriptor in the network package.
    */
  var nsdInfoId: NsdInfoId
}
object GetSolNetworkPackageDescriptorInput {
  
  inline def apply(nsdInfoId: NsdInfoId): GetSolNetworkPackageDescriptorInput = {
    val __obj = js.Dynamic.literal(nsdInfoId = nsdInfoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolNetworkPackageDescriptorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolNetworkPackageDescriptorInput] (val x: Self) extends AnyVal {
    
    inline def setNsdInfoId(value: NsdInfoId): Self = StObject.set(x, "nsdInfoId", value.asInstanceOf[js.Any])
  }
}
