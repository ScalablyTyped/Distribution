package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTag extends StObject {
  
  /**
    * The key of a tag.
    */
  var key: ResourceTagKey
  
  /**
    * The value of a tag.
    */
  var value: js.UndefOr[ResourceTagValue] = js.undefined
}
object ResourceTag {
  
  inline def apply(key: ResourceTagKey): ResourceTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTag]
  }
  
  extension [Self <: ResourceTag](x: Self) {
    
    inline def setKey(value: ResourceTagKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ResourceTagValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
