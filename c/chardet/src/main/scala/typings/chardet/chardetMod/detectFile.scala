package typings.chardet.chardetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chardet", "detectFile")
@js.native
object detectFile extends js.Object {
  def apply(path: String, cb: js.Function2[/* err */ js.Any, /* result */ String | Null, Unit]): Unit = js.native
  def apply(path: String, opts: Options, cb: js.Function2[/* err */ js.Any, /* result */ String | Null, Unit]): Unit = js.native
}

