package typings.chardet.chardetMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chardet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def detect(buf: Buffer): Result = js.native
  def detect(buf: Buffer, opts: Options): Result = js.native
  def detectFile(path: String, cb: js.Function2[/* err */ js.Any, /* result */ Result, Unit]): Unit = js.native
  def detectFile(path: String, opts: Options, cb: js.Function2[/* err */ js.Any, /* result */ Result, Unit]): Unit = js.native
  def detectFileSync(path: String): Result = js.native
  def detectFileSync(path: String, opts: Options): Result = js.native
}

