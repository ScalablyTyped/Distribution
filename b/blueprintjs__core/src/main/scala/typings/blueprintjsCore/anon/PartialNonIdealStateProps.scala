package typings.blueprintjsCore.anon

import typings.blueprintjsCore.blueprintjsCoreStrings.horizontal
import typings.blueprintjsCore.blueprintjsCoreStrings.vertical
import typings.blueprintjsCore.nonIdealStateMod.NonIdealStateIconSize
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.blueprintIcons16Mod.BlueprintIcons16Id
import typings.react.mod.ReactChild
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/non-ideal-state/nonIdealState.NonIdealStateProps> */
trait PartialNonIdealStateProps extends StObject {
  
  var action: js.UndefOr[Element] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[ReactChild] = js.undefined
  
  var icon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
  
  var iconSize: js.UndefOr[NonIdealStateIconSize] = js.undefined
  
  var layout: js.UndefOr[vertical | horizontal] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
}
object PartialNonIdealStateProps {
  
  inline def apply(): PartialNonIdealStateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNonIdealStateProps]
  }
  
  extension [Self <: PartialNonIdealStateProps](x: Self) {
    
    inline def setAction(value: Element): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDescription(value: ReactChild): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconSize(value: NonIdealStateIconSize): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLayout(value: vertical | horizontal): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
