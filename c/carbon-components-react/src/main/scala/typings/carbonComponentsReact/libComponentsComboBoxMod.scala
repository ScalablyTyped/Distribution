package typings.carbonComponentsReact

import typings.carbonComponentsReact.libComponentsComboBoxComboBoxMod.ComboBoxProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefProps
import typings.std.Extract
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsComboBoxMod {
  
  @JSImport("carbon-components-react/lib/components/ComboBox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](props: ForwardRefProps[HTMLInputElement, ComboBoxProps[T, Extract[T, js.Object]]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
}
