package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSolNetworkInstanceInput extends StObject {
  
  /**
    * Network instance description.
    */
  var nsDescription: js.UndefOr[CreateSolNetworkInstanceInputNsDescriptionString] = js.undefined
  
  /**
    * Network instance name.
    */
  var nsName: CreateSolNetworkInstanceInputNsNameString
  
  /**
    * ID for network service descriptor.
    */
  var nsdInfoId: NsdInfoId
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateSolNetworkInstanceInput {
  
  inline def apply(nsName: CreateSolNetworkInstanceInputNsNameString, nsdInfoId: NsdInfoId): CreateSolNetworkInstanceInput = {
    val __obj = js.Dynamic.literal(nsName = nsName.asInstanceOf[js.Any], nsdInfoId = nsdInfoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSolNetworkInstanceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSolNetworkInstanceInput] (val x: Self) extends AnyVal {
    
    inline def setNsDescription(value: CreateSolNetworkInstanceInputNsDescriptionString): Self = StObject.set(x, "nsDescription", value.asInstanceOf[js.Any])
    
    inline def setNsDescriptionUndefined: Self = StObject.set(x, "nsDescription", js.undefined)
    
    inline def setNsName(value: CreateSolNetworkInstanceInputNsNameString): Self = StObject.set(x, "nsName", value.asInstanceOf[js.Any])
    
    inline def setNsdInfoId(value: NsdInfoId): Self = StObject.set(x, "nsdInfoId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
