package typings.chai.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Length
  extends LanguageChains
     with NumericComparison {
  
  def apply(length: Double): Assertion = js.native
  def apply(length: Double, message: String): Assertion = js.native
}
