package typings.cids

import typings.cids.cidsStrings.B
import typings.cids.cidsStrings.C
import typings.cids.cidsStrings.F
import typings.cids.cidsStrings.K
import typings.cids.cidsStrings.M
import typings.cids.cidsStrings.Null
import typings.cids.cidsStrings.T
import typings.cids.cidsStrings.U
import typings.cids.cidsStrings.V
import typings.cids.cidsStrings.Z
import typings.cids.cidsStrings.`0`
import typings.cids.cidsStrings.`7`
import typings.cids.cidsStrings.`9`
import typings.cids.cidsStrings.b_
import typings.cids.cidsStrings.base10
import typings.cids.cidsStrings.base16
import typings.cids.cidsStrings.base16upper
import typings.cids.cidsStrings.base2
import typings.cids.cidsStrings.base32
import typings.cids.cidsStrings.base32hex
import typings.cids.cidsStrings.base32hexpad
import typings.cids.cidsStrings.base32hexpadupper
import typings.cids.cidsStrings.base32hexupper
import typings.cids.cidsStrings.base32pad
import typings.cids.cidsStrings.base32padupper
import typings.cids.cidsStrings.base32upper
import typings.cids.cidsStrings.base32z
import typings.cids.cidsStrings.base36
import typings.cids.cidsStrings.base36upper
import typings.cids.cidsStrings.base58btc
import typings.cids.cidsStrings.base58flickr
import typings.cids.cidsStrings.base64
import typings.cids.cidsStrings.base64pad
import typings.cids.cidsStrings.base64url
import typings.cids.cidsStrings.base64urlpad
import typings.cids.cidsStrings.base8
import typings.cids.cidsStrings.c_
import typings.cids.cidsStrings.f_
import typings.cids.cidsStrings.h
import typings.cids.cidsStrings.identity
import typings.cids.cidsStrings.k_
import typings.cids.cidsStrings.m_
import typings.cids.cidsStrings.t_
import typings.cids.cidsStrings.u_
import typings.cids.cidsStrings.v_
import typings.cids.cidsStrings.z_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @typedef {Object} SerializedCID
    * @property {string} codec
    * @property {number} version
    * @property {Uint8Array} hash
    */
  /**
    * @typedef {0|1} CIDVersion
    * @typedef {import('multibase').BaseNameOrCode} BaseNameOrCode
    * @typedef {import('multicodec').CodecName} CodecName
    * @typedef {import('multicodec').CodecCode} CodecCode
    */
  /**
    * Class representing a CID `<mbase><version><mcodec><mhash>`
    * , as defined in [ipld/cid](https://github.com/multiformats/cid).
    *
    * @class CID
    */
  @JSImport("cids", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CID {
    def this(version: String) = this()
    def this(version: js.typedarray.Uint8Array) = this()
    def this(version: CID) = this()
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
      * @param {CIDVersion | string | Uint8Array | CID} version
      * @param {string|number} [codec]
      * @param {Uint8Array} [multihash]
      * @param {string} [multibaseName]
      *
      * @example
      * new CID(<version>, <codec>, <multihash>, <multibaseName>)
      * new CID(<cidStr>)
      * new CID(<cid.bytes>)
      * new CID(<multihash>)
      * new CID(<bs58 encoded multihash>)
      * new CID(<cid>)
      */
    def this(version: CIDVersion) = this()
    def this(version: String, codec: String) = this()
    def this(version: String, codec: Double) = this()
    def this(version: js.typedarray.Uint8Array, codec: String) = this()
    def this(version: js.typedarray.Uint8Array, codec: Double) = this()
    def this(version: CIDVersion, codec: String) = this()
    def this(version: CIDVersion, codec: Double) = this()
    def this(version: CID, codec: String) = this()
    def this(version: CID, codec: Double) = this()
    def this(version: String, codec: String, multihash: js.typedarray.Uint8Array) = this()
    def this(version: String, codec: Double, multihash: js.typedarray.Uint8Array) = this()
    def this(version: String, codec: Unit, multihash: js.typedarray.Uint8Array) = this()
    def this(version: js.typedarray.Uint8Array, codec: String, multihash: js.typedarray.Uint8Array) = this()
    def this(version: js.typedarray.Uint8Array, codec: Double, multihash: js.typedarray.Uint8Array) = this()
    def this(version: js.typedarray.Uint8Array, codec: Unit, multihash: js.typedarray.Uint8Array) = this()
    def this(version: CIDVersion, codec: String, multihash: js.typedarray.Uint8Array) = this()
    def this(version: CIDVersion, codec: Double, multihash: js.typedarray.Uint8Array) = this()
    def this(version: CIDVersion, codec: Unit, multihash: js.typedarray.Uint8Array) = this()
    def this(version: CID, codec: String, multihash: js.typedarray.Uint8Array) = this()
    def this(version: CID, codec: Double, multihash: js.typedarray.Uint8Array) = this()
    def this(version: CID, codec: Unit, multihash: js.typedarray.Uint8Array) = this()
    def this(version: String, codec: String, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: String, codec: String, multihash: Unit, multibaseName: String) = this()
    def this(version: String, codec: Double, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: String, codec: Double, multihash: Unit, multibaseName: String) = this()
    def this(version: String, codec: Unit, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: String, codec: Unit, multihash: Unit, multibaseName: String) = this()
    def this(
      version: js.typedarray.Uint8Array,
      codec: String,
      multihash: js.typedarray.Uint8Array,
      multibaseName: String
    ) = this()
    def this(version: js.typedarray.Uint8Array, codec: String, multihash: Unit, multibaseName: String) = this()
    def this(
      version: js.typedarray.Uint8Array,
      codec: Double,
      multihash: js.typedarray.Uint8Array,
      multibaseName: String
    ) = this()
    def this(version: js.typedarray.Uint8Array, codec: Double, multihash: Unit, multibaseName: String) = this()
    def this(
      version: js.typedarray.Uint8Array,
      codec: Unit,
      multihash: js.typedarray.Uint8Array,
      multibaseName: String
    ) = this()
    def this(version: js.typedarray.Uint8Array, codec: Unit, multihash: Unit, multibaseName: String) = this()
    def this(version: CIDVersion, codec: String, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: CIDVersion, codec: String, multihash: Unit, multibaseName: String) = this()
    def this(version: CIDVersion, codec: Double, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: CIDVersion, codec: Double, multihash: Unit, multibaseName: String) = this()
    def this(version: CIDVersion, codec: Unit, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: CIDVersion, codec: Unit, multihash: Unit, multibaseName: String) = this()
    def this(version: CID, codec: String, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: CID, codec: String, multihash: Unit, multibaseName: String) = this()
    def this(version: CID, codec: Double, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: CID, codec: Double, multihash: Unit, multibaseName: String) = this()
    def this(version: CID, codec: Unit, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: CID, codec: Unit, multihash: Unit, multibaseName: String) = this()
  }
  @JSImport("cids", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cids", "codecs")
  @js.native
  val codecs: Record[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_generated-types.CodecName */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_generated-types.CodecCode */ Any
  ] = js.native
  
  /**
    * Check if object is a CID instance
    *
    * @param {any} value
    * @returns {value is CID}
    */
  /* static member */
  inline def isCID(value: Any): /* is cids.cids.^ */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCID")(value.asInstanceOf[js.Any]).asInstanceOf[/* is cids.cids.^ */ Boolean]
  
  /**
    * Test if the given input is a valid CID object.
    * Throws if it is not.
    *
    * @param {any} other - The other CID.
    * @returns {void}
    */
  /* static member */
  inline def validateCID(other: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCID")(other.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.cids.cidsStrings.base58btc
    - typings.cids.cidsStrings.identity
    - typings.cids.cidsStrings.Null
    - typings.cids.cidsStrings.`0`
    - typings.cids.cidsStrings.`7`
    - typings.cids.cidsStrings.`9`
    - typings.cids.cidsStrings.f_
    - typings.cids.cidsStrings.F
    - typings.cids.cidsStrings.v_
    - typings.cids.cidsStrings.V
    - typings.cids.cidsStrings.t_
    - typings.cids.cidsStrings.T
    - typings.cids.cidsStrings.b_
    - typings.cids.cidsStrings.B
    - typings.cids.cidsStrings.c_
    - typings.cids.cidsStrings.C
    - typings.cids.cidsStrings.h
    - typings.cids.cidsStrings.k_
    - typings.cids.cidsStrings.K
    - typings.cids.cidsStrings.z_
    - typings.cids.cidsStrings.Z
    - typings.cids.cidsStrings.m_
    - typings.cids.cidsStrings.M
    - typings.cids.cidsStrings.u_
    - typings.cids.cidsStrings.U
    - typings.cids.cidsStrings.base2
    - typings.cids.cidsStrings.base8
    - typings.cids.cidsStrings.base10
    - typings.cids.cidsStrings.base16
    - typings.cids.cidsStrings.base16upper
    - typings.cids.cidsStrings.base32hex
    - typings.cids.cidsStrings.base32hexupper
    - typings.cids.cidsStrings.base32hexpad
    - typings.cids.cidsStrings.base32hexpadupper
    - typings.cids.cidsStrings.base32
    - typings.cids.cidsStrings.base32upper
    - typings.cids.cidsStrings.base32pad
    - typings.cids.cidsStrings.base32padupper
    - typings.cids.cidsStrings.base32z
    - typings.cids.cidsStrings.base36
    - typings.cids.cidsStrings.base36upper
    - typings.cids.cidsStrings.base58flickr
    - typings.cids.cidsStrings.base64
    - typings.cids.cidsStrings.base64pad
    - typings.cids.cidsStrings.base64url
    - typings.cids.cidsStrings.base64urlpad
  */
  trait BaseNameOrCode extends StObject
  object BaseNameOrCode {
    
    inline def `0`: typings.cids.cidsStrings.`0` = "0".asInstanceOf[typings.cids.cidsStrings.`0`]
    
    inline def `7`: typings.cids.cidsStrings.`7` = "7".asInstanceOf[typings.cids.cidsStrings.`7`]
    
    inline def `9`: typings.cids.cidsStrings.`9` = "9".asInstanceOf[typings.cids.cidsStrings.`9`]
    
    inline def B: typings.cids.cidsStrings.B = "B".asInstanceOf[typings.cids.cidsStrings.B]
    
    inline def C: typings.cids.cidsStrings.C = "C".asInstanceOf[typings.cids.cidsStrings.C]
    
    inline def F: typings.cids.cidsStrings.F = "F".asInstanceOf[typings.cids.cidsStrings.F]
    
    inline def K: typings.cids.cidsStrings.K = "K".asInstanceOf[typings.cids.cidsStrings.K]
    
    inline def M: typings.cids.cidsStrings.M = "M".asInstanceOf[typings.cids.cidsStrings.M]
    
    inline def Null: typings.cids.cidsStrings.Null = "\u0000".asInstanceOf[typings.cids.cidsStrings.Null]
    
    inline def T: typings.cids.cidsStrings.T = "T".asInstanceOf[typings.cids.cidsStrings.T]
    
    inline def U: typings.cids.cidsStrings.U = "U".asInstanceOf[typings.cids.cidsStrings.U]
    
    inline def V: typings.cids.cidsStrings.V = "V".asInstanceOf[typings.cids.cidsStrings.V]
    
    inline def Z: typings.cids.cidsStrings.Z = "Z".asInstanceOf[typings.cids.cidsStrings.Z]
    
    inline def b: b_ = "b".asInstanceOf[b_]
    
    inline def base10: typings.cids.cidsStrings.base10 = "base10".asInstanceOf[typings.cids.cidsStrings.base10]
    
    inline def base16: typings.cids.cidsStrings.base16 = "base16".asInstanceOf[typings.cids.cidsStrings.base16]
    
    inline def base16upper: typings.cids.cidsStrings.base16upper = "base16upper".asInstanceOf[typings.cids.cidsStrings.base16upper]
    
    inline def base2: typings.cids.cidsStrings.base2 = "base2".asInstanceOf[typings.cids.cidsStrings.base2]
    
    inline def base32: typings.cids.cidsStrings.base32 = "base32".asInstanceOf[typings.cids.cidsStrings.base32]
    
    inline def base32hex: typings.cids.cidsStrings.base32hex = "base32hex".asInstanceOf[typings.cids.cidsStrings.base32hex]
    
    inline def base32hexpad: typings.cids.cidsStrings.base32hexpad = "base32hexpad".asInstanceOf[typings.cids.cidsStrings.base32hexpad]
    
    inline def base32hexpadupper: typings.cids.cidsStrings.base32hexpadupper = "base32hexpadupper".asInstanceOf[typings.cids.cidsStrings.base32hexpadupper]
    
    inline def base32hexupper: typings.cids.cidsStrings.base32hexupper = "base32hexupper".asInstanceOf[typings.cids.cidsStrings.base32hexupper]
    
    inline def base32pad: typings.cids.cidsStrings.base32pad = "base32pad".asInstanceOf[typings.cids.cidsStrings.base32pad]
    
    inline def base32padupper: typings.cids.cidsStrings.base32padupper = "base32padupper".asInstanceOf[typings.cids.cidsStrings.base32padupper]
    
    inline def base32upper: typings.cids.cidsStrings.base32upper = "base32upper".asInstanceOf[typings.cids.cidsStrings.base32upper]
    
    inline def base32z: typings.cids.cidsStrings.base32z = "base32z".asInstanceOf[typings.cids.cidsStrings.base32z]
    
    inline def base36: typings.cids.cidsStrings.base36 = "base36".asInstanceOf[typings.cids.cidsStrings.base36]
    
    inline def base36upper: typings.cids.cidsStrings.base36upper = "base36upper".asInstanceOf[typings.cids.cidsStrings.base36upper]
    
    inline def base58btc: typings.cids.cidsStrings.base58btc = "base58btc".asInstanceOf[typings.cids.cidsStrings.base58btc]
    
    inline def base58flickr: typings.cids.cidsStrings.base58flickr = "base58flickr".asInstanceOf[typings.cids.cidsStrings.base58flickr]
    
    inline def base64: typings.cids.cidsStrings.base64 = "base64".asInstanceOf[typings.cids.cidsStrings.base64]
    
    inline def base64pad: typings.cids.cidsStrings.base64pad = "base64pad".asInstanceOf[typings.cids.cidsStrings.base64pad]
    
    inline def base64url: typings.cids.cidsStrings.base64url = "base64url".asInstanceOf[typings.cids.cidsStrings.base64url]
    
    inline def base64urlpad: typings.cids.cidsStrings.base64urlpad = "base64urlpad".asInstanceOf[typings.cids.cidsStrings.base64urlpad]
    
    inline def base8: typings.cids.cidsStrings.base8 = "base8".asInstanceOf[typings.cids.cidsStrings.base8]
    
    inline def c: c_ = "c".asInstanceOf[c_]
    
    inline def f: f_ = "f".asInstanceOf[f_]
    
    inline def h: typings.cids.cidsStrings.h = "h".asInstanceOf[typings.cids.cidsStrings.h]
    
    inline def identity: typings.cids.cidsStrings.identity = "identity".asInstanceOf[typings.cids.cidsStrings.identity]
    
    inline def k: k_ = "k".asInstanceOf[k_]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def t: t_ = "t".asInstanceOf[t_]
    
    inline def u: u_ = "u".asInstanceOf[u_]
    
    inline def v: v_ = "v".asInstanceOf[v_]
    
    inline def z: z_ = "z".asInstanceOf[z_]
  }
  
  /**
    * @typedef {Object} SerializedCID
    * @property {string} codec
    * @property {number} version
    * @property {Uint8Array} hash
    */
  /**
    * @typedef {0|1} CIDVersion
    * @typedef {import('multibase').BaseNameOrCode} BaseNameOrCode
    * @typedef {import('multicodec').CodecName} CodecName
    * @typedef {import('multicodec').CodecCode} CodecCode
    */
  /**
    * Class representing a CID `<mbase><version><mcodec><mhash>`
    * , as defined in [ipld/cid](https://github.com/multiformats/cid).
    *
    * @class CID
    */
  @js.native
  trait CID extends StObject {
    
    /**
      * The CID as a `Uint8Array`
      *
      * @returns {Uint8Array}
      *
      */
    def bytes: js.typedarray.Uint8Array = js.native
    
    /**
      * The codec of the CID in its number form.
      *
      * @returns {CodecCode}
      */
    def code: Any = js.native
    
    /**
      * The codec of the CID.
      *
      * @deprecated
      * @type {CodecName}
      */
    var codec: CodecName = js.native
    
    /**
      * Compare equality with another CID.
      *
      * @param {CID} other
      * @returns {boolean}
      */
    def equals(other: CID): Boolean = js.native
    
    var multibaseName: Any = js.native
    
    /**
      * The multihash of the CID.
      *
      * @type {Uint8Array}
      */
    var multihash: js.typedarray.Uint8Array = js.native
    
    /**
      * The prefix of the CID.
      *
      * @returns {Uint8Array}
      */
    def prefix: js.typedarray.Uint8Array = js.native
    
    /**
      * Encode the CID into a string.
      *
      * @param {BaseNameOrCode} [base=this.multibaseName] - Base encoding to use.
      * @returns {string}
      */
    def toBaseEncodedString(): String = js.native
    def toBaseEncodedString(
      base: base58btc | identity | Null | `0` | `7` | `9` | f_ | F | v_ | V | t_ | T | b_ | B | c_ | C | h | k_ | K | z_ | Z | m_ | M | u_ | U | base2 | base8 | base10 | base16 | base16upper | base32hex | base32hexupper | base32hexpad | base32hexpadupper | base32 | base32upper | base32pad | base32padupper | base32z | base36 | base36upper | base58flickr | base64 | base64pad | base64url | base64urlpad
    ): String = js.native
    
    /**
      * Serialize to a plain object.
      *
      * @returns {SerializedCID}
      */
    def toJSON(): SerializedCID = js.native
    
    def toString(
      base: base58btc | identity | Null | `0` | `7` | `9` | f_ | F | v_ | V | t_ | T | b_ | B | c_ | C | h | k_ | K | z_ | Z | m_ | M | u_ | U | base2 | base8 | base10 | base16 | base16upper | base32hex | base32hexupper | base32hexpad | base32hexpadupper | base32 | base32upper | base32pad | base32padupper | base32z | base36 | base36upper | base58flickr | base64 | base64pad | base64url | base64urlpad
    ): String = js.native
    
    /**
      * Convert to a CID of version `0`.
      *
      * @returns {CID}
      */
    def toV0(): CID = js.native
    
    /**
      * Convert to a CID of version `1`.
      *
      * @returns {CID}
      */
    def toV1(): CID = js.native
    
    /**
      * The version of the CID.
      *
      * @type {CIDVersion}
      */
    var version: CIDVersion = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cids.cidsInts.`0`
    - typings.cids.cidsInts.`1`
  */
  trait CIDVersion extends StObject
  object CIDVersion {
    
    inline def `0`: typings.cids.cidsInts.`0` = 0.asInstanceOf[typings.cids.cidsInts.`0`]
    
    inline def `1`: typings.cids.cidsInts.`1` = 1.asInstanceOf[typings.cids.cidsInts.`1`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cids.cidsInts.`0`
    - typings.cids.cidsInts.`1`
    - typings.cids.cidsInts.`2`
    - typings.cids.cidsInts.`3`
    - typings.cids.cidsInts.`4`
    - typings.cids.cidsInts.`6`
    - typings.cids.cidsInts.`17`
    - typings.cids.cidsInts.`18`
    - typings.cids.cidsInts.`19`
    - typings.cids.cidsInts.`20`
    - typings.cids.cidsInts.`21`
    - typings.cids.cidsInts.`22`
    - typings.cids.cidsInts.`23`
    - typings.cids.cidsInts.`24`
    - typings.cids.cidsInts.`25`
    - typings.cids.cidsInts.`26`
    - typings.cids.cidsInts.`27`
    - typings.cids.cidsInts.`28`
    - typings.cids.cidsInts.`29`
    - typings.cids.cidsInts.`30`
    - typings.cids.cidsInts.`33`
    - typings.cids.cidsInts.`34`
    - typings.cids.cidsInts.`35`
    - typings.cids.cidsInts.`41`
    - typings.cids.cidsInts.`42`
    - typings.cids.cidsInts.`47`
    - typings.cids.cidsInts.`48`
    - typings.cids.cidsInts.`49`
    - typings.cids.cidsInts.`50`
    - typings.cids.cidsInts.`51`
    - typings.cids.cidsInts.`53`
    - typings.cids.cidsInts.`54`
    - typings.cids.cidsInts.`55`
    - typings.cids.cidsInts.`56`
    - typings.cids.cidsInts.`80`
    - typings.cids.cidsInts.`81`
    - typings.cids.cidsInts.`85`
    - typings.cids.cidsInts.`86`
    - typings.cids.cidsInts.`96`
    - typings.cids.cidsInts.`99`
    - typings.cids.cidsInts.`112`
    - typings.cids.cidsInts.`113`
    - typings.cids.cidsInts.`114`
    - typings.cids.cidsInts.`120`
    - typings.cids.cidsInts.`123`
    - typings.cids.cidsInts.`124`
    - typings.cids.cidsInts.`129`
    - typings.cids.cidsInts.`130`
    - typings.cids.cidsInts.`131`
    - typings.cids.cidsInts.`132`
    - typings.cids.cidsInts.`133`
    - typings.cids.cidsInts.`134`
    - typings.cids.cidsInts.`144`
    - typings.cids.cidsInts.`145`
    - typings.cids.cidsInts.`146`
    - typings.cids.cidsInts.`147`
    - typings.cids.cidsInts.`148`
    - typings.cids.cidsInts.`149`
    - typings.cids.cidsInts.`150`
    - typings.cids.cidsInts.`151`
    - typings.cids.cidsInts.`152`
    - typings.cids.cidsInts.`176`
    - typings.cids.cidsInts.`177`
    - typings.cids.cidsInts.`178`
    - typings.cids.cidsInts.`192`
    - typings.cids.cidsInts.`193`
    - typings.cids.cidsInts.`206`
    - typings.cids.cidsInts.`208`
    - typings.cids.cidsInts.`209`
    - typings.cids.cidsInts.`212`
    - typings.cids.cidsInts.`213`
    - typings.cids.cidsInts.`214`
    - typings.cids.cidsInts.`224`
    - typings.cids.cidsInts.`225`
    - typings.cids.cidsInts.`226`
    - typings.cids.cidsInts.`227`
    - typings.cids.cidsInts.`228`
    - typings.cids.cidsInts.`229`
    - typings.cids.cidsInts.`230`
    - typings.cids.cidsInts.`231`
    - typings.cids.cidsInts.`234`
    - typings.cids.cidsInts.`235`
    - typings.cids.cidsInts.`236`
    - typings.cids.cidsInts.`237`
    - typings.cids.cidsInts.`238`
    - typings.cids.cidsInts.`240`
    - typings.cids.cidsInts.`241`
    - typings.cids.cidsInts.`250`
    - typings.cids.cidsInts.`251`
    - typings.cids.cidsInts.`273`
    - typings.cids.cidsInts.`275`
    - typings.cids.cidsInts.`276`
    - typings.cids.cidsInts.`277`
    - typings.cids.cidsInts.`290`
    - typings.cids.cidsInts.`297`
    - typings.cids.cidsInts.`301`
    - typings.cids.cidsInts.`302`
    - typings.cids.cidsInts.`400`
    - typings.cids.cidsInts.`406`
    - typings.cids.cidsInts.`421`
    - typings.cids.cidsInts.`443`
    - typings.cids.cidsInts.`444`
    - typings.cids.cidsInts.`445`
    - typings.cids.cidsInts.`446`
    - typings.cids.cidsInts.`447`
    - typings.cids.cidsInts.`448`
    - typings.cids.cidsInts.`460`
    - typings.cids.cidsInts.`477`
    - typings.cids.cidsInts.`478`
    - typings.cids.cidsInts.`479`
    - typings.cids.cidsInts.`480`
    - typings.cids.cidsInts.`512`
    - typings.cids.cidsInts.`513`
    - typings.cids.cidsInts.`769`
    - typings.cids.cidsInts.`4114`
    - typings.cids.cidsInts.`4178`
    - typings.cids.cidsInts.`4179`
    - typings.cids.cidsInts.`4180`
    - typings.cids.cidsInts.`4181`
    - typings.cids.cidsInts.`4352`
    - typings.cids.cidsInts.`4608`
    - typings.cids.cidsInts.`4609`
    - typings.cids.cidsInts.`4610`
    - typings.cids.cidsInts.`4611`
    - typings.cids.cidsInts.`4612`
    - typings.cids.cidsInts.`4864`
    - typings.cids.cidsInts.`7425`
    - typings.cids.cidsInts.`21325`
    - typings.cids.cidsInts.`45569`
    - typings.cids.cidsInts.`45570`
    - typings.cids.cidsInts.`45571`
    - typings.cids.cidsInts.`45572`
    - typings.cids.cidsInts.`45573`
    - typings.cids.cidsInts.`45574`
    - typings.cids.cidsInts.`45575`
    - typings.cids.cidsInts.`45576`
    - typings.cids.cidsInts.`45577`
    - typings.cids.cidsInts.`45578`
    - typings.cids.cidsInts.`45579`
    - typings.cids.cidsInts.`45580`
    - typings.cids.cidsInts.`45581`
    - typings.cids.cidsInts.`45582`
    - typings.cids.cidsInts.`45583`
    - typings.cids.cidsInts.`45584`
    - typings.cids.cidsInts.`45585`
    - typings.cids.cidsInts.`45586`
    - typings.cids.cidsInts.`45587`
    - typings.cids.cidsInts.`45588`
    - typings.cids.cidsInts.`45589`
    - typings.cids.cidsInts.`45590`
    - typings.cids.cidsInts.`45591`
    - typings.cids.cidsInts.`45592`
    - typings.cids.cidsInts.`45593`
    - typings.cids.cidsInts.`45594`
    - typings.cids.cidsInts.`45595`
    - typings.cids.cidsInts.`45596`
    - typings.cids.cidsInts.`45597`
    - typings.cids.cidsInts.`45598`
    - typings.cids.cidsInts.`45599`
    - typings.cids.cidsInts.`45600`
    - typings.cids.cidsInts.`45601`
    - typings.cids.cidsInts.`45602`
    - typings.cids.cidsInts.`45603`
    - typings.cids.cidsInts.`45604`
    - typings.cids.cidsInts.`45605`
    - typings.cids.cidsInts.`45606`
    - typings.cids.cidsInts.`45607`
    - typings.cids.cidsInts.`45608`
    - typings.cids.cidsInts.`45609`
    - typings.cids.cidsInts.`45610`
    - typings.cids.cidsInts.`45611`
    - typings.cids.cidsInts.`45612`
    - typings.cids.cidsInts.`45613`
    - typings.cids.cidsInts.`45614`
    - typings.cids.cidsInts.`45615`
    - typings.cids.cidsInts.`45616`
    - typings.cids.cidsInts.`45617`
    - typings.cids.cidsInts.`45618`
    - typings.cids.cidsInts.`45619`
    - typings.cids.cidsInts.`45620`
    - typings.cids.cidsInts.`45621`
    - typings.cids.cidsInts.`45622`
    - typings.cids.cidsInts.`45623`
    - typings.cids.cidsInts.`45624`
    - typings.cids.cidsInts.`45625`
    - typings.cids.cidsInts.`45626`
    - typings.cids.cidsInts.`45627`
    - typings.cids.cidsInts.`45628`
    - typings.cids.cidsInts.`45629`
    - typings.cids.cidsInts.`45630`
    - typings.cids.cidsInts.`45631`
    - typings.cids.cidsInts.`45632`
    - typings.cids.cidsInts.`45633`
    - typings.cids.cidsInts.`45634`
    - typings.cids.cidsInts.`45635`
    - typings.cids.cidsInts.`45636`
    - typings.cids.cidsInts.`45637`
    - typings.cids.cidsInts.`45638`
    - typings.cids.cidsInts.`45639`
    - typings.cids.cidsInts.`45640`
    - typings.cids.cidsInts.`45641`
    - typings.cids.cidsInts.`45642`
    - typings.cids.cidsInts.`45643`
    - typings.cids.cidsInts.`45644`
    - typings.cids.cidsInts.`45645`
    - typings.cids.cidsInts.`45646`
    - typings.cids.cidsInts.`45647`
    - typings.cids.cidsInts.`45648`
    - typings.cids.cidsInts.`45649`
    - typings.cids.cidsInts.`45650`
    - typings.cids.cidsInts.`45651`
    - typings.cids.cidsInts.`45652`
    - typings.cids.cidsInts.`45653`
    - typings.cids.cidsInts.`45654`
    - typings.cids.cidsInts.`45655`
    - typings.cids.cidsInts.`45656`
    - typings.cids.cidsInts.`45657`
    - typings.cids.cidsInts.`45658`
    - typings.cids.cidsInts.`45659`
    - typings.cids.cidsInts.`45660`
    - typings.cids.cidsInts.`45661`
    - typings.cids.cidsInts.`45662`
    - typings.cids.cidsInts.`45663`
    - typings.cids.cidsInts.`45664`
    - typings.cids.cidsInts.`45825`
    - typings.cids.cidsInts.`45826`
    - typings.cids.cidsInts.`45827`
    - typings.cids.cidsInts.`45828`
    - typings.cids.cidsInts.`45829`
    - typings.cids.cidsInts.`45830`
    - typings.cids.cidsInts.`45831`
    - typings.cids.cidsInts.`45832`
    - typings.cids.cidsInts.`45833`
    - typings.cids.cidsInts.`45834`
    - typings.cids.cidsInts.`45835`
    - typings.cids.cidsInts.`45836`
    - typings.cids.cidsInts.`45837`
    - typings.cids.cidsInts.`45838`
    - typings.cids.cidsInts.`45839`
    - typings.cids.cidsInts.`45840`
    - typings.cids.cidsInts.`45841`
    - typings.cids.cidsInts.`45842`
    - typings.cids.cidsInts.`45843`
    - typings.cids.cidsInts.`45844`
    - typings.cids.cidsInts.`45845`
    - typings.cids.cidsInts.`45846`
    - typings.cids.cidsInts.`45847`
    - typings.cids.cidsInts.`45848`
    - typings.cids.cidsInts.`45849`
    - typings.cids.cidsInts.`45850`
    - typings.cids.cidsInts.`45851`
    - typings.cids.cidsInts.`45852`
    - typings.cids.cidsInts.`45853`
    - typings.cids.cidsInts.`45854`
    - typings.cids.cidsInts.`45855`
    - typings.cids.cidsInts.`45856`
    - typings.cids.cidsInts.`45857`
    - typings.cids.cidsInts.`45858`
    - typings.cids.cidsInts.`45859`
    - typings.cids.cidsInts.`45860`
    - typings.cids.cidsInts.`45861`
    - typings.cids.cidsInts.`45862`
    - typings.cids.cidsInts.`45863`
    - typings.cids.cidsInts.`45864`
    - typings.cids.cidsInts.`45865`
    - typings.cids.cidsInts.`45866`
    - typings.cids.cidsInts.`45867`
    - typings.cids.cidsInts.`45868`
    - typings.cids.cidsInts.`45869`
    - typings.cids.cidsInts.`45870`
    - typings.cids.cidsInts.`45871`
    - typings.cids.cidsInts.`45872`
    - typings.cids.cidsInts.`45873`
    - typings.cids.cidsInts.`45874`
    - typings.cids.cidsInts.`45875`
    - typings.cids.cidsInts.`45876`
    - typings.cids.cidsInts.`45877`
    - typings.cids.cidsInts.`45878`
    - typings.cids.cidsInts.`45879`
    - typings.cids.cidsInts.`45880`
    - typings.cids.cidsInts.`45881`
    - typings.cids.cidsInts.`45882`
    - typings.cids.cidsInts.`45883`
    - typings.cids.cidsInts.`45884`
    - typings.cids.cidsInts.`45885`
    - typings.cids.cidsInts.`45886`
    - typings.cids.cidsInts.`45887`
    - typings.cids.cidsInts.`45888`
    - typings.cids.cidsInts.`45889`
    - typings.cids.cidsInts.`45890`
    - typings.cids.cidsInts.`45891`
    - typings.cids.cidsInts.`45892`
    - typings.cids.cidsInts.`45893`
    - typings.cids.cidsInts.`45894`
    - typings.cids.cidsInts.`45895`
    - typings.cids.cidsInts.`45896`
    - typings.cids.cidsInts.`45897`
    - typings.cids.cidsInts.`45898`
    - typings.cids.cidsInts.`45899`
    - typings.cids.cidsInts.`45900`
    - typings.cids.cidsInts.`45901`
    - typings.cids.cidsInts.`45902`
    - typings.cids.cidsInts.`45903`
    - typings.cids.cidsInts.`45904`
    - typings.cids.cidsInts.`45905`
    - typings.cids.cidsInts.`45906`
    - typings.cids.cidsInts.`45907`
    - typings.cids.cidsInts.`45908`
    - typings.cids.cidsInts.`45909`
    - typings.cids.cidsInts.`45910`
    - typings.cids.cidsInts.`45911`
    - typings.cids.cidsInts.`45912`
    - typings.cids.cidsInts.`45913`
    - typings.cids.cidsInts.`45914`
    - typings.cids.cidsInts.`45915`
    - typings.cids.cidsInts.`45916`
    - typings.cids.cidsInts.`45917`
    - typings.cids.cidsInts.`45918`
    - typings.cids.cidsInts.`45919`
    - typings.cids.cidsInts.`45920`
    - typings.cids.cidsInts.`45921`
    - typings.cids.cidsInts.`45922`
    - typings.cids.cidsInts.`45923`
    - typings.cids.cidsInts.`45924`
    - typings.cids.cidsInts.`45925`
    - typings.cids.cidsInts.`45926`
    - typings.cids.cidsInts.`45927`
    - typings.cids.cidsInts.`45928`
    - typings.cids.cidsInts.`45929`
    - typings.cids.cidsInts.`45930`
    - typings.cids.cidsInts.`45931`
    - typings.cids.cidsInts.`45932`
    - typings.cids.cidsInts.`45933`
    - typings.cids.cidsInts.`45934`
    - typings.cids.cidsInts.`45935`
    - typings.cids.cidsInts.`45936`
    - typings.cids.cidsInts.`45937`
    - typings.cids.cidsInts.`45938`
    - typings.cids.cidsInts.`45939`
    - typings.cids.cidsInts.`45940`
    - typings.cids.cidsInts.`45941`
    - typings.cids.cidsInts.`45942`
    - typings.cids.cidsInts.`45943`
    - typings.cids.cidsInts.`45944`
    - typings.cids.cidsInts.`45945`
    - typings.cids.cidsInts.`45946`
    - typings.cids.cidsInts.`45947`
    - typings.cids.cidsInts.`45948`
    - typings.cids.cidsInts.`45949`
    - typings.cids.cidsInts.`45950`
    - typings.cids.cidsInts.`45951`
    - typings.cids.cidsInts.`45952`
    - typings.cids.cidsInts.`45953`
    - typings.cids.cidsInts.`45954`
    - typings.cids.cidsInts.`45955`
    - typings.cids.cidsInts.`45956`
    - typings.cids.cidsInts.`45957`
    - typings.cids.cidsInts.`45958`
    - typings.cids.cidsInts.`45959`
    - typings.cids.cidsInts.`45960`
    - typings.cids.cidsInts.`45961`
    - typings.cids.cidsInts.`45962`
    - typings.cids.cidsInts.`45963`
    - typings.cids.cidsInts.`45964`
    - typings.cids.cidsInts.`45965`
    - typings.cids.cidsInts.`45966`
    - typings.cids.cidsInts.`45967`
    - typings.cids.cidsInts.`45968`
    - typings.cids.cidsInts.`45969`
    - typings.cids.cidsInts.`45970`
    - typings.cids.cidsInts.`45971`
    - typings.cids.cidsInts.`45972`
    - typings.cids.cidsInts.`45973`
    - typings.cids.cidsInts.`45974`
    - typings.cids.cidsInts.`45975`
    - typings.cids.cidsInts.`45976`
    - typings.cids.cidsInts.`45977`
    - typings.cids.cidsInts.`45978`
    - typings.cids.cidsInts.`45979`
    - typings.cids.cidsInts.`45980`
    - typings.cids.cidsInts.`45981`
    - typings.cids.cidsInts.`45982`
    - typings.cids.cidsInts.`45983`
    - typings.cids.cidsInts.`45984`
    - typings.cids.cidsInts.`45985`
    - typings.cids.cidsInts.`45986`
    - typings.cids.cidsInts.`45987`
    - typings.cids.cidsInts.`45988`
    - typings.cids.cidsInts.`45989`
    - typings.cids.cidsInts.`45990`
    - typings.cids.cidsInts.`45991`
    - typings.cids.cidsInts.`45992`
    - typings.cids.cidsInts.`45993`
    - typings.cids.cidsInts.`45994`
    - typings.cids.cidsInts.`45995`
    - typings.cids.cidsInts.`45996`
    - typings.cids.cidsInts.`45997`
    - typings.cids.cidsInts.`45998`
    - typings.cids.cidsInts.`45999`
    - typings.cids.cidsInts.`46000`
    - typings.cids.cidsInts.`46001`
    - typings.cids.cidsInts.`46002`
    - typings.cids.cidsInts.`46003`
    - typings.cids.cidsInts.`46004`
    - typings.cids.cidsInts.`46005`
    - typings.cids.cidsInts.`46006`
    - typings.cids.cidsInts.`46007`
    - typings.cids.cidsInts.`46008`
    - typings.cids.cidsInts.`46009`
    - typings.cids.cidsInts.`46010`
    - typings.cids.cidsInts.`46011`
    - typings.cids.cidsInts.`46012`
    - typings.cids.cidsInts.`46013`
    - typings.cids.cidsInts.`46014`
    - typings.cids.cidsInts.`46015`
    - typings.cids.cidsInts.`46016`
    - typings.cids.cidsInts.`46017`
    - typings.cids.cidsInts.`46018`
    - typings.cids.cidsInts.`46019`
    - typings.cids.cidsInts.`46020`
    - typings.cids.cidsInts.`46021`
    - typings.cids.cidsInts.`46022`
    - typings.cids.cidsInts.`46023`
    - typings.cids.cidsInts.`46024`
    - typings.cids.cidsInts.`46025`
    - typings.cids.cidsInts.`46026`
    - typings.cids.cidsInts.`46027`
    - typings.cids.cidsInts.`46028`
    - typings.cids.cidsInts.`46029`
    - typings.cids.cidsInts.`46030`
    - typings.cids.cidsInts.`46031`
    - typings.cids.cidsInts.`46032`
    - typings.cids.cidsInts.`46033`
    - typings.cids.cidsInts.`46034`
    - typings.cids.cidsInts.`46035`
    - typings.cids.cidsInts.`46036`
    - typings.cids.cidsInts.`46037`
    - typings.cids.cidsInts.`46038`
    - typings.cids.cidsInts.`46039`
    - typings.cids.cidsInts.`46040`
    - typings.cids.cidsInts.`46041`
    - typings.cids.cidsInts.`46042`
    - typings.cids.cidsInts.`46043`
    - typings.cids.cidsInts.`46044`
    - typings.cids.cidsInts.`46045`
    - typings.cids.cidsInts.`46046`
    - typings.cids.cidsInts.`46047`
    - typings.cids.cidsInts.`46048`
    - typings.cids.cidsInts.`46081`
    - typings.cids.cidsInts.`46082`
    - typings.cids.cidsInts.`52753`
    - typings.cids.cidsInts.`61697`
    - typings.cids.cidsInts.`61698`
    - typings.cids.cidsInts.`8417572`
    - typings.cids.cidsInts.`8483108`
    - typings.cids.cidsInts.`9728292`
    - typings.cids.cidsInts.`9793828`
    - typings.cids.cidsInts.`10645796`
    - typings.cids.cidsInts.`10711332`
    - typings.cids.cidsInts.`11639056`
  */
  trait CodecCode extends StObject
  object CodecCode {
    
    inline def `0`: typings.cids.cidsInts.`0` = 0.asInstanceOf[typings.cids.cidsInts.`0`]
    
    inline def `1`: typings.cids.cidsInts.`1` = 1.asInstanceOf[typings.cids.cidsInts.`1`]
    
    inline def `10645796`: typings.cids.cidsInts.`10645796` = 10645796.asInstanceOf[typings.cids.cidsInts.`10645796`]
    
    inline def `10711332`: typings.cids.cidsInts.`10711332` = 10711332.asInstanceOf[typings.cids.cidsInts.`10711332`]
    
    inline def `112`: typings.cids.cidsInts.`112` = 112.asInstanceOf[typings.cids.cidsInts.`112`]
    
    inline def `113`: typings.cids.cidsInts.`113` = 113.asInstanceOf[typings.cids.cidsInts.`113`]
    
    inline def `114`: typings.cids.cidsInts.`114` = 114.asInstanceOf[typings.cids.cidsInts.`114`]
    
    inline def `11639056`: typings.cids.cidsInts.`11639056` = 11639056.asInstanceOf[typings.cids.cidsInts.`11639056`]
    
    inline def `120`: typings.cids.cidsInts.`120` = 120.asInstanceOf[typings.cids.cidsInts.`120`]
    
    inline def `123`: typings.cids.cidsInts.`123` = 123.asInstanceOf[typings.cids.cidsInts.`123`]
    
    inline def `124`: typings.cids.cidsInts.`124` = 124.asInstanceOf[typings.cids.cidsInts.`124`]
    
    inline def `129`: typings.cids.cidsInts.`129` = 129.asInstanceOf[typings.cids.cidsInts.`129`]
    
    inline def `130`: typings.cids.cidsInts.`130` = 130.asInstanceOf[typings.cids.cidsInts.`130`]
    
    inline def `131`: typings.cids.cidsInts.`131` = 131.asInstanceOf[typings.cids.cidsInts.`131`]
    
    inline def `132`: typings.cids.cidsInts.`132` = 132.asInstanceOf[typings.cids.cidsInts.`132`]
    
    inline def `133`: typings.cids.cidsInts.`133` = 133.asInstanceOf[typings.cids.cidsInts.`133`]
    
    inline def `134`: typings.cids.cidsInts.`134` = 134.asInstanceOf[typings.cids.cidsInts.`134`]
    
    inline def `144`: typings.cids.cidsInts.`144` = 144.asInstanceOf[typings.cids.cidsInts.`144`]
    
    inline def `145`: typings.cids.cidsInts.`145` = 145.asInstanceOf[typings.cids.cidsInts.`145`]
    
    inline def `146`: typings.cids.cidsInts.`146` = 146.asInstanceOf[typings.cids.cidsInts.`146`]
    
    inline def `147`: typings.cids.cidsInts.`147` = 147.asInstanceOf[typings.cids.cidsInts.`147`]
    
    inline def `148`: typings.cids.cidsInts.`148` = 148.asInstanceOf[typings.cids.cidsInts.`148`]
    
    inline def `149`: typings.cids.cidsInts.`149` = 149.asInstanceOf[typings.cids.cidsInts.`149`]
    
    inline def `150`: typings.cids.cidsInts.`150` = 150.asInstanceOf[typings.cids.cidsInts.`150`]
    
    inline def `151`: typings.cids.cidsInts.`151` = 151.asInstanceOf[typings.cids.cidsInts.`151`]
    
    inline def `152`: typings.cids.cidsInts.`152` = 152.asInstanceOf[typings.cids.cidsInts.`152`]
    
    inline def `17`: typings.cids.cidsInts.`17` = 17.asInstanceOf[typings.cids.cidsInts.`17`]
    
    inline def `176`: typings.cids.cidsInts.`176` = 176.asInstanceOf[typings.cids.cidsInts.`176`]
    
    inline def `177`: typings.cids.cidsInts.`177` = 177.asInstanceOf[typings.cids.cidsInts.`177`]
    
    inline def `178`: typings.cids.cidsInts.`178` = 178.asInstanceOf[typings.cids.cidsInts.`178`]
    
    inline def `18`: typings.cids.cidsInts.`18` = 18.asInstanceOf[typings.cids.cidsInts.`18`]
    
    inline def `19`: typings.cids.cidsInts.`19` = 19.asInstanceOf[typings.cids.cidsInts.`19`]
    
    inline def `192`: typings.cids.cidsInts.`192` = 192.asInstanceOf[typings.cids.cidsInts.`192`]
    
    inline def `193`: typings.cids.cidsInts.`193` = 193.asInstanceOf[typings.cids.cidsInts.`193`]
    
    inline def `2`: typings.cids.cidsInts.`2` = 2.asInstanceOf[typings.cids.cidsInts.`2`]
    
    inline def `20`: typings.cids.cidsInts.`20` = 20.asInstanceOf[typings.cids.cidsInts.`20`]
    
    inline def `206`: typings.cids.cidsInts.`206` = 206.asInstanceOf[typings.cids.cidsInts.`206`]
    
    inline def `208`: typings.cids.cidsInts.`208` = 208.asInstanceOf[typings.cids.cidsInts.`208`]
    
    inline def `209`: typings.cids.cidsInts.`209` = 209.asInstanceOf[typings.cids.cidsInts.`209`]
    
    inline def `21`: typings.cids.cidsInts.`21` = 21.asInstanceOf[typings.cids.cidsInts.`21`]
    
    inline def `212`: typings.cids.cidsInts.`212` = 212.asInstanceOf[typings.cids.cidsInts.`212`]
    
    inline def `213`: typings.cids.cidsInts.`213` = 213.asInstanceOf[typings.cids.cidsInts.`213`]
    
    inline def `21325`: typings.cids.cidsInts.`21325` = 21325.asInstanceOf[typings.cids.cidsInts.`21325`]
    
    inline def `214`: typings.cids.cidsInts.`214` = 214.asInstanceOf[typings.cids.cidsInts.`214`]
    
    inline def `22`: typings.cids.cidsInts.`22` = 22.asInstanceOf[typings.cids.cidsInts.`22`]
    
    inline def `224`: typings.cids.cidsInts.`224` = 224.asInstanceOf[typings.cids.cidsInts.`224`]
    
    inline def `225`: typings.cids.cidsInts.`225` = 225.asInstanceOf[typings.cids.cidsInts.`225`]
    
    inline def `226`: typings.cids.cidsInts.`226` = 226.asInstanceOf[typings.cids.cidsInts.`226`]
    
    inline def `227`: typings.cids.cidsInts.`227` = 227.asInstanceOf[typings.cids.cidsInts.`227`]
    
    inline def `228`: typings.cids.cidsInts.`228` = 228.asInstanceOf[typings.cids.cidsInts.`228`]
    
    inline def `229`: typings.cids.cidsInts.`229` = 229.asInstanceOf[typings.cids.cidsInts.`229`]
    
    inline def `23`: typings.cids.cidsInts.`23` = 23.asInstanceOf[typings.cids.cidsInts.`23`]
    
    inline def `230`: typings.cids.cidsInts.`230` = 230.asInstanceOf[typings.cids.cidsInts.`230`]
    
    inline def `231`: typings.cids.cidsInts.`231` = 231.asInstanceOf[typings.cids.cidsInts.`231`]
    
    inline def `234`: typings.cids.cidsInts.`234` = 234.asInstanceOf[typings.cids.cidsInts.`234`]
    
    inline def `235`: typings.cids.cidsInts.`235` = 235.asInstanceOf[typings.cids.cidsInts.`235`]
    
    inline def `236`: typings.cids.cidsInts.`236` = 236.asInstanceOf[typings.cids.cidsInts.`236`]
    
    inline def `237`: typings.cids.cidsInts.`237` = 237.asInstanceOf[typings.cids.cidsInts.`237`]
    
    inline def `238`: typings.cids.cidsInts.`238` = 238.asInstanceOf[typings.cids.cidsInts.`238`]
    
    inline def `24`: typings.cids.cidsInts.`24` = 24.asInstanceOf[typings.cids.cidsInts.`24`]
    
    inline def `240`: typings.cids.cidsInts.`240` = 240.asInstanceOf[typings.cids.cidsInts.`240`]
    
    inline def `241`: typings.cids.cidsInts.`241` = 241.asInstanceOf[typings.cids.cidsInts.`241`]
    
    inline def `25`: typings.cids.cidsInts.`25` = 25.asInstanceOf[typings.cids.cidsInts.`25`]
    
    inline def `250`: typings.cids.cidsInts.`250` = 250.asInstanceOf[typings.cids.cidsInts.`250`]
    
    inline def `251`: typings.cids.cidsInts.`251` = 251.asInstanceOf[typings.cids.cidsInts.`251`]
    
    inline def `26`: typings.cids.cidsInts.`26` = 26.asInstanceOf[typings.cids.cidsInts.`26`]
    
    inline def `27`: typings.cids.cidsInts.`27` = 27.asInstanceOf[typings.cids.cidsInts.`27`]
    
    inline def `273`: typings.cids.cidsInts.`273` = 273.asInstanceOf[typings.cids.cidsInts.`273`]
    
    inline def `275`: typings.cids.cidsInts.`275` = 275.asInstanceOf[typings.cids.cidsInts.`275`]
    
    inline def `276`: typings.cids.cidsInts.`276` = 276.asInstanceOf[typings.cids.cidsInts.`276`]
    
    inline def `277`: typings.cids.cidsInts.`277` = 277.asInstanceOf[typings.cids.cidsInts.`277`]
    
    inline def `28`: typings.cids.cidsInts.`28` = 28.asInstanceOf[typings.cids.cidsInts.`28`]
    
    inline def `29`: typings.cids.cidsInts.`29` = 29.asInstanceOf[typings.cids.cidsInts.`29`]
    
    inline def `290`: typings.cids.cidsInts.`290` = 290.asInstanceOf[typings.cids.cidsInts.`290`]
    
    inline def `297`: typings.cids.cidsInts.`297` = 297.asInstanceOf[typings.cids.cidsInts.`297`]
    
    inline def `3`: typings.cids.cidsInts.`3` = 3.asInstanceOf[typings.cids.cidsInts.`3`]
    
    inline def `30`: typings.cids.cidsInts.`30` = 30.asInstanceOf[typings.cids.cidsInts.`30`]
    
    inline def `301`: typings.cids.cidsInts.`301` = 301.asInstanceOf[typings.cids.cidsInts.`301`]
    
    inline def `302`: typings.cids.cidsInts.`302` = 302.asInstanceOf[typings.cids.cidsInts.`302`]
    
    inline def `33`: typings.cids.cidsInts.`33` = 33.asInstanceOf[typings.cids.cidsInts.`33`]
    
    inline def `34`: typings.cids.cidsInts.`34` = 34.asInstanceOf[typings.cids.cidsInts.`34`]
    
    inline def `35`: typings.cids.cidsInts.`35` = 35.asInstanceOf[typings.cids.cidsInts.`35`]
    
    inline def `4`: typings.cids.cidsInts.`4` = 4.asInstanceOf[typings.cids.cidsInts.`4`]
    
    inline def `400`: typings.cids.cidsInts.`400` = 400.asInstanceOf[typings.cids.cidsInts.`400`]
    
    inline def `406`: typings.cids.cidsInts.`406` = 406.asInstanceOf[typings.cids.cidsInts.`406`]
    
    inline def `41`: typings.cids.cidsInts.`41` = 41.asInstanceOf[typings.cids.cidsInts.`41`]
    
    inline def `4114`: typings.cids.cidsInts.`4114` = 4114.asInstanceOf[typings.cids.cidsInts.`4114`]
    
    inline def `4178`: typings.cids.cidsInts.`4178` = 4178.asInstanceOf[typings.cids.cidsInts.`4178`]
    
    inline def `4179`: typings.cids.cidsInts.`4179` = 4179.asInstanceOf[typings.cids.cidsInts.`4179`]
    
    inline def `4180`: typings.cids.cidsInts.`4180` = 4180.asInstanceOf[typings.cids.cidsInts.`4180`]
    
    inline def `4181`: typings.cids.cidsInts.`4181` = 4181.asInstanceOf[typings.cids.cidsInts.`4181`]
    
    inline def `42`: typings.cids.cidsInts.`42` = 42.asInstanceOf[typings.cids.cidsInts.`42`]
    
    inline def `421`: typings.cids.cidsInts.`421` = 421.asInstanceOf[typings.cids.cidsInts.`421`]
    
    inline def `4352`: typings.cids.cidsInts.`4352` = 4352.asInstanceOf[typings.cids.cidsInts.`4352`]
    
    inline def `443`: typings.cids.cidsInts.`443` = 443.asInstanceOf[typings.cids.cidsInts.`443`]
    
    inline def `444`: typings.cids.cidsInts.`444` = 444.asInstanceOf[typings.cids.cidsInts.`444`]
    
    inline def `445`: typings.cids.cidsInts.`445` = 445.asInstanceOf[typings.cids.cidsInts.`445`]
    
    inline def `446`: typings.cids.cidsInts.`446` = 446.asInstanceOf[typings.cids.cidsInts.`446`]
    
    inline def `447`: typings.cids.cidsInts.`447` = 447.asInstanceOf[typings.cids.cidsInts.`447`]
    
    inline def `448`: typings.cids.cidsInts.`448` = 448.asInstanceOf[typings.cids.cidsInts.`448`]
    
    inline def `45569`: typings.cids.cidsInts.`45569` = 45569.asInstanceOf[typings.cids.cidsInts.`45569`]
    
    inline def `45570`: typings.cids.cidsInts.`45570` = 45570.asInstanceOf[typings.cids.cidsInts.`45570`]
    
    inline def `45571`: typings.cids.cidsInts.`45571` = 45571.asInstanceOf[typings.cids.cidsInts.`45571`]
    
    inline def `45572`: typings.cids.cidsInts.`45572` = 45572.asInstanceOf[typings.cids.cidsInts.`45572`]
    
    inline def `45573`: typings.cids.cidsInts.`45573` = 45573.asInstanceOf[typings.cids.cidsInts.`45573`]
    
    inline def `45574`: typings.cids.cidsInts.`45574` = 45574.asInstanceOf[typings.cids.cidsInts.`45574`]
    
    inline def `45575`: typings.cids.cidsInts.`45575` = 45575.asInstanceOf[typings.cids.cidsInts.`45575`]
    
    inline def `45576`: typings.cids.cidsInts.`45576` = 45576.asInstanceOf[typings.cids.cidsInts.`45576`]
    
    inline def `45577`: typings.cids.cidsInts.`45577` = 45577.asInstanceOf[typings.cids.cidsInts.`45577`]
    
    inline def `45578`: typings.cids.cidsInts.`45578` = 45578.asInstanceOf[typings.cids.cidsInts.`45578`]
    
    inline def `45579`: typings.cids.cidsInts.`45579` = 45579.asInstanceOf[typings.cids.cidsInts.`45579`]
    
    inline def `45580`: typings.cids.cidsInts.`45580` = 45580.asInstanceOf[typings.cids.cidsInts.`45580`]
    
    inline def `45581`: typings.cids.cidsInts.`45581` = 45581.asInstanceOf[typings.cids.cidsInts.`45581`]
    
    inline def `45582`: typings.cids.cidsInts.`45582` = 45582.asInstanceOf[typings.cids.cidsInts.`45582`]
    
    inline def `45583`: typings.cids.cidsInts.`45583` = 45583.asInstanceOf[typings.cids.cidsInts.`45583`]
    
    inline def `45584`: typings.cids.cidsInts.`45584` = 45584.asInstanceOf[typings.cids.cidsInts.`45584`]
    
    inline def `45585`: typings.cids.cidsInts.`45585` = 45585.asInstanceOf[typings.cids.cidsInts.`45585`]
    
    inline def `45586`: typings.cids.cidsInts.`45586` = 45586.asInstanceOf[typings.cids.cidsInts.`45586`]
    
    inline def `45587`: typings.cids.cidsInts.`45587` = 45587.asInstanceOf[typings.cids.cidsInts.`45587`]
    
    inline def `45588`: typings.cids.cidsInts.`45588` = 45588.asInstanceOf[typings.cids.cidsInts.`45588`]
    
    inline def `45589`: typings.cids.cidsInts.`45589` = 45589.asInstanceOf[typings.cids.cidsInts.`45589`]
    
    inline def `45590`: typings.cids.cidsInts.`45590` = 45590.asInstanceOf[typings.cids.cidsInts.`45590`]
    
    inline def `45591`: typings.cids.cidsInts.`45591` = 45591.asInstanceOf[typings.cids.cidsInts.`45591`]
    
    inline def `45592`: typings.cids.cidsInts.`45592` = 45592.asInstanceOf[typings.cids.cidsInts.`45592`]
    
    inline def `45593`: typings.cids.cidsInts.`45593` = 45593.asInstanceOf[typings.cids.cidsInts.`45593`]
    
    inline def `45594`: typings.cids.cidsInts.`45594` = 45594.asInstanceOf[typings.cids.cidsInts.`45594`]
    
    inline def `45595`: typings.cids.cidsInts.`45595` = 45595.asInstanceOf[typings.cids.cidsInts.`45595`]
    
    inline def `45596`: typings.cids.cidsInts.`45596` = 45596.asInstanceOf[typings.cids.cidsInts.`45596`]
    
    inline def `45597`: typings.cids.cidsInts.`45597` = 45597.asInstanceOf[typings.cids.cidsInts.`45597`]
    
    inline def `45598`: typings.cids.cidsInts.`45598` = 45598.asInstanceOf[typings.cids.cidsInts.`45598`]
    
    inline def `45599`: typings.cids.cidsInts.`45599` = 45599.asInstanceOf[typings.cids.cidsInts.`45599`]
    
    inline def `45600`: typings.cids.cidsInts.`45600` = 45600.asInstanceOf[typings.cids.cidsInts.`45600`]
    
    inline def `45601`: typings.cids.cidsInts.`45601` = 45601.asInstanceOf[typings.cids.cidsInts.`45601`]
    
    inline def `45602`: typings.cids.cidsInts.`45602` = 45602.asInstanceOf[typings.cids.cidsInts.`45602`]
    
    inline def `45603`: typings.cids.cidsInts.`45603` = 45603.asInstanceOf[typings.cids.cidsInts.`45603`]
    
    inline def `45604`: typings.cids.cidsInts.`45604` = 45604.asInstanceOf[typings.cids.cidsInts.`45604`]
    
    inline def `45605`: typings.cids.cidsInts.`45605` = 45605.asInstanceOf[typings.cids.cidsInts.`45605`]
    
    inline def `45606`: typings.cids.cidsInts.`45606` = 45606.asInstanceOf[typings.cids.cidsInts.`45606`]
    
    inline def `45607`: typings.cids.cidsInts.`45607` = 45607.asInstanceOf[typings.cids.cidsInts.`45607`]
    
    inline def `45608`: typings.cids.cidsInts.`45608` = 45608.asInstanceOf[typings.cids.cidsInts.`45608`]
    
    inline def `45609`: typings.cids.cidsInts.`45609` = 45609.asInstanceOf[typings.cids.cidsInts.`45609`]
    
    inline def `45610`: typings.cids.cidsInts.`45610` = 45610.asInstanceOf[typings.cids.cidsInts.`45610`]
    
    inline def `45611`: typings.cids.cidsInts.`45611` = 45611.asInstanceOf[typings.cids.cidsInts.`45611`]
    
    inline def `45612`: typings.cids.cidsInts.`45612` = 45612.asInstanceOf[typings.cids.cidsInts.`45612`]
    
    inline def `45613`: typings.cids.cidsInts.`45613` = 45613.asInstanceOf[typings.cids.cidsInts.`45613`]
    
    inline def `45614`: typings.cids.cidsInts.`45614` = 45614.asInstanceOf[typings.cids.cidsInts.`45614`]
    
    inline def `45615`: typings.cids.cidsInts.`45615` = 45615.asInstanceOf[typings.cids.cidsInts.`45615`]
    
    inline def `45616`: typings.cids.cidsInts.`45616` = 45616.asInstanceOf[typings.cids.cidsInts.`45616`]
    
    inline def `45617`: typings.cids.cidsInts.`45617` = 45617.asInstanceOf[typings.cids.cidsInts.`45617`]
    
    inline def `45618`: typings.cids.cidsInts.`45618` = 45618.asInstanceOf[typings.cids.cidsInts.`45618`]
    
    inline def `45619`: typings.cids.cidsInts.`45619` = 45619.asInstanceOf[typings.cids.cidsInts.`45619`]
    
    inline def `45620`: typings.cids.cidsInts.`45620` = 45620.asInstanceOf[typings.cids.cidsInts.`45620`]
    
    inline def `45621`: typings.cids.cidsInts.`45621` = 45621.asInstanceOf[typings.cids.cidsInts.`45621`]
    
    inline def `45622`: typings.cids.cidsInts.`45622` = 45622.asInstanceOf[typings.cids.cidsInts.`45622`]
    
    inline def `45623`: typings.cids.cidsInts.`45623` = 45623.asInstanceOf[typings.cids.cidsInts.`45623`]
    
    inline def `45624`: typings.cids.cidsInts.`45624` = 45624.asInstanceOf[typings.cids.cidsInts.`45624`]
    
    inline def `45625`: typings.cids.cidsInts.`45625` = 45625.asInstanceOf[typings.cids.cidsInts.`45625`]
    
    inline def `45626`: typings.cids.cidsInts.`45626` = 45626.asInstanceOf[typings.cids.cidsInts.`45626`]
    
    inline def `45627`: typings.cids.cidsInts.`45627` = 45627.asInstanceOf[typings.cids.cidsInts.`45627`]
    
    inline def `45628`: typings.cids.cidsInts.`45628` = 45628.asInstanceOf[typings.cids.cidsInts.`45628`]
    
    inline def `45629`: typings.cids.cidsInts.`45629` = 45629.asInstanceOf[typings.cids.cidsInts.`45629`]
    
    inline def `45630`: typings.cids.cidsInts.`45630` = 45630.asInstanceOf[typings.cids.cidsInts.`45630`]
    
    inline def `45631`: typings.cids.cidsInts.`45631` = 45631.asInstanceOf[typings.cids.cidsInts.`45631`]
    
    inline def `45632`: typings.cids.cidsInts.`45632` = 45632.asInstanceOf[typings.cids.cidsInts.`45632`]
    
    inline def `45633`: typings.cids.cidsInts.`45633` = 45633.asInstanceOf[typings.cids.cidsInts.`45633`]
    
    inline def `45634`: typings.cids.cidsInts.`45634` = 45634.asInstanceOf[typings.cids.cidsInts.`45634`]
    
    inline def `45635`: typings.cids.cidsInts.`45635` = 45635.asInstanceOf[typings.cids.cidsInts.`45635`]
    
    inline def `45636`: typings.cids.cidsInts.`45636` = 45636.asInstanceOf[typings.cids.cidsInts.`45636`]
    
    inline def `45637`: typings.cids.cidsInts.`45637` = 45637.asInstanceOf[typings.cids.cidsInts.`45637`]
    
    inline def `45638`: typings.cids.cidsInts.`45638` = 45638.asInstanceOf[typings.cids.cidsInts.`45638`]
    
    inline def `45639`: typings.cids.cidsInts.`45639` = 45639.asInstanceOf[typings.cids.cidsInts.`45639`]
    
    inline def `45640`: typings.cids.cidsInts.`45640` = 45640.asInstanceOf[typings.cids.cidsInts.`45640`]
    
    inline def `45641`: typings.cids.cidsInts.`45641` = 45641.asInstanceOf[typings.cids.cidsInts.`45641`]
    
    inline def `45642`: typings.cids.cidsInts.`45642` = 45642.asInstanceOf[typings.cids.cidsInts.`45642`]
    
    inline def `45643`: typings.cids.cidsInts.`45643` = 45643.asInstanceOf[typings.cids.cidsInts.`45643`]
    
    inline def `45644`: typings.cids.cidsInts.`45644` = 45644.asInstanceOf[typings.cids.cidsInts.`45644`]
    
    inline def `45645`: typings.cids.cidsInts.`45645` = 45645.asInstanceOf[typings.cids.cidsInts.`45645`]
    
    inline def `45646`: typings.cids.cidsInts.`45646` = 45646.asInstanceOf[typings.cids.cidsInts.`45646`]
    
    inline def `45647`: typings.cids.cidsInts.`45647` = 45647.asInstanceOf[typings.cids.cidsInts.`45647`]
    
    inline def `45648`: typings.cids.cidsInts.`45648` = 45648.asInstanceOf[typings.cids.cidsInts.`45648`]
    
    inline def `45649`: typings.cids.cidsInts.`45649` = 45649.asInstanceOf[typings.cids.cidsInts.`45649`]
    
    inline def `45650`: typings.cids.cidsInts.`45650` = 45650.asInstanceOf[typings.cids.cidsInts.`45650`]
    
    inline def `45651`: typings.cids.cidsInts.`45651` = 45651.asInstanceOf[typings.cids.cidsInts.`45651`]
    
    inline def `45652`: typings.cids.cidsInts.`45652` = 45652.asInstanceOf[typings.cids.cidsInts.`45652`]
    
    inline def `45653`: typings.cids.cidsInts.`45653` = 45653.asInstanceOf[typings.cids.cidsInts.`45653`]
    
    inline def `45654`: typings.cids.cidsInts.`45654` = 45654.asInstanceOf[typings.cids.cidsInts.`45654`]
    
    inline def `45655`: typings.cids.cidsInts.`45655` = 45655.asInstanceOf[typings.cids.cidsInts.`45655`]
    
    inline def `45656`: typings.cids.cidsInts.`45656` = 45656.asInstanceOf[typings.cids.cidsInts.`45656`]
    
    inline def `45657`: typings.cids.cidsInts.`45657` = 45657.asInstanceOf[typings.cids.cidsInts.`45657`]
    
    inline def `45658`: typings.cids.cidsInts.`45658` = 45658.asInstanceOf[typings.cids.cidsInts.`45658`]
    
    inline def `45659`: typings.cids.cidsInts.`45659` = 45659.asInstanceOf[typings.cids.cidsInts.`45659`]
    
    inline def `45660`: typings.cids.cidsInts.`45660` = 45660.asInstanceOf[typings.cids.cidsInts.`45660`]
    
    inline def `45661`: typings.cids.cidsInts.`45661` = 45661.asInstanceOf[typings.cids.cidsInts.`45661`]
    
    inline def `45662`: typings.cids.cidsInts.`45662` = 45662.asInstanceOf[typings.cids.cidsInts.`45662`]
    
    inline def `45663`: typings.cids.cidsInts.`45663` = 45663.asInstanceOf[typings.cids.cidsInts.`45663`]
    
    inline def `45664`: typings.cids.cidsInts.`45664` = 45664.asInstanceOf[typings.cids.cidsInts.`45664`]
    
    inline def `45825`: typings.cids.cidsInts.`45825` = 45825.asInstanceOf[typings.cids.cidsInts.`45825`]
    
    inline def `45826`: typings.cids.cidsInts.`45826` = 45826.asInstanceOf[typings.cids.cidsInts.`45826`]
    
    inline def `45827`: typings.cids.cidsInts.`45827` = 45827.asInstanceOf[typings.cids.cidsInts.`45827`]
    
    inline def `45828`: typings.cids.cidsInts.`45828` = 45828.asInstanceOf[typings.cids.cidsInts.`45828`]
    
    inline def `45829`: typings.cids.cidsInts.`45829` = 45829.asInstanceOf[typings.cids.cidsInts.`45829`]
    
    inline def `45830`: typings.cids.cidsInts.`45830` = 45830.asInstanceOf[typings.cids.cidsInts.`45830`]
    
    inline def `45831`: typings.cids.cidsInts.`45831` = 45831.asInstanceOf[typings.cids.cidsInts.`45831`]
    
    inline def `45832`: typings.cids.cidsInts.`45832` = 45832.asInstanceOf[typings.cids.cidsInts.`45832`]
    
    inline def `45833`: typings.cids.cidsInts.`45833` = 45833.asInstanceOf[typings.cids.cidsInts.`45833`]
    
    inline def `45834`: typings.cids.cidsInts.`45834` = 45834.asInstanceOf[typings.cids.cidsInts.`45834`]
    
    inline def `45835`: typings.cids.cidsInts.`45835` = 45835.asInstanceOf[typings.cids.cidsInts.`45835`]
    
    inline def `45836`: typings.cids.cidsInts.`45836` = 45836.asInstanceOf[typings.cids.cidsInts.`45836`]
    
    inline def `45837`: typings.cids.cidsInts.`45837` = 45837.asInstanceOf[typings.cids.cidsInts.`45837`]
    
    inline def `45838`: typings.cids.cidsInts.`45838` = 45838.asInstanceOf[typings.cids.cidsInts.`45838`]
    
    inline def `45839`: typings.cids.cidsInts.`45839` = 45839.asInstanceOf[typings.cids.cidsInts.`45839`]
    
    inline def `45840`: typings.cids.cidsInts.`45840` = 45840.asInstanceOf[typings.cids.cidsInts.`45840`]
    
    inline def `45841`: typings.cids.cidsInts.`45841` = 45841.asInstanceOf[typings.cids.cidsInts.`45841`]
    
    inline def `45842`: typings.cids.cidsInts.`45842` = 45842.asInstanceOf[typings.cids.cidsInts.`45842`]
    
    inline def `45843`: typings.cids.cidsInts.`45843` = 45843.asInstanceOf[typings.cids.cidsInts.`45843`]
    
    inline def `45844`: typings.cids.cidsInts.`45844` = 45844.asInstanceOf[typings.cids.cidsInts.`45844`]
    
    inline def `45845`: typings.cids.cidsInts.`45845` = 45845.asInstanceOf[typings.cids.cidsInts.`45845`]
    
    inline def `45846`: typings.cids.cidsInts.`45846` = 45846.asInstanceOf[typings.cids.cidsInts.`45846`]
    
    inline def `45847`: typings.cids.cidsInts.`45847` = 45847.asInstanceOf[typings.cids.cidsInts.`45847`]
    
    inline def `45848`: typings.cids.cidsInts.`45848` = 45848.asInstanceOf[typings.cids.cidsInts.`45848`]
    
    inline def `45849`: typings.cids.cidsInts.`45849` = 45849.asInstanceOf[typings.cids.cidsInts.`45849`]
    
    inline def `45850`: typings.cids.cidsInts.`45850` = 45850.asInstanceOf[typings.cids.cidsInts.`45850`]
    
    inline def `45851`: typings.cids.cidsInts.`45851` = 45851.asInstanceOf[typings.cids.cidsInts.`45851`]
    
    inline def `45852`: typings.cids.cidsInts.`45852` = 45852.asInstanceOf[typings.cids.cidsInts.`45852`]
    
    inline def `45853`: typings.cids.cidsInts.`45853` = 45853.asInstanceOf[typings.cids.cidsInts.`45853`]
    
    inline def `45854`: typings.cids.cidsInts.`45854` = 45854.asInstanceOf[typings.cids.cidsInts.`45854`]
    
    inline def `45855`: typings.cids.cidsInts.`45855` = 45855.asInstanceOf[typings.cids.cidsInts.`45855`]
    
    inline def `45856`: typings.cids.cidsInts.`45856` = 45856.asInstanceOf[typings.cids.cidsInts.`45856`]
    
    inline def `45857`: typings.cids.cidsInts.`45857` = 45857.asInstanceOf[typings.cids.cidsInts.`45857`]
    
    inline def `45858`: typings.cids.cidsInts.`45858` = 45858.asInstanceOf[typings.cids.cidsInts.`45858`]
    
    inline def `45859`: typings.cids.cidsInts.`45859` = 45859.asInstanceOf[typings.cids.cidsInts.`45859`]
    
    inline def `45860`: typings.cids.cidsInts.`45860` = 45860.asInstanceOf[typings.cids.cidsInts.`45860`]
    
    inline def `45861`: typings.cids.cidsInts.`45861` = 45861.asInstanceOf[typings.cids.cidsInts.`45861`]
    
    inline def `45862`: typings.cids.cidsInts.`45862` = 45862.asInstanceOf[typings.cids.cidsInts.`45862`]
    
    inline def `45863`: typings.cids.cidsInts.`45863` = 45863.asInstanceOf[typings.cids.cidsInts.`45863`]
    
    inline def `45864`: typings.cids.cidsInts.`45864` = 45864.asInstanceOf[typings.cids.cidsInts.`45864`]
    
    inline def `45865`: typings.cids.cidsInts.`45865` = 45865.asInstanceOf[typings.cids.cidsInts.`45865`]
    
    inline def `45866`: typings.cids.cidsInts.`45866` = 45866.asInstanceOf[typings.cids.cidsInts.`45866`]
    
    inline def `45867`: typings.cids.cidsInts.`45867` = 45867.asInstanceOf[typings.cids.cidsInts.`45867`]
    
    inline def `45868`: typings.cids.cidsInts.`45868` = 45868.asInstanceOf[typings.cids.cidsInts.`45868`]
    
    inline def `45869`: typings.cids.cidsInts.`45869` = 45869.asInstanceOf[typings.cids.cidsInts.`45869`]
    
    inline def `45870`: typings.cids.cidsInts.`45870` = 45870.asInstanceOf[typings.cids.cidsInts.`45870`]
    
    inline def `45871`: typings.cids.cidsInts.`45871` = 45871.asInstanceOf[typings.cids.cidsInts.`45871`]
    
    inline def `45872`: typings.cids.cidsInts.`45872` = 45872.asInstanceOf[typings.cids.cidsInts.`45872`]
    
    inline def `45873`: typings.cids.cidsInts.`45873` = 45873.asInstanceOf[typings.cids.cidsInts.`45873`]
    
    inline def `45874`: typings.cids.cidsInts.`45874` = 45874.asInstanceOf[typings.cids.cidsInts.`45874`]
    
    inline def `45875`: typings.cids.cidsInts.`45875` = 45875.asInstanceOf[typings.cids.cidsInts.`45875`]
    
    inline def `45876`: typings.cids.cidsInts.`45876` = 45876.asInstanceOf[typings.cids.cidsInts.`45876`]
    
    inline def `45877`: typings.cids.cidsInts.`45877` = 45877.asInstanceOf[typings.cids.cidsInts.`45877`]
    
    inline def `45878`: typings.cids.cidsInts.`45878` = 45878.asInstanceOf[typings.cids.cidsInts.`45878`]
    
    inline def `45879`: typings.cids.cidsInts.`45879` = 45879.asInstanceOf[typings.cids.cidsInts.`45879`]
    
    inline def `45880`: typings.cids.cidsInts.`45880` = 45880.asInstanceOf[typings.cids.cidsInts.`45880`]
    
    inline def `45881`: typings.cids.cidsInts.`45881` = 45881.asInstanceOf[typings.cids.cidsInts.`45881`]
    
    inline def `45882`: typings.cids.cidsInts.`45882` = 45882.asInstanceOf[typings.cids.cidsInts.`45882`]
    
    inline def `45883`: typings.cids.cidsInts.`45883` = 45883.asInstanceOf[typings.cids.cidsInts.`45883`]
    
    inline def `45884`: typings.cids.cidsInts.`45884` = 45884.asInstanceOf[typings.cids.cidsInts.`45884`]
    
    inline def `45885`: typings.cids.cidsInts.`45885` = 45885.asInstanceOf[typings.cids.cidsInts.`45885`]
    
    inline def `45886`: typings.cids.cidsInts.`45886` = 45886.asInstanceOf[typings.cids.cidsInts.`45886`]
    
    inline def `45887`: typings.cids.cidsInts.`45887` = 45887.asInstanceOf[typings.cids.cidsInts.`45887`]
    
    inline def `45888`: typings.cids.cidsInts.`45888` = 45888.asInstanceOf[typings.cids.cidsInts.`45888`]
    
    inline def `45889`: typings.cids.cidsInts.`45889` = 45889.asInstanceOf[typings.cids.cidsInts.`45889`]
    
    inline def `45890`: typings.cids.cidsInts.`45890` = 45890.asInstanceOf[typings.cids.cidsInts.`45890`]
    
    inline def `45891`: typings.cids.cidsInts.`45891` = 45891.asInstanceOf[typings.cids.cidsInts.`45891`]
    
    inline def `45892`: typings.cids.cidsInts.`45892` = 45892.asInstanceOf[typings.cids.cidsInts.`45892`]
    
    inline def `45893`: typings.cids.cidsInts.`45893` = 45893.asInstanceOf[typings.cids.cidsInts.`45893`]
    
    inline def `45894`: typings.cids.cidsInts.`45894` = 45894.asInstanceOf[typings.cids.cidsInts.`45894`]
    
    inline def `45895`: typings.cids.cidsInts.`45895` = 45895.asInstanceOf[typings.cids.cidsInts.`45895`]
    
    inline def `45896`: typings.cids.cidsInts.`45896` = 45896.asInstanceOf[typings.cids.cidsInts.`45896`]
    
    inline def `45897`: typings.cids.cidsInts.`45897` = 45897.asInstanceOf[typings.cids.cidsInts.`45897`]
    
    inline def `45898`: typings.cids.cidsInts.`45898` = 45898.asInstanceOf[typings.cids.cidsInts.`45898`]
    
    inline def `45899`: typings.cids.cidsInts.`45899` = 45899.asInstanceOf[typings.cids.cidsInts.`45899`]
    
    inline def `45900`: typings.cids.cidsInts.`45900` = 45900.asInstanceOf[typings.cids.cidsInts.`45900`]
    
    inline def `45901`: typings.cids.cidsInts.`45901` = 45901.asInstanceOf[typings.cids.cidsInts.`45901`]
    
    inline def `45902`: typings.cids.cidsInts.`45902` = 45902.asInstanceOf[typings.cids.cidsInts.`45902`]
    
    inline def `45903`: typings.cids.cidsInts.`45903` = 45903.asInstanceOf[typings.cids.cidsInts.`45903`]
    
    inline def `45904`: typings.cids.cidsInts.`45904` = 45904.asInstanceOf[typings.cids.cidsInts.`45904`]
    
    inline def `45905`: typings.cids.cidsInts.`45905` = 45905.asInstanceOf[typings.cids.cidsInts.`45905`]
    
    inline def `45906`: typings.cids.cidsInts.`45906` = 45906.asInstanceOf[typings.cids.cidsInts.`45906`]
    
    inline def `45907`: typings.cids.cidsInts.`45907` = 45907.asInstanceOf[typings.cids.cidsInts.`45907`]
    
    inline def `45908`: typings.cids.cidsInts.`45908` = 45908.asInstanceOf[typings.cids.cidsInts.`45908`]
    
    inline def `45909`: typings.cids.cidsInts.`45909` = 45909.asInstanceOf[typings.cids.cidsInts.`45909`]
    
    inline def `45910`: typings.cids.cidsInts.`45910` = 45910.asInstanceOf[typings.cids.cidsInts.`45910`]
    
    inline def `45911`: typings.cids.cidsInts.`45911` = 45911.asInstanceOf[typings.cids.cidsInts.`45911`]
    
    inline def `45912`: typings.cids.cidsInts.`45912` = 45912.asInstanceOf[typings.cids.cidsInts.`45912`]
    
    inline def `45913`: typings.cids.cidsInts.`45913` = 45913.asInstanceOf[typings.cids.cidsInts.`45913`]
    
    inline def `45914`: typings.cids.cidsInts.`45914` = 45914.asInstanceOf[typings.cids.cidsInts.`45914`]
    
    inline def `45915`: typings.cids.cidsInts.`45915` = 45915.asInstanceOf[typings.cids.cidsInts.`45915`]
    
    inline def `45916`: typings.cids.cidsInts.`45916` = 45916.asInstanceOf[typings.cids.cidsInts.`45916`]
    
    inline def `45917`: typings.cids.cidsInts.`45917` = 45917.asInstanceOf[typings.cids.cidsInts.`45917`]
    
    inline def `45918`: typings.cids.cidsInts.`45918` = 45918.asInstanceOf[typings.cids.cidsInts.`45918`]
    
    inline def `45919`: typings.cids.cidsInts.`45919` = 45919.asInstanceOf[typings.cids.cidsInts.`45919`]
    
    inline def `45920`: typings.cids.cidsInts.`45920` = 45920.asInstanceOf[typings.cids.cidsInts.`45920`]
    
    inline def `45921`: typings.cids.cidsInts.`45921` = 45921.asInstanceOf[typings.cids.cidsInts.`45921`]
    
    inline def `45922`: typings.cids.cidsInts.`45922` = 45922.asInstanceOf[typings.cids.cidsInts.`45922`]
    
    inline def `45923`: typings.cids.cidsInts.`45923` = 45923.asInstanceOf[typings.cids.cidsInts.`45923`]
    
    inline def `45924`: typings.cids.cidsInts.`45924` = 45924.asInstanceOf[typings.cids.cidsInts.`45924`]
    
    inline def `45925`: typings.cids.cidsInts.`45925` = 45925.asInstanceOf[typings.cids.cidsInts.`45925`]
    
    inline def `45926`: typings.cids.cidsInts.`45926` = 45926.asInstanceOf[typings.cids.cidsInts.`45926`]
    
    inline def `45927`: typings.cids.cidsInts.`45927` = 45927.asInstanceOf[typings.cids.cidsInts.`45927`]
    
    inline def `45928`: typings.cids.cidsInts.`45928` = 45928.asInstanceOf[typings.cids.cidsInts.`45928`]
    
    inline def `45929`: typings.cids.cidsInts.`45929` = 45929.asInstanceOf[typings.cids.cidsInts.`45929`]
    
    inline def `45930`: typings.cids.cidsInts.`45930` = 45930.asInstanceOf[typings.cids.cidsInts.`45930`]
    
    inline def `45931`: typings.cids.cidsInts.`45931` = 45931.asInstanceOf[typings.cids.cidsInts.`45931`]
    
    inline def `45932`: typings.cids.cidsInts.`45932` = 45932.asInstanceOf[typings.cids.cidsInts.`45932`]
    
    inline def `45933`: typings.cids.cidsInts.`45933` = 45933.asInstanceOf[typings.cids.cidsInts.`45933`]
    
    inline def `45934`: typings.cids.cidsInts.`45934` = 45934.asInstanceOf[typings.cids.cidsInts.`45934`]
    
    inline def `45935`: typings.cids.cidsInts.`45935` = 45935.asInstanceOf[typings.cids.cidsInts.`45935`]
    
    inline def `45936`: typings.cids.cidsInts.`45936` = 45936.asInstanceOf[typings.cids.cidsInts.`45936`]
    
    inline def `45937`: typings.cids.cidsInts.`45937` = 45937.asInstanceOf[typings.cids.cidsInts.`45937`]
    
    inline def `45938`: typings.cids.cidsInts.`45938` = 45938.asInstanceOf[typings.cids.cidsInts.`45938`]
    
    inline def `45939`: typings.cids.cidsInts.`45939` = 45939.asInstanceOf[typings.cids.cidsInts.`45939`]
    
    inline def `45940`: typings.cids.cidsInts.`45940` = 45940.asInstanceOf[typings.cids.cidsInts.`45940`]
    
    inline def `45941`: typings.cids.cidsInts.`45941` = 45941.asInstanceOf[typings.cids.cidsInts.`45941`]
    
    inline def `45942`: typings.cids.cidsInts.`45942` = 45942.asInstanceOf[typings.cids.cidsInts.`45942`]
    
    inline def `45943`: typings.cids.cidsInts.`45943` = 45943.asInstanceOf[typings.cids.cidsInts.`45943`]
    
    inline def `45944`: typings.cids.cidsInts.`45944` = 45944.asInstanceOf[typings.cids.cidsInts.`45944`]
    
    inline def `45945`: typings.cids.cidsInts.`45945` = 45945.asInstanceOf[typings.cids.cidsInts.`45945`]
    
    inline def `45946`: typings.cids.cidsInts.`45946` = 45946.asInstanceOf[typings.cids.cidsInts.`45946`]
    
    inline def `45947`: typings.cids.cidsInts.`45947` = 45947.asInstanceOf[typings.cids.cidsInts.`45947`]
    
    inline def `45948`: typings.cids.cidsInts.`45948` = 45948.asInstanceOf[typings.cids.cidsInts.`45948`]
    
    inline def `45949`: typings.cids.cidsInts.`45949` = 45949.asInstanceOf[typings.cids.cidsInts.`45949`]
    
    inline def `45950`: typings.cids.cidsInts.`45950` = 45950.asInstanceOf[typings.cids.cidsInts.`45950`]
    
    inline def `45951`: typings.cids.cidsInts.`45951` = 45951.asInstanceOf[typings.cids.cidsInts.`45951`]
    
    inline def `45952`: typings.cids.cidsInts.`45952` = 45952.asInstanceOf[typings.cids.cidsInts.`45952`]
    
    inline def `45953`: typings.cids.cidsInts.`45953` = 45953.asInstanceOf[typings.cids.cidsInts.`45953`]
    
    inline def `45954`: typings.cids.cidsInts.`45954` = 45954.asInstanceOf[typings.cids.cidsInts.`45954`]
    
    inline def `45955`: typings.cids.cidsInts.`45955` = 45955.asInstanceOf[typings.cids.cidsInts.`45955`]
    
    inline def `45956`: typings.cids.cidsInts.`45956` = 45956.asInstanceOf[typings.cids.cidsInts.`45956`]
    
    inline def `45957`: typings.cids.cidsInts.`45957` = 45957.asInstanceOf[typings.cids.cidsInts.`45957`]
    
    inline def `45958`: typings.cids.cidsInts.`45958` = 45958.asInstanceOf[typings.cids.cidsInts.`45958`]
    
    inline def `45959`: typings.cids.cidsInts.`45959` = 45959.asInstanceOf[typings.cids.cidsInts.`45959`]
    
    inline def `45960`: typings.cids.cidsInts.`45960` = 45960.asInstanceOf[typings.cids.cidsInts.`45960`]
    
    inline def `45961`: typings.cids.cidsInts.`45961` = 45961.asInstanceOf[typings.cids.cidsInts.`45961`]
    
    inline def `45962`: typings.cids.cidsInts.`45962` = 45962.asInstanceOf[typings.cids.cidsInts.`45962`]
    
    inline def `45963`: typings.cids.cidsInts.`45963` = 45963.asInstanceOf[typings.cids.cidsInts.`45963`]
    
    inline def `45964`: typings.cids.cidsInts.`45964` = 45964.asInstanceOf[typings.cids.cidsInts.`45964`]
    
    inline def `45965`: typings.cids.cidsInts.`45965` = 45965.asInstanceOf[typings.cids.cidsInts.`45965`]
    
    inline def `45966`: typings.cids.cidsInts.`45966` = 45966.asInstanceOf[typings.cids.cidsInts.`45966`]
    
    inline def `45967`: typings.cids.cidsInts.`45967` = 45967.asInstanceOf[typings.cids.cidsInts.`45967`]
    
    inline def `45968`: typings.cids.cidsInts.`45968` = 45968.asInstanceOf[typings.cids.cidsInts.`45968`]
    
    inline def `45969`: typings.cids.cidsInts.`45969` = 45969.asInstanceOf[typings.cids.cidsInts.`45969`]
    
    inline def `45970`: typings.cids.cidsInts.`45970` = 45970.asInstanceOf[typings.cids.cidsInts.`45970`]
    
    inline def `45971`: typings.cids.cidsInts.`45971` = 45971.asInstanceOf[typings.cids.cidsInts.`45971`]
    
    inline def `45972`: typings.cids.cidsInts.`45972` = 45972.asInstanceOf[typings.cids.cidsInts.`45972`]
    
    inline def `45973`: typings.cids.cidsInts.`45973` = 45973.asInstanceOf[typings.cids.cidsInts.`45973`]
    
    inline def `45974`: typings.cids.cidsInts.`45974` = 45974.asInstanceOf[typings.cids.cidsInts.`45974`]
    
    inline def `45975`: typings.cids.cidsInts.`45975` = 45975.asInstanceOf[typings.cids.cidsInts.`45975`]
    
    inline def `45976`: typings.cids.cidsInts.`45976` = 45976.asInstanceOf[typings.cids.cidsInts.`45976`]
    
    inline def `45977`: typings.cids.cidsInts.`45977` = 45977.asInstanceOf[typings.cids.cidsInts.`45977`]
    
    inline def `45978`: typings.cids.cidsInts.`45978` = 45978.asInstanceOf[typings.cids.cidsInts.`45978`]
    
    inline def `45979`: typings.cids.cidsInts.`45979` = 45979.asInstanceOf[typings.cids.cidsInts.`45979`]
    
    inline def `45980`: typings.cids.cidsInts.`45980` = 45980.asInstanceOf[typings.cids.cidsInts.`45980`]
    
    inline def `45981`: typings.cids.cidsInts.`45981` = 45981.asInstanceOf[typings.cids.cidsInts.`45981`]
    
    inline def `45982`: typings.cids.cidsInts.`45982` = 45982.asInstanceOf[typings.cids.cidsInts.`45982`]
    
    inline def `45983`: typings.cids.cidsInts.`45983` = 45983.asInstanceOf[typings.cids.cidsInts.`45983`]
    
    inline def `45984`: typings.cids.cidsInts.`45984` = 45984.asInstanceOf[typings.cids.cidsInts.`45984`]
    
    inline def `45985`: typings.cids.cidsInts.`45985` = 45985.asInstanceOf[typings.cids.cidsInts.`45985`]
    
    inline def `45986`: typings.cids.cidsInts.`45986` = 45986.asInstanceOf[typings.cids.cidsInts.`45986`]
    
    inline def `45987`: typings.cids.cidsInts.`45987` = 45987.asInstanceOf[typings.cids.cidsInts.`45987`]
    
    inline def `45988`: typings.cids.cidsInts.`45988` = 45988.asInstanceOf[typings.cids.cidsInts.`45988`]
    
    inline def `45989`: typings.cids.cidsInts.`45989` = 45989.asInstanceOf[typings.cids.cidsInts.`45989`]
    
    inline def `45990`: typings.cids.cidsInts.`45990` = 45990.asInstanceOf[typings.cids.cidsInts.`45990`]
    
    inline def `45991`: typings.cids.cidsInts.`45991` = 45991.asInstanceOf[typings.cids.cidsInts.`45991`]
    
    inline def `45992`: typings.cids.cidsInts.`45992` = 45992.asInstanceOf[typings.cids.cidsInts.`45992`]
    
    inline def `45993`: typings.cids.cidsInts.`45993` = 45993.asInstanceOf[typings.cids.cidsInts.`45993`]
    
    inline def `45994`: typings.cids.cidsInts.`45994` = 45994.asInstanceOf[typings.cids.cidsInts.`45994`]
    
    inline def `45995`: typings.cids.cidsInts.`45995` = 45995.asInstanceOf[typings.cids.cidsInts.`45995`]
    
    inline def `45996`: typings.cids.cidsInts.`45996` = 45996.asInstanceOf[typings.cids.cidsInts.`45996`]
    
    inline def `45997`: typings.cids.cidsInts.`45997` = 45997.asInstanceOf[typings.cids.cidsInts.`45997`]
    
    inline def `45998`: typings.cids.cidsInts.`45998` = 45998.asInstanceOf[typings.cids.cidsInts.`45998`]
    
    inline def `45999`: typings.cids.cidsInts.`45999` = 45999.asInstanceOf[typings.cids.cidsInts.`45999`]
    
    inline def `460`: typings.cids.cidsInts.`460` = 460.asInstanceOf[typings.cids.cidsInts.`460`]
    
    inline def `46000`: typings.cids.cidsInts.`46000` = 46000.asInstanceOf[typings.cids.cidsInts.`46000`]
    
    inline def `46001`: typings.cids.cidsInts.`46001` = 46001.asInstanceOf[typings.cids.cidsInts.`46001`]
    
    inline def `46002`: typings.cids.cidsInts.`46002` = 46002.asInstanceOf[typings.cids.cidsInts.`46002`]
    
    inline def `46003`: typings.cids.cidsInts.`46003` = 46003.asInstanceOf[typings.cids.cidsInts.`46003`]
    
    inline def `46004`: typings.cids.cidsInts.`46004` = 46004.asInstanceOf[typings.cids.cidsInts.`46004`]
    
    inline def `46005`: typings.cids.cidsInts.`46005` = 46005.asInstanceOf[typings.cids.cidsInts.`46005`]
    
    inline def `46006`: typings.cids.cidsInts.`46006` = 46006.asInstanceOf[typings.cids.cidsInts.`46006`]
    
    inline def `46007`: typings.cids.cidsInts.`46007` = 46007.asInstanceOf[typings.cids.cidsInts.`46007`]
    
    inline def `46008`: typings.cids.cidsInts.`46008` = 46008.asInstanceOf[typings.cids.cidsInts.`46008`]
    
    inline def `46009`: typings.cids.cidsInts.`46009` = 46009.asInstanceOf[typings.cids.cidsInts.`46009`]
    
    inline def `46010`: typings.cids.cidsInts.`46010` = 46010.asInstanceOf[typings.cids.cidsInts.`46010`]
    
    inline def `46011`: typings.cids.cidsInts.`46011` = 46011.asInstanceOf[typings.cids.cidsInts.`46011`]
    
    inline def `46012`: typings.cids.cidsInts.`46012` = 46012.asInstanceOf[typings.cids.cidsInts.`46012`]
    
    inline def `46013`: typings.cids.cidsInts.`46013` = 46013.asInstanceOf[typings.cids.cidsInts.`46013`]
    
    inline def `46014`: typings.cids.cidsInts.`46014` = 46014.asInstanceOf[typings.cids.cidsInts.`46014`]
    
    inline def `46015`: typings.cids.cidsInts.`46015` = 46015.asInstanceOf[typings.cids.cidsInts.`46015`]
    
    inline def `46016`: typings.cids.cidsInts.`46016` = 46016.asInstanceOf[typings.cids.cidsInts.`46016`]
    
    inline def `46017`: typings.cids.cidsInts.`46017` = 46017.asInstanceOf[typings.cids.cidsInts.`46017`]
    
    inline def `46018`: typings.cids.cidsInts.`46018` = 46018.asInstanceOf[typings.cids.cidsInts.`46018`]
    
    inline def `46019`: typings.cids.cidsInts.`46019` = 46019.asInstanceOf[typings.cids.cidsInts.`46019`]
    
    inline def `46020`: typings.cids.cidsInts.`46020` = 46020.asInstanceOf[typings.cids.cidsInts.`46020`]
    
    inline def `46021`: typings.cids.cidsInts.`46021` = 46021.asInstanceOf[typings.cids.cidsInts.`46021`]
    
    inline def `46022`: typings.cids.cidsInts.`46022` = 46022.asInstanceOf[typings.cids.cidsInts.`46022`]
    
    inline def `46023`: typings.cids.cidsInts.`46023` = 46023.asInstanceOf[typings.cids.cidsInts.`46023`]
    
    inline def `46024`: typings.cids.cidsInts.`46024` = 46024.asInstanceOf[typings.cids.cidsInts.`46024`]
    
    inline def `46025`: typings.cids.cidsInts.`46025` = 46025.asInstanceOf[typings.cids.cidsInts.`46025`]
    
    inline def `46026`: typings.cids.cidsInts.`46026` = 46026.asInstanceOf[typings.cids.cidsInts.`46026`]
    
    inline def `46027`: typings.cids.cidsInts.`46027` = 46027.asInstanceOf[typings.cids.cidsInts.`46027`]
    
    inline def `46028`: typings.cids.cidsInts.`46028` = 46028.asInstanceOf[typings.cids.cidsInts.`46028`]
    
    inline def `46029`: typings.cids.cidsInts.`46029` = 46029.asInstanceOf[typings.cids.cidsInts.`46029`]
    
    inline def `46030`: typings.cids.cidsInts.`46030` = 46030.asInstanceOf[typings.cids.cidsInts.`46030`]
    
    inline def `46031`: typings.cids.cidsInts.`46031` = 46031.asInstanceOf[typings.cids.cidsInts.`46031`]
    
    inline def `46032`: typings.cids.cidsInts.`46032` = 46032.asInstanceOf[typings.cids.cidsInts.`46032`]
    
    inline def `46033`: typings.cids.cidsInts.`46033` = 46033.asInstanceOf[typings.cids.cidsInts.`46033`]
    
    inline def `46034`: typings.cids.cidsInts.`46034` = 46034.asInstanceOf[typings.cids.cidsInts.`46034`]
    
    inline def `46035`: typings.cids.cidsInts.`46035` = 46035.asInstanceOf[typings.cids.cidsInts.`46035`]
    
    inline def `46036`: typings.cids.cidsInts.`46036` = 46036.asInstanceOf[typings.cids.cidsInts.`46036`]
    
    inline def `46037`: typings.cids.cidsInts.`46037` = 46037.asInstanceOf[typings.cids.cidsInts.`46037`]
    
    inline def `46038`: typings.cids.cidsInts.`46038` = 46038.asInstanceOf[typings.cids.cidsInts.`46038`]
    
    inline def `46039`: typings.cids.cidsInts.`46039` = 46039.asInstanceOf[typings.cids.cidsInts.`46039`]
    
    inline def `46040`: typings.cids.cidsInts.`46040` = 46040.asInstanceOf[typings.cids.cidsInts.`46040`]
    
    inline def `46041`: typings.cids.cidsInts.`46041` = 46041.asInstanceOf[typings.cids.cidsInts.`46041`]
    
    inline def `46042`: typings.cids.cidsInts.`46042` = 46042.asInstanceOf[typings.cids.cidsInts.`46042`]
    
    inline def `46043`: typings.cids.cidsInts.`46043` = 46043.asInstanceOf[typings.cids.cidsInts.`46043`]
    
    inline def `46044`: typings.cids.cidsInts.`46044` = 46044.asInstanceOf[typings.cids.cidsInts.`46044`]
    
    inline def `46045`: typings.cids.cidsInts.`46045` = 46045.asInstanceOf[typings.cids.cidsInts.`46045`]
    
    inline def `46046`: typings.cids.cidsInts.`46046` = 46046.asInstanceOf[typings.cids.cidsInts.`46046`]
    
    inline def `46047`: typings.cids.cidsInts.`46047` = 46047.asInstanceOf[typings.cids.cidsInts.`46047`]
    
    inline def `46048`: typings.cids.cidsInts.`46048` = 46048.asInstanceOf[typings.cids.cidsInts.`46048`]
    
    inline def `4608`: typings.cids.cidsInts.`4608` = 4608.asInstanceOf[typings.cids.cidsInts.`4608`]
    
    inline def `46081`: typings.cids.cidsInts.`46081` = 46081.asInstanceOf[typings.cids.cidsInts.`46081`]
    
    inline def `46082`: typings.cids.cidsInts.`46082` = 46082.asInstanceOf[typings.cids.cidsInts.`46082`]
    
    inline def `4609`: typings.cids.cidsInts.`4609` = 4609.asInstanceOf[typings.cids.cidsInts.`4609`]
    
    inline def `4610`: typings.cids.cidsInts.`4610` = 4610.asInstanceOf[typings.cids.cidsInts.`4610`]
    
    inline def `4611`: typings.cids.cidsInts.`4611` = 4611.asInstanceOf[typings.cids.cidsInts.`4611`]
    
    inline def `4612`: typings.cids.cidsInts.`4612` = 4612.asInstanceOf[typings.cids.cidsInts.`4612`]
    
    inline def `47`: typings.cids.cidsInts.`47` = 47.asInstanceOf[typings.cids.cidsInts.`47`]
    
    inline def `477`: typings.cids.cidsInts.`477` = 477.asInstanceOf[typings.cids.cidsInts.`477`]
    
    inline def `478`: typings.cids.cidsInts.`478` = 478.asInstanceOf[typings.cids.cidsInts.`478`]
    
    inline def `479`: typings.cids.cidsInts.`479` = 479.asInstanceOf[typings.cids.cidsInts.`479`]
    
    inline def `48`: typings.cids.cidsInts.`48` = 48.asInstanceOf[typings.cids.cidsInts.`48`]
    
    inline def `480`: typings.cids.cidsInts.`480` = 480.asInstanceOf[typings.cids.cidsInts.`480`]
    
    inline def `4864`: typings.cids.cidsInts.`4864` = 4864.asInstanceOf[typings.cids.cidsInts.`4864`]
    
    inline def `49`: typings.cids.cidsInts.`49` = 49.asInstanceOf[typings.cids.cidsInts.`49`]
    
    inline def `50`: typings.cids.cidsInts.`50` = 50.asInstanceOf[typings.cids.cidsInts.`50`]
    
    inline def `51`: typings.cids.cidsInts.`51` = 51.asInstanceOf[typings.cids.cidsInts.`51`]
    
    inline def `512`: typings.cids.cidsInts.`512` = 512.asInstanceOf[typings.cids.cidsInts.`512`]
    
    inline def `513`: typings.cids.cidsInts.`513` = 513.asInstanceOf[typings.cids.cidsInts.`513`]
    
    inline def `52753`: typings.cids.cidsInts.`52753` = 52753.asInstanceOf[typings.cids.cidsInts.`52753`]
    
    inline def `53`: typings.cids.cidsInts.`53` = 53.asInstanceOf[typings.cids.cidsInts.`53`]
    
    inline def `54`: typings.cids.cidsInts.`54` = 54.asInstanceOf[typings.cids.cidsInts.`54`]
    
    inline def `55`: typings.cids.cidsInts.`55` = 55.asInstanceOf[typings.cids.cidsInts.`55`]
    
    inline def `56`: typings.cids.cidsInts.`56` = 56.asInstanceOf[typings.cids.cidsInts.`56`]
    
    inline def `6`: typings.cids.cidsInts.`6` = 6.asInstanceOf[typings.cids.cidsInts.`6`]
    
    inline def `61697`: typings.cids.cidsInts.`61697` = 61697.asInstanceOf[typings.cids.cidsInts.`61697`]
    
    inline def `61698`: typings.cids.cidsInts.`61698` = 61698.asInstanceOf[typings.cids.cidsInts.`61698`]
    
    inline def `7425`: typings.cids.cidsInts.`7425` = 7425.asInstanceOf[typings.cids.cidsInts.`7425`]
    
    inline def `769`: typings.cids.cidsInts.`769` = 769.asInstanceOf[typings.cids.cidsInts.`769`]
    
    inline def `80`: typings.cids.cidsInts.`80` = 80.asInstanceOf[typings.cids.cidsInts.`80`]
    
    inline def `81`: typings.cids.cidsInts.`81` = 81.asInstanceOf[typings.cids.cidsInts.`81`]
    
    inline def `8417572`: typings.cids.cidsInts.`8417572` = 8417572.asInstanceOf[typings.cids.cidsInts.`8417572`]
    
    inline def `8483108`: typings.cids.cidsInts.`8483108` = 8483108.asInstanceOf[typings.cids.cidsInts.`8483108`]
    
    inline def `85`: typings.cids.cidsInts.`85` = 85.asInstanceOf[typings.cids.cidsInts.`85`]
    
    inline def `86`: typings.cids.cidsInts.`86` = 86.asInstanceOf[typings.cids.cidsInts.`86`]
    
    inline def `96`: typings.cids.cidsInts.`96` = 96.asInstanceOf[typings.cids.cidsInts.`96`]
    
    inline def `9728292`: typings.cids.cidsInts.`9728292` = 9728292.asInstanceOf[typings.cids.cidsInts.`9728292`]
    
    inline def `9793828`: typings.cids.cidsInts.`9793828` = 9793828.asInstanceOf[typings.cids.cidsInts.`9793828`]
    
    inline def `99`: typings.cids.cidsInts.`99` = 99.asInstanceOf[typings.cids.cidsInts.`99`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cids.cidsStrings.`dag-pb`
    - typings.cids.cidsStrings.identity
    - typings.cids.cidsStrings.cidv1
    - typings.cids.cidsStrings.cidv2
    - typings.cids.cidsStrings.cidv3
    - typings.cids.cidsStrings.ip4
    - typings.cids.cidsStrings.tcp
    - typings.cids.cidsStrings.sha1
    - typings.cids.cidsStrings.`sha2-256`
    - typings.cids.cidsStrings.`sha2-512`
    - typings.cids.cidsStrings.`sha3-512`
    - typings.cids.cidsStrings.`sha3-384`
    - typings.cids.cidsStrings.`sha3-256`
    - typings.cids.cidsStrings.`sha3-224`
    - typings.cids.cidsStrings.`shake-128`
    - typings.cids.cidsStrings.`shake-256`
    - typings.cids.cidsStrings.`keccak-224`
    - typings.cids.cidsStrings.`keccak-256`
    - typings.cids.cidsStrings.`keccak-384`
    - typings.cids.cidsStrings.`keccak-512`
    - typings.cids.cidsStrings.blake3
    - typings.cids.cidsStrings.dccp
    - typings.cids.cidsStrings.`murmur3-128`
    - typings.cids.cidsStrings.`murmur3-32`
    - typings.cids.cidsStrings.ip6
    - typings.cids.cidsStrings.ip6zone
    - typings.cids.cidsStrings.path
    - typings.cids.cidsStrings.multicodec
    - typings.cids.cidsStrings.multihash
    - typings.cids.cidsStrings.multiaddr
    - typings.cids.cidsStrings.multibase
    - typings.cids.cidsStrings.dns
    - typings.cids.cidsStrings.dns4
    - typings.cids.cidsStrings.dns6
    - typings.cids.cidsStrings.dnsaddr
    - typings.cids.cidsStrings.protobuf
    - typings.cids.cidsStrings.cbor
    - typings.cids.cidsStrings.raw
    - typings.cids.cidsStrings.`dbl-sha2-256`
    - typings.cids.cidsStrings.rlp
    - typings.cids.cidsStrings.bencode
    - typings.cids.cidsStrings.`dag-cbor`
    - typings.cids.cidsStrings.`libp2p-key`
    - typings.cids.cidsStrings.`git-raw`
    - typings.cids.cidsStrings.`torrent-info`
    - typings.cids.cidsStrings.`torrent-file`
    - typings.cids.cidsStrings.`leofcoin-block`
    - typings.cids.cidsStrings.`leofcoin-tx`
    - typings.cids.cidsStrings.`leofcoin-pr`
    - typings.cids.cidsStrings.sctp
    - typings.cids.cidsStrings.`dag-jose`
    - typings.cids.cidsStrings.`dag-cose`
    - typings.cids.cidsStrings.`eth-block`
    - typings.cids.cidsStrings.`eth-block-list`
    - typings.cids.cidsStrings.`eth-tx-trie`
    - typings.cids.cidsStrings.`eth-tx`
    - typings.cids.cidsStrings.`eth-tx-receipt-trie`
    - typings.cids.cidsStrings.`eth-tx-receipt`
    - typings.cids.cidsStrings.`eth-state-trie`
    - typings.cids.cidsStrings.`eth-account-snapshot`
    - typings.cids.cidsStrings.`eth-storage-trie`
    - typings.cids.cidsStrings.`bitcoin-block`
    - typings.cids.cidsStrings.`bitcoin-tx`
    - typings.cids.cidsStrings.`bitcoin-witness-commitment`
    - typings.cids.cidsStrings.`zcash-block`
    - typings.cids.cidsStrings.`zcash-tx`
    - typings.cids.cidsStrings.docid
    - typings.cids.cidsStrings.`stellar-block`
    - typings.cids.cidsStrings.`stellar-tx`
    - typings.cids.cidsStrings.md4
    - typings.cids.cidsStrings.md5
    - typings.cids.cidsStrings.bmt
    - typings.cids.cidsStrings.`decred-block`
    - typings.cids.cidsStrings.`decred-tx`
    - typings.cids.cidsStrings.`ipld-ns`
    - typings.cids.cidsStrings.`ipfs-ns`
    - typings.cids.cidsStrings.`swarm-ns`
    - typings.cids.cidsStrings.`ipns-ns`
    - typings.cids.cidsStrings.zeronet
    - typings.cids.cidsStrings.`secp256k1-pub`
    - typings.cids.cidsStrings.`bls12_381-g1-pub`
    - typings.cids.cidsStrings.`bls12_381-g2-pub`
    - typings.cids.cidsStrings.`x25519-pub`
    - typings.cids.cidsStrings.`ed25519-pub`
    - typings.cids.cidsStrings.`bls12_381-g1g2-pub`
    - typings.cids.cidsStrings.`dash-block`
    - typings.cids.cidsStrings.`dash-tx`
    - typings.cids.cidsStrings.`swarm-manifest`
    - typings.cids.cidsStrings.`swarm-feed`
    - typings.cids.cidsStrings.udp
    - typings.cids.cidsStrings.`p2p-webrtc-star`
    - typings.cids.cidsStrings.`p2p-webrtc-direct`
    - typings.cids.cidsStrings.`p2p-stardust`
    - typings.cids.cidsStrings.`p2p-circuit`
    - typings.cids.cidsStrings.`dag-json`
    - typings.cids.cidsStrings.udt
    - typings.cids.cidsStrings.utp
    - typings.cids.cidsStrings.unix
    - typings.cids.cidsStrings.thread
    - typings.cids.cidsStrings.p2p
    - typings.cids.cidsStrings.ipfs
    - typings.cids.cidsStrings.https
    - typings.cids.cidsStrings.onion
    - typings.cids.cidsStrings.onion3
    - typings.cids.cidsStrings.garlic64
    - typings.cids.cidsStrings.garlic32
    - typings.cids.cidsStrings.tls
    - typings.cids.cidsStrings.quic
    - typings.cids.cidsStrings.ws
    - typings.cids.cidsStrings.wss
    - typings.cids.cidsStrings.`p2p-websocket-star`
    - typings.cids.cidsStrings.http
    - typings.cids.cidsStrings.json
    - typings.cids.cidsStrings.messagepack
    - typings.cids.cidsStrings.`libp2p-peer-record`
    - typings.cids.cidsStrings.`sha2-256-trunc254-padded`
    - typings.cids.cidsStrings.`ripemd-128`
    - typings.cids.cidsStrings.`ripemd-160`
    - typings.cids.cidsStrings.`ripemd-256`
    - typings.cids.cidsStrings.`ripemd-320`
    - typings.cids.cidsStrings.x11
    - typings.cids.cidsStrings.`p256-pub`
    - typings.cids.cidsStrings.`p384-pub`
    - typings.cids.cidsStrings.`p521-pub`
    - typings.cids.cidsStrings.`ed448-pub`
    - typings.cids.cidsStrings.`x448-pub`
    - typings.cids.cidsStrings.`ed25519-priv`
    - typings.cids.cidsStrings.kangarootwelve
    - typings.cids.cidsStrings.`sm3-256`
    - typings.cids.cidsStrings.`blake2b-8`
    - typings.cids.cidsStrings.`blake2b-16`
    - typings.cids.cidsStrings.`blake2b-24`
    - typings.cids.cidsStrings.`blake2b-32`
    - typings.cids.cidsStrings.`blake2b-40`
    - typings.cids.cidsStrings.`blake2b-48`
    - typings.cids.cidsStrings.`blake2b-56`
    - typings.cids.cidsStrings.`blake2b-64`
    - typings.cids.cidsStrings.`blake2b-72`
    - typings.cids.cidsStrings.`blake2b-80`
    - typings.cids.cidsStrings.`blake2b-88`
    - typings.cids.cidsStrings.`blake2b-96`
    - typings.cids.cidsStrings.`blake2b-104`
    - typings.cids.cidsStrings.`blake2b-112`
    - typings.cids.cidsStrings.`blake2b-120`
    - typings.cids.cidsStrings.`blake2b-128`
    - typings.cids.cidsStrings.`blake2b-136`
    - typings.cids.cidsStrings.`blake2b-144`
    - typings.cids.cidsStrings.`blake2b-152`
    - typings.cids.cidsStrings.`blake2b-160`
    - typings.cids.cidsStrings.`blake2b-168`
    - typings.cids.cidsStrings.`blake2b-176`
    - typings.cids.cidsStrings.`blake2b-184`
    - typings.cids.cidsStrings.`blake2b-192`
    - typings.cids.cidsStrings.`blake2b-200`
    - typings.cids.cidsStrings.`blake2b-208`
    - typings.cids.cidsStrings.`blake2b-216`
    - typings.cids.cidsStrings.`blake2b-224`
    - typings.cids.cidsStrings.`blake2b-232`
    - typings.cids.cidsStrings.`blake2b-240`
    - typings.cids.cidsStrings.`blake2b-248`
    - typings.cids.cidsStrings.`blake2b-256`
    - typings.cids.cidsStrings.`blake2b-264`
    - typings.cids.cidsStrings.`blake2b-272`
    - typings.cids.cidsStrings.`blake2b-280`
    - typings.cids.cidsStrings.`blake2b-288`
    - typings.cids.cidsStrings.`blake2b-296`
    - typings.cids.cidsStrings.`blake2b-304`
    - typings.cids.cidsStrings.`blake2b-312`
    - typings.cids.cidsStrings.`blake2b-320`
    - typings.cids.cidsStrings.`blake2b-328`
    - typings.cids.cidsStrings.`blake2b-336`
    - typings.cids.cidsStrings.`blake2b-344`
    - typings.cids.cidsStrings.`blake2b-352`
    - typings.cids.cidsStrings.`blake2b-360`
    - typings.cids.cidsStrings.`blake2b-368`
    - typings.cids.cidsStrings.`blake2b-376`
    - typings.cids.cidsStrings.`blake2b-384`
    - typings.cids.cidsStrings.`blake2b-392`
    - typings.cids.cidsStrings.`blake2b-400`
    - typings.cids.cidsStrings.`blake2b-408`
    - typings.cids.cidsStrings.`blake2b-416`
    - typings.cids.cidsStrings.`blake2b-424`
    - typings.cids.cidsStrings.`blake2b-432`
    - typings.cids.cidsStrings.`blake2b-440`
    - typings.cids.cidsStrings.`blake2b-448`
    - typings.cids.cidsStrings.`blake2b-456`
    - typings.cids.cidsStrings.`blake2b-464`
    - typings.cids.cidsStrings.`blake2b-472`
    - typings.cids.cidsStrings.`blake2b-480`
    - typings.cids.cidsStrings.`blake2b-488`
    - typings.cids.cidsStrings.`blake2b-496`
    - typings.cids.cidsStrings.`blake2b-504`
    - typings.cids.cidsStrings.`blake2b-512`
    - typings.cids.cidsStrings.`blake2s-8`
    - typings.cids.cidsStrings.`blake2s-16`
    - typings.cids.cidsStrings.`blake2s-24`
    - typings.cids.cidsStrings.`blake2s-32`
    - typings.cids.cidsStrings.`blake2s-40`
    - typings.cids.cidsStrings.`blake2s-48`
    - typings.cids.cidsStrings.`blake2s-56`
    - typings.cids.cidsStrings.`blake2s-64`
    - typings.cids.cidsStrings.`blake2s-72`
    - typings.cids.cidsStrings.`blake2s-80`
    - typings.cids.cidsStrings.`blake2s-88`
    - typings.cids.cidsStrings.`blake2s-96`
    - typings.cids.cidsStrings.`blake2s-104`
    - typings.cids.cidsStrings.`blake2s-112`
    - typings.cids.cidsStrings.`blake2s-120`
    - typings.cids.cidsStrings.`blake2s-128`
    - typings.cids.cidsStrings.`blake2s-136`
    - typings.cids.cidsStrings.`blake2s-144`
    - typings.cids.cidsStrings.`blake2s-152`
    - typings.cids.cidsStrings.`blake2s-160`
    - typings.cids.cidsStrings.`blake2s-168`
    - typings.cids.cidsStrings.`blake2s-176`
    - typings.cids.cidsStrings.`blake2s-184`
    - typings.cids.cidsStrings.`blake2s-192`
    - typings.cids.cidsStrings.`blake2s-200`
    - typings.cids.cidsStrings.`blake2s-208`
    - typings.cids.cidsStrings.`blake2s-216`
    - typings.cids.cidsStrings.`blake2s-224`
    - typings.cids.cidsStrings.`blake2s-232`
    - typings.cids.cidsStrings.`blake2s-240`
    - typings.cids.cidsStrings.`blake2s-248`
    - typings.cids.cidsStrings.`blake2s-256`
    - typings.cids.cidsStrings.`skein256-8`
    - typings.cids.cidsStrings.`skein256-16`
    - typings.cids.cidsStrings.`skein256-24`
    - typings.cids.cidsStrings.`skein256-32`
    - typings.cids.cidsStrings.`skein256-40`
    - typings.cids.cidsStrings.`skein256-48`
    - typings.cids.cidsStrings.`skein256-56`
    - typings.cids.cidsStrings.`skein256-64`
    - typings.cids.cidsStrings.`skein256-72`
    - typings.cids.cidsStrings.`skein256-80`
    - typings.cids.cidsStrings.`skein256-88`
    - typings.cids.cidsStrings.`skein256-96`
    - typings.cids.cidsStrings.`skein256-104`
    - typings.cids.cidsStrings.`skein256-112`
    - typings.cids.cidsStrings.`skein256-120`
    - typings.cids.cidsStrings.`skein256-128`
    - typings.cids.cidsStrings.`skein256-136`
    - typings.cids.cidsStrings.`skein256-144`
    - typings.cids.cidsStrings.`skein256-152`
    - typings.cids.cidsStrings.`skein256-160`
    - typings.cids.cidsStrings.`skein256-168`
    - typings.cids.cidsStrings.`skein256-176`
    - typings.cids.cidsStrings.`skein256-184`
    - typings.cids.cidsStrings.`skein256-192`
    - typings.cids.cidsStrings.`skein256-200`
    - typings.cids.cidsStrings.`skein256-208`
    - typings.cids.cidsStrings.`skein256-216`
    - typings.cids.cidsStrings.`skein256-224`
    - typings.cids.cidsStrings.`skein256-232`
    - typings.cids.cidsStrings.`skein256-240`
    - typings.cids.cidsStrings.`skein256-248`
    - typings.cids.cidsStrings.`skein256-256`
    - typings.cids.cidsStrings.`skein512-8`
    - typings.cids.cidsStrings.`skein512-16`
    - typings.cids.cidsStrings.`skein512-24`
    - typings.cids.cidsStrings.`skein512-32`
    - typings.cids.cidsStrings.`skein512-40`
    - typings.cids.cidsStrings.`skein512-48`
    - typings.cids.cidsStrings.`skein512-56`
    - typings.cids.cidsStrings.`skein512-64`
    - typings.cids.cidsStrings.`skein512-72`
    - typings.cids.cidsStrings.`skein512-80`
    - typings.cids.cidsStrings.`skein512-88`
    - typings.cids.cidsStrings.`skein512-96`
    - typings.cids.cidsStrings.`skein512-104`
    - typings.cids.cidsStrings.`skein512-112`
    - typings.cids.cidsStrings.`skein512-120`
    - typings.cids.cidsStrings.`skein512-128`
    - typings.cids.cidsStrings.`skein512-136`
    - typings.cids.cidsStrings.`skein512-144`
    - typings.cids.cidsStrings.`skein512-152`
    - typings.cids.cidsStrings.`skein512-160`
    - typings.cids.cidsStrings.`skein512-168`
    - typings.cids.cidsStrings.`skein512-176`
    - typings.cids.cidsStrings.`skein512-184`
    - typings.cids.cidsStrings.`skein512-192`
    - typings.cids.cidsStrings.`skein512-200`
    - typings.cids.cidsStrings.`skein512-208`
    - typings.cids.cidsStrings.`skein512-216`
    - typings.cids.cidsStrings.`skein512-224`
    - typings.cids.cidsStrings.`skein512-232`
    - typings.cids.cidsStrings.`skein512-240`
    - typings.cids.cidsStrings.`skein512-248`
    - typings.cids.cidsStrings.`skein512-256`
    - typings.cids.cidsStrings.`skein512-264`
    - typings.cids.cidsStrings.`skein512-272`
    - typings.cids.cidsStrings.`skein512-280`
    - typings.cids.cidsStrings.`skein512-288`
    - typings.cids.cidsStrings.`skein512-296`
    - typings.cids.cidsStrings.`skein512-304`
    - typings.cids.cidsStrings.`skein512-312`
    - typings.cids.cidsStrings.`skein512-320`
    - typings.cids.cidsStrings.`skein512-328`
    - typings.cids.cidsStrings.`skein512-336`
    - typings.cids.cidsStrings.`skein512-344`
    - typings.cids.cidsStrings.`skein512-352`
    - typings.cids.cidsStrings.`skein512-360`
    - typings.cids.cidsStrings.`skein512-368`
    - typings.cids.cidsStrings.`skein512-376`
    - typings.cids.cidsStrings.`skein512-384`
    - typings.cids.cidsStrings.`skein512-392`
    - typings.cids.cidsStrings.`skein512-400`
    - typings.cids.cidsStrings.`skein512-408`
    - typings.cids.cidsStrings.`skein512-416`
    - typings.cids.cidsStrings.`skein512-424`
    - typings.cids.cidsStrings.`skein512-432`
    - typings.cids.cidsStrings.`skein512-440`
    - typings.cids.cidsStrings.`skein512-448`
    - typings.cids.cidsStrings.`skein512-456`
    - typings.cids.cidsStrings.`skein512-464`
    - typings.cids.cidsStrings.`skein512-472`
    - typings.cids.cidsStrings.`skein512-480`
    - typings.cids.cidsStrings.`skein512-488`
    - typings.cids.cidsStrings.`skein512-496`
    - typings.cids.cidsStrings.`skein512-504`
    - typings.cids.cidsStrings.`skein512-512`
    - typings.cids.cidsStrings.`skein1024-8`
    - typings.cids.cidsStrings.`skein1024-16`
    - typings.cids.cidsStrings.`skein1024-24`
    - typings.cids.cidsStrings.`skein1024-32`
    - typings.cids.cidsStrings.`skein1024-40`
    - typings.cids.cidsStrings.`skein1024-48`
    - typings.cids.cidsStrings.`skein1024-56`
    - typings.cids.cidsStrings.`skein1024-64`
    - typings.cids.cidsStrings.`skein1024-72`
    - typings.cids.cidsStrings.`skein1024-80`
    - typings.cids.cidsStrings.`skein1024-88`
    - typings.cids.cidsStrings.`skein1024-96`
    - typings.cids.cidsStrings.`skein1024-104`
    - typings.cids.cidsStrings.`skein1024-112`
    - typings.cids.cidsStrings.`skein1024-120`
    - typings.cids.cidsStrings.`skein1024-128`
    - typings.cids.cidsStrings.`skein1024-136`
    - typings.cids.cidsStrings.`skein1024-144`
    - typings.cids.cidsStrings.`skein1024-152`
    - typings.cids.cidsStrings.`skein1024-160`
    - typings.cids.cidsStrings.`skein1024-168`
    - typings.cids.cidsStrings.`skein1024-176`
    - typings.cids.cidsStrings.`skein1024-184`
    - typings.cids.cidsStrings.`skein1024-192`
    - typings.cids.cidsStrings.`skein1024-200`
    - typings.cids.cidsStrings.`skein1024-208`
    - typings.cids.cidsStrings.`skein1024-216`
    - typings.cids.cidsStrings.`skein1024-224`
    - typings.cids.cidsStrings.`skein1024-232`
    - typings.cids.cidsStrings.`skein1024-240`
    - typings.cids.cidsStrings.`skein1024-248`
    - typings.cids.cidsStrings.`skein1024-256`
    - typings.cids.cidsStrings.`skein1024-264`
    - typings.cids.cidsStrings.`skein1024-272`
    - typings.cids.cidsStrings.`skein1024-280`
    - typings.cids.cidsStrings.`skein1024-288`
    - typings.cids.cidsStrings.`skein1024-296`
    - typings.cids.cidsStrings.`skein1024-304`
    - typings.cids.cidsStrings.`skein1024-312`
    - typings.cids.cidsStrings.`skein1024-320`
    - typings.cids.cidsStrings.`skein1024-328`
    - typings.cids.cidsStrings.`skein1024-336`
    - typings.cids.cidsStrings.`skein1024-344`
    - typings.cids.cidsStrings.`skein1024-352`
    - typings.cids.cidsStrings.`skein1024-360`
    - typings.cids.cidsStrings.`skein1024-368`
    - typings.cids.cidsStrings.`skein1024-376`
    - typings.cids.cidsStrings.`skein1024-384`
    - typings.cids.cidsStrings.`skein1024-392`
    - typings.cids.cidsStrings.`skein1024-400`
    - typings.cids.cidsStrings.`skein1024-408`
    - typings.cids.cidsStrings.`skein1024-416`
    - typings.cids.cidsStrings.`skein1024-424`
    - typings.cids.cidsStrings.`skein1024-432`
    - typings.cids.cidsStrings.`skein1024-440`
    - typings.cids.cidsStrings.`skein1024-448`
    - typings.cids.cidsStrings.`skein1024-456`
    - typings.cids.cidsStrings.`skein1024-464`
    - typings.cids.cidsStrings.`skein1024-472`
    - typings.cids.cidsStrings.`skein1024-480`
    - typings.cids.cidsStrings.`skein1024-488`
    - typings.cids.cidsStrings.`skein1024-496`
    - typings.cids.cidsStrings.`skein1024-504`
    - typings.cids.cidsStrings.`skein1024-512`
    - typings.cids.cidsStrings.`skein1024-520`
    - typings.cids.cidsStrings.`skein1024-528`
    - typings.cids.cidsStrings.`skein1024-536`
    - typings.cids.cidsStrings.`skein1024-544`
    - typings.cids.cidsStrings.`skein1024-552`
    - typings.cids.cidsStrings.`skein1024-560`
    - typings.cids.cidsStrings.`skein1024-568`
    - typings.cids.cidsStrings.`skein1024-576`
    - typings.cids.cidsStrings.`skein1024-584`
    - typings.cids.cidsStrings.`skein1024-592`
    - typings.cids.cidsStrings.`skein1024-600`
    - typings.cids.cidsStrings.`skein1024-608`
    - typings.cids.cidsStrings.`skein1024-616`
    - typings.cids.cidsStrings.`skein1024-624`
    - typings.cids.cidsStrings.`skein1024-632`
    - typings.cids.cidsStrings.`skein1024-640`
    - typings.cids.cidsStrings.`skein1024-648`
    - typings.cids.cidsStrings.`skein1024-656`
    - typings.cids.cidsStrings.`skein1024-664`
    - typings.cids.cidsStrings.`skein1024-672`
    - typings.cids.cidsStrings.`skein1024-680`
    - typings.cids.cidsStrings.`skein1024-688`
    - typings.cids.cidsStrings.`skein1024-696`
    - typings.cids.cidsStrings.`skein1024-704`
    - typings.cids.cidsStrings.`skein1024-712`
    - typings.cids.cidsStrings.`skein1024-720`
    - typings.cids.cidsStrings.`skein1024-728`
    - typings.cids.cidsStrings.`skein1024-736`
    - typings.cids.cidsStrings.`skein1024-744`
    - typings.cids.cidsStrings.`skein1024-752`
    - typings.cids.cidsStrings.`skein1024-760`
    - typings.cids.cidsStrings.`skein1024-768`
    - typings.cids.cidsStrings.`skein1024-776`
    - typings.cids.cidsStrings.`skein1024-784`
    - typings.cids.cidsStrings.`skein1024-792`
    - typings.cids.cidsStrings.`skein1024-800`
    - typings.cids.cidsStrings.`skein1024-808`
    - typings.cids.cidsStrings.`skein1024-816`
    - typings.cids.cidsStrings.`skein1024-824`
    - typings.cids.cidsStrings.`skein1024-832`
    - typings.cids.cidsStrings.`skein1024-840`
    - typings.cids.cidsStrings.`skein1024-848`
    - typings.cids.cidsStrings.`skein1024-856`
    - typings.cids.cidsStrings.`skein1024-864`
    - typings.cids.cidsStrings.`skein1024-872`
    - typings.cids.cidsStrings.`skein1024-880`
    - typings.cids.cidsStrings.`skein1024-888`
    - typings.cids.cidsStrings.`skein1024-896`
    - typings.cids.cidsStrings.`skein1024-904`
    - typings.cids.cidsStrings.`skein1024-912`
    - typings.cids.cidsStrings.`skein1024-920`
    - typings.cids.cidsStrings.`skein1024-928`
    - typings.cids.cidsStrings.`skein1024-936`
    - typings.cids.cidsStrings.`skein1024-944`
    - typings.cids.cidsStrings.`skein1024-952`
    - typings.cids.cidsStrings.`skein1024-960`
    - typings.cids.cidsStrings.`skein1024-968`
    - typings.cids.cidsStrings.`skein1024-976`
    - typings.cids.cidsStrings.`skein1024-984`
    - typings.cids.cidsStrings.`skein1024-992`
    - typings.cids.cidsStrings.`skein1024-1000`
    - typings.cids.cidsStrings.`skein1024-1008`
    - typings.cids.cidsStrings.`skein1024-1016`
    - typings.cids.cidsStrings.`skein1024-1024`
    - typings.cids.cidsStrings.`poseidon-bls12_381-a2-fc1`
    - typings.cids.cidsStrings.`poseidon-bls12_381-a2-fc1-sc`
    - typings.cids.cidsStrings.`zeroxcert-imprint-256`
    - typings.cids.cidsStrings.`fil-commitment-unsealed`
    - typings.cids.cidsStrings.`fil-commitment-sealed`
    - typings.cids.cidsStrings.`holochain-adr-v0`
    - typings.cids.cidsStrings.`holochain-adr-v1`
    - typings.cids.cidsStrings.`holochain-key-v0`
    - typings.cids.cidsStrings.`holochain-key-v1`
    - typings.cids.cidsStrings.`holochain-sig-v0`
    - typings.cids.cidsStrings.`holochain-sig-v1`
    - typings.cids.cidsStrings.`skynet-ns`
  */
  trait CodecName extends StObject
  object CodecName {
    
    inline def bencode: typings.cids.cidsStrings.bencode = "bencode".asInstanceOf[typings.cids.cidsStrings.bencode]
    
    inline def `bitcoin-block`: typings.cids.cidsStrings.`bitcoin-block` = "bitcoin-block".asInstanceOf[typings.cids.cidsStrings.`bitcoin-block`]
    
    inline def `bitcoin-tx`: typings.cids.cidsStrings.`bitcoin-tx` = "bitcoin-tx".asInstanceOf[typings.cids.cidsStrings.`bitcoin-tx`]
    
    inline def `bitcoin-witness-commitment`: typings.cids.cidsStrings.`bitcoin-witness-commitment` = "bitcoin-witness-commitment".asInstanceOf[typings.cids.cidsStrings.`bitcoin-witness-commitment`]
    
    inline def `blake2b-104`: typings.cids.cidsStrings.`blake2b-104` = "blake2b-104".asInstanceOf[typings.cids.cidsStrings.`blake2b-104`]
    
    inline def `blake2b-112`: typings.cids.cidsStrings.`blake2b-112` = "blake2b-112".asInstanceOf[typings.cids.cidsStrings.`blake2b-112`]
    
    inline def `blake2b-120`: typings.cids.cidsStrings.`blake2b-120` = "blake2b-120".asInstanceOf[typings.cids.cidsStrings.`blake2b-120`]
    
    inline def `blake2b-128`: typings.cids.cidsStrings.`blake2b-128` = "blake2b-128".asInstanceOf[typings.cids.cidsStrings.`blake2b-128`]
    
    inline def `blake2b-136`: typings.cids.cidsStrings.`blake2b-136` = "blake2b-136".asInstanceOf[typings.cids.cidsStrings.`blake2b-136`]
    
    inline def `blake2b-144`: typings.cids.cidsStrings.`blake2b-144` = "blake2b-144".asInstanceOf[typings.cids.cidsStrings.`blake2b-144`]
    
    inline def `blake2b-152`: typings.cids.cidsStrings.`blake2b-152` = "blake2b-152".asInstanceOf[typings.cids.cidsStrings.`blake2b-152`]
    
    inline def `blake2b-16`: typings.cids.cidsStrings.`blake2b-16` = "blake2b-16".asInstanceOf[typings.cids.cidsStrings.`blake2b-16`]
    
    inline def `blake2b-160`: typings.cids.cidsStrings.`blake2b-160` = "blake2b-160".asInstanceOf[typings.cids.cidsStrings.`blake2b-160`]
    
    inline def `blake2b-168`: typings.cids.cidsStrings.`blake2b-168` = "blake2b-168".asInstanceOf[typings.cids.cidsStrings.`blake2b-168`]
    
    inline def `blake2b-176`: typings.cids.cidsStrings.`blake2b-176` = "blake2b-176".asInstanceOf[typings.cids.cidsStrings.`blake2b-176`]
    
    inline def `blake2b-184`: typings.cids.cidsStrings.`blake2b-184` = "blake2b-184".asInstanceOf[typings.cids.cidsStrings.`blake2b-184`]
    
    inline def `blake2b-192`: typings.cids.cidsStrings.`blake2b-192` = "blake2b-192".asInstanceOf[typings.cids.cidsStrings.`blake2b-192`]
    
    inline def `blake2b-200`: typings.cids.cidsStrings.`blake2b-200` = "blake2b-200".asInstanceOf[typings.cids.cidsStrings.`blake2b-200`]
    
    inline def `blake2b-208`: typings.cids.cidsStrings.`blake2b-208` = "blake2b-208".asInstanceOf[typings.cids.cidsStrings.`blake2b-208`]
    
    inline def `blake2b-216`: typings.cids.cidsStrings.`blake2b-216` = "blake2b-216".asInstanceOf[typings.cids.cidsStrings.`blake2b-216`]
    
    inline def `blake2b-224`: typings.cids.cidsStrings.`blake2b-224` = "blake2b-224".asInstanceOf[typings.cids.cidsStrings.`blake2b-224`]
    
    inline def `blake2b-232`: typings.cids.cidsStrings.`blake2b-232` = "blake2b-232".asInstanceOf[typings.cids.cidsStrings.`blake2b-232`]
    
    inline def `blake2b-24`: typings.cids.cidsStrings.`blake2b-24` = "blake2b-24".asInstanceOf[typings.cids.cidsStrings.`blake2b-24`]
    
    inline def `blake2b-240`: typings.cids.cidsStrings.`blake2b-240` = "blake2b-240".asInstanceOf[typings.cids.cidsStrings.`blake2b-240`]
    
    inline def `blake2b-248`: typings.cids.cidsStrings.`blake2b-248` = "blake2b-248".asInstanceOf[typings.cids.cidsStrings.`blake2b-248`]
    
    inline def `blake2b-256`: typings.cids.cidsStrings.`blake2b-256` = "blake2b-256".asInstanceOf[typings.cids.cidsStrings.`blake2b-256`]
    
    inline def `blake2b-264`: typings.cids.cidsStrings.`blake2b-264` = "blake2b-264".asInstanceOf[typings.cids.cidsStrings.`blake2b-264`]
    
    inline def `blake2b-272`: typings.cids.cidsStrings.`blake2b-272` = "blake2b-272".asInstanceOf[typings.cids.cidsStrings.`blake2b-272`]
    
    inline def `blake2b-280`: typings.cids.cidsStrings.`blake2b-280` = "blake2b-280".asInstanceOf[typings.cids.cidsStrings.`blake2b-280`]
    
    inline def `blake2b-288`: typings.cids.cidsStrings.`blake2b-288` = "blake2b-288".asInstanceOf[typings.cids.cidsStrings.`blake2b-288`]
    
    inline def `blake2b-296`: typings.cids.cidsStrings.`blake2b-296` = "blake2b-296".asInstanceOf[typings.cids.cidsStrings.`blake2b-296`]
    
    inline def `blake2b-304`: typings.cids.cidsStrings.`blake2b-304` = "blake2b-304".asInstanceOf[typings.cids.cidsStrings.`blake2b-304`]
    
    inline def `blake2b-312`: typings.cids.cidsStrings.`blake2b-312` = "blake2b-312".asInstanceOf[typings.cids.cidsStrings.`blake2b-312`]
    
    inline def `blake2b-32`: typings.cids.cidsStrings.`blake2b-32` = "blake2b-32".asInstanceOf[typings.cids.cidsStrings.`blake2b-32`]
    
    inline def `blake2b-320`: typings.cids.cidsStrings.`blake2b-320` = "blake2b-320".asInstanceOf[typings.cids.cidsStrings.`blake2b-320`]
    
    inline def `blake2b-328`: typings.cids.cidsStrings.`blake2b-328` = "blake2b-328".asInstanceOf[typings.cids.cidsStrings.`blake2b-328`]
    
    inline def `blake2b-336`: typings.cids.cidsStrings.`blake2b-336` = "blake2b-336".asInstanceOf[typings.cids.cidsStrings.`blake2b-336`]
    
    inline def `blake2b-344`: typings.cids.cidsStrings.`blake2b-344` = "blake2b-344".asInstanceOf[typings.cids.cidsStrings.`blake2b-344`]
    
    inline def `blake2b-352`: typings.cids.cidsStrings.`blake2b-352` = "blake2b-352".asInstanceOf[typings.cids.cidsStrings.`blake2b-352`]
    
    inline def `blake2b-360`: typings.cids.cidsStrings.`blake2b-360` = "blake2b-360".asInstanceOf[typings.cids.cidsStrings.`blake2b-360`]
    
    inline def `blake2b-368`: typings.cids.cidsStrings.`blake2b-368` = "blake2b-368".asInstanceOf[typings.cids.cidsStrings.`blake2b-368`]
    
    inline def `blake2b-376`: typings.cids.cidsStrings.`blake2b-376` = "blake2b-376".asInstanceOf[typings.cids.cidsStrings.`blake2b-376`]
    
    inline def `blake2b-384`: typings.cids.cidsStrings.`blake2b-384` = "blake2b-384".asInstanceOf[typings.cids.cidsStrings.`blake2b-384`]
    
    inline def `blake2b-392`: typings.cids.cidsStrings.`blake2b-392` = "blake2b-392".asInstanceOf[typings.cids.cidsStrings.`blake2b-392`]
    
    inline def `blake2b-40`: typings.cids.cidsStrings.`blake2b-40` = "blake2b-40".asInstanceOf[typings.cids.cidsStrings.`blake2b-40`]
    
    inline def `blake2b-400`: typings.cids.cidsStrings.`blake2b-400` = "blake2b-400".asInstanceOf[typings.cids.cidsStrings.`blake2b-400`]
    
    inline def `blake2b-408`: typings.cids.cidsStrings.`blake2b-408` = "blake2b-408".asInstanceOf[typings.cids.cidsStrings.`blake2b-408`]
    
    inline def `blake2b-416`: typings.cids.cidsStrings.`blake2b-416` = "blake2b-416".asInstanceOf[typings.cids.cidsStrings.`blake2b-416`]
    
    inline def `blake2b-424`: typings.cids.cidsStrings.`blake2b-424` = "blake2b-424".asInstanceOf[typings.cids.cidsStrings.`blake2b-424`]
    
    inline def `blake2b-432`: typings.cids.cidsStrings.`blake2b-432` = "blake2b-432".asInstanceOf[typings.cids.cidsStrings.`blake2b-432`]
    
    inline def `blake2b-440`: typings.cids.cidsStrings.`blake2b-440` = "blake2b-440".asInstanceOf[typings.cids.cidsStrings.`blake2b-440`]
    
    inline def `blake2b-448`: typings.cids.cidsStrings.`blake2b-448` = "blake2b-448".asInstanceOf[typings.cids.cidsStrings.`blake2b-448`]
    
    inline def `blake2b-456`: typings.cids.cidsStrings.`blake2b-456` = "blake2b-456".asInstanceOf[typings.cids.cidsStrings.`blake2b-456`]
    
    inline def `blake2b-464`: typings.cids.cidsStrings.`blake2b-464` = "blake2b-464".asInstanceOf[typings.cids.cidsStrings.`blake2b-464`]
    
    inline def `blake2b-472`: typings.cids.cidsStrings.`blake2b-472` = "blake2b-472".asInstanceOf[typings.cids.cidsStrings.`blake2b-472`]
    
    inline def `blake2b-48`: typings.cids.cidsStrings.`blake2b-48` = "blake2b-48".asInstanceOf[typings.cids.cidsStrings.`blake2b-48`]
    
    inline def `blake2b-480`: typings.cids.cidsStrings.`blake2b-480` = "blake2b-480".asInstanceOf[typings.cids.cidsStrings.`blake2b-480`]
    
    inline def `blake2b-488`: typings.cids.cidsStrings.`blake2b-488` = "blake2b-488".asInstanceOf[typings.cids.cidsStrings.`blake2b-488`]
    
    inline def `blake2b-496`: typings.cids.cidsStrings.`blake2b-496` = "blake2b-496".asInstanceOf[typings.cids.cidsStrings.`blake2b-496`]
    
    inline def `blake2b-504`: typings.cids.cidsStrings.`blake2b-504` = "blake2b-504".asInstanceOf[typings.cids.cidsStrings.`blake2b-504`]
    
    inline def `blake2b-512`: typings.cids.cidsStrings.`blake2b-512` = "blake2b-512".asInstanceOf[typings.cids.cidsStrings.`blake2b-512`]
    
    inline def `blake2b-56`: typings.cids.cidsStrings.`blake2b-56` = "blake2b-56".asInstanceOf[typings.cids.cidsStrings.`blake2b-56`]
    
    inline def `blake2b-64`: typings.cids.cidsStrings.`blake2b-64` = "blake2b-64".asInstanceOf[typings.cids.cidsStrings.`blake2b-64`]
    
    inline def `blake2b-72`: typings.cids.cidsStrings.`blake2b-72` = "blake2b-72".asInstanceOf[typings.cids.cidsStrings.`blake2b-72`]
    
    inline def `blake2b-8`: typings.cids.cidsStrings.`blake2b-8` = "blake2b-8".asInstanceOf[typings.cids.cidsStrings.`blake2b-8`]
    
    inline def `blake2b-80`: typings.cids.cidsStrings.`blake2b-80` = "blake2b-80".asInstanceOf[typings.cids.cidsStrings.`blake2b-80`]
    
    inline def `blake2b-88`: typings.cids.cidsStrings.`blake2b-88` = "blake2b-88".asInstanceOf[typings.cids.cidsStrings.`blake2b-88`]
    
    inline def `blake2b-96`: typings.cids.cidsStrings.`blake2b-96` = "blake2b-96".asInstanceOf[typings.cids.cidsStrings.`blake2b-96`]
    
    inline def `blake2s-104`: typings.cids.cidsStrings.`blake2s-104` = "blake2s-104".asInstanceOf[typings.cids.cidsStrings.`blake2s-104`]
    
    inline def `blake2s-112`: typings.cids.cidsStrings.`blake2s-112` = "blake2s-112".asInstanceOf[typings.cids.cidsStrings.`blake2s-112`]
    
    inline def `blake2s-120`: typings.cids.cidsStrings.`blake2s-120` = "blake2s-120".asInstanceOf[typings.cids.cidsStrings.`blake2s-120`]
    
    inline def `blake2s-128`: typings.cids.cidsStrings.`blake2s-128` = "blake2s-128".asInstanceOf[typings.cids.cidsStrings.`blake2s-128`]
    
    inline def `blake2s-136`: typings.cids.cidsStrings.`blake2s-136` = "blake2s-136".asInstanceOf[typings.cids.cidsStrings.`blake2s-136`]
    
    inline def `blake2s-144`: typings.cids.cidsStrings.`blake2s-144` = "blake2s-144".asInstanceOf[typings.cids.cidsStrings.`blake2s-144`]
    
    inline def `blake2s-152`: typings.cids.cidsStrings.`blake2s-152` = "blake2s-152".asInstanceOf[typings.cids.cidsStrings.`blake2s-152`]
    
    inline def `blake2s-16`: typings.cids.cidsStrings.`blake2s-16` = "blake2s-16".asInstanceOf[typings.cids.cidsStrings.`blake2s-16`]
    
    inline def `blake2s-160`: typings.cids.cidsStrings.`blake2s-160` = "blake2s-160".asInstanceOf[typings.cids.cidsStrings.`blake2s-160`]
    
    inline def `blake2s-168`: typings.cids.cidsStrings.`blake2s-168` = "blake2s-168".asInstanceOf[typings.cids.cidsStrings.`blake2s-168`]
    
    inline def `blake2s-176`: typings.cids.cidsStrings.`blake2s-176` = "blake2s-176".asInstanceOf[typings.cids.cidsStrings.`blake2s-176`]
    
    inline def `blake2s-184`: typings.cids.cidsStrings.`blake2s-184` = "blake2s-184".asInstanceOf[typings.cids.cidsStrings.`blake2s-184`]
    
    inline def `blake2s-192`: typings.cids.cidsStrings.`blake2s-192` = "blake2s-192".asInstanceOf[typings.cids.cidsStrings.`blake2s-192`]
    
    inline def `blake2s-200`: typings.cids.cidsStrings.`blake2s-200` = "blake2s-200".asInstanceOf[typings.cids.cidsStrings.`blake2s-200`]
    
    inline def `blake2s-208`: typings.cids.cidsStrings.`blake2s-208` = "blake2s-208".asInstanceOf[typings.cids.cidsStrings.`blake2s-208`]
    
    inline def `blake2s-216`: typings.cids.cidsStrings.`blake2s-216` = "blake2s-216".asInstanceOf[typings.cids.cidsStrings.`blake2s-216`]
    
    inline def `blake2s-224`: typings.cids.cidsStrings.`blake2s-224` = "blake2s-224".asInstanceOf[typings.cids.cidsStrings.`blake2s-224`]
    
    inline def `blake2s-232`: typings.cids.cidsStrings.`blake2s-232` = "blake2s-232".asInstanceOf[typings.cids.cidsStrings.`blake2s-232`]
    
    inline def `blake2s-24`: typings.cids.cidsStrings.`blake2s-24` = "blake2s-24".asInstanceOf[typings.cids.cidsStrings.`blake2s-24`]
    
    inline def `blake2s-240`: typings.cids.cidsStrings.`blake2s-240` = "blake2s-240".asInstanceOf[typings.cids.cidsStrings.`blake2s-240`]
    
    inline def `blake2s-248`: typings.cids.cidsStrings.`blake2s-248` = "blake2s-248".asInstanceOf[typings.cids.cidsStrings.`blake2s-248`]
    
    inline def `blake2s-256`: typings.cids.cidsStrings.`blake2s-256` = "blake2s-256".asInstanceOf[typings.cids.cidsStrings.`blake2s-256`]
    
    inline def `blake2s-32`: typings.cids.cidsStrings.`blake2s-32` = "blake2s-32".asInstanceOf[typings.cids.cidsStrings.`blake2s-32`]
    
    inline def `blake2s-40`: typings.cids.cidsStrings.`blake2s-40` = "blake2s-40".asInstanceOf[typings.cids.cidsStrings.`blake2s-40`]
    
    inline def `blake2s-48`: typings.cids.cidsStrings.`blake2s-48` = "blake2s-48".asInstanceOf[typings.cids.cidsStrings.`blake2s-48`]
    
    inline def `blake2s-56`: typings.cids.cidsStrings.`blake2s-56` = "blake2s-56".asInstanceOf[typings.cids.cidsStrings.`blake2s-56`]
    
    inline def `blake2s-64`: typings.cids.cidsStrings.`blake2s-64` = "blake2s-64".asInstanceOf[typings.cids.cidsStrings.`blake2s-64`]
    
    inline def `blake2s-72`: typings.cids.cidsStrings.`blake2s-72` = "blake2s-72".asInstanceOf[typings.cids.cidsStrings.`blake2s-72`]
    
    inline def `blake2s-8`: typings.cids.cidsStrings.`blake2s-8` = "blake2s-8".asInstanceOf[typings.cids.cidsStrings.`blake2s-8`]
    
    inline def `blake2s-80`: typings.cids.cidsStrings.`blake2s-80` = "blake2s-80".asInstanceOf[typings.cids.cidsStrings.`blake2s-80`]
    
    inline def `blake2s-88`: typings.cids.cidsStrings.`blake2s-88` = "blake2s-88".asInstanceOf[typings.cids.cidsStrings.`blake2s-88`]
    
    inline def `blake2s-96`: typings.cids.cidsStrings.`blake2s-96` = "blake2s-96".asInstanceOf[typings.cids.cidsStrings.`blake2s-96`]
    
    inline def blake3: typings.cids.cidsStrings.blake3 = "blake3".asInstanceOf[typings.cids.cidsStrings.blake3]
    
    inline def `bls12_381-g1-pub`: typings.cids.cidsStrings.`bls12_381-g1-pub` = "bls12_381-g1-pub".asInstanceOf[typings.cids.cidsStrings.`bls12_381-g1-pub`]
    
    inline def `bls12_381-g1g2-pub`: typings.cids.cidsStrings.`bls12_381-g1g2-pub` = "bls12_381-g1g2-pub".asInstanceOf[typings.cids.cidsStrings.`bls12_381-g1g2-pub`]
    
    inline def `bls12_381-g2-pub`: typings.cids.cidsStrings.`bls12_381-g2-pub` = "bls12_381-g2-pub".asInstanceOf[typings.cids.cidsStrings.`bls12_381-g2-pub`]
    
    inline def bmt: typings.cids.cidsStrings.bmt = "bmt".asInstanceOf[typings.cids.cidsStrings.bmt]
    
    inline def cbor: typings.cids.cidsStrings.cbor = "cbor".asInstanceOf[typings.cids.cidsStrings.cbor]
    
    inline def cidv1: typings.cids.cidsStrings.cidv1 = "cidv1".asInstanceOf[typings.cids.cidsStrings.cidv1]
    
    inline def cidv2: typings.cids.cidsStrings.cidv2 = "cidv2".asInstanceOf[typings.cids.cidsStrings.cidv2]
    
    inline def cidv3: typings.cids.cidsStrings.cidv3 = "cidv3".asInstanceOf[typings.cids.cidsStrings.cidv3]
    
    inline def `dag-cbor`: typings.cids.cidsStrings.`dag-cbor` = "dag-cbor".asInstanceOf[typings.cids.cidsStrings.`dag-cbor`]
    
    inline def `dag-cose`: typings.cids.cidsStrings.`dag-cose` = "dag-cose".asInstanceOf[typings.cids.cidsStrings.`dag-cose`]
    
    inline def `dag-jose`: typings.cids.cidsStrings.`dag-jose` = "dag-jose".asInstanceOf[typings.cids.cidsStrings.`dag-jose`]
    
    inline def `dag-json`: typings.cids.cidsStrings.`dag-json` = "dag-json".asInstanceOf[typings.cids.cidsStrings.`dag-json`]
    
    inline def `dag-pb`: typings.cids.cidsStrings.`dag-pb` = "dag-pb".asInstanceOf[typings.cids.cidsStrings.`dag-pb`]
    
    inline def `dash-block`: typings.cids.cidsStrings.`dash-block` = "dash-block".asInstanceOf[typings.cids.cidsStrings.`dash-block`]
    
    inline def `dash-tx`: typings.cids.cidsStrings.`dash-tx` = "dash-tx".asInstanceOf[typings.cids.cidsStrings.`dash-tx`]
    
    inline def `dbl-sha2-256`: typings.cids.cidsStrings.`dbl-sha2-256` = "dbl-sha2-256".asInstanceOf[typings.cids.cidsStrings.`dbl-sha2-256`]
    
    inline def dccp: typings.cids.cidsStrings.dccp = "dccp".asInstanceOf[typings.cids.cidsStrings.dccp]
    
    inline def `decred-block`: typings.cids.cidsStrings.`decred-block` = "decred-block".asInstanceOf[typings.cids.cidsStrings.`decred-block`]
    
    inline def `decred-tx`: typings.cids.cidsStrings.`decred-tx` = "decred-tx".asInstanceOf[typings.cids.cidsStrings.`decred-tx`]
    
    inline def dns: typings.cids.cidsStrings.dns = "dns".asInstanceOf[typings.cids.cidsStrings.dns]
    
    inline def dns4: typings.cids.cidsStrings.dns4 = "dns4".asInstanceOf[typings.cids.cidsStrings.dns4]
    
    inline def dns6: typings.cids.cidsStrings.dns6 = "dns6".asInstanceOf[typings.cids.cidsStrings.dns6]
    
    inline def dnsaddr: typings.cids.cidsStrings.dnsaddr = "dnsaddr".asInstanceOf[typings.cids.cidsStrings.dnsaddr]
    
    inline def docid: typings.cids.cidsStrings.docid = "docid".asInstanceOf[typings.cids.cidsStrings.docid]
    
    inline def `ed25519-priv`: typings.cids.cidsStrings.`ed25519-priv` = "ed25519-priv".asInstanceOf[typings.cids.cidsStrings.`ed25519-priv`]
    
    inline def `ed25519-pub`: typings.cids.cidsStrings.`ed25519-pub` = "ed25519-pub".asInstanceOf[typings.cids.cidsStrings.`ed25519-pub`]
    
    inline def `ed448-pub`: typings.cids.cidsStrings.`ed448-pub` = "ed448-pub".asInstanceOf[typings.cids.cidsStrings.`ed448-pub`]
    
    inline def `eth-account-snapshot`: typings.cids.cidsStrings.`eth-account-snapshot` = "eth-account-snapshot".asInstanceOf[typings.cids.cidsStrings.`eth-account-snapshot`]
    
    inline def `eth-block`: typings.cids.cidsStrings.`eth-block` = "eth-block".asInstanceOf[typings.cids.cidsStrings.`eth-block`]
    
    inline def `eth-block-list`: typings.cids.cidsStrings.`eth-block-list` = "eth-block-list".asInstanceOf[typings.cids.cidsStrings.`eth-block-list`]
    
    inline def `eth-state-trie`: typings.cids.cidsStrings.`eth-state-trie` = "eth-state-trie".asInstanceOf[typings.cids.cidsStrings.`eth-state-trie`]
    
    inline def `eth-storage-trie`: typings.cids.cidsStrings.`eth-storage-trie` = "eth-storage-trie".asInstanceOf[typings.cids.cidsStrings.`eth-storage-trie`]
    
    inline def `eth-tx`: typings.cids.cidsStrings.`eth-tx` = "eth-tx".asInstanceOf[typings.cids.cidsStrings.`eth-tx`]
    
    inline def `eth-tx-receipt`: typings.cids.cidsStrings.`eth-tx-receipt` = "eth-tx-receipt".asInstanceOf[typings.cids.cidsStrings.`eth-tx-receipt`]
    
    inline def `eth-tx-receipt-trie`: typings.cids.cidsStrings.`eth-tx-receipt-trie` = "eth-tx-receipt-trie".asInstanceOf[typings.cids.cidsStrings.`eth-tx-receipt-trie`]
    
    inline def `eth-tx-trie`: typings.cids.cidsStrings.`eth-tx-trie` = "eth-tx-trie".asInstanceOf[typings.cids.cidsStrings.`eth-tx-trie`]
    
    inline def `fil-commitment-sealed`: typings.cids.cidsStrings.`fil-commitment-sealed` = "fil-commitment-sealed".asInstanceOf[typings.cids.cidsStrings.`fil-commitment-sealed`]
    
    inline def `fil-commitment-unsealed`: typings.cids.cidsStrings.`fil-commitment-unsealed` = "fil-commitment-unsealed".asInstanceOf[typings.cids.cidsStrings.`fil-commitment-unsealed`]
    
    inline def garlic32: typings.cids.cidsStrings.garlic32 = "garlic32".asInstanceOf[typings.cids.cidsStrings.garlic32]
    
    inline def garlic64: typings.cids.cidsStrings.garlic64 = "garlic64".asInstanceOf[typings.cids.cidsStrings.garlic64]
    
    inline def `git-raw`: typings.cids.cidsStrings.`git-raw` = "git-raw".asInstanceOf[typings.cids.cidsStrings.`git-raw`]
    
    inline def `holochain-adr-v0`: typings.cids.cidsStrings.`holochain-adr-v0` = "holochain-adr-v0".asInstanceOf[typings.cids.cidsStrings.`holochain-adr-v0`]
    
    inline def `holochain-adr-v1`: typings.cids.cidsStrings.`holochain-adr-v1` = "holochain-adr-v1".asInstanceOf[typings.cids.cidsStrings.`holochain-adr-v1`]
    
    inline def `holochain-key-v0`: typings.cids.cidsStrings.`holochain-key-v0` = "holochain-key-v0".asInstanceOf[typings.cids.cidsStrings.`holochain-key-v0`]
    
    inline def `holochain-key-v1`: typings.cids.cidsStrings.`holochain-key-v1` = "holochain-key-v1".asInstanceOf[typings.cids.cidsStrings.`holochain-key-v1`]
    
    inline def `holochain-sig-v0`: typings.cids.cidsStrings.`holochain-sig-v0` = "holochain-sig-v0".asInstanceOf[typings.cids.cidsStrings.`holochain-sig-v0`]
    
    inline def `holochain-sig-v1`: typings.cids.cidsStrings.`holochain-sig-v1` = "holochain-sig-v1".asInstanceOf[typings.cids.cidsStrings.`holochain-sig-v1`]
    
    inline def http: typings.cids.cidsStrings.http = "http".asInstanceOf[typings.cids.cidsStrings.http]
    
    inline def https: typings.cids.cidsStrings.https = "https".asInstanceOf[typings.cids.cidsStrings.https]
    
    inline def identity: typings.cids.cidsStrings.identity = "identity".asInstanceOf[typings.cids.cidsStrings.identity]
    
    inline def ip4: typings.cids.cidsStrings.ip4 = "ip4".asInstanceOf[typings.cids.cidsStrings.ip4]
    
    inline def ip6: typings.cids.cidsStrings.ip6 = "ip6".asInstanceOf[typings.cids.cidsStrings.ip6]
    
    inline def ip6zone: typings.cids.cidsStrings.ip6zone = "ip6zone".asInstanceOf[typings.cids.cidsStrings.ip6zone]
    
    inline def ipfs: typings.cids.cidsStrings.ipfs = "ipfs".asInstanceOf[typings.cids.cidsStrings.ipfs]
    
    inline def `ipfs-ns`: typings.cids.cidsStrings.`ipfs-ns` = "ipfs-ns".asInstanceOf[typings.cids.cidsStrings.`ipfs-ns`]
    
    inline def `ipld-ns`: typings.cids.cidsStrings.`ipld-ns` = "ipld-ns".asInstanceOf[typings.cids.cidsStrings.`ipld-ns`]
    
    inline def `ipns-ns`: typings.cids.cidsStrings.`ipns-ns` = "ipns-ns".asInstanceOf[typings.cids.cidsStrings.`ipns-ns`]
    
    inline def json: typings.cids.cidsStrings.json = "json".asInstanceOf[typings.cids.cidsStrings.json]
    
    inline def kangarootwelve: typings.cids.cidsStrings.kangarootwelve = "kangarootwelve".asInstanceOf[typings.cids.cidsStrings.kangarootwelve]
    
    inline def `keccak-224`: typings.cids.cidsStrings.`keccak-224` = "keccak-224".asInstanceOf[typings.cids.cidsStrings.`keccak-224`]
    
    inline def `keccak-256`: typings.cids.cidsStrings.`keccak-256` = "keccak-256".asInstanceOf[typings.cids.cidsStrings.`keccak-256`]
    
    inline def `keccak-384`: typings.cids.cidsStrings.`keccak-384` = "keccak-384".asInstanceOf[typings.cids.cidsStrings.`keccak-384`]
    
    inline def `keccak-512`: typings.cids.cidsStrings.`keccak-512` = "keccak-512".asInstanceOf[typings.cids.cidsStrings.`keccak-512`]
    
    inline def `leofcoin-block`: typings.cids.cidsStrings.`leofcoin-block` = "leofcoin-block".asInstanceOf[typings.cids.cidsStrings.`leofcoin-block`]
    
    inline def `leofcoin-pr`: typings.cids.cidsStrings.`leofcoin-pr` = "leofcoin-pr".asInstanceOf[typings.cids.cidsStrings.`leofcoin-pr`]
    
    inline def `leofcoin-tx`: typings.cids.cidsStrings.`leofcoin-tx` = "leofcoin-tx".asInstanceOf[typings.cids.cidsStrings.`leofcoin-tx`]
    
    inline def `libp2p-key`: typings.cids.cidsStrings.`libp2p-key` = "libp2p-key".asInstanceOf[typings.cids.cidsStrings.`libp2p-key`]
    
    inline def `libp2p-peer-record`: typings.cids.cidsStrings.`libp2p-peer-record` = "libp2p-peer-record".asInstanceOf[typings.cids.cidsStrings.`libp2p-peer-record`]
    
    inline def md4: typings.cids.cidsStrings.md4 = "md4".asInstanceOf[typings.cids.cidsStrings.md4]
    
    inline def md5: typings.cids.cidsStrings.md5 = "md5".asInstanceOf[typings.cids.cidsStrings.md5]
    
    inline def messagepack: typings.cids.cidsStrings.messagepack = "messagepack".asInstanceOf[typings.cids.cidsStrings.messagepack]
    
    inline def multiaddr: typings.cids.cidsStrings.multiaddr = "multiaddr".asInstanceOf[typings.cids.cidsStrings.multiaddr]
    
    inline def multibase: typings.cids.cidsStrings.multibase = "multibase".asInstanceOf[typings.cids.cidsStrings.multibase]
    
    inline def multicodec: typings.cids.cidsStrings.multicodec = "multicodec".asInstanceOf[typings.cids.cidsStrings.multicodec]
    
    inline def multihash: typings.cids.cidsStrings.multihash = "multihash".asInstanceOf[typings.cids.cidsStrings.multihash]
    
    inline def `murmur3-128`: typings.cids.cidsStrings.`murmur3-128` = "murmur3-128".asInstanceOf[typings.cids.cidsStrings.`murmur3-128`]
    
    inline def `murmur3-32`: typings.cids.cidsStrings.`murmur3-32` = "murmur3-32".asInstanceOf[typings.cids.cidsStrings.`murmur3-32`]
    
    inline def onion: typings.cids.cidsStrings.onion = "onion".asInstanceOf[typings.cids.cidsStrings.onion]
    
    inline def onion3: typings.cids.cidsStrings.onion3 = "onion3".asInstanceOf[typings.cids.cidsStrings.onion3]
    
    inline def `p256-pub`: typings.cids.cidsStrings.`p256-pub` = "p256-pub".asInstanceOf[typings.cids.cidsStrings.`p256-pub`]
    
    inline def p2p: typings.cids.cidsStrings.p2p = "p2p".asInstanceOf[typings.cids.cidsStrings.p2p]
    
    inline def `p2p-circuit`: typings.cids.cidsStrings.`p2p-circuit` = "p2p-circuit".asInstanceOf[typings.cids.cidsStrings.`p2p-circuit`]
    
    inline def `p2p-stardust`: typings.cids.cidsStrings.`p2p-stardust` = "p2p-stardust".asInstanceOf[typings.cids.cidsStrings.`p2p-stardust`]
    
    inline def `p2p-webrtc-direct`: typings.cids.cidsStrings.`p2p-webrtc-direct` = "p2p-webrtc-direct".asInstanceOf[typings.cids.cidsStrings.`p2p-webrtc-direct`]
    
    inline def `p2p-webrtc-star`: typings.cids.cidsStrings.`p2p-webrtc-star` = "p2p-webrtc-star".asInstanceOf[typings.cids.cidsStrings.`p2p-webrtc-star`]
    
    inline def `p2p-websocket-star`: typings.cids.cidsStrings.`p2p-websocket-star` = "p2p-websocket-star".asInstanceOf[typings.cids.cidsStrings.`p2p-websocket-star`]
    
    inline def `p384-pub`: typings.cids.cidsStrings.`p384-pub` = "p384-pub".asInstanceOf[typings.cids.cidsStrings.`p384-pub`]
    
    inline def `p521-pub`: typings.cids.cidsStrings.`p521-pub` = "p521-pub".asInstanceOf[typings.cids.cidsStrings.`p521-pub`]
    
    inline def path: typings.cids.cidsStrings.path = "path".asInstanceOf[typings.cids.cidsStrings.path]
    
    inline def `poseidon-bls12_381-a2-fc1`: typings.cids.cidsStrings.`poseidon-bls12_381-a2-fc1` = "poseidon-bls12_381-a2-fc1".asInstanceOf[typings.cids.cidsStrings.`poseidon-bls12_381-a2-fc1`]
    
    inline def `poseidon-bls12_381-a2-fc1-sc`: typings.cids.cidsStrings.`poseidon-bls12_381-a2-fc1-sc` = "poseidon-bls12_381-a2-fc1-sc".asInstanceOf[typings.cids.cidsStrings.`poseidon-bls12_381-a2-fc1-sc`]
    
    inline def protobuf: typings.cids.cidsStrings.protobuf = "protobuf".asInstanceOf[typings.cids.cidsStrings.protobuf]
    
    inline def quic: typings.cids.cidsStrings.quic = "quic".asInstanceOf[typings.cids.cidsStrings.quic]
    
    inline def raw: typings.cids.cidsStrings.raw = "raw".asInstanceOf[typings.cids.cidsStrings.raw]
    
    inline def `ripemd-128`: typings.cids.cidsStrings.`ripemd-128` = "ripemd-128".asInstanceOf[typings.cids.cidsStrings.`ripemd-128`]
    
    inline def `ripemd-160`: typings.cids.cidsStrings.`ripemd-160` = "ripemd-160".asInstanceOf[typings.cids.cidsStrings.`ripemd-160`]
    
    inline def `ripemd-256`: typings.cids.cidsStrings.`ripemd-256` = "ripemd-256".asInstanceOf[typings.cids.cidsStrings.`ripemd-256`]
    
    inline def `ripemd-320`: typings.cids.cidsStrings.`ripemd-320` = "ripemd-320".asInstanceOf[typings.cids.cidsStrings.`ripemd-320`]
    
    inline def rlp: typings.cids.cidsStrings.rlp = "rlp".asInstanceOf[typings.cids.cidsStrings.rlp]
    
    inline def sctp: typings.cids.cidsStrings.sctp = "sctp".asInstanceOf[typings.cids.cidsStrings.sctp]
    
    inline def `secp256k1-pub`: typings.cids.cidsStrings.`secp256k1-pub` = "secp256k1-pub".asInstanceOf[typings.cids.cidsStrings.`secp256k1-pub`]
    
    inline def sha1: typings.cids.cidsStrings.sha1 = "sha1".asInstanceOf[typings.cids.cidsStrings.sha1]
    
    inline def `sha2-256`: typings.cids.cidsStrings.`sha2-256` = "sha2-256".asInstanceOf[typings.cids.cidsStrings.`sha2-256`]
    
    inline def `sha2-256-trunc254-padded`: typings.cids.cidsStrings.`sha2-256-trunc254-padded` = "sha2-256-trunc254-padded".asInstanceOf[typings.cids.cidsStrings.`sha2-256-trunc254-padded`]
    
    inline def `sha2-512`: typings.cids.cidsStrings.`sha2-512` = "sha2-512".asInstanceOf[typings.cids.cidsStrings.`sha2-512`]
    
    inline def `sha3-224`: typings.cids.cidsStrings.`sha3-224` = "sha3-224".asInstanceOf[typings.cids.cidsStrings.`sha3-224`]
    
    inline def `sha3-256`: typings.cids.cidsStrings.`sha3-256` = "sha3-256".asInstanceOf[typings.cids.cidsStrings.`sha3-256`]
    
    inline def `sha3-384`: typings.cids.cidsStrings.`sha3-384` = "sha3-384".asInstanceOf[typings.cids.cidsStrings.`sha3-384`]
    
    inline def `sha3-512`: typings.cids.cidsStrings.`sha3-512` = "sha3-512".asInstanceOf[typings.cids.cidsStrings.`sha3-512`]
    
    inline def `shake-128`: typings.cids.cidsStrings.`shake-128` = "shake-128".asInstanceOf[typings.cids.cidsStrings.`shake-128`]
    
    inline def `shake-256`: typings.cids.cidsStrings.`shake-256` = "shake-256".asInstanceOf[typings.cids.cidsStrings.`shake-256`]
    
    inline def `skein1024-1000`: typings.cids.cidsStrings.`skein1024-1000` = "skein1024-1000".asInstanceOf[typings.cids.cidsStrings.`skein1024-1000`]
    
    inline def `skein1024-1008`: typings.cids.cidsStrings.`skein1024-1008` = "skein1024-1008".asInstanceOf[typings.cids.cidsStrings.`skein1024-1008`]
    
    inline def `skein1024-1016`: typings.cids.cidsStrings.`skein1024-1016` = "skein1024-1016".asInstanceOf[typings.cids.cidsStrings.`skein1024-1016`]
    
    inline def `skein1024-1024`: typings.cids.cidsStrings.`skein1024-1024` = "skein1024-1024".asInstanceOf[typings.cids.cidsStrings.`skein1024-1024`]
    
    inline def `skein1024-104`: typings.cids.cidsStrings.`skein1024-104` = "skein1024-104".asInstanceOf[typings.cids.cidsStrings.`skein1024-104`]
    
    inline def `skein1024-112`: typings.cids.cidsStrings.`skein1024-112` = "skein1024-112".asInstanceOf[typings.cids.cidsStrings.`skein1024-112`]
    
    inline def `skein1024-120`: typings.cids.cidsStrings.`skein1024-120` = "skein1024-120".asInstanceOf[typings.cids.cidsStrings.`skein1024-120`]
    
    inline def `skein1024-128`: typings.cids.cidsStrings.`skein1024-128` = "skein1024-128".asInstanceOf[typings.cids.cidsStrings.`skein1024-128`]
    
    inline def `skein1024-136`: typings.cids.cidsStrings.`skein1024-136` = "skein1024-136".asInstanceOf[typings.cids.cidsStrings.`skein1024-136`]
    
    inline def `skein1024-144`: typings.cids.cidsStrings.`skein1024-144` = "skein1024-144".asInstanceOf[typings.cids.cidsStrings.`skein1024-144`]
    
    inline def `skein1024-152`: typings.cids.cidsStrings.`skein1024-152` = "skein1024-152".asInstanceOf[typings.cids.cidsStrings.`skein1024-152`]
    
    inline def `skein1024-16`: typings.cids.cidsStrings.`skein1024-16` = "skein1024-16".asInstanceOf[typings.cids.cidsStrings.`skein1024-16`]
    
    inline def `skein1024-160`: typings.cids.cidsStrings.`skein1024-160` = "skein1024-160".asInstanceOf[typings.cids.cidsStrings.`skein1024-160`]
    
    inline def `skein1024-168`: typings.cids.cidsStrings.`skein1024-168` = "skein1024-168".asInstanceOf[typings.cids.cidsStrings.`skein1024-168`]
    
    inline def `skein1024-176`: typings.cids.cidsStrings.`skein1024-176` = "skein1024-176".asInstanceOf[typings.cids.cidsStrings.`skein1024-176`]
    
    inline def `skein1024-184`: typings.cids.cidsStrings.`skein1024-184` = "skein1024-184".asInstanceOf[typings.cids.cidsStrings.`skein1024-184`]
    
    inline def `skein1024-192`: typings.cids.cidsStrings.`skein1024-192` = "skein1024-192".asInstanceOf[typings.cids.cidsStrings.`skein1024-192`]
    
    inline def `skein1024-200`: typings.cids.cidsStrings.`skein1024-200` = "skein1024-200".asInstanceOf[typings.cids.cidsStrings.`skein1024-200`]
    
    inline def `skein1024-208`: typings.cids.cidsStrings.`skein1024-208` = "skein1024-208".asInstanceOf[typings.cids.cidsStrings.`skein1024-208`]
    
    inline def `skein1024-216`: typings.cids.cidsStrings.`skein1024-216` = "skein1024-216".asInstanceOf[typings.cids.cidsStrings.`skein1024-216`]
    
    inline def `skein1024-224`: typings.cids.cidsStrings.`skein1024-224` = "skein1024-224".asInstanceOf[typings.cids.cidsStrings.`skein1024-224`]
    
    inline def `skein1024-232`: typings.cids.cidsStrings.`skein1024-232` = "skein1024-232".asInstanceOf[typings.cids.cidsStrings.`skein1024-232`]
    
    inline def `skein1024-24`: typings.cids.cidsStrings.`skein1024-24` = "skein1024-24".asInstanceOf[typings.cids.cidsStrings.`skein1024-24`]
    
    inline def `skein1024-240`: typings.cids.cidsStrings.`skein1024-240` = "skein1024-240".asInstanceOf[typings.cids.cidsStrings.`skein1024-240`]
    
    inline def `skein1024-248`: typings.cids.cidsStrings.`skein1024-248` = "skein1024-248".asInstanceOf[typings.cids.cidsStrings.`skein1024-248`]
    
    inline def `skein1024-256`: typings.cids.cidsStrings.`skein1024-256` = "skein1024-256".asInstanceOf[typings.cids.cidsStrings.`skein1024-256`]
    
    inline def `skein1024-264`: typings.cids.cidsStrings.`skein1024-264` = "skein1024-264".asInstanceOf[typings.cids.cidsStrings.`skein1024-264`]
    
    inline def `skein1024-272`: typings.cids.cidsStrings.`skein1024-272` = "skein1024-272".asInstanceOf[typings.cids.cidsStrings.`skein1024-272`]
    
    inline def `skein1024-280`: typings.cids.cidsStrings.`skein1024-280` = "skein1024-280".asInstanceOf[typings.cids.cidsStrings.`skein1024-280`]
    
    inline def `skein1024-288`: typings.cids.cidsStrings.`skein1024-288` = "skein1024-288".asInstanceOf[typings.cids.cidsStrings.`skein1024-288`]
    
    inline def `skein1024-296`: typings.cids.cidsStrings.`skein1024-296` = "skein1024-296".asInstanceOf[typings.cids.cidsStrings.`skein1024-296`]
    
    inline def `skein1024-304`: typings.cids.cidsStrings.`skein1024-304` = "skein1024-304".asInstanceOf[typings.cids.cidsStrings.`skein1024-304`]
    
    inline def `skein1024-312`: typings.cids.cidsStrings.`skein1024-312` = "skein1024-312".asInstanceOf[typings.cids.cidsStrings.`skein1024-312`]
    
    inline def `skein1024-32`: typings.cids.cidsStrings.`skein1024-32` = "skein1024-32".asInstanceOf[typings.cids.cidsStrings.`skein1024-32`]
    
    inline def `skein1024-320`: typings.cids.cidsStrings.`skein1024-320` = "skein1024-320".asInstanceOf[typings.cids.cidsStrings.`skein1024-320`]
    
    inline def `skein1024-328`: typings.cids.cidsStrings.`skein1024-328` = "skein1024-328".asInstanceOf[typings.cids.cidsStrings.`skein1024-328`]
    
    inline def `skein1024-336`: typings.cids.cidsStrings.`skein1024-336` = "skein1024-336".asInstanceOf[typings.cids.cidsStrings.`skein1024-336`]
    
    inline def `skein1024-344`: typings.cids.cidsStrings.`skein1024-344` = "skein1024-344".asInstanceOf[typings.cids.cidsStrings.`skein1024-344`]
    
    inline def `skein1024-352`: typings.cids.cidsStrings.`skein1024-352` = "skein1024-352".asInstanceOf[typings.cids.cidsStrings.`skein1024-352`]
    
    inline def `skein1024-360`: typings.cids.cidsStrings.`skein1024-360` = "skein1024-360".asInstanceOf[typings.cids.cidsStrings.`skein1024-360`]
    
    inline def `skein1024-368`: typings.cids.cidsStrings.`skein1024-368` = "skein1024-368".asInstanceOf[typings.cids.cidsStrings.`skein1024-368`]
    
    inline def `skein1024-376`: typings.cids.cidsStrings.`skein1024-376` = "skein1024-376".asInstanceOf[typings.cids.cidsStrings.`skein1024-376`]
    
    inline def `skein1024-384`: typings.cids.cidsStrings.`skein1024-384` = "skein1024-384".asInstanceOf[typings.cids.cidsStrings.`skein1024-384`]
    
    inline def `skein1024-392`: typings.cids.cidsStrings.`skein1024-392` = "skein1024-392".asInstanceOf[typings.cids.cidsStrings.`skein1024-392`]
    
    inline def `skein1024-40`: typings.cids.cidsStrings.`skein1024-40` = "skein1024-40".asInstanceOf[typings.cids.cidsStrings.`skein1024-40`]
    
    inline def `skein1024-400`: typings.cids.cidsStrings.`skein1024-400` = "skein1024-400".asInstanceOf[typings.cids.cidsStrings.`skein1024-400`]
    
    inline def `skein1024-408`: typings.cids.cidsStrings.`skein1024-408` = "skein1024-408".asInstanceOf[typings.cids.cidsStrings.`skein1024-408`]
    
    inline def `skein1024-416`: typings.cids.cidsStrings.`skein1024-416` = "skein1024-416".asInstanceOf[typings.cids.cidsStrings.`skein1024-416`]
    
    inline def `skein1024-424`: typings.cids.cidsStrings.`skein1024-424` = "skein1024-424".asInstanceOf[typings.cids.cidsStrings.`skein1024-424`]
    
    inline def `skein1024-432`: typings.cids.cidsStrings.`skein1024-432` = "skein1024-432".asInstanceOf[typings.cids.cidsStrings.`skein1024-432`]
    
    inline def `skein1024-440`: typings.cids.cidsStrings.`skein1024-440` = "skein1024-440".asInstanceOf[typings.cids.cidsStrings.`skein1024-440`]
    
    inline def `skein1024-448`: typings.cids.cidsStrings.`skein1024-448` = "skein1024-448".asInstanceOf[typings.cids.cidsStrings.`skein1024-448`]
    
    inline def `skein1024-456`: typings.cids.cidsStrings.`skein1024-456` = "skein1024-456".asInstanceOf[typings.cids.cidsStrings.`skein1024-456`]
    
    inline def `skein1024-464`: typings.cids.cidsStrings.`skein1024-464` = "skein1024-464".asInstanceOf[typings.cids.cidsStrings.`skein1024-464`]
    
    inline def `skein1024-472`: typings.cids.cidsStrings.`skein1024-472` = "skein1024-472".asInstanceOf[typings.cids.cidsStrings.`skein1024-472`]
    
    inline def `skein1024-48`: typings.cids.cidsStrings.`skein1024-48` = "skein1024-48".asInstanceOf[typings.cids.cidsStrings.`skein1024-48`]
    
    inline def `skein1024-480`: typings.cids.cidsStrings.`skein1024-480` = "skein1024-480".asInstanceOf[typings.cids.cidsStrings.`skein1024-480`]
    
    inline def `skein1024-488`: typings.cids.cidsStrings.`skein1024-488` = "skein1024-488".asInstanceOf[typings.cids.cidsStrings.`skein1024-488`]
    
    inline def `skein1024-496`: typings.cids.cidsStrings.`skein1024-496` = "skein1024-496".asInstanceOf[typings.cids.cidsStrings.`skein1024-496`]
    
    inline def `skein1024-504`: typings.cids.cidsStrings.`skein1024-504` = "skein1024-504".asInstanceOf[typings.cids.cidsStrings.`skein1024-504`]
    
    inline def `skein1024-512`: typings.cids.cidsStrings.`skein1024-512` = "skein1024-512".asInstanceOf[typings.cids.cidsStrings.`skein1024-512`]
    
    inline def `skein1024-520`: typings.cids.cidsStrings.`skein1024-520` = "skein1024-520".asInstanceOf[typings.cids.cidsStrings.`skein1024-520`]
    
    inline def `skein1024-528`: typings.cids.cidsStrings.`skein1024-528` = "skein1024-528".asInstanceOf[typings.cids.cidsStrings.`skein1024-528`]
    
    inline def `skein1024-536`: typings.cids.cidsStrings.`skein1024-536` = "skein1024-536".asInstanceOf[typings.cids.cidsStrings.`skein1024-536`]
    
    inline def `skein1024-544`: typings.cids.cidsStrings.`skein1024-544` = "skein1024-544".asInstanceOf[typings.cids.cidsStrings.`skein1024-544`]
    
    inline def `skein1024-552`: typings.cids.cidsStrings.`skein1024-552` = "skein1024-552".asInstanceOf[typings.cids.cidsStrings.`skein1024-552`]
    
    inline def `skein1024-56`: typings.cids.cidsStrings.`skein1024-56` = "skein1024-56".asInstanceOf[typings.cids.cidsStrings.`skein1024-56`]
    
    inline def `skein1024-560`: typings.cids.cidsStrings.`skein1024-560` = "skein1024-560".asInstanceOf[typings.cids.cidsStrings.`skein1024-560`]
    
    inline def `skein1024-568`: typings.cids.cidsStrings.`skein1024-568` = "skein1024-568".asInstanceOf[typings.cids.cidsStrings.`skein1024-568`]
    
    inline def `skein1024-576`: typings.cids.cidsStrings.`skein1024-576` = "skein1024-576".asInstanceOf[typings.cids.cidsStrings.`skein1024-576`]
    
    inline def `skein1024-584`: typings.cids.cidsStrings.`skein1024-584` = "skein1024-584".asInstanceOf[typings.cids.cidsStrings.`skein1024-584`]
    
    inline def `skein1024-592`: typings.cids.cidsStrings.`skein1024-592` = "skein1024-592".asInstanceOf[typings.cids.cidsStrings.`skein1024-592`]
    
    inline def `skein1024-600`: typings.cids.cidsStrings.`skein1024-600` = "skein1024-600".asInstanceOf[typings.cids.cidsStrings.`skein1024-600`]
    
    inline def `skein1024-608`: typings.cids.cidsStrings.`skein1024-608` = "skein1024-608".asInstanceOf[typings.cids.cidsStrings.`skein1024-608`]
    
    inline def `skein1024-616`: typings.cids.cidsStrings.`skein1024-616` = "skein1024-616".asInstanceOf[typings.cids.cidsStrings.`skein1024-616`]
    
    inline def `skein1024-624`: typings.cids.cidsStrings.`skein1024-624` = "skein1024-624".asInstanceOf[typings.cids.cidsStrings.`skein1024-624`]
    
    inline def `skein1024-632`: typings.cids.cidsStrings.`skein1024-632` = "skein1024-632".asInstanceOf[typings.cids.cidsStrings.`skein1024-632`]
    
    inline def `skein1024-64`: typings.cids.cidsStrings.`skein1024-64` = "skein1024-64".asInstanceOf[typings.cids.cidsStrings.`skein1024-64`]
    
    inline def `skein1024-640`: typings.cids.cidsStrings.`skein1024-640` = "skein1024-640".asInstanceOf[typings.cids.cidsStrings.`skein1024-640`]
    
    inline def `skein1024-648`: typings.cids.cidsStrings.`skein1024-648` = "skein1024-648".asInstanceOf[typings.cids.cidsStrings.`skein1024-648`]
    
    inline def `skein1024-656`: typings.cids.cidsStrings.`skein1024-656` = "skein1024-656".asInstanceOf[typings.cids.cidsStrings.`skein1024-656`]
    
    inline def `skein1024-664`: typings.cids.cidsStrings.`skein1024-664` = "skein1024-664".asInstanceOf[typings.cids.cidsStrings.`skein1024-664`]
    
    inline def `skein1024-672`: typings.cids.cidsStrings.`skein1024-672` = "skein1024-672".asInstanceOf[typings.cids.cidsStrings.`skein1024-672`]
    
    inline def `skein1024-680`: typings.cids.cidsStrings.`skein1024-680` = "skein1024-680".asInstanceOf[typings.cids.cidsStrings.`skein1024-680`]
    
    inline def `skein1024-688`: typings.cids.cidsStrings.`skein1024-688` = "skein1024-688".asInstanceOf[typings.cids.cidsStrings.`skein1024-688`]
    
    inline def `skein1024-696`: typings.cids.cidsStrings.`skein1024-696` = "skein1024-696".asInstanceOf[typings.cids.cidsStrings.`skein1024-696`]
    
    inline def `skein1024-704`: typings.cids.cidsStrings.`skein1024-704` = "skein1024-704".asInstanceOf[typings.cids.cidsStrings.`skein1024-704`]
    
    inline def `skein1024-712`: typings.cids.cidsStrings.`skein1024-712` = "skein1024-712".asInstanceOf[typings.cids.cidsStrings.`skein1024-712`]
    
    inline def `skein1024-72`: typings.cids.cidsStrings.`skein1024-72` = "skein1024-72".asInstanceOf[typings.cids.cidsStrings.`skein1024-72`]
    
    inline def `skein1024-720`: typings.cids.cidsStrings.`skein1024-720` = "skein1024-720".asInstanceOf[typings.cids.cidsStrings.`skein1024-720`]
    
    inline def `skein1024-728`: typings.cids.cidsStrings.`skein1024-728` = "skein1024-728".asInstanceOf[typings.cids.cidsStrings.`skein1024-728`]
    
    inline def `skein1024-736`: typings.cids.cidsStrings.`skein1024-736` = "skein1024-736".asInstanceOf[typings.cids.cidsStrings.`skein1024-736`]
    
    inline def `skein1024-744`: typings.cids.cidsStrings.`skein1024-744` = "skein1024-744".asInstanceOf[typings.cids.cidsStrings.`skein1024-744`]
    
    inline def `skein1024-752`: typings.cids.cidsStrings.`skein1024-752` = "skein1024-752".asInstanceOf[typings.cids.cidsStrings.`skein1024-752`]
    
    inline def `skein1024-760`: typings.cids.cidsStrings.`skein1024-760` = "skein1024-760".asInstanceOf[typings.cids.cidsStrings.`skein1024-760`]
    
    inline def `skein1024-768`: typings.cids.cidsStrings.`skein1024-768` = "skein1024-768".asInstanceOf[typings.cids.cidsStrings.`skein1024-768`]
    
    inline def `skein1024-776`: typings.cids.cidsStrings.`skein1024-776` = "skein1024-776".asInstanceOf[typings.cids.cidsStrings.`skein1024-776`]
    
    inline def `skein1024-784`: typings.cids.cidsStrings.`skein1024-784` = "skein1024-784".asInstanceOf[typings.cids.cidsStrings.`skein1024-784`]
    
    inline def `skein1024-792`: typings.cids.cidsStrings.`skein1024-792` = "skein1024-792".asInstanceOf[typings.cids.cidsStrings.`skein1024-792`]
    
    inline def `skein1024-8`: typings.cids.cidsStrings.`skein1024-8` = "skein1024-8".asInstanceOf[typings.cids.cidsStrings.`skein1024-8`]
    
    inline def `skein1024-80`: typings.cids.cidsStrings.`skein1024-80` = "skein1024-80".asInstanceOf[typings.cids.cidsStrings.`skein1024-80`]
    
    inline def `skein1024-800`: typings.cids.cidsStrings.`skein1024-800` = "skein1024-800".asInstanceOf[typings.cids.cidsStrings.`skein1024-800`]
    
    inline def `skein1024-808`: typings.cids.cidsStrings.`skein1024-808` = "skein1024-808".asInstanceOf[typings.cids.cidsStrings.`skein1024-808`]
    
    inline def `skein1024-816`: typings.cids.cidsStrings.`skein1024-816` = "skein1024-816".asInstanceOf[typings.cids.cidsStrings.`skein1024-816`]
    
    inline def `skein1024-824`: typings.cids.cidsStrings.`skein1024-824` = "skein1024-824".asInstanceOf[typings.cids.cidsStrings.`skein1024-824`]
    
    inline def `skein1024-832`: typings.cids.cidsStrings.`skein1024-832` = "skein1024-832".asInstanceOf[typings.cids.cidsStrings.`skein1024-832`]
    
    inline def `skein1024-840`: typings.cids.cidsStrings.`skein1024-840` = "skein1024-840".asInstanceOf[typings.cids.cidsStrings.`skein1024-840`]
    
    inline def `skein1024-848`: typings.cids.cidsStrings.`skein1024-848` = "skein1024-848".asInstanceOf[typings.cids.cidsStrings.`skein1024-848`]
    
    inline def `skein1024-856`: typings.cids.cidsStrings.`skein1024-856` = "skein1024-856".asInstanceOf[typings.cids.cidsStrings.`skein1024-856`]
    
    inline def `skein1024-864`: typings.cids.cidsStrings.`skein1024-864` = "skein1024-864".asInstanceOf[typings.cids.cidsStrings.`skein1024-864`]
    
    inline def `skein1024-872`: typings.cids.cidsStrings.`skein1024-872` = "skein1024-872".asInstanceOf[typings.cids.cidsStrings.`skein1024-872`]
    
    inline def `skein1024-88`: typings.cids.cidsStrings.`skein1024-88` = "skein1024-88".asInstanceOf[typings.cids.cidsStrings.`skein1024-88`]
    
    inline def `skein1024-880`: typings.cids.cidsStrings.`skein1024-880` = "skein1024-880".asInstanceOf[typings.cids.cidsStrings.`skein1024-880`]
    
    inline def `skein1024-888`: typings.cids.cidsStrings.`skein1024-888` = "skein1024-888".asInstanceOf[typings.cids.cidsStrings.`skein1024-888`]
    
    inline def `skein1024-896`: typings.cids.cidsStrings.`skein1024-896` = "skein1024-896".asInstanceOf[typings.cids.cidsStrings.`skein1024-896`]
    
    inline def `skein1024-904`: typings.cids.cidsStrings.`skein1024-904` = "skein1024-904".asInstanceOf[typings.cids.cidsStrings.`skein1024-904`]
    
    inline def `skein1024-912`: typings.cids.cidsStrings.`skein1024-912` = "skein1024-912".asInstanceOf[typings.cids.cidsStrings.`skein1024-912`]
    
    inline def `skein1024-920`: typings.cids.cidsStrings.`skein1024-920` = "skein1024-920".asInstanceOf[typings.cids.cidsStrings.`skein1024-920`]
    
    inline def `skein1024-928`: typings.cids.cidsStrings.`skein1024-928` = "skein1024-928".asInstanceOf[typings.cids.cidsStrings.`skein1024-928`]
    
    inline def `skein1024-936`: typings.cids.cidsStrings.`skein1024-936` = "skein1024-936".asInstanceOf[typings.cids.cidsStrings.`skein1024-936`]
    
    inline def `skein1024-944`: typings.cids.cidsStrings.`skein1024-944` = "skein1024-944".asInstanceOf[typings.cids.cidsStrings.`skein1024-944`]
    
    inline def `skein1024-952`: typings.cids.cidsStrings.`skein1024-952` = "skein1024-952".asInstanceOf[typings.cids.cidsStrings.`skein1024-952`]
    
    inline def `skein1024-96`: typings.cids.cidsStrings.`skein1024-96` = "skein1024-96".asInstanceOf[typings.cids.cidsStrings.`skein1024-96`]
    
    inline def `skein1024-960`: typings.cids.cidsStrings.`skein1024-960` = "skein1024-960".asInstanceOf[typings.cids.cidsStrings.`skein1024-960`]
    
    inline def `skein1024-968`: typings.cids.cidsStrings.`skein1024-968` = "skein1024-968".asInstanceOf[typings.cids.cidsStrings.`skein1024-968`]
    
    inline def `skein1024-976`: typings.cids.cidsStrings.`skein1024-976` = "skein1024-976".asInstanceOf[typings.cids.cidsStrings.`skein1024-976`]
    
    inline def `skein1024-984`: typings.cids.cidsStrings.`skein1024-984` = "skein1024-984".asInstanceOf[typings.cids.cidsStrings.`skein1024-984`]
    
    inline def `skein1024-992`: typings.cids.cidsStrings.`skein1024-992` = "skein1024-992".asInstanceOf[typings.cids.cidsStrings.`skein1024-992`]
    
    inline def `skein256-104`: typings.cids.cidsStrings.`skein256-104` = "skein256-104".asInstanceOf[typings.cids.cidsStrings.`skein256-104`]
    
    inline def `skein256-112`: typings.cids.cidsStrings.`skein256-112` = "skein256-112".asInstanceOf[typings.cids.cidsStrings.`skein256-112`]
    
    inline def `skein256-120`: typings.cids.cidsStrings.`skein256-120` = "skein256-120".asInstanceOf[typings.cids.cidsStrings.`skein256-120`]
    
    inline def `skein256-128`: typings.cids.cidsStrings.`skein256-128` = "skein256-128".asInstanceOf[typings.cids.cidsStrings.`skein256-128`]
    
    inline def `skein256-136`: typings.cids.cidsStrings.`skein256-136` = "skein256-136".asInstanceOf[typings.cids.cidsStrings.`skein256-136`]
    
    inline def `skein256-144`: typings.cids.cidsStrings.`skein256-144` = "skein256-144".asInstanceOf[typings.cids.cidsStrings.`skein256-144`]
    
    inline def `skein256-152`: typings.cids.cidsStrings.`skein256-152` = "skein256-152".asInstanceOf[typings.cids.cidsStrings.`skein256-152`]
    
    inline def `skein256-16`: typings.cids.cidsStrings.`skein256-16` = "skein256-16".asInstanceOf[typings.cids.cidsStrings.`skein256-16`]
    
    inline def `skein256-160`: typings.cids.cidsStrings.`skein256-160` = "skein256-160".asInstanceOf[typings.cids.cidsStrings.`skein256-160`]
    
    inline def `skein256-168`: typings.cids.cidsStrings.`skein256-168` = "skein256-168".asInstanceOf[typings.cids.cidsStrings.`skein256-168`]
    
    inline def `skein256-176`: typings.cids.cidsStrings.`skein256-176` = "skein256-176".asInstanceOf[typings.cids.cidsStrings.`skein256-176`]
    
    inline def `skein256-184`: typings.cids.cidsStrings.`skein256-184` = "skein256-184".asInstanceOf[typings.cids.cidsStrings.`skein256-184`]
    
    inline def `skein256-192`: typings.cids.cidsStrings.`skein256-192` = "skein256-192".asInstanceOf[typings.cids.cidsStrings.`skein256-192`]
    
    inline def `skein256-200`: typings.cids.cidsStrings.`skein256-200` = "skein256-200".asInstanceOf[typings.cids.cidsStrings.`skein256-200`]
    
    inline def `skein256-208`: typings.cids.cidsStrings.`skein256-208` = "skein256-208".asInstanceOf[typings.cids.cidsStrings.`skein256-208`]
    
    inline def `skein256-216`: typings.cids.cidsStrings.`skein256-216` = "skein256-216".asInstanceOf[typings.cids.cidsStrings.`skein256-216`]
    
    inline def `skein256-224`: typings.cids.cidsStrings.`skein256-224` = "skein256-224".asInstanceOf[typings.cids.cidsStrings.`skein256-224`]
    
    inline def `skein256-232`: typings.cids.cidsStrings.`skein256-232` = "skein256-232".asInstanceOf[typings.cids.cidsStrings.`skein256-232`]
    
    inline def `skein256-24`: typings.cids.cidsStrings.`skein256-24` = "skein256-24".asInstanceOf[typings.cids.cidsStrings.`skein256-24`]
    
    inline def `skein256-240`: typings.cids.cidsStrings.`skein256-240` = "skein256-240".asInstanceOf[typings.cids.cidsStrings.`skein256-240`]
    
    inline def `skein256-248`: typings.cids.cidsStrings.`skein256-248` = "skein256-248".asInstanceOf[typings.cids.cidsStrings.`skein256-248`]
    
    inline def `skein256-256`: typings.cids.cidsStrings.`skein256-256` = "skein256-256".asInstanceOf[typings.cids.cidsStrings.`skein256-256`]
    
    inline def `skein256-32`: typings.cids.cidsStrings.`skein256-32` = "skein256-32".asInstanceOf[typings.cids.cidsStrings.`skein256-32`]
    
    inline def `skein256-40`: typings.cids.cidsStrings.`skein256-40` = "skein256-40".asInstanceOf[typings.cids.cidsStrings.`skein256-40`]
    
    inline def `skein256-48`: typings.cids.cidsStrings.`skein256-48` = "skein256-48".asInstanceOf[typings.cids.cidsStrings.`skein256-48`]
    
    inline def `skein256-56`: typings.cids.cidsStrings.`skein256-56` = "skein256-56".asInstanceOf[typings.cids.cidsStrings.`skein256-56`]
    
    inline def `skein256-64`: typings.cids.cidsStrings.`skein256-64` = "skein256-64".asInstanceOf[typings.cids.cidsStrings.`skein256-64`]
    
    inline def `skein256-72`: typings.cids.cidsStrings.`skein256-72` = "skein256-72".asInstanceOf[typings.cids.cidsStrings.`skein256-72`]
    
    inline def `skein256-8`: typings.cids.cidsStrings.`skein256-8` = "skein256-8".asInstanceOf[typings.cids.cidsStrings.`skein256-8`]
    
    inline def `skein256-80`: typings.cids.cidsStrings.`skein256-80` = "skein256-80".asInstanceOf[typings.cids.cidsStrings.`skein256-80`]
    
    inline def `skein256-88`: typings.cids.cidsStrings.`skein256-88` = "skein256-88".asInstanceOf[typings.cids.cidsStrings.`skein256-88`]
    
    inline def `skein256-96`: typings.cids.cidsStrings.`skein256-96` = "skein256-96".asInstanceOf[typings.cids.cidsStrings.`skein256-96`]
    
    inline def `skein512-104`: typings.cids.cidsStrings.`skein512-104` = "skein512-104".asInstanceOf[typings.cids.cidsStrings.`skein512-104`]
    
    inline def `skein512-112`: typings.cids.cidsStrings.`skein512-112` = "skein512-112".asInstanceOf[typings.cids.cidsStrings.`skein512-112`]
    
    inline def `skein512-120`: typings.cids.cidsStrings.`skein512-120` = "skein512-120".asInstanceOf[typings.cids.cidsStrings.`skein512-120`]
    
    inline def `skein512-128`: typings.cids.cidsStrings.`skein512-128` = "skein512-128".asInstanceOf[typings.cids.cidsStrings.`skein512-128`]
    
    inline def `skein512-136`: typings.cids.cidsStrings.`skein512-136` = "skein512-136".asInstanceOf[typings.cids.cidsStrings.`skein512-136`]
    
    inline def `skein512-144`: typings.cids.cidsStrings.`skein512-144` = "skein512-144".asInstanceOf[typings.cids.cidsStrings.`skein512-144`]
    
    inline def `skein512-152`: typings.cids.cidsStrings.`skein512-152` = "skein512-152".asInstanceOf[typings.cids.cidsStrings.`skein512-152`]
    
    inline def `skein512-16`: typings.cids.cidsStrings.`skein512-16` = "skein512-16".asInstanceOf[typings.cids.cidsStrings.`skein512-16`]
    
    inline def `skein512-160`: typings.cids.cidsStrings.`skein512-160` = "skein512-160".asInstanceOf[typings.cids.cidsStrings.`skein512-160`]
    
    inline def `skein512-168`: typings.cids.cidsStrings.`skein512-168` = "skein512-168".asInstanceOf[typings.cids.cidsStrings.`skein512-168`]
    
    inline def `skein512-176`: typings.cids.cidsStrings.`skein512-176` = "skein512-176".asInstanceOf[typings.cids.cidsStrings.`skein512-176`]
    
    inline def `skein512-184`: typings.cids.cidsStrings.`skein512-184` = "skein512-184".asInstanceOf[typings.cids.cidsStrings.`skein512-184`]
    
    inline def `skein512-192`: typings.cids.cidsStrings.`skein512-192` = "skein512-192".asInstanceOf[typings.cids.cidsStrings.`skein512-192`]
    
    inline def `skein512-200`: typings.cids.cidsStrings.`skein512-200` = "skein512-200".asInstanceOf[typings.cids.cidsStrings.`skein512-200`]
    
    inline def `skein512-208`: typings.cids.cidsStrings.`skein512-208` = "skein512-208".asInstanceOf[typings.cids.cidsStrings.`skein512-208`]
    
    inline def `skein512-216`: typings.cids.cidsStrings.`skein512-216` = "skein512-216".asInstanceOf[typings.cids.cidsStrings.`skein512-216`]
    
    inline def `skein512-224`: typings.cids.cidsStrings.`skein512-224` = "skein512-224".asInstanceOf[typings.cids.cidsStrings.`skein512-224`]
    
    inline def `skein512-232`: typings.cids.cidsStrings.`skein512-232` = "skein512-232".asInstanceOf[typings.cids.cidsStrings.`skein512-232`]
    
    inline def `skein512-24`: typings.cids.cidsStrings.`skein512-24` = "skein512-24".asInstanceOf[typings.cids.cidsStrings.`skein512-24`]
    
    inline def `skein512-240`: typings.cids.cidsStrings.`skein512-240` = "skein512-240".asInstanceOf[typings.cids.cidsStrings.`skein512-240`]
    
    inline def `skein512-248`: typings.cids.cidsStrings.`skein512-248` = "skein512-248".asInstanceOf[typings.cids.cidsStrings.`skein512-248`]
    
    inline def `skein512-256`: typings.cids.cidsStrings.`skein512-256` = "skein512-256".asInstanceOf[typings.cids.cidsStrings.`skein512-256`]
    
    inline def `skein512-264`: typings.cids.cidsStrings.`skein512-264` = "skein512-264".asInstanceOf[typings.cids.cidsStrings.`skein512-264`]
    
    inline def `skein512-272`: typings.cids.cidsStrings.`skein512-272` = "skein512-272".asInstanceOf[typings.cids.cidsStrings.`skein512-272`]
    
    inline def `skein512-280`: typings.cids.cidsStrings.`skein512-280` = "skein512-280".asInstanceOf[typings.cids.cidsStrings.`skein512-280`]
    
    inline def `skein512-288`: typings.cids.cidsStrings.`skein512-288` = "skein512-288".asInstanceOf[typings.cids.cidsStrings.`skein512-288`]
    
    inline def `skein512-296`: typings.cids.cidsStrings.`skein512-296` = "skein512-296".asInstanceOf[typings.cids.cidsStrings.`skein512-296`]
    
    inline def `skein512-304`: typings.cids.cidsStrings.`skein512-304` = "skein512-304".asInstanceOf[typings.cids.cidsStrings.`skein512-304`]
    
    inline def `skein512-312`: typings.cids.cidsStrings.`skein512-312` = "skein512-312".asInstanceOf[typings.cids.cidsStrings.`skein512-312`]
    
    inline def `skein512-32`: typings.cids.cidsStrings.`skein512-32` = "skein512-32".asInstanceOf[typings.cids.cidsStrings.`skein512-32`]
    
    inline def `skein512-320`: typings.cids.cidsStrings.`skein512-320` = "skein512-320".asInstanceOf[typings.cids.cidsStrings.`skein512-320`]
    
    inline def `skein512-328`: typings.cids.cidsStrings.`skein512-328` = "skein512-328".asInstanceOf[typings.cids.cidsStrings.`skein512-328`]
    
    inline def `skein512-336`: typings.cids.cidsStrings.`skein512-336` = "skein512-336".asInstanceOf[typings.cids.cidsStrings.`skein512-336`]
    
    inline def `skein512-344`: typings.cids.cidsStrings.`skein512-344` = "skein512-344".asInstanceOf[typings.cids.cidsStrings.`skein512-344`]
    
    inline def `skein512-352`: typings.cids.cidsStrings.`skein512-352` = "skein512-352".asInstanceOf[typings.cids.cidsStrings.`skein512-352`]
    
    inline def `skein512-360`: typings.cids.cidsStrings.`skein512-360` = "skein512-360".asInstanceOf[typings.cids.cidsStrings.`skein512-360`]
    
    inline def `skein512-368`: typings.cids.cidsStrings.`skein512-368` = "skein512-368".asInstanceOf[typings.cids.cidsStrings.`skein512-368`]
    
    inline def `skein512-376`: typings.cids.cidsStrings.`skein512-376` = "skein512-376".asInstanceOf[typings.cids.cidsStrings.`skein512-376`]
    
    inline def `skein512-384`: typings.cids.cidsStrings.`skein512-384` = "skein512-384".asInstanceOf[typings.cids.cidsStrings.`skein512-384`]
    
    inline def `skein512-392`: typings.cids.cidsStrings.`skein512-392` = "skein512-392".asInstanceOf[typings.cids.cidsStrings.`skein512-392`]
    
    inline def `skein512-40`: typings.cids.cidsStrings.`skein512-40` = "skein512-40".asInstanceOf[typings.cids.cidsStrings.`skein512-40`]
    
    inline def `skein512-400`: typings.cids.cidsStrings.`skein512-400` = "skein512-400".asInstanceOf[typings.cids.cidsStrings.`skein512-400`]
    
    inline def `skein512-408`: typings.cids.cidsStrings.`skein512-408` = "skein512-408".asInstanceOf[typings.cids.cidsStrings.`skein512-408`]
    
    inline def `skein512-416`: typings.cids.cidsStrings.`skein512-416` = "skein512-416".asInstanceOf[typings.cids.cidsStrings.`skein512-416`]
    
    inline def `skein512-424`: typings.cids.cidsStrings.`skein512-424` = "skein512-424".asInstanceOf[typings.cids.cidsStrings.`skein512-424`]
    
    inline def `skein512-432`: typings.cids.cidsStrings.`skein512-432` = "skein512-432".asInstanceOf[typings.cids.cidsStrings.`skein512-432`]
    
    inline def `skein512-440`: typings.cids.cidsStrings.`skein512-440` = "skein512-440".asInstanceOf[typings.cids.cidsStrings.`skein512-440`]
    
    inline def `skein512-448`: typings.cids.cidsStrings.`skein512-448` = "skein512-448".asInstanceOf[typings.cids.cidsStrings.`skein512-448`]
    
    inline def `skein512-456`: typings.cids.cidsStrings.`skein512-456` = "skein512-456".asInstanceOf[typings.cids.cidsStrings.`skein512-456`]
    
    inline def `skein512-464`: typings.cids.cidsStrings.`skein512-464` = "skein512-464".asInstanceOf[typings.cids.cidsStrings.`skein512-464`]
    
    inline def `skein512-472`: typings.cids.cidsStrings.`skein512-472` = "skein512-472".asInstanceOf[typings.cids.cidsStrings.`skein512-472`]
    
    inline def `skein512-48`: typings.cids.cidsStrings.`skein512-48` = "skein512-48".asInstanceOf[typings.cids.cidsStrings.`skein512-48`]
    
    inline def `skein512-480`: typings.cids.cidsStrings.`skein512-480` = "skein512-480".asInstanceOf[typings.cids.cidsStrings.`skein512-480`]
    
    inline def `skein512-488`: typings.cids.cidsStrings.`skein512-488` = "skein512-488".asInstanceOf[typings.cids.cidsStrings.`skein512-488`]
    
    inline def `skein512-496`: typings.cids.cidsStrings.`skein512-496` = "skein512-496".asInstanceOf[typings.cids.cidsStrings.`skein512-496`]
    
    inline def `skein512-504`: typings.cids.cidsStrings.`skein512-504` = "skein512-504".asInstanceOf[typings.cids.cidsStrings.`skein512-504`]
    
    inline def `skein512-512`: typings.cids.cidsStrings.`skein512-512` = "skein512-512".asInstanceOf[typings.cids.cidsStrings.`skein512-512`]
    
    inline def `skein512-56`: typings.cids.cidsStrings.`skein512-56` = "skein512-56".asInstanceOf[typings.cids.cidsStrings.`skein512-56`]
    
    inline def `skein512-64`: typings.cids.cidsStrings.`skein512-64` = "skein512-64".asInstanceOf[typings.cids.cidsStrings.`skein512-64`]
    
    inline def `skein512-72`: typings.cids.cidsStrings.`skein512-72` = "skein512-72".asInstanceOf[typings.cids.cidsStrings.`skein512-72`]
    
    inline def `skein512-8`: typings.cids.cidsStrings.`skein512-8` = "skein512-8".asInstanceOf[typings.cids.cidsStrings.`skein512-8`]
    
    inline def `skein512-80`: typings.cids.cidsStrings.`skein512-80` = "skein512-80".asInstanceOf[typings.cids.cidsStrings.`skein512-80`]
    
    inline def `skein512-88`: typings.cids.cidsStrings.`skein512-88` = "skein512-88".asInstanceOf[typings.cids.cidsStrings.`skein512-88`]
    
    inline def `skein512-96`: typings.cids.cidsStrings.`skein512-96` = "skein512-96".asInstanceOf[typings.cids.cidsStrings.`skein512-96`]
    
    inline def `skynet-ns`: typings.cids.cidsStrings.`skynet-ns` = "skynet-ns".asInstanceOf[typings.cids.cidsStrings.`skynet-ns`]
    
    inline def `sm3-256`: typings.cids.cidsStrings.`sm3-256` = "sm3-256".asInstanceOf[typings.cids.cidsStrings.`sm3-256`]
    
    inline def `stellar-block`: typings.cids.cidsStrings.`stellar-block` = "stellar-block".asInstanceOf[typings.cids.cidsStrings.`stellar-block`]
    
    inline def `stellar-tx`: typings.cids.cidsStrings.`stellar-tx` = "stellar-tx".asInstanceOf[typings.cids.cidsStrings.`stellar-tx`]
    
    inline def `swarm-feed`: typings.cids.cidsStrings.`swarm-feed` = "swarm-feed".asInstanceOf[typings.cids.cidsStrings.`swarm-feed`]
    
    inline def `swarm-manifest`: typings.cids.cidsStrings.`swarm-manifest` = "swarm-manifest".asInstanceOf[typings.cids.cidsStrings.`swarm-manifest`]
    
    inline def `swarm-ns`: typings.cids.cidsStrings.`swarm-ns` = "swarm-ns".asInstanceOf[typings.cids.cidsStrings.`swarm-ns`]
    
    inline def tcp: typings.cids.cidsStrings.tcp = "tcp".asInstanceOf[typings.cids.cidsStrings.tcp]
    
    inline def thread: typings.cids.cidsStrings.thread = "thread".asInstanceOf[typings.cids.cidsStrings.thread]
    
    inline def tls: typings.cids.cidsStrings.tls = "tls".asInstanceOf[typings.cids.cidsStrings.tls]
    
    inline def `torrent-file`: typings.cids.cidsStrings.`torrent-file` = "torrent-file".asInstanceOf[typings.cids.cidsStrings.`torrent-file`]
    
    inline def `torrent-info`: typings.cids.cidsStrings.`torrent-info` = "torrent-info".asInstanceOf[typings.cids.cidsStrings.`torrent-info`]
    
    inline def udp: typings.cids.cidsStrings.udp = "udp".asInstanceOf[typings.cids.cidsStrings.udp]
    
    inline def udt: typings.cids.cidsStrings.udt = "udt".asInstanceOf[typings.cids.cidsStrings.udt]
    
    inline def unix: typings.cids.cidsStrings.unix = "unix".asInstanceOf[typings.cids.cidsStrings.unix]
    
    inline def utp: typings.cids.cidsStrings.utp = "utp".asInstanceOf[typings.cids.cidsStrings.utp]
    
    inline def ws: typings.cids.cidsStrings.ws = "ws".asInstanceOf[typings.cids.cidsStrings.ws]
    
    inline def wss: typings.cids.cidsStrings.wss = "wss".asInstanceOf[typings.cids.cidsStrings.wss]
    
    inline def x11: typings.cids.cidsStrings.x11 = "x11".asInstanceOf[typings.cids.cidsStrings.x11]
    
    inline def `x25519-pub`: typings.cids.cidsStrings.`x25519-pub` = "x25519-pub".asInstanceOf[typings.cids.cidsStrings.`x25519-pub`]
    
    inline def `x448-pub`: typings.cids.cidsStrings.`x448-pub` = "x448-pub".asInstanceOf[typings.cids.cidsStrings.`x448-pub`]
    
    inline def `zcash-block`: typings.cids.cidsStrings.`zcash-block` = "zcash-block".asInstanceOf[typings.cids.cidsStrings.`zcash-block`]
    
    inline def `zcash-tx`: typings.cids.cidsStrings.`zcash-tx` = "zcash-tx".asInstanceOf[typings.cids.cidsStrings.`zcash-tx`]
    
    inline def zeronet: typings.cids.cidsStrings.zeronet = "zeronet".asInstanceOf[typings.cids.cidsStrings.zeronet]
    
    inline def `zeroxcert-imprint-256`: typings.cids.cidsStrings.`zeroxcert-imprint-256` = "zeroxcert-imprint-256".asInstanceOf[typings.cids.cidsStrings.`zeroxcert-imprint-256`]
  }
  
  trait SerializedCID extends StObject {
    
    var codec: String
    
    var hash: js.typedarray.Uint8Array
    
    var version: Double
  }
  object SerializedCID {
    
    inline def apply(codec: String, hash: js.typedarray.Uint8Array, version: Double): SerializedCID = {
      val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedCID]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedCID] (val x: Self) extends AnyVal {
      
      inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setHash(value: js.typedarray.Uint8Array): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
