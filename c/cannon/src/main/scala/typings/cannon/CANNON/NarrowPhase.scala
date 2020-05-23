package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NarrowPhase extends js.Object {
  var contactPointPool: js.Array[Pool]
  var v3pool: Vec3Pool
}

object NarrowPhase {
  @scala.inline
  def apply(contactPointPool: js.Array[Pool], v3pool: Vec3Pool): NarrowPhase = {
    val __obj = js.Dynamic.literal(contactPointPool = contactPointPool.asInstanceOf[js.Any], v3pool = v3pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[NarrowPhase]
  }
}

