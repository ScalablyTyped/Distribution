package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSolNetworkInstanceInput extends StObject {
  
  /**
    * Identifies the network function information parameters and/or the configurable properties of the network function to be modified.
    */
  var modifyVnfInfoData: js.UndefOr[UpdateSolNetworkModify] = js.undefined
  
  /**
    * ID of the network instance.
    */
  var nsInstanceId: NsInstanceId
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. When you use this API, the tags are transferred to the network operation that is created. Use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of update.
    */
  var updateType: UpdateSolNetworkType
}
object UpdateSolNetworkInstanceInput {
  
  inline def apply(nsInstanceId: NsInstanceId, updateType: UpdateSolNetworkType): UpdateSolNetworkInstanceInput = {
    val __obj = js.Dynamic.literal(nsInstanceId = nsInstanceId.asInstanceOf[js.Any], updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSolNetworkInstanceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSolNetworkInstanceInput] (val x: Self) extends AnyVal {
    
    inline def setModifyVnfInfoData(value: UpdateSolNetworkModify): Self = StObject.set(x, "modifyVnfInfoData", value.asInstanceOf[js.Any])
    
    inline def setModifyVnfInfoDataUndefined: Self = StObject.set(x, "modifyVnfInfoData", js.undefined)
    
    inline def setNsInstanceId(value: NsInstanceId): Self = StObject.set(x, "nsInstanceId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUpdateType(value: UpdateSolNetworkType): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
  }
}
