package typings
package cuintLib.cuintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UintConstructor[T /* <: Uint */]
  extends org.scalablytyped.runtime.Instantiable2[(/* low */ scala.Double) | (/* text */ java.lang.String), /* high */ scala.Double, T]
     with // called as a constructor:
// tslint:disable-next-line:unified-signatures
org.scalablytyped.runtime.Instantiable1[(/* low */ scala.Double) | (/* text */ java.lang.String), T] {
  // called as a function:
  def apply(low: scala.Double): T = js.native
  def apply(low: scala.Double, high: scala.Double): T = js.native
  // tslint:disable-next-line:unified-signatures
  def apply(text: java.lang.String): T = js.native
  def apply(text: java.lang.String, radix: scala.Double): T = js.native
}

