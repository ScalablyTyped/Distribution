package typings.broccoliNodeApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackObject extends js.Object {
  def build(): js.Promise[Unit] | Unit = js.native
  def build(buildChangeObject: BuildChangeObject): js.Promise[Unit] | Unit = js.native
}

