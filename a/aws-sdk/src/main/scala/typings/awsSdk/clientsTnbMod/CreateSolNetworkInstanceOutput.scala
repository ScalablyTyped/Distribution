package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSolNetworkInstanceOutput extends StObject {
  
  /**
    * Network instance ARN.
    */
  var arn: NsInstanceArn
  
  /**
    * Network instance ID.
    */
  var id: NsInstanceId
  
  /**
    * Network instance name.
    */
  var nsInstanceName: String
  
  /**
    * Network service descriptor ID.
    */
  var nsdInfoId: NsdInfoId
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateSolNetworkInstanceOutput {
  
  inline def apply(arn: NsInstanceArn, id: NsInstanceId, nsInstanceName: String, nsdInfoId: NsdInfoId): CreateSolNetworkInstanceOutput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nsInstanceName = nsInstanceName.asInstanceOf[js.Any], nsdInfoId = nsdInfoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSolNetworkInstanceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSolNetworkInstanceOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NsInstanceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: NsInstanceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNsInstanceName(value: String): Self = StObject.set(x, "nsInstanceName", value.asInstanceOf[js.Any])
    
    inline def setNsdInfoId(value: NsdInfoId): Self = StObject.set(x, "nsdInfoId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
