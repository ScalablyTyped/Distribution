package typings.contractProxyKit

import org.scalablytyped.runtime.Instantiable0
import typings.contractProxyKit.contractProxyKitStrings.Ξ
import typings.ethers.AnonFrom
import typings.ethers.abiCoderMod.AbiCoder
import typings.ethers.typesMod.Arrayish
import typings.ethers.typesMod.BigNumber
import typings.ethers.typesMod.BigNumberish
import typings.ethers.typesMod.ConnectionInfo
import typings.ethers.typesMod.EventFragment
import typings.ethers.typesMod.FunctionFragment
import typings.ethers.typesMod.Network
import typings.ethers.typesMod.Networkish
import typings.ethers.typesMod.ParamType
import typings.ethers.typesMod.Signature
import typings.ethers.typesMod.Transaction
import typings.ethers.typesMod.UnsignedTransaction
import typings.ethers.utf8Mod.UnicodeNormalizationForm
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofutils extends js.Object {
  var AbiCoder: Instantiable0[typings.ethers.mod.ethers.utils.AbiCoder] = js.native
  val RLP: TypeofRLP = js.native
  val base64: Typeofbase64 = js.native
  val constants: AnonHashZero = js.native
  val defaultAbiCoder: AbiCoder = js.native
  val errors: Typeoferrors = js.native
  val etherSymbol: Ξ = js.native
  val types: Typeoftypes = js.native
  def arrayify(value: Arrayish): Uint8Array = js.native
  def arrayify(value: BigNumber): Uint8Array = js.native
  def bigNumberify(value: BigNumberish): BigNumber = js.native
  def computePublicKey(key: Arrayish): String = js.native
  def computePublicKey(key: Arrayish, compressed: Boolean): String = js.native
  def concat(objects: js.Array[Arrayish]): Uint8Array = js.native
  def defineFrozen(`object`: js.Any, name: String, value: js.Any): Unit = js.native
  def defineReadOnly(`object`: js.Any, name: String, value: js.Any): Unit = js.native
  def fetchJson(connection: String, json: String, processFunc: js.Function1[/* value */ js.Any, _]): js.Promise[_] = js.native
  def fetchJson(connection: ConnectionInfo, json: String, processFunc: js.Function1[/* value */ js.Any, _]): js.Promise[_] = js.native
  def formatEther(wei: BigNumberish): String = js.native
  def formatEther(wei: BigNumberish, options: js.Any): String = js.native
  def formatParamType(paramType: ParamType): String = js.native
  def formatSignature(fragment: EventFragment): String = js.native
  def formatSignature(fragment: FunctionFragment): String = js.native
  def formatUnits(value: BigNumberish): String = js.native
  def formatUnits(value: BigNumberish, unitType: String): String = js.native
  def formatUnits(value: BigNumberish, unitType: String, options: js.Any): String = js.native
  def formatUnits(value: BigNumberish, unitType: Double): String = js.native
  def formatUnits(value: BigNumberish, unitType: Double, options: js.Any): String = js.native
  def getAddress(address: String): String = js.native
  def getContractAddress(transaction: AnonFrom): String = js.native
  def getIcapAddress(address: String): String = js.native
  def getJsonWalletAddress(json: String): String = js.native
  def getNetwork(network: Networkish): Network = js.native
  def hashMessage(message: String): String = js.native
  def hashMessage(message: Arrayish): String = js.native
  def hexDataLength(data: String): Double = js.native
  def hexDataSlice(data: String, offset: Double): String = js.native
  def hexDataSlice(data: String, offset: Double, length: Double): String = js.native
  def hexStripZeros(value: String): String = js.native
  def hexZeroPad(value: String, length: Double): String = js.native
  def hexlify(value: Double): String = js.native
  def hexlify(value: Arrayish): String = js.native
  def hexlify(value: BigNumber): String = js.native
  def id(text: String): String = js.native
  def joinSignature(signature: Signature): String = js.native
  def keccak256(data: Arrayish): String = js.native
  def namehash(name: String): String = js.native
  def padZeros(value: Arrayish, length: Double): Uint8Array = js.native
  def parseEther(ether: String): BigNumber = js.native
  def parseParamType(`type`: String): ParamType = js.native
  def parseSignature(fragment: String): EventFragment | FunctionFragment = js.native
  def parseTransaction(rawTransaction: Arrayish): Transaction = js.native
  def parseUnits(value: String): BigNumber = js.native
  def parseUnits(value: String, unitType: String): BigNumber = js.native
  def parseUnits(value: String, unitType: Double): BigNumber = js.native
  def randomBytes(length: Double): Uint8Array = js.native
  def resolveProperties(`object`: js.Any): js.Promise[_] = js.native
  def serializeTransaction(transaction: UnsignedTransaction): String = js.native
  def serializeTransaction(transaction: UnsignedTransaction, signature: Arrayish): String = js.native
  def serializeTransaction(transaction: UnsignedTransaction, signature: Signature): String = js.native
  def sha256(data: Arrayish): String = js.native
  def shallowCopy(`object`: js.Any): js.Any = js.native
  def solidityKeccak256(types: js.Array[String], values: js.Array[_]): String = js.native
  def solidityPack(types: js.Array[String], values: js.Array[_]): String = js.native
  def soliditySha256(types: js.Array[String], values: js.Array[_]): String = js.native
  def splitSignature(signature: Arrayish): Signature = js.native
  def splitSignature(signature: Signature): Signature = js.native
  def stripZeros(value: Arrayish): Uint8Array = js.native
  def toUtf8Bytes(str: String): Uint8Array = js.native
  def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): Uint8Array = js.native
  def toUtf8String(bytes: Arrayish): String = js.native
  def verifyMessage(message: String, signature: String): String = js.native
  def verifyMessage(message: String, signature: Signature): String = js.native
  def verifyMessage(message: Arrayish, signature: String): String = js.native
  def verifyMessage(message: Arrayish, signature: Signature): String = js.native
}

