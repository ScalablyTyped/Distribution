package typings.dateFnsTz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurriedFn4[A, B, C, D, R] extends StObject {
  
  def apply[A](a: A): CurriedFn3[B, C, D, R] = js.native
  def apply[A, B](a: A, b: B): CurriedFn2[C, D, R] = js.native
  def apply[A, B, C](a: A, b: B, c: C): CurriedFn1[D, R] = js.native
  def apply[A, B, C, D](a: A, b: B, c: C, d: D): R = js.native
}
