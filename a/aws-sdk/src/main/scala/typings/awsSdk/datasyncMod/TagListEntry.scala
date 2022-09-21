package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagListEntry extends StObject {
  
  /**
    * The key for an Amazon Web Services resource tag.
    */
  var Key: TagKey
  
  /**
    * The value for an Amazon Web Services resource tag.
    */
  var Value: js.UndefOr[TagValue] = js.undefined
}
object TagListEntry {
  
  inline def apply(Key: TagKey): TagListEntry = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagListEntry]
  }
  
  extension [Self <: TagListEntry](x: Self) {
    
    inline def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
