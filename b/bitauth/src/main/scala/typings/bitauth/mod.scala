package typings.bitauth

import typings.bitauth.anon.Created
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.cryptoMod.BinaryLike
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bitauth", "decrypt")
  @js.native
  def decrypt(password: BinaryLike, str: String): String = js.native
  
  @JSImport("bitauth", "encrypt")
  @js.native
  def encrypt(password: BinaryLike, str: String): String = js.native
  
  @JSImport("bitauth", "generateSin")
  @js.native
  def generateSin(): Created = js.native
  
  @JSImport("bitauth", "getPublicKeyFromPrivateKey")
  @js.native
  def getPublicKeyFromPrivateKey(privkey: String): String = js.native
  @JSImport("bitauth", "getPublicKeyFromPrivateKey")
  @js.native
  def getPublicKeyFromPrivateKey(privkey: Uint8Array): String = js.native
  
  @JSImport("bitauth", "getSinFromPublicKey")
  @js.native
  def getSinFromPublicKey(pubkey: String): String = js.native
  @JSImport("bitauth", "getSinFromPublicKey")
  @js.native
  def getSinFromPublicKey(pubkey: Uint8Array): String = js.native
  
  @JSImport("bitauth", "middleware")
  @js.native
  def middleware(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("bitauth", "sign")
  @js.native
  def sign(data: String, privkey: String): Uint8Array = js.native
  @JSImport("bitauth", "sign")
  @js.native
  def sign(data: String, privkey: Uint8Array): Uint8Array = js.native
  @JSImport("bitauth", "sign")
  @js.native
  def sign(data: Uint8Array, privkey: String): Uint8Array = js.native
  @JSImport("bitauth", "sign")
  @js.native
  def sign(data: Uint8Array, privkey: Uint8Array): Uint8Array = js.native
  
  @JSImport("bitauth", "validateSin")
  @js.native
  def validateSin(sin: String): Boolean | Unit = js.native
  @JSImport("bitauth", "validateSin")
  @js.native
  def validateSin(sin: String, callback: callback): Boolean | Unit = js.native
  
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: String, hexsignature: String): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: String, hexsignature: String, callback: callback): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: String, hexsignature: Uint8Array): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: String, hexsignature: Uint8Array, callback: callback): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: Uint8Array, hexsignature: String): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: Uint8Array, hexsignature: String, callback: callback): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: Uint8Array, hexsignature: Uint8Array): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: Uint8Array, hexsignature: Uint8Array, callback: callback): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: Uint8Array, pubkey: String, hexsignature: String): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: Uint8Array, pubkey: String, hexsignature: String, callback: callback): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: Uint8Array, pubkey: String, hexsignature: Uint8Array): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: Uint8Array, pubkey: String, hexsignature: Uint8Array, callback: callback): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: Uint8Array, pubkey: Uint8Array, hexsignature: String): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: Uint8Array, pubkey: Uint8Array, hexsignature: String, callback: callback): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: Uint8Array, pubkey: Uint8Array, hexsignature: Uint8Array): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: Uint8Array, pubkey: Uint8Array, hexsignature: Uint8Array, callback: callback): Boolean | Unit = js.native
  
  type callback = js.Function2[/* err */ js.UndefOr[Error], /* valid */ js.UndefOr[Boolean], js.Any]
}
