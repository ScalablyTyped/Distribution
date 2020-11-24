package typings.cids.mod

import typings.std.Record
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cids", JSImport.Namespace)
@js.native
class ^ protected () extends CID {
  def this(cid: String) = this()
  def this(cid: CID) = this()
  def this(cid: Uint8Array) = this()
  /**
    * Create a new CID.
    *
    * The algorithm for argument input is roughly:
    * ```
    * if (cid)
    *   -> create a copy
    * else if (str)
    *   if (1st char is on multibase table) -> CID String
    *   else -> bs58 encoded multihash
    * else if (Uint8Array)
    *   if (1st byte is 0 or 1) -> CID
    *   else -> multihash
    * else if (Number)
    *   -> construct CID by parts
    * ```
    *
    * @example
    * new CID(<version>, <codec>, <multihash>, <multibaseName>)
    * new CID(<cidStr>)
    * new CID(<cid.bytes>)
    * new CID(<multihash>)
    * new CID(<bs58 encoded multihash>)
    * new CID(<cid>)
    */
  def this(version: CIDVersion, codec: String, multhash: Uint8Array) = this()
  def this(version: CIDVersion, codec: Double, multhash: Uint8Array) = this()
  def this(version: CIDVersion, codec: String, multhash: Uint8Array, multibaseName: String) = this()
  def this(version: CIDVersion, codec: Double, multhash: Uint8Array, multibaseName: String) = this()
}
@JSImport("cids", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var codecs: Record[String, Double] = js.native
  
  def isCID(mixed: js.Any): /* is cids.cids.CID */ Boolean = js.native
  
  /**
    * Test if the given input is a valid CID object.
    * Throws if it is not.
    *
    * @param other The other CID.
    */
  def validateCID(other: js.Any): Unit = js.native
}
