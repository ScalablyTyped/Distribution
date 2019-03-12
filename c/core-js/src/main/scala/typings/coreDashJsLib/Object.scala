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
  def apply(getOwnPropertyDescriptors: js.Any => stdLib.PropertyDescriptorMap): Object = {
    val __obj = js.Dynamic.literal(getOwnPropertyDescriptors = js.Any.fromFunction1(getOwnPropertyDescriptors))
  
    __obj.asInstanceOf[Object]
  }
}

