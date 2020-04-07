package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BPMNDiagram extends TypeDerived {
  var labelStyle: BPMNLabelStyle
  var plane: BPMNPlane
}

object BPMNDiagram {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, labelStyle: BPMNLabelStyle, plane: BPMNPlane): BPMNDiagram = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], plane = plane.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BPMNDiagram]
  }
}

