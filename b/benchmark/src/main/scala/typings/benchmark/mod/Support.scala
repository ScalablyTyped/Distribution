package typings.benchmark.mod

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
    val __obj = js.Dynamic.literal(air = air.asInstanceOf[js.Any], argumentsClass = argumentsClass.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], charByIndex = charByIndex.asInstanceOf[js.Any], charByOwnIndex = charByOwnIndex.asInstanceOf[js.Any], decompilation = decompilation.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], getAllKeys = getAllKeys.asInstanceOf[js.Any], iteratesOwnFirst = iteratesOwnFirst.asInstanceOf[js.Any], nodeClass = nodeClass.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("java")(java_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Support]
  }
}

