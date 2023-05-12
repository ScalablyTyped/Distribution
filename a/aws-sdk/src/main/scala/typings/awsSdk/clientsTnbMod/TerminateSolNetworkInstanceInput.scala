package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateSolNetworkInstanceInput extends StObject {
  
  /**
    * ID of the network instance.
    */
  var nsInstanceId: NsInstanceId
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. When you use this API, the tags are transferred to the network operation that is created. Use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object TerminateSolNetworkInstanceInput {
  
  inline def apply(nsInstanceId: NsInstanceId): TerminateSolNetworkInstanceInput = {
    val __obj = js.Dynamic.literal(nsInstanceId = nsInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateSolNetworkInstanceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminateSolNetworkInstanceInput] (val x: Self) extends AnyVal {
    
    inline def setNsInstanceId(value: NsInstanceId): Self = StObject.set(x, "nsInstanceId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
