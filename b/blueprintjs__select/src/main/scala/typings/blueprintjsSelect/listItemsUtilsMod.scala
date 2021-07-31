package typings.blueprintjsSelect

import typings.blueprintjsSelect.blueprintjsSelectStrings.`blueprint-create-new-item`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemsUtilsMod {
  
  @JSImport("@blueprintjs/select/lib/esm/common/listItemsUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getActiveItem[T](): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveItem")().asInstanceOf[T | Null]
  @scala.inline
  def getActiveItem[T](activeItem: T): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveItem")(activeItem.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  @scala.inline
  def getActiveItem[T](activeItem: ICreateNewItem): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveItem")(activeItem.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  
  @scala.inline
  def getCreateNewItem(): ICreateNewItem = ^.asInstanceOf[js.Dynamic].applyDynamic("getCreateNewItem")().asInstanceOf[ICreateNewItem]
  
  @scala.inline
  def isCreateNewItem[T](): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateNewItem")().asInstanceOf[/* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean]
  @scala.inline
  def isCreateNewItem[T](item: T): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateNewItem")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean]
  @scala.inline
  def isCreateNewItem[T](item: ICreateNewItem): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateNewItem")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean]
  
  trait ICreateNewItem extends StObject {
    
    var __blueprintCreateNewItemBrand: `blueprint-create-new-item`
  }
  object ICreateNewItem {
    
    @scala.inline
    def apply(): ICreateNewItem = {
      val __obj = js.Dynamic.literal(__blueprintCreateNewItemBrand = "blueprint-create-new-item")
      __obj.asInstanceOf[ICreateNewItem]
    }
    
    @scala.inline
    implicit class ICreateNewItemMutableBuilder[Self <: ICreateNewItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__blueprintCreateNewItemBrand(value: `blueprint-create-new-item`): Self = StObject.set(x, "__blueprintCreateNewItemBrand", value.asInstanceOf[js.Any])
    }
  }
}
