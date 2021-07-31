package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchType extends StObject {
  
  var batchType: js.UndefOr[String] = js.undefined
  
  var lastRangeBackward: js.UndefOr[Boolean] = js.undefined
  
  var rootName: js.UndefOr[String] = js.undefined
  
  var selectionAttributes: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object BatchType {
  
  @scala.inline
  def apply(): BatchType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchType]
  }
  
  @scala.inline
  implicit class BatchTypeMutableBuilder[Self <: BatchType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchType(value: String): Self = StObject.set(x, "batchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchTypeUndefined: Self = StObject.set(x, "batchType", js.undefined)
    
    @scala.inline
    def setLastRangeBackward(value: Boolean): Self = StObject.set(x, "lastRangeBackward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRangeBackwardUndefined: Self = StObject.set(x, "lastRangeBackward", js.undefined)
    
    @scala.inline
    def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
    
    @scala.inline
    def setSelectionAttributes(value: js.Array[js.Object]): Self = StObject.set(x, "selectionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionAttributesUndefined: Self = StObject.set(x, "selectionAttributes", js.undefined)
    
    @scala.inline
    def setSelectionAttributesVarargs(value: js.Object*): Self = StObject.set(x, "selectionAttributes", js.Array(value :_*))
  }
}
