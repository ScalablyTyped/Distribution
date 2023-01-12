package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/overflow-menu/overflow-menu.OverflowMenuOptions> */
trait PartialOverflowMenuOption extends StObject {
  
  var classMenuFlip: js.UndefOr[String] = js.undefined
  
  var classMenuShown: js.UndefOr[String] = js.undefined
  
  var classShown: js.UndefOr[String] = js.undefined
  
  var objMenuOffset: js.UndefOr[
    js.Function3[
      /* menuBody */ typings.std.Element, 
      /* direction */ String, 
      /* trigger */ typings.std.Element, 
      js.UndefOr[Left]
    ]
  ] = js.undefined
  
  var objMenuOffsetFlip: js.UndefOr[
    js.Function3[
      /* menuBody */ typings.std.Element, 
      /* direction */ String, 
      /* trigger */ typings.std.Element, 
      js.UndefOr[Left]
    ]
  ] = js.undefined
  
  var selectorContent: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
  
  var selectorItem: js.UndefOr[String] = js.undefined
  
  var selectorOptionMenu: js.UndefOr[String] = js.undefined
  
  var selectorTrigger: js.UndefOr[String] = js.undefined
}
object PartialOverflowMenuOption {
  
  inline def apply(): PartialOverflowMenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverflowMenuOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialOverflowMenuOption] (val x: Self) extends AnyVal {
    
    inline def setClassMenuFlip(value: String): Self = StObject.set(x, "classMenuFlip", value.asInstanceOf[js.Any])
    
    inline def setClassMenuFlipUndefined: Self = StObject.set(x, "classMenuFlip", js.undefined)
    
    inline def setClassMenuShown(value: String): Self = StObject.set(x, "classMenuShown", value.asInstanceOf[js.Any])
    
    inline def setClassMenuShownUndefined: Self = StObject.set(x, "classMenuShown", js.undefined)
    
    inline def setClassShown(value: String): Self = StObject.set(x, "classShown", value.asInstanceOf[js.Any])
    
    inline def setClassShownUndefined: Self = StObject.set(x, "classShown", js.undefined)
    
    inline def setObjMenuOffset(
      value: (/* menuBody */ typings.std.Element, /* direction */ String, /* trigger */ typings.std.Element) => js.UndefOr[Left]
    ): Self = StObject.set(x, "objMenuOffset", js.Any.fromFunction3(value))
    
    inline def setObjMenuOffsetFlip(
      value: (/* menuBody */ typings.std.Element, /* direction */ String, /* trigger */ typings.std.Element) => js.UndefOr[Left]
    ): Self = StObject.set(x, "objMenuOffsetFlip", js.Any.fromFunction3(value))
    
    inline def setObjMenuOffsetFlipUndefined: Self = StObject.set(x, "objMenuOffsetFlip", js.undefined)
    
    inline def setObjMenuOffsetUndefined: Self = StObject.set(x, "objMenuOffset", js.undefined)
    
    inline def setSelectorContent(value: String): Self = StObject.set(x, "selectorContent", value.asInstanceOf[js.Any])
    
    inline def setSelectorContentUndefined: Self = StObject.set(x, "selectorContent", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
    
    inline def setSelectorItem(value: String): Self = StObject.set(x, "selectorItem", value.asInstanceOf[js.Any])
    
    inline def setSelectorItemUndefined: Self = StObject.set(x, "selectorItem", js.undefined)
    
    inline def setSelectorOptionMenu(value: String): Self = StObject.set(x, "selectorOptionMenu", value.asInstanceOf[js.Any])
    
    inline def setSelectorOptionMenuUndefined: Self = StObject.set(x, "selectorOptionMenu", js.undefined)
    
    inline def setSelectorTrigger(value: String): Self = StObject.set(x, "selectorTrigger", value.asInstanceOf[js.Any])
    
    inline def setSelectorTriggerUndefined: Self = StObject.set(x, "selectorTrigger", js.undefined)
  }
}
