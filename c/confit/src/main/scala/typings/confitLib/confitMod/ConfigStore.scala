package typings
package confitLib.confitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigStore extends js.Object {
  def get(name: java.lang.String): js.Any
  def set[T](name: java.lang.String, newValue: T): T
  def use(newSettings: js.Object): scala.Unit
}

