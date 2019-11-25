package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Import extends TypeDerived {
  var importType: String
  var location: String
  var namespace: String
}

object Import {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, importType: String, location: String, namespace: String): Import = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], importType = importType.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Import]
  }
}

