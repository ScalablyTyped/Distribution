package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncRequestParameters extends StObject {
  
  /**
    * A container of the parameters for a CreateMultiRegionAccessPoint request.
    */
  var CreateMultiRegionAccessPointRequest: js.UndefOr[CreateMultiRegionAccessPointInput] = js.undefined
  
  /**
    * A container of the parameters for a DeleteMultiRegionAccessPoint request.
    */
  var DeleteMultiRegionAccessPointRequest: js.UndefOr[DeleteMultiRegionAccessPointInput] = js.undefined
  
  /**
    * A container of the parameters for a PutMultiRegionAccessPoint request.
    */
  var PutMultiRegionAccessPointPolicyRequest: js.UndefOr[PutMultiRegionAccessPointPolicyInput] = js.undefined
}
object AsyncRequestParameters {
  
  inline def apply(): AsyncRequestParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncRequestParameters]
  }
  
  extension [Self <: AsyncRequestParameters](x: Self) {
    
    inline def setCreateMultiRegionAccessPointRequest(value: CreateMultiRegionAccessPointInput): Self = StObject.set(x, "CreateMultiRegionAccessPointRequest", value.asInstanceOf[js.Any])
    
    inline def setCreateMultiRegionAccessPointRequestUndefined: Self = StObject.set(x, "CreateMultiRegionAccessPointRequest", js.undefined)
    
    inline def setDeleteMultiRegionAccessPointRequest(value: DeleteMultiRegionAccessPointInput): Self = StObject.set(x, "DeleteMultiRegionAccessPointRequest", value.asInstanceOf[js.Any])
    
    inline def setDeleteMultiRegionAccessPointRequestUndefined: Self = StObject.set(x, "DeleteMultiRegionAccessPointRequest", js.undefined)
    
    inline def setPutMultiRegionAccessPointPolicyRequest(value: PutMultiRegionAccessPointPolicyInput): Self = StObject.set(x, "PutMultiRegionAccessPointPolicyRequest", value.asInstanceOf[js.Any])
    
    inline def setPutMultiRegionAccessPointPolicyRequestUndefined: Self = StObject.set(x, "PutMultiRegionAccessPointPolicyRequest", js.undefined)
  }
}
