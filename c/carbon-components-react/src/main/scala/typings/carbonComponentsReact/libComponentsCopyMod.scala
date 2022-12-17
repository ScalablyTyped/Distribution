package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsCopyCopyMod.CopyProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCopyMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Copy", JSImport.Default)
  @js.native
  val default: FC[CopyProps] = js.native
  
  type _To = FC[CopyProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsCopyMod.foo` */
  override def _to: FC[CopyProps] = default
}
