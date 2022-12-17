package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsLoadingLoadingMod.LoadingProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsLoadingMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Loading", JSImport.Default)
  @js.native
  val default: FC[LoadingProps] = js.native
  
  type _To = FC[LoadingProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsLoadingMod.foo` */
  override def _to: FC[LoadingProps] = default
}
