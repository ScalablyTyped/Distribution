package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurriedFn3[A, B, C, R] extends StObject {
  
  def apply(a: A): CurriedFn2[B, C, R] = js.native
  def apply(a: A, b: B): CurriedFn1[C, R] = js.native
  def apply(a: A, b: B, c: C): R = js.native
}
