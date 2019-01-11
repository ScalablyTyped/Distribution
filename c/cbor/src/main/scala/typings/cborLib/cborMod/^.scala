package typings
package cborLib.cborMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cbor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(input: java.lang.String): js.Any = js.native
  def decode(input: nodeLib.Buffer): js.Any = js.native
  def decodeAll(
    input: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* objs */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def decodeAll(
    input: nodeLib.Buffer,
    callback: js.Function2[/* error */ js.Any, /* objs */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def decodeAllSync(input: java.lang.String): js.Array[_] = js.native
  def decodeAllSync(input: nodeLib.Buffer): js.Array[_] = js.native
  def decodeFirst(input: java.lang.String, callback: js.Function2[/* error */ js.Any, /* obj */ js.Any, scala.Unit]): scala.Unit = js.native
  def decodeFirst(input: nodeLib.Buffer, callback: js.Function2[/* error */ js.Any, /* obj */ js.Any, scala.Unit]): scala.Unit = js.native
  def decodeFirstSync(input: java.lang.String): js.Any = js.native
  def decodeFirstSync(input: nodeLib.Buffer): js.Any = js.native
  def encode(input: js.Any): nodeLib.Buffer = js.native
}

