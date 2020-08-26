package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2DistanceInput extends js.Object {
  /**
    * Proxy A
    **/
  var proxyA: b2DistanceProxy = js.native
  /**
    * Proxy B
    **/
  var proxyB: b2DistanceProxy = js.native
  /**
    * Transform A
    **/
  var transformA: b2Transform = js.native
  /**
    * Transform B
    **/
  var transformB: b2Transform = js.native
  /**
    * Use shape radii in computation?
    **/
  var useRadii: Boolean = js.native
}

object b2DistanceInput {
  @scala.inline
  def apply(
    proxyA: b2DistanceProxy,
    proxyB: b2DistanceProxy,
    transformA: b2Transform,
    transformB: b2Transform,
    useRadii: Boolean
  ): b2DistanceInput = {
    val __obj = js.Dynamic.literal(proxyA = proxyA.asInstanceOf[js.Any], proxyB = proxyB.asInstanceOf[js.Any], transformA = transformA.asInstanceOf[js.Any], transformB = transformB.asInstanceOf[js.Any], useRadii = useRadii.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2DistanceInput]
  }
  @scala.inline
  implicit class b2DistanceInputOps[Self <: b2DistanceInput] (val x: Self) extends AnyVal {
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
    def setProxyA(value: b2DistanceProxy): Self = this.set("proxyA", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxyB(value: b2DistanceProxy): Self = this.set("proxyB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformA(value: b2Transform): Self = this.set("transformA", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformB(value: b2Transform): Self = this.set("transformB", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseRadii(value: Boolean): Self = this.set("useRadii", value.asInstanceOf[js.Any])
  }
  
}

