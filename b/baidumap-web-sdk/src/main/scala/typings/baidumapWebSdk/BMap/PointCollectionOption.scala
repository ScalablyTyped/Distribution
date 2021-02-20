package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCollectionOption extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var shape: js.UndefOr[ShapeType] = js.native
  
  var size: js.UndefOr[SizeType] = js.native
}
object PointCollectionOption {
  
  @scala.inline
  def apply(): PointCollectionOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCollectionOption]
  }
  
  @scala.inline
  implicit class PointCollectionOptionMutableBuilder[Self <: PointCollectionOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setShape(value: ShapeType): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
