package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateSolNetworkInstanceOutput extends StObject {
  
  /**
    * The identifier of the network operation.
    */
  var nsLcmOpOccId: js.UndefOr[NsLcmOpOccId] = js.undefined
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. When you use this API, the tags are transferred to the network operation that is created. Use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object TerminateSolNetworkInstanceOutput {
  
  inline def apply(): TerminateSolNetworkInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateSolNetworkInstanceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminateSolNetworkInstanceOutput] (val x: Self) extends AnyVal {
    
    inline def setNsLcmOpOccId(value: NsLcmOpOccId): Self = StObject.set(x, "nsLcmOpOccId", value.asInstanceOf[js.Any])
    
    inline def setNsLcmOpOccIdUndefined: Self = StObject.set(x, "nsLcmOpOccId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
