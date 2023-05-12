package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolVnfcResourceInfo extends StObject {
  
  /**
    * The metadata of the network function compute.
    */
  var metadata: js.UndefOr[GetSolVnfcResourceInfoMetadata] = js.undefined
}
object GetSolVnfcResourceInfo {
  
  inline def apply(): GetSolVnfcResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSolVnfcResourceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolVnfcResourceInfo] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: GetSolVnfcResourceInfoMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
