package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable4
import typings.contractProxyKit.contractProxyKitInts.`27`
import typings.contractProxyKit.contractProxyKitInts.`28`
import typings.ethers.mod.ethers.Signature
import typings.ethers.typesCryptoSignatureMod.SignatureLike
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSignature
  extends StObject
     with Instantiable4[/* guard */ Any, /* r */ String, /* s */ String, /* v */ `27` | `28`, Signature] {
  
  /**
    *  Creates a new [[Signature]].
    *
    *  If no %%sig%% is provided, a new [[Signature]] is created
    *  with default values.
    *
    *  If %%sig%% is a string, it is parsed.
    */
  def from(): typings.ethers.typesCryptoSignatureMod.Signature = js.native
  def from(sig: SignatureLike): typings.ethers.typesCryptoSignatureMod.Signature = js.native
  
  /**
    *  Compute the chain ID from the ``v`` in a legacy EIP-155 transactions.
    *
    *  @example:
    *    Signature.getChainId(45)
    *    //_result:
    *
    *    Signature.getChainId(46)
    *    //_result:
    */
  def getChainId(v: BigNumberish): js.BigInt = js.native
  
  /**
    *  Compute the ``v`` for a chain ID for a legacy EIP-155 transactions.
    *
    *  Legacy transactions which use [[link-eip-155]] hijack the ``v``
    *  property to include the chain ID.
    *
    *  @example:
    *    Signature.getChainIdV(5, 27)
    *    //_result:
    *
    *    Signature.getChainIdV(5, 28)
    *    //_result:
    *
    */
  def getChainIdV(chainId: BigNumberish, v: `27` | `28`): js.BigInt = js.native
  
  /**
    *  Compute the normalized legacy transaction ``v`` from a ``yParirty``,
    *  a legacy transaction ``v`` or a legacy [[link-eip-155]] transaction.
    *
    *  @example:
    *    // The values 0 and 1 imply v is actually yParity
    *    Signature.getNormalizedV(0)
    *    //_result:
    *
    *    // Legacy non-EIP-1559 transaction (i.e. 27 or 28)
    *    Signature.getNormalizedV(27)
    *    //_result:
    *
    *    // Legacy EIP-155 transaction (i.e. >= 35)
    *    Signature.getNormalizedV(46)
    *    //_result:
    *
    *    // Invalid values throw
    *    Signature.getNormalizedV(5)
    *    //_error:
    */
  def getNormalizedV(v: BigNumberish): `27` | `28` = js.native
}
