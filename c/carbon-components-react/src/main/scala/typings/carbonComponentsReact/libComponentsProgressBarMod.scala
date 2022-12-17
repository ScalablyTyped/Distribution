package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsProgressBarProgressBarMod.ProgressBarProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsProgressBarMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/ProgressBar", JSImport.Default)
  @js.native
  val default: FC[ProgressBarProps] = js.native
  
  type _To = FC[ProgressBarProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsProgressBarMod.foo` */
  override def _to: FC[ProgressBarProps] = default
}
