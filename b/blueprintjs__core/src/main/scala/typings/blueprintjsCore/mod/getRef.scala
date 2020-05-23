package typings.blueprintjsCore.mod

import typings.blueprintjsCore.refsMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "getRef")
@js.native
object getRef extends js.Object {
  def apply[T](ref: T): T = js.native
  def apply[T](ref: IRefObject[T]): T = js.native
}

