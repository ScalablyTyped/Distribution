package typings.cypress.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Match extends StObject {
  
  def apply(regexp: js.RegExp): Assertion = js.native
  def apply(regexp: js.RegExp, message: String): Assertion = js.native
  def apply(selector: String): Assertion = js.native
}
