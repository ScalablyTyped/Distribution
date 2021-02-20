package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurriedFn2[A, B, R] extends StObject {
  
  def apply(a: A): CurriedFn1[B, R] = js.native
  def apply(a: A, b: B): R = js.native
}
