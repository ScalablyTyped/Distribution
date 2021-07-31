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
    
    var nested: js.UndefOr[Boolean] = js.undefined
  }
  object UnorderedListProps {
    
    @scala.inline
    def apply(): UnorderedListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnorderedListProps]
    }
    
    @scala.inline
    implicit class UnorderedListPropsMutableBuilder[Self <: UnorderedListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    }
  }
  
  type _To = FC[UnorderedListProps]
  
  /* This means you don't have to write `default`, but can instead just say `unorderedListUnorderedListMod.foo` */
  override def _to: FC[UnorderedListProps] = default
}
