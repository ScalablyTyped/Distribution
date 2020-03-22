package typings.bluebirdGlobal

import typings.bluebird.mod.Bluebird
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallValue extends js.Object {
  def apply(): Bluebird[Unit] = js.native
  def apply[U](value: U): Bluebird[U] = js.native
}

