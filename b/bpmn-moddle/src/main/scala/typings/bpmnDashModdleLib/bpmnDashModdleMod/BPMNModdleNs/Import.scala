package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Import extends TypeDerived {
  var importType: java.lang.String
  var location: java.lang.String
  var namespace: java.lang.String
}

object Import {
  @scala.inline
  def apply(
    $type: ElementType,
    importType: java.lang.String,
    location: java.lang.String,
    namespace: java.lang.String
  ): Import = {
    val __obj = js.Dynamic.literal($type = $type, importType = importType, location = location, namespace = namespace)
  
    __obj.asInstanceOf[Import]
  }
}

