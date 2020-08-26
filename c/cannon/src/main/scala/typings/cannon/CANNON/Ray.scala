package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ray extends js.Object {
  var checkCollisionResponse: Boolean = js.native
  var from: Vec3 = js.native
  var precision: Double = js.native
  var to: Vec3 = js.native
  def getAABB(result: RaycastResult): Unit = js.native
}

object Ray {
  @scala.inline
  def apply(
    checkCollisionResponse: Boolean,
    from: Vec3,
    getAABB: RaycastResult => Unit,
    precision: Double,
    to: Vec3
  ): Ray = {
    val __obj = js.Dynamic.literal(checkCollisionResponse = checkCollisionResponse.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], getAABB = js.Any.fromFunction1(getAABB), precision = precision.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ray]
  }
  @scala.inline
  implicit class RayOps[Self <: Ray] (val x: Self) extends AnyVal {
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
    def setCheckCollisionResponse(value: Boolean): Self = this.set("checkCollisionResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: Vec3): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAABB(value: RaycastResult => Unit): Self = this.set("getAABB", js.Any.fromFunction1(value))
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: Vec3): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

