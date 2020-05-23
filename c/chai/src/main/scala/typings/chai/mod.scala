package typings.chai

import org.scalablytyped.runtime.TopLevel
import typings.chai.Chai.ChaiStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chai", JSImport.Namespace)
@js.native
object mod extends TopLevel[ChaiStatic] {
  @js.native
  class AssertionError protected ()
    extends typings.chai.Chai.AssertionError {
    def this(message: String) = this()
    def this(message: String, _props: js.Any) = this()
    def this(message: String, _props: js.Any, ssf: js.Function) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var showDiff: Boolean = js.native
    /* CompleteClass */
    override var stack: String = js.native
  }
  
}

