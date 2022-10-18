package typings.cypress.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Should
  extends StObject
     with ShouldAssertion {
  
  def fail(): scala.Nothing = js.native
  def fail(actual: Any, expected: Any): scala.Nothing = js.native
  def fail(actual: Any, expected: Any, message: String): scala.Nothing = js.native
  def fail(actual: Any, expected: Any, message: String, operator: Operator): scala.Nothing = js.native
  def fail(actual: Any, expected: Any, message: Unit, operator: Operator): scala.Nothing = js.native
  def fail(message: String): scala.Nothing = js.native
  
  var not: ShouldAssertion = js.native
}
