package typings.blueprintjsSelect

import typings.blueprintjsSelect.blueprintjsSelectStrings.`blueprint-create-new-item`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemsUtilsMod {
  
  @JSImport("@blueprintjs/select/lib/esm/common/listItemsUtils", "getActiveItem")
  @js.native
  def getActiveItem[T](): T | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/common/listItemsUtils", "getActiveItem")
  @js.native
  def getActiveItem[T](activeItem: T): T | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/common/listItemsUtils", "getActiveItem")
  @js.native
  def getActiveItem[T](activeItem: ICreateNewItem): T | Null = js.native
  
  @JSImport("@blueprintjs/select/lib/esm/common/listItemsUtils", "getCreateNewItem")
  @js.native
  def getCreateNewItem(): ICreateNewItem = js.native
  
  @JSImport("@blueprintjs/select/lib/esm/common/listItemsUtils", "isCreateNewItem")
  @js.native
  def isCreateNewItem[T](): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  @JSImport("@blueprintjs/select/lib/esm/common/listItemsUtils", "isCreateNewItem")
  @js.native
  def isCreateNewItem[T](item: T): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  @JSImport("@blueprintjs/select/lib/esm/common/listItemsUtils", "isCreateNewItem")
  @js.native
  def isCreateNewItem[T](item: ICreateNewItem): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  
  @js.native
  trait ICreateNewItem extends StObject {
    
    var __blueprintCreateNewItemBrand: `blueprint-create-new-item` = js.native
  }
  object ICreateNewItem {
    
    @scala.inline
    def apply(__blueprintCreateNewItemBrand: `blueprint-create-new-item`): ICreateNewItem = {
      val __obj = js.Dynamic.literal(__blueprintCreateNewItemBrand = __blueprintCreateNewItemBrand.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICreateNewItem]
    }
    
    @scala.inline
    implicit class ICreateNewItemMutableBuilder[Self <: ICreateNewItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__blueprintCreateNewItemBrand(value: `blueprint-create-new-item`): Self = StObject.set(x, "__blueprintCreateNewItemBrand", value.asInstanceOf[js.Any])
    }
  }
}
