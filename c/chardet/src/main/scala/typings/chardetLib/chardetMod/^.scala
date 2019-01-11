package typings
package chardetLib.chardetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chardet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def detect(buf: nodeLib.Buffer): chardetLib.chardetMod.Result = js.native
  def detect(buf: nodeLib.Buffer, opts: chardetLib.chardetMod.Options): chardetLib.chardetMod.Result = js.native
  def detectFile(
    path: java.lang.String,
    cb: js.Function2[/* err */ js.Any, /* result */ chardetLib.chardetMod.Result, scala.Unit]
  ): scala.Unit = js.native
  def detectFile(
    path: java.lang.String,
    opts: chardetLib.chardetMod.Options,
    cb: js.Function2[/* err */ js.Any, /* result */ chardetLib.chardetMod.Result, scala.Unit]
  ): scala.Unit = js.native
  def detectFileSync(path: java.lang.String): chardetLib.chardetMod.Result = js.native
  def detectFileSync(path: java.lang.String, opts: chardetLib.chardetMod.Options): chardetLib.chardetMod.Result = js.native
}

