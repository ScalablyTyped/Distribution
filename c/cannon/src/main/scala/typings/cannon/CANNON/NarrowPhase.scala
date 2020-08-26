package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NarrowPhase extends js.Object {
  var contactPointPool: js.Array[Pool] = js.native
  var v3pool: Vec3Pool = js.native
}

object NarrowPhase {
  @scala.inline
  def apply(contactPointPool: js.Array[Pool], v3pool: Vec3Pool): NarrowPhase = {
    val __obj = js.Dynamic.literal(contactPointPool = contactPointPool.asInstanceOf[js.Any], v3pool = v3pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[NarrowPhase]
  }
  @scala.inline
  implicit class NarrowPhaseOps[Self <: NarrowPhase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContactPointPoolVarargs(value: Pool*): Self = this.set("contactPointPool", js.Array(value :_*))
    @scala.inline
    def setContactPointPool(value: js.Array[Pool]): Self = this.set("contactPointPool", value.asInstanceOf[js.Any])
    @scala.inline
    def setV3pool(value: Vec3Pool): Self = this.set("v3pool", value.asInstanceOf[js.Any])
  }
  
}

