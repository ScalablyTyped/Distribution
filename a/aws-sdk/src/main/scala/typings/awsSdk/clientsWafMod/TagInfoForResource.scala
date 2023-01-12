package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagInfoForResource extends StObject {
  
  /**
    * 
    */
  var ResourceARN: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * 
    */
  var TagList: js.UndefOr[typings.awsSdk.clientsWafMod.TagList] = js.undefined
}
object TagInfoForResource {
  
  inline def apply(): TagInfoForResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagInfoForResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagInfoForResource] (val x: Self) extends AnyVal {
    
    inline def setResourceARN(value: ResourceArn): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
  }
}
