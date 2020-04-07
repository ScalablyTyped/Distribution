package typings.babylonjs.mathLikeMod

import typings.babylonjs.typesMod.float
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlaneLike extends js.Object {
  var d: float
  var normal: IVector3Like
  def normalize(): Unit
}

object IPlaneLike {
  @scala.inline
  def apply(d: float, normal: IVector3Like, normalize: () => Unit): IPlaneLike = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize))
  
    __obj.asInstanceOf[IPlaneLike]
  }
}

