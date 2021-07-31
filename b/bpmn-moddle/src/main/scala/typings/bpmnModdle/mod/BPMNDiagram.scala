package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BPMNDiagram
  extends StObject
     with TypeDerived {
  
  var labelStyle: BPMNLabelStyle
  
  var plane: BPMNPlane
}
object BPMNDiagram {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, labelStyle: BPMNLabelStyle, plane: BPMNPlane): BPMNDiagram = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], plane = plane.asInstanceOf[js.Any])
    __obj.asInstanceOf[BPMNDiagram]
  }
  
  @scala.inline
  implicit class BPMNDiagramMutableBuilder[Self <: BPMNDiagram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelStyle(value: BPMNLabelStyle): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlane(value: BPMNPlane): Self = StObject.set(x, "plane", value.asInstanceOf[js.Any])
  }
}
