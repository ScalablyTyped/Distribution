package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pool extends js.Object {
  var objects: js.Array[_]
  var `type`: js.Array[_]
  def constructObject(): js.Any
  def get(): js.Any
  def release(): js.Any
}

object Pool {
  @scala.inline
  def apply(
    constructObject: () => js.Any,
    get: () => js.Any,
    objects: js.Array[_],
    release: () => js.Any,
    `type`: js.Array[_]
  ): Pool = {
    val __obj = js.Dynamic.literal(constructObject = js.Any.fromFunction0(constructObject), get = js.Any.fromFunction0(get), objects = objects.asInstanceOf[js.Any], release = js.Any.fromFunction0(release))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pool]
  }
}

