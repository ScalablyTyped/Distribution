package typings
package benchmarkLib.benchmarkMod.BenchmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Support extends js.Object {
  var air: scala.Boolean
  var argumentsClass: scala.Boolean
  var browser: scala.Boolean
  var charByIndex: scala.Boolean
  var charByOwnIndex: scala.Boolean
  var decompilation: scala.Boolean
  var descriptors: scala.Boolean
  var getAllKeys: scala.Boolean
  var iteratesOwnFirst: scala.Boolean
  @JSName("java")
  var `java_`: scala.Boolean
  var nodeClass: scala.Boolean
  var timeout: scala.Boolean
}

object Support {
  @scala.inline
  def apply(
    air: scala.Boolean,
    argumentsClass: scala.Boolean,
    browser: scala.Boolean,
    charByIndex: scala.Boolean,
    charByOwnIndex: scala.Boolean,
    decompilation: scala.Boolean,
    descriptors: scala.Boolean,
    getAllKeys: scala.Boolean,
    iteratesOwnFirst: scala.Boolean,
    `java_`: scala.Boolean,
    nodeClass: scala.Boolean,
    timeout: scala.Boolean
  ): Support = {
    val __obj = js.Dynamic.literal(`java_` = `java_`)
    __obj.updateDynamic("air")(air)
    __obj.updateDynamic("argumentsClass")(argumentsClass)
    __obj.updateDynamic("browser")(browser)
    __obj.updateDynamic("charByIndex")(charByIndex)
    __obj.updateDynamic("charByOwnIndex")(charByOwnIndex)
    __obj.updateDynamic("decompilation")(decompilation)
    __obj.updateDynamic("descriptors")(descriptors)
    __obj.updateDynamic("getAllKeys")(getAllKeys)
    __obj.updateDynamic("iteratesOwnFirst")(iteratesOwnFirst)
    __obj.updateDynamic("nodeClass")(nodeClass)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[Support]
  }
}

