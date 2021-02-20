package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurriedFn4[A, B, C, D, R] extends StObject {
  
  def apply(a: A): CurriedFn3[B, C, D, R] = js.native
  def apply(a: A, b: B): CurriedFn2[C, D, R] = js.native
  def apply(a: A, b: B, c: C): CurriedFn1[D, R] = js.native
  def apply(a: A, b: B, c: C, d: D): R = js.native
}
