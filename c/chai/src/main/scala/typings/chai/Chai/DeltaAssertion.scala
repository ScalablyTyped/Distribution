package typings.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeltaAssertion
  extends StObject
     with Assertion {
  
  def by(delta: Double): Assertion = js.native
  def by(delta: Double, msg: String): Assertion = js.native
}
