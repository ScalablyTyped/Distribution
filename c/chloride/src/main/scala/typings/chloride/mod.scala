package typings.chloride

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chloride", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cryptoAuth(data: Buffer, key: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def cryptoAuthVerify(signed: Buffer, data: Buffer, key: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_verify")(signed.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoBoxEasy(data: Buffer, nonce: Buffer, publicKey: Buffer, secretKey: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(data.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def cryptoBoxKeypair(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_keypair")().asInstanceOf[KeyPair]
  
  inline def cryptoBoxOpenEasy(boxed: Buffer, nonce: Buffer, publicKey: Buffer, secretKey: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(boxed.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def cryptoBoxSeedKeypair(seed: Buffer): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seed_keypair")(seed.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def cryptoHash(plainText: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(plainText.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def cryptoHashSha256(plainText: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256")(plainText.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def cryptoScalarmult(secretKey: Buffer, publicKey: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult")(secretKey.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def cryptoSecretboxEasy(plainText: Buffer, nonce: Buffer, key: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(plainText.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def cryptoSecretboxOpenEasy(encrypted: Buffer, nonce: Buffer, key: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(encrypted.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def cryptoSign(message: Buffer, secretKey: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def cryptoSignDetached(message: Buffer, secretKey: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def cryptoSignEd25519PkToCurve25519(publicKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def cryptoSignEd25519SkToCurve25519(secretKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(secretKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def cryptoSignKeypair(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_keypair")().asInstanceOf[KeyPair]
  
  inline def cryptoSignOpen(signed: Buffer, publicKey: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signed.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def cryptoSignSeedKeypair(seed: Buffer): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_seed_keypair")(seed.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def cryptoSignVerifyDetached(signed: Buffer, message: Buffer, publicKey: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_verify_detached")(signed.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def randombytes(buf: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("randombytes")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait KeyPair extends StObject {
    
    var publicKey: Buffer
    
    var secretKey: Buffer
  }
  object KeyPair {
    
    inline def apply(publicKey: Buffer, secretKey: Buffer): KeyPair = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPair]
    }
    
    extension [Self <: KeyPair](x: Self) {
      
      inline def setPublicKey(value: Buffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKey(value: Buffer): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
}
