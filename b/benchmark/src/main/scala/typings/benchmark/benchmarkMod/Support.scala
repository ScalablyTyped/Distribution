package typings.benchmark.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Support extends js.Object {
  var air: Boolean
  var argumentsClass: Boolean
  var browser: Boolean
  var charByIndex: Boolean
  var charByOwnIndex: Boolean
  var decompilation: Boolean
  var descriptors: Boolean
  var getAllKeys: Boolean
  var iteratesOwnFirst: Boolean
  @JSName("java")
  var java_ : Boolean
  var nodeClass: Boolean
  var timeout: Boolean
}

object Support {
  @scala.inline
  def apply(
    air: Boolean,
    argumentsClass: Boolean,
    browser: Boolean,
    charByIndex: Boolean,
    charByOwnIndex: Boolean,
    decompilation: Boolean,
    descriptors: Boolean,
    getAllKeys: Boolean,
    iteratesOwnFirst: Boolean,
    java_ : Boolean,
    nodeClass: Boolean,
    timeout: Boolean
  ): Support = {
    val __obj = js.Dynamic.literal(air = air, argumentsClass = argumentsClass, browser = browser, charByIndex = charByIndex, charByOwnIndex = charByOwnIndex, decompilation = decompilation, descriptors = descriptors, getAllKeys = getAllKeys, iteratesOwnFirst = iteratesOwnFirst, nodeClass = nodeClass, timeout = timeout)
    __obj.updateDynamic("java")(java_)
    __obj.asInstanceOf[Support]
  }
}

