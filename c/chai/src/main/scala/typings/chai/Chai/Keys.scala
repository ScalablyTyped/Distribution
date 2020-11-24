package typings.chai.Chai

import typings.chai.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keys extends js.Object {
  
  def apply(keys: String*): Assertion = js.native
  def apply(keys: js.Array[_]): Assertion = js.native
  def apply(keys: Object): Assertion = js.native
}
