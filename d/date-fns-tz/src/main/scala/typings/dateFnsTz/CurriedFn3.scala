package typings.dateFnsTz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurriedFn3[A, B, C, R] extends StObject {
  
  def apply[A](a: A): CurriedFn2[B, C, R] = js.native
  def apply[A, B](a: A, b: B): CurriedFn1[C, R] = js.native
  def apply[A, B, C](a: A, b: B, c: C): R = js.native
}
