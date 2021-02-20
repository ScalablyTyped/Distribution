package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagListEntry extends StObject {
  
  /**
    * The key for an AWS resource tag.
    */
  var Key: TagKey = js.native
  
  /**
    * The value for an AWS resource tag.
    */
  var Value: js.UndefOr[TagValue] = js.native
}
object TagListEntry {
  
  @scala.inline
  def apply(Key: TagKey): TagListEntry = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagListEntry]
  }
  
  @scala.inline
  implicit class TagListEntryMutableBuilder[Self <: TagListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
