package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceGroupTag extends StObject {
  
  /**
    * A tag key.
    */
  var key: TagKey = js.native
  
  /**
    * The value assigned to a tag key.
    */
  var value: js.UndefOr[TagValue] = js.native
}
object ResourceGroupTag {
  
  @scala.inline
  def apply(key: TagKey): ResourceGroupTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceGroupTag]
  }
  
  @scala.inline
  implicit class ResourceGroupTagMutableBuilder[Self <: ResourceGroupTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: TagKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TagValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
