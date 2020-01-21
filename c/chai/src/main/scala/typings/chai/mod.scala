package typings.chai

import org.scalablytyped.runtime.TopLevel
import typings.chai.Chai_.ChaiStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chai", JSImport.Namespace)
@js.native
object mod extends TopLevel[ChaiStatic] {
  @js.native
  class AssertionError protected ()
    extends typings.chai.Chai_.AssertionError {
    def this(message: String) = this()
    def this(message: String, _props: js.Any) = this()
    def this(message: String, _props: js.Any, ssf: js.Function) = this()
  }
  
}

