package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  def getOwnPropertyDescriptors(`object`: js.Any): stdLib.PropertyDescriptorMap
}

object Object {
  @scala.inline
  def apply(getOwnPropertyDescriptors: js.Function1[js.Any, stdLib.PropertyDescriptorMap]): Object = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getOwnPropertyDescriptors")(getOwnPropertyDescriptors)
    __obj.asInstanceOf[Object]
  }
}

