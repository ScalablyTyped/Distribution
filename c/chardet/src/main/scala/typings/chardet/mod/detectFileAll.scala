package typings.chardet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chardet", "detectFileAll")
@js.native
object detectFileAll extends js.Object {
  def apply(path: String, cb: js.Function2[/* err */ js.Any, /* result */ js.Array[Confidence] | Null, Unit]): Unit = js.native
  def apply(
    path: String,
    opts: Options,
    cb: js.Function2[/* err */ js.Any, /* result */ js.Array[Confidence] | Null, Unit]
  ): Unit = js.native
}

