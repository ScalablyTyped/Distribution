package typings.bitcoinComputerBitcore.mod.Bitcoin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoin-computer-bitcore", "Bitcoin.Unit")
@js.native
open class Unit protected () extends StObject {
  def this(amount: Double, unitPreference: String) = this()
  
  def toBTC(): Double = js.native
  
  def toBits(): Double = js.native
  
  def toMilis(): Double = js.native
  
  def toSatoshis(): Double = js.native
}
object Unit {
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.Unit")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromBTC(amount: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBTC")(amount.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def fromBits(amount: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(amount.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def fromMilis(amount: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMilis")(amount.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def fromSatoshis(amount: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSatoshis")(amount.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
