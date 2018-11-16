package typings
package coinstringLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coinstring", JSImport.Namespace)
@js.native
object coinstringMod extends js.Object {
  def createDecoder(version: scala.Double): js.Function2[
    /* base58str */ java.lang.String, 
    /* version */ js.UndefOr[scala.Double | nodeLib.Buffer], 
    nodeLib.Buffer
  ] = js.native
  def createEncoder(version: scala.Double): js.Function2[
    /* payload */ nodeLib.Buffer | js.Array[scala.Double] | stdLib.Uint8Array, 
    /* version */ js.UndefOr[scala.Double | nodeLib.Buffer], 
    java.lang.String
  ] = js.native
  def createValidator(version: scala.Double): js.Function2[
    /* base58str */ java.lang.String, 
    /* version */ js.UndefOr[scala.Double | nodeLib.Buffer], 
    scala.Boolean
  ] = js.native
  def decode(base58str: java.lang.String): nodeLib.Buffer = js.native
  def decode(base58str: java.lang.String, version: nodeLib.Buffer): nodeLib.Buffer = js.native
  def decode(base58str: java.lang.String, version: scala.Double): nodeLib.Buffer = js.native
  def encode(payload: js.Array[scala.Double]): java.lang.String = js.native
  def encode(payload: js.Array[scala.Double], version: nodeLib.Buffer): java.lang.String = js.native
  def encode(payload: js.Array[scala.Double], version: scala.Double): java.lang.String = js.native
  def encode(payload: nodeLib.Buffer): java.lang.String = js.native
  def encode(payload: nodeLib.Buffer, version: nodeLib.Buffer): java.lang.String = js.native
  def encode(payload: nodeLib.Buffer, version: scala.Double): java.lang.String = js.native
  def encode(payload: stdLib.Uint8Array): java.lang.String = js.native
  def encode(payload: stdLib.Uint8Array, version: nodeLib.Buffer): java.lang.String = js.native
  def encode(payload: stdLib.Uint8Array, version: scala.Double): java.lang.String = js.native
  def isValid(base58str: java.lang.String): scala.Boolean = js.native
  def isValid(base58str: java.lang.String, version: nodeLib.Buffer): scala.Boolean = js.native
  def isValid(base58str: java.lang.String, version: scala.Double): scala.Boolean = js.native
}

