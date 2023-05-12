package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable3
import typings.ethers.mod.ethers.FixedNumber
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsFixednumberMod.FixedFormat
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFixedNumber
  extends StObject
     with Instantiable3[/* guard */ Any, /* value */ js.BigInt, /* format */ Any, FixedNumber] {
  
  /**
    *  Creates a new [[FixedNumber]] with the big-endian representation
    *  %%value%% with %%format%%.
    *
    *  This will throw a [[NumericFaultError]] if %%value%% cannot fit
    *  in %%format%% due to overflow.
    */
  def fromBytes(_value: BytesLike): typings.ethers.typesUtilsFixednumberMod.FixedNumber = js.native
  def fromBytes(_value: BytesLike, _format: FixedFormat): typings.ethers.typesUtilsFixednumberMod.FixedNumber = js.native
  
  /**
    *  Creates a new [[FixedNumber]] for %%value%% with %%format%%.
    *
    *  This will throw a [[NumericFaultError]] if %%value%% cannot fit
    *  in %%format%%, either due to overflow or underflow (precision loss).
    */
  def fromString(_value: String): typings.ethers.typesUtilsFixednumberMod.FixedNumber = js.native
  def fromString(_value: String, _format: FixedFormat): typings.ethers.typesUtilsFixednumberMod.FixedNumber = js.native
  
  /**
    *  Creates a new [[FixedNumber]] for %%value%% divided by
    *  %%decimal%% places with %%format%%.
    *
    *  This will throw a [[NumericFaultError]] if %%value%% (once adjusted
    *  for %%decimals%%) cannot fit in %%format%%, either due to overflow
    *  or underflow (precision loss).
    */
  def fromValue(_value: BigNumberish): typings.ethers.typesUtilsFixednumberMod.FixedNumber = js.native
  def fromValue(_value: BigNumberish, decimals: Double): typings.ethers.typesUtilsFixednumberMod.FixedNumber = js.native
  def fromValue(_value: BigNumberish, decimals: Double, _format: FixedFormat): typings.ethers.typesUtilsFixednumberMod.FixedNumber = js.native
  def fromValue(_value: BigNumberish, decimals: Unit, _format: FixedFormat): typings.ethers.typesUtilsFixednumberMod.FixedNumber = js.native
}
