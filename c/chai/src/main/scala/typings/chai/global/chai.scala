package typings.chai.global

import org.scalablytyped.runtime.TopLevel
import typings.chai.Chai.ChaiStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chai")
@js.native
object chai extends TopLevel[ChaiStatic] {
  
  @js.native
  class AssertionError protected ()
    extends typings.chai.Chai.AssertionError {
    def this(message: String) = this()
    def this(message: String, _props: js.Any) = this()
    def this(message: String, _props: js.UndefOr[scala.Nothing], ssf: js.Function) = this()
    def this(message: String, _props: js.Any, ssf: js.Function) = this()
  }
}
