package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.multiSelectMultiSelectMod.MultiSelect
import typings.carbonComponentsReact.typingsSharedMod.ListBoxBaseItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSelectMod {
  
  object default extends Shortcut {
    
    @JSImport("carbon-components-react/lib/components/MultiSelect", JSImport.Default)
    @js.native
    val ^ : MultiSelect[String] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("carbon-components-react/lib/components/MultiSelect", "default.Filterable")
    @js.native
    class Filterable[T /* <: ListBoxBaseItemType */] ()
      extends typings.carbonComponentsReact.filterableMultiSelectMod.default[T]
    
    type _To = MultiSelect[String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: MultiSelect[String] = ^
  }
}
