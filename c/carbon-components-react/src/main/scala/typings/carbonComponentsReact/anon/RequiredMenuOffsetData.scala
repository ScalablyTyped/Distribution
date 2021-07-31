package typings.carbonComponentsReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<carbon-components-react.carbon-components-react/typings/shared.MenuOffsetData> */
trait RequiredMenuOffsetData extends StObject {
  
  var left: Double
  
  var top: Double
}
object RequiredMenuOffsetData {
  
  @scala.inline
  def apply(left: Double, top: Double): RequiredMenuOffsetData = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredMenuOffsetData]
  }
  
  @scala.inline
  implicit class RequiredMenuOffsetDataMutableBuilder[Self <: RequiredMenuOffsetData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
