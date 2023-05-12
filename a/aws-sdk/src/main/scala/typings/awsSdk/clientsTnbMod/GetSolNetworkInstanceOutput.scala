package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolNetworkInstanceOutput extends StObject {
  
  /**
    * Network instance ARN.
    */
  var arn: NsInstanceArn
  
  /**
    * Network instance ID.
    */
  var id: NsInstanceId
  
  var lcmOpInfo: js.UndefOr[LcmOperationInfo] = js.undefined
  
  var metadata: GetSolNetworkInstanceMetadata
  
  /**
    * Network instance description.
    */
  var nsInstanceDescription: String
  
  /**
    * Network instance name.
    */
  var nsInstanceName: String
  
  /**
    * Network instance state.
    */
  var nsState: js.UndefOr[NsState] = js.undefined
  
  /**
    * Network service descriptor ID.
    */
  var nsdId: NsdId
  
  /**
    * Network service descriptor info ID.
    */
  var nsdInfoId: NsdInfoId
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object GetSolNetworkInstanceOutput {
  
  inline def apply(
    arn: NsInstanceArn,
    id: NsInstanceId,
    metadata: GetSolNetworkInstanceMetadata,
    nsInstanceDescription: String,
    nsInstanceName: String,
    nsdId: NsdId,
    nsdInfoId: NsdInfoId
  ): GetSolNetworkInstanceOutput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nsInstanceDescription = nsInstanceDescription.asInstanceOf[js.Any], nsInstanceName = nsInstanceName.asInstanceOf[js.Any], nsdId = nsdId.asInstanceOf[js.Any], nsdInfoId = nsdInfoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolNetworkInstanceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolNetworkInstanceOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NsInstanceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: NsInstanceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLcmOpInfo(value: LcmOperationInfo): Self = StObject.set(x, "lcmOpInfo", value.asInstanceOf[js.Any])
    
    inline def setLcmOpInfoUndefined: Self = StObject.set(x, "lcmOpInfo", js.undefined)
    
    inline def setMetadata(value: GetSolNetworkInstanceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNsInstanceDescription(value: String): Self = StObject.set(x, "nsInstanceDescription", value.asInstanceOf[js.Any])
    
    inline def setNsInstanceName(value: String): Self = StObject.set(x, "nsInstanceName", value.asInstanceOf[js.Any])
    
    inline def setNsState(value: NsState): Self = StObject.set(x, "nsState", value.asInstanceOf[js.Any])
    
    inline def setNsStateUndefined: Self = StObject.set(x, "nsState", js.undefined)
    
    inline def setNsdId(value: NsdId): Self = StObject.set(x, "nsdId", value.asInstanceOf[js.Any])
    
    inline def setNsdInfoId(value: NsdInfoId): Self = StObject.set(x, "nsdInfoId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
