package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataOutput extends ItemAwareElement {
  /**
           * @default false
           */
  var isCollection: scala.Boolean
  var name: java.lang.String
  var outputSetRef: js.Array[InputSet]
  var outputSetWithOptional: js.Array[InputSet]
  var outputSetWithWhileExecuting: js.Array[InputSet]
}

