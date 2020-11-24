package typings.chai.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Chai")
@js.native
object Chai_ extends js.Object {
  
  @js.native
  class AssertionError protected ()
    extends typings.chai.Chai.AssertionError {
    def this(message: String) = this()
    def this(message: String, _props: js.Any) = this()
    def this(message: String, _props: js.UndefOr[scala.Nothing], ssf: js.Function) = this()
    def this(message: String, _props: js.Any, ssf: js.Function) = this()
  }
}
