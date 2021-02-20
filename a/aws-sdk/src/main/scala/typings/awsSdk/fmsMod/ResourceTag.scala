package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceTag extends StObject {
  
  /**
    * The resource tag key.
    */
  var Key: ResourceTagKey = js.native
  
  /**
    * The resource tag value.
    */
  var Value: js.UndefOr[ResourceTagValue] = js.native
}
object ResourceTag {
  
  @scala.inline
  def apply(Key: ResourceTagKey): ResourceTag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTag]
  }
  
  @scala.inline
  implicit class ResourceTagMutableBuilder[Self <: ResourceTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: ResourceTagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ResourceTagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
