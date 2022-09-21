package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unorderedListUnorderedListMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UnorderedList/UnorderedList", JSImport.Default)
  @js.native
  val default: FC[UnorderedListProps] = js.native
  
  trait UnorderedListProps
    extends StObject
       with HTMLAttributes[HTMLUListElement] {
    
    var isExpressive: js.UndefOr[Boolean] = js.undefined
    
    var nested: js.UndefOr[Boolean] = js.undefined
  }
  object UnorderedListProps {
    
    inline def apply(): UnorderedListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnorderedListProps]
    }
    
    extension [Self <: UnorderedListProps](x: Self) {
      
      inline def setIsExpressive(value: Boolean): Self = StObject.set(x, "isExpressive", value.asInstanceOf[js.Any])
      
      inline def setIsExpressiveUndefined: Self = StObject.set(x, "isExpressive", js.undefined)
      
      inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    }
  }
  
  type _To = FC[UnorderedListProps]
  
  /* This means you don't have to write `default`, but can instead just say `unorderedListUnorderedListMod.foo` */
  override def _to: FC[UnorderedListProps] = default
}
