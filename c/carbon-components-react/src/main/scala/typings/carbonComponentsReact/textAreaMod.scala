package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.textAreaTextAreaMod.TextAreaProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/TextArea", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLTextAreaElement, TextAreaProps] = js.native
  
  type _To = ForwardRefReturn[HTMLTextAreaElement, TextAreaProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaMod.foo` */
  override def _to: ForwardRefReturn[HTMLTextAreaElement, TextAreaProps] = default
}
