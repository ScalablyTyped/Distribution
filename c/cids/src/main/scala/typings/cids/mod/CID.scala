package typings.cids.mod

import typings.cids.anon.Codec
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CID extends js.Object {
  
  /**
    * The CID as a `Uint8Array`
    */
  val bytes: Uint8Array = js.native
  
  /**
    * The codec of the CID in its number form.
    */
  val code: Double = js.native
  
  /**
    * The codec of the CID.
    * @deprecated
    */
  val codec: String = js.native
  
  /**
    * Compare equality with another CID.
    *
    * @param other The other CID.
    */
  def equals(other: js.Any): Boolean = js.native
  
  /**
    * Multibase name as string.
    * @deprecated
    */
  val multibaseName: String = js.native
  
  /**
    * The multihash of the CID.
    */
  val multihash: Uint8Array = js.native
  
  /**
    * The prefix of the CID.
    * @deprecated
    */
  val prefix: Uint8Array = js.native
  
  /**
    * Encode the CID into a string.
    *
    * @param base Base encoding to use.
    */
  def toBaseEncodedString(): String = js.native
  def toBaseEncodedString(base: String): String = js.native
  
  /**
    * Serialize to a plain object.
    */
  def toJSON(): Codec = js.native
  
  def toString(base: String): String = js.native
  
  /**
    * Convert to a CID of version `0`.
    */
  def toV0(): CID = js.native
  
  /**
    * Convert to a CID of version `1`.
    */
  def toV1(): CID = js.native
  
  /**
    * The version of the CID.
    */
  val version: CIDVersion = js.native
}
