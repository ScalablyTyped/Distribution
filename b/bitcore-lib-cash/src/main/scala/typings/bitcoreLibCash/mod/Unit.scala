package typings.bitcoreLibCash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "Unit")
@js.native
open class Unit protected () extends StObject {
  def this(amount: Double, unitPreference: String) = this()
  
  def toBTC(): Double = js.native
  
  def toBits(): Double = js.native
  
  def toMilis(): Double = js.native
  
  def toSatoshis(): Double = js.native
}
/* static members */
object Unit {
  
  @JSImport("bitcore-lib-cash", "Unit")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromBTC(amount: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBTC")(amount.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fromBits(amount: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(amount.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fromMilis(amount: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMilis")(amount.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fromSatoshis(amount: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSatoshis")(amount.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
