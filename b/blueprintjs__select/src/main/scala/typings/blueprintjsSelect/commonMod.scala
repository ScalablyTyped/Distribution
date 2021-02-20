package typings.blueprintjsSelect

import typings.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typings.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typings.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  object Classes {
    
    @JSImport("@blueprintjs/select/lib/esm/common", "Classes.MULTISELECT")
    @js.native
    val MULTISELECT: String = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/common", "Classes.MULTISELECT_POPOVER")
    @js.native
    val MULTISELECT_POPOVER: String = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/common", "Classes.MULTISELECT_TAG_INPUT_INPUT")
    @js.native
    val MULTISELECT_TAG_INPUT_INPUT: String = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/common", "Classes.OMNIBAR")
    @js.native
    val OMNIBAR: String = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/common", "Classes.OMNIBAR_OVERLAY")
    @js.native
    val OMNIBAR_OVERLAY: String = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/common", "Classes.SELECT")
    @js.native
    val SELECT: String = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/common", "Classes.SELECT_POPOVER")
    @js.native
    val SELECT_POPOVER: String = js.native
  }
  
  @JSImport("@blueprintjs/select/lib/esm/common", "executeItemsEqual")
  @js.native
  def executeItemsEqual[T](): Boolean = js.native
  @JSImport("@blueprintjs/select/lib/esm/common", "executeItemsEqual")
  @js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: T): Boolean = js.native
  @JSImport("@blueprintjs/select/lib/esm/common", "executeItemsEqual")
  @js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: T, itemB: T): Boolean = js.native
  @JSImport("@blueprintjs/select/lib/esm/common", "executeItemsEqual")
  @js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: js.UndefOr[scala.Nothing], itemB: T): Boolean = js.native
  @JSImport("@blueprintjs/select/lib/esm/common", "executeItemsEqual")
  @js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: Null, itemB: T): Boolean = js.native
  @JSImport("@blueprintjs/select/lib/esm/common", "executeItemsEqual")
  @js.native
  def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T]): Boolean = js.native
  
  @JSImport("@blueprintjs/select/lib/esm/common", "getActiveItem")
  @js.native
  def getActiveItem[T](): T | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/common", "getActiveItem")
  @js.native
  def getActiveItem[T](activeItem: T): T | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/common", "getActiveItem")
  @js.native
  def getActiveItem[T](activeItem: ICreateNewItem): T | Null = js.native
  
  @JSImport("@blueprintjs/select/lib/esm/common", "getCreateNewItem")
  @js.native
  def getCreateNewItem(): ICreateNewItem = js.native
  
  @JSImport("@blueprintjs/select/lib/esm/common", "isCreateNewItem")
  @js.native
  def isCreateNewItem[T](): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  @JSImport("@blueprintjs/select/lib/esm/common", "isCreateNewItem")
  @js.native
  def isCreateNewItem[T](item: T): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  @JSImport("@blueprintjs/select/lib/esm/common", "isCreateNewItem")
  @js.native
  def isCreateNewItem[T](item: ICreateNewItem): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  
  @JSImport("@blueprintjs/select/lib/esm/common", "renderFilteredItems")
  @js.native
  def renderFilteredItems(props: IItemListRendererProps[_]): ReactNode = js.native
  @JSImport("@blueprintjs/select/lib/esm/common", "renderFilteredItems")
  @js.native
  def renderFilteredItems(props: IItemListRendererProps[_], noResults: js.UndefOr[ReactNode], initialContent: ReactNode): ReactNode = js.native
  @JSImport("@blueprintjs/select/lib/esm/common", "renderFilteredItems")
  @js.native
  def renderFilteredItems(props: IItemListRendererProps[_], noResults: ReactNode): ReactNode = js.native
}
