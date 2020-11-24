package typings.chai

import typings.chai.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object extends js.Object {
  
  def should(`type`: String): Assertion = js.native
  def should(`type`: String, message: String): Assertion = js.native
  @JSName("should")
  var should_Original: Assertion = js.native
}
