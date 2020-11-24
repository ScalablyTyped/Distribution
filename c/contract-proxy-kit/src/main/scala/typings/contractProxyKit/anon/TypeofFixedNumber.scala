package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable3
import typings.ethers.mod.ethers.FixedNumber
import typings.ethersprojectBignumber.bignumberMod.BigNumber
import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBignumber.fixednumberMod.FixedFormat
import typings.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFixedNumber
  extends Instantiable3[/* constructorGuard */ js.Any, /* hex */ String, /* value */ String, FixedNumber] {
  
  def from(value: js.Any): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def from(value: js.Any, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def from(value: js.Any, format: FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def fromBytes(value: BytesLike): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def fromString(value: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def fromValue(value: BigNumber): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: js.UndefOr[BigNumberish], format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: js.UndefOr[BigNumberish], format: FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: BigNumberish): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def isFixedNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = js.native
}
