package typings.dateFnsTz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurriedFn2[A, B, R] extends StObject {
  
  def apply[A](a: A): CurriedFn1[B, R] = js.native
  def apply[A, B](a: A, b: B): R = js.native
}
