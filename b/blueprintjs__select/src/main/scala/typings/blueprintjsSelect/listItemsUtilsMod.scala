package typings.blueprintjsSelect

import typings.blueprintjsSelect.blueprintjsSelectStrings.`blueprint-create-new-item`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemsUtilsMod {
  
  @JSImport("@blueprintjs/select/lib/esm/common/listItemsUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getActiveItem[T](): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveItem")().asInstanceOf[T | Null]
  inline def getActiveItem[T](activeItem: T): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveItem")(activeItem.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  inline def getActiveItem[T](activeItem: CreateNewItem): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveItem")(activeItem.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  
  inline def getCreateNewItem(): CreateNewItem = ^.asInstanceOf[js.Dynamic].applyDynamic("getCreateNewItem")().asInstanceOf[CreateNewItem]
  
  inline def isCreateNewItem[T](): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.CreateNewItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateNewItem")().asInstanceOf[/* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.CreateNewItem */ Boolean]
  inline def isCreateNewItem[T](item: T): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.CreateNewItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateNewItem")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.CreateNewItem */ Boolean]
  inline def isCreateNewItem[T](item: CreateNewItem): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.CreateNewItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateNewItem")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.CreateNewItem */ Boolean]
  
  trait CreateNewItem extends StObject {
    
    var __blueprintCreateNewItemBrand: `blueprint-create-new-item`
  }
  object CreateNewItem {
    
    inline def apply(): CreateNewItem = {
      val __obj = js.Dynamic.literal(__blueprintCreateNewItemBrand = "blueprint-create-new-item")
      __obj.asInstanceOf[CreateNewItem]
    }
    
    extension [Self <: CreateNewItem](x: Self) {
      
      inline def set__blueprintCreateNewItemBrand(value: `blueprint-create-new-item`): Self = StObject.set(x, "__blueprintCreateNewItemBrand", value.asInstanceOf[js.Any])
    }
  }
  
  type ICreateNewItem = CreateNewItem
}
