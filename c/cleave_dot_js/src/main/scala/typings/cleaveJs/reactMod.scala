package typings.cleaveJs

import org.scalablytyped.runtime.Shortcut
import typings.cleaveJs.propsMod.Props
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("cleave.js/react", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[Props, ComponentState, js.Any] {
    def this(props: Props) = this()
    def this(props: Props, context: js.Any) = this()
  }
  @JSImport("cleave.js/react", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (ComponentClass[Props, ComponentState]) = js.native
  
  type _To = js.Object & (ComponentClass[Props, ComponentState])
  
  /* This means you don't have to write `^`, but can instead just say `reactMod.foo` */
  override def _to: js.Object & (ComponentClass[Props, ComponentState]) = ^
}
