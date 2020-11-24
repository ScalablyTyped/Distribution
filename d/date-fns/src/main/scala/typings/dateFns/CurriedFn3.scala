package typings.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurriedFn3[A, B, C, R] extends js.Object {
  
  def apply(a: A): CurriedFn2[B, C, R] = js.native
  def apply(a: A, b: B): CurriedFn1[C, R] = js.native
  def apply(a: A, b: B, c: C): R = js.native
}
