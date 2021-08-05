package typings.coinstring

import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("coinstring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDecoder(version: Double): js.Function2[/* base58str */ String, /* version */ js.UndefOr[Double | Buffer], Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoder")(version.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* base58str */ String, /* version */ js.UndefOr[Double | Buffer], Buffer]]
  
  inline def createEncoder(version: Double): js.Function2[
    /* payload */ Buffer | js.Array[Double] | Uint8Array, 
    /* version */ js.UndefOr[Double | Buffer], 
    String
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncoder")(version.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* payload */ Buffer | js.Array[Double] | Uint8Array, 
    /* version */ js.UndefOr[Double | Buffer], 
    String
  ]]
  
  inline def createValidator(version: Double): js.Function2[/* base58str */ String, /* version */ js.UndefOr[Double | Buffer], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createValidator")(version.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* base58str */ String, /* version */ js.UndefOr[Double | Buffer], Boolean]]
  
  inline def decode(base58str: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(base58str.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def decode(base58str: String, version: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(base58str.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def decode(base58str: String, version: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(base58str.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encode(payload: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(payload: js.Array[Double], version: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(payload: js.Array[Double], version: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(payload: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(payload: Buffer, version: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(payload: Buffer, version: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(payload: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(payload: Uint8Array, version: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(payload: Uint8Array, version: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isValid(base58str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(base58str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(base58str: String, version: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(base58str.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValid(base58str: String, version: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(base58str.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
