package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable3
import typings.ethers.mod.ethers.FixedNumber
import typings.ethersprojectBignumber.libBignumberMod.BigNumber
import typings.ethersprojectBignumber.libBignumberMod.BigNumberish
import typings.ethersprojectBignumber.libFixednumberMod.FixedFormat
import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFixedNumber
  extends StObject
     with Instantiable3[/* constructorGuard */ Any, /* hex */ String, /* value */ String, FixedNumber] {
  
  def from(value: Any): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def from(value: Any, format: String): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def from(value: Any, format: Double): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def from(value: Any, format: FixedFormat): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  
  def fromBytes(value: BytesLike): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: String): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: Double): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: FixedFormat): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  
  def fromString(value: String): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: String): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: Double): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: FixedFormat): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  
  def fromValue(value: BigNumber): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: Unit, format: String): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: Unit, format: Double): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: Unit, format: FixedFormat): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: BigNumberish): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: BigNumberish, format: String): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: BigNumberish, format: Double): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: BigNumberish, format: FixedFormat): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  
  def isFixedNumber(value: Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = js.native
}
