package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.unorderedListUnorderedListMod.UnorderedListProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unorderedListMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UnorderedList", JSImport.Default)
  @js.native
  val default: FC[UnorderedListProps] = js.native
  
  type _To = FC[UnorderedListProps]
  
  /* This means you don't have to write `default`, but can instead just say `unorderedListMod.foo` */
  override def _to: FC[UnorderedListProps] = default
}
