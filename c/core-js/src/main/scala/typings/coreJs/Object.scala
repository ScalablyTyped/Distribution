package typings.coreJs

import typings.std.PropertyDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap
}

object Object {
  @scala.inline
  def apply(getOwnPropertyDescriptors: js.Any => PropertyDescriptorMap): Object = {
    val __obj = js.Dynamic.literal(getOwnPropertyDescriptors = js.Any.fromFunction1(getOwnPropertyDescriptors))
  
    __obj.asInstanceOf[Object]
  }
}

