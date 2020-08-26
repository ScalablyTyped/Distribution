package typings.cytoscape.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Degree extends js.Object {
  def degree(): Double = js.native
}

object Degree {
  @scala.inline
  def apply(degree: () => Double): Degree = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction0(degree))
    __obj.asInstanceOf[Degree]
  }
  @scala.inline
  implicit class DegreeOps[Self <: Degree] (val x: Self) extends AnyVal {
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
    def setDegree(value: () => Double): Self = this.set("degree", js.Any.fromFunction0(value))
  }
  
}

