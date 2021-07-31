package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordTag extends StObject {
  
  /**
    * The key for this tag.
    */
  var Key: js.UndefOr[RecordTagKey] = js.undefined
  
  /**
    * The value for this tag.
    */
  var Value: js.UndefOr[RecordTagValue] = js.undefined
}
object RecordTag {
  
  @scala.inline
  def apply(): RecordTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordTag]
  }
  
  @scala.inline
  implicit class RecordTagMutableBuilder[Self <: RecordTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: RecordTagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValue(value: RecordTagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
