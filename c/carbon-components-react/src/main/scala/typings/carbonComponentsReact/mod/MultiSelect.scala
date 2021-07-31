package typings.carbonComponentsReact.mod

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.filterableMultiSelectMod.default
import typings.carbonComponentsReact.typingsSharedMod.ListBoxBaseItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultiSelect extends Shortcut {
  
  @JSImport("carbon-components-react", "MultiSelect")
  @js.native
  val ^ : typings.carbonComponentsReact.multiSelectMultiSelectMod.MultiSelect[String] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("carbon-components-react", "MultiSelect.Filterable")
  @js.native
  class Filterable[T /* <: ListBoxBaseItemType */] () extends default[T]
  
  type _To = typings.carbonComponentsReact.multiSelectMultiSelectMod.MultiSelect[String]
  
  /* This means you don't have to write `^`, but can instead just say `MultiSelect.foo` */
  override def _to: typings.carbonComponentsReact.multiSelectMultiSelectMod.MultiSelect[String] = ^
}
