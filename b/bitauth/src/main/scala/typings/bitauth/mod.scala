package typings.bitauth

import typings.bitauth.anon.Created
import typings.express.mod.RequestHandler
import typings.node.cryptoMod.BinaryLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bitauth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(password: BinaryLike, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(password.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encrypt(password: BinaryLike, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(password.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateSin(): Created = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSin")().asInstanceOf[Created]
  
  inline def getPublicKeyFromPrivateKey(privkey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFromPrivateKey")(privkey.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getPublicKeyFromPrivateKey(privkey: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFromPrivateKey")(privkey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSinFromPublicKey(pubkey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSinFromPublicKey")(pubkey.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getSinFromPublicKey(pubkey: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSinFromPublicKey")(pubkey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("bitauth", "middleware")
  @js.native
  val middleware: RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = js.native
  
  inline def sign(data: String, privkey: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(data.asInstanceOf[js.Any], privkey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def sign(data: String, privkey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(data.asInstanceOf[js.Any], privkey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def sign(data: js.typedarray.Uint8Array, privkey: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(data.asInstanceOf[js.Any], privkey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def sign(data: js.typedarray.Uint8Array, privkey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(data.asInstanceOf[js.Any], privkey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def validateSin(sin: String): Boolean | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSin")(sin.asInstanceOf[js.Any]).asInstanceOf[Boolean | Unit]
  inline def validateSin(sin: String, callback: callback): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateSin")(sin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  
  inline def verifySignature(data: String, pubkey: String, hexsignature: String): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(data: String, pubkey: String, hexsignature: String, callback: callback): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(data: String, pubkey: String, hexsignature: js.typedarray.Uint8Array): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(data: String, pubkey: String, hexsignature: js.typedarray.Uint8Array, callback: callback): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(data: String, pubkey: js.typedarray.Uint8Array, hexsignature: String): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(data: String, pubkey: js.typedarray.Uint8Array, hexsignature: String, callback: callback): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(data: String, pubkey: js.typedarray.Uint8Array, hexsignature: js.typedarray.Uint8Array): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(
    data: String,
    pubkey: js.typedarray.Uint8Array,
    hexsignature: js.typedarray.Uint8Array,
    callback: callback
  ): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(data: js.typedarray.Uint8Array, pubkey: String, hexsignature: String): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(data: js.typedarray.Uint8Array, pubkey: String, hexsignature: String, callback: callback): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(data: js.typedarray.Uint8Array, pubkey: String, hexsignature: js.typedarray.Uint8Array): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(
    data: js.typedarray.Uint8Array,
    pubkey: String,
    hexsignature: js.typedarray.Uint8Array,
    callback: callback
  ): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(data: js.typedarray.Uint8Array, pubkey: js.typedarray.Uint8Array, hexsignature: String): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(
    data: js.typedarray.Uint8Array,
    pubkey: js.typedarray.Uint8Array,
    hexsignature: String,
    callback: callback
  ): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(
    data: js.typedarray.Uint8Array,
    pubkey: js.typedarray.Uint8Array,
    hexsignature: js.typedarray.Uint8Array
  ): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def verifySignature(
    data: js.typedarray.Uint8Array,
    pubkey: js.typedarray.Uint8Array,
    hexsignature: js.typedarray.Uint8Array,
    callback: callback
  ): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(data.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], hexsignature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  
  type callback = js.Function2[/* err */ js.UndefOr[js.Error], /* valid */ js.UndefOr[Boolean], Any]
}
