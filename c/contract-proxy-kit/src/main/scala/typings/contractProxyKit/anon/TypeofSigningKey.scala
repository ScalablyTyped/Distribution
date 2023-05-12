package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typings.ethers.mod.ethers.SigningKey
import typings.ethers.typesCryptoSignatureMod.SignatureLike
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSigningKey
  extends StObject
     with Instantiable1[/* privateKey */ BytesLike, SigningKey] {
  
  /**
    *  Returns the point resulting from adding the ellipic curve points
    *  %%p0%% and %%p1%%.
    *
    *  This is not a common function most developers should require, but
    *  can be useful for certain privacy-specific techniques.
    *
    *  For example, it is used by [[HDNodeWallet]] to compute child
    *  addresses from parent public keys and chain codes.
    */
  def addPoints(p0: BytesLike, p1: BytesLike): String = js.native
  def addPoints(p0: BytesLike, p1: BytesLike, compressed: Boolean): String = js.native
  
  /**
    *  Compute the public key for %%key%%, optionally %%compressed%%.
    *
    *  The %%key%% may be any type of key, a raw public key, a
    *  compressed/uncompressed public key or private key.
    *
    *  @example:
    *    sign = new SigningKey(id("some-secret"));
    *
    *    // Compute the uncompressed public key for a private key
    *    SigningKey.computePublicKey(sign.privateKey)
    *    //_result:
    *
    *    // Compute the compressed public key for a private key
    *    SigningKey.computePublicKey(sign.privateKey, true)
    *    //_result:
    *
    *    // Compute the uncompressed public key
    *    SigningKey.computePublicKey(sign.publicKey, false);
    *    //_result:
    *
    *    // Compute the Compressed a public key
    *    SigningKey.computePublicKey(sign.publicKey, true);
    *    //_result:
    */
  def computePublicKey(key: BytesLike): String = js.native
  def computePublicKey(key: BytesLike, compressed: Boolean): String = js.native
  
  /**
    *  Returns the public key for the private key which produced the
    *  %%signature%% for the given %%digest%%.
    *
    *  @example:
    *    key = new SigningKey(id("some-secret"))
    *    digest = id("hello world")
    *    sig = key.sign(digest)
    *
    *    // Notice the signer public key...
    *    key.publicKey
    *    //_result:
    *
    *    // ...is equal to the recovered public key
    *    SigningKey.recoverPublicKey(digest, sig)
    *    //_result:
    *
    */
  def recoverPublicKey(digest: BytesLike, signature: SignatureLike): String = js.native
}
