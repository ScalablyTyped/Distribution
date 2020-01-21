package typings.broccoliOutputWrapper

import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnData extends js.Object {
  def apply(file: Double, data: js.Any): Unit = js.native
  def apply(file: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
  def apply(file: PathLike, data: js.Any): Unit = js.native
  def apply(file: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
}

