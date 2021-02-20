package typings.chai

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai", JSImport.Namespace)
  @js.native
  val ^ : ChaiStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("chai", "Assertion")
  @js.native
  class Assertion protected ()
    extends typings.chai.Chai.Assertion {
    def this(target: js.Any) = this()
    def this(target: js.Any, message: String) = this()
    def this(target: js.Any, message: js.UndefOr[scala.Nothing], ssfi: js.Function) = this()
    def this(target: js.Any, message: String, ssfi: js.Function) = this()
    def this(
      target: js.Any,
      message: js.UndefOr[scala.Nothing],
      ssfi: js.UndefOr[scala.Nothing],
      lockSsfi: Boolean
    ) = this()
    def this(target: js.Any, message: js.UndefOr[scala.Nothing], ssfi: js.Function, lockSsfi: Boolean) = this()
    def this(target: js.Any, message: String, ssfi: js.UndefOr[scala.Nothing], lockSsfi: Boolean) = this()
    def this(target: js.Any, message: String, ssfi: js.Function, lockSsfi: Boolean) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("chai", "AssertionError")
  @js.native
  class AssertionError protected ()
    extends typings.chai.Chai.AssertionError {
    def this(message: String) = this()
    def this(message: String, _props: js.Any) = this()
    def this(message: String, _props: js.UndefOr[scala.Nothing], ssf: js.Function) = this()
    def this(message: String, _props: js.Any, ssf: js.Function) = this()
  }
  
  type _To = ChaiStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiStatic = ^
}
