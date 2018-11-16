package typings
package chocolatechipjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Headers Interface. This defines the methods exposed by the Headers object.
 */
@js.native
trait Headers extends js.Object {
  def apply(): scala.Unit = js.native
  def apply(headers: js.Any): scala.Unit = js.native
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def delete(name: java.lang.String): js.Any = js.native
  def forEach(callback: js.Function, thisArg: js.Any): js.Any = js.native
  def get(name: java.lang.String): js.Any = js.native
  def getAll(name: java.lang.String): js.Any = js.native
  def has(name: java.lang.String): js.Any = js.native
  def set(name: java.lang.String, value: java.lang.String): js.Any = js.native
}

