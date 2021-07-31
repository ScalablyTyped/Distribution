package typings.cids

import typings.cids.anon.Codec
import typings.std.Record
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cids", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with CID {
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
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cids", "codecs")
  @js.native
  def codecs: Record[String, Double] = js.native
  @scala.inline
  def codecs_=(x: Record[String, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codecs")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def isCID(mixed: js.Any): /* is cids.cids.CID */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCID")(mixed.asInstanceOf[js.Any]).asInstanceOf[/* is cids.cids.CID */ Boolean]
  
  /**
    * Test if the given input is a valid CID object.
    * Throws if it is not.
    *
    * @param other The other CID.
    */
  /* static member */
  @scala.inline
  def validateCID(other: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCID")(other.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait CID extends StObject {
    
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.cids.cidsNumbers.`0`
    - typings.cids.cidsNumbers.`1`
  */
  trait CIDVersion extends StObject
  object CIDVersion {
    
    @scala.inline
    def `0`: typings.cids.cidsNumbers.`0` = 0.asInstanceOf[typings.cids.cidsNumbers.`0`]
    
    @scala.inline
    def `1`: typings.cids.cidsNumbers.`1` = 1.asInstanceOf[typings.cids.cidsNumbers.`1`]
  }
}
