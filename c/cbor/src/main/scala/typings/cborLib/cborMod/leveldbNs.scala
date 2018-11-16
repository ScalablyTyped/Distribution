package typings
package cborLib.cborMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cbor", "leveldb")
@js.native
object leveldbNs extends js.Object {
  val buffer: scala.Boolean = js.native
  val name: java.lang.String = js.native
  def decode(input: java.lang.String): js.Array[_] = js.native
  def decode(input: nodeLib.Buffer): js.Array[_] = js.native
  def encode(input: js.Any): nodeLib.Buffer = js.native
}

