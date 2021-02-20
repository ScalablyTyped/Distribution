package typings.d3pie.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnClickSegment extends StObject {
  
  var onClickSegment: js.UndefOr[js.Function] = js.native
  
  var onMouseoutSegment: js.UndefOr[js.Function] = js.native
  
  var onMouseoverSegment: js.UndefOr[js.Function] = js.native
  
  var onload: js.UndefOr[js.Function] = js.native
}
object OnClickSegment {
  
  @scala.inline
  def apply(): OnClickSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnClickSegment]
  }
  
  @scala.inline
  implicit class OnClickSegmentMutableBuilder[Self <: OnClickSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClickSegment(value: js.Function): Self = StObject.set(x, "onClickSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickSegmentUndefined: Self = StObject.set(x, "onClickSegment", js.undefined)
    
    @scala.inline
    def setOnMouseoutSegment(value: js.Function): Self = StObject.set(x, "onMouseoutSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseoutSegmentUndefined: Self = StObject.set(x, "onMouseoutSegment", js.undefined)
    
    @scala.inline
    def setOnMouseoverSegment(value: js.Function): Self = StObject.set(x, "onMouseoverSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseoverSegmentUndefined: Self = StObject.set(x, "onMouseoverSegment", js.undefined)
    
    @scala.inline
    def setOnload(value: js.Function): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
  }
}
