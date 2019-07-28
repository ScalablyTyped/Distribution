package typings.cuint.cuintMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UintConstructor[T /* <: Uint */]
  extends Instantiable2[(/* low */ Double) | (/* text */ String), /* high */ Double, T]
     with // called as a constructor:
// tslint:disable-next-line:unified-signatures
Instantiable1[(/* low */ Double) | (/* text */ String), T] {
  // called as a function:
  def apply(low: Double): T = js.native
  def apply(low: Double, high: Double): T = js.native
  // tslint:disable-next-line:unified-signatures
  def apply(text: String): T = js.native
  def apply(text: String, radix: Double): T = js.native
}

