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
  var java_ : scala.Boolean
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
    java_ : scala.Boolean,
    nodeClass: scala.Boolean,
    timeout: scala.Boolean
  ): Support = {
    val __obj = js.Dynamic.literal(air = air, argumentsClass = argumentsClass, browser = browser, charByIndex = charByIndex, charByOwnIndex = charByOwnIndex, decompilation = decompilation, descriptors = descriptors, getAllKeys = getAllKeys, iteratesOwnFirst = iteratesOwnFirst, nodeClass = nodeClass, timeout = timeout)
    __obj.updateDynamic("java")(java_)
    __obj.asInstanceOf[Support]
  }
}

