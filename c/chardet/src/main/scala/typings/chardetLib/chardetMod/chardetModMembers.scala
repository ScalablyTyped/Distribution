package typings
package chardetLib.chardetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chardet", JSImport.Namespace)
@js.native
object chardetModMembers extends js.Object {
  def detect(buf: nodeLib.Buffer): Result = js.native
  def detect(buf: nodeLib.Buffer, opts: Options): Result = js.native
  def detectFile(path: java.lang.String, cb: js.Function2[/* err */ js.Any, /* result */ Result, scala.Unit]): scala.Unit = js.native
  def detectFile(
    path: java.lang.String,
    opts: Options,
    cb: js.Function2[/* err */ js.Any, /* result */ Result, scala.Unit]
  ): scala.Unit = js.native
  def detectFileSync(path: java.lang.String): Result = js.native
  def detectFileSync(path: java.lang.String, opts: Options): Result = js.native
}

