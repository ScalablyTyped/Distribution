package typings.blueprintjsSelect

import typings.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typings.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typings.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  def executeItemsEqual[T](): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: T, itemB: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: js.UndefOr[scala.Nothing], itemB: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: Null, itemB: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T]): Boolean = js.native
  def getActiveItem[T](): T | Null = js.native
  def getActiveItem[T](activeItem: T): T | Null = js.native
  def getActiveItem[T](activeItem: ICreateNewItem): T | Null = js.native
  def getCreateNewItem(): ICreateNewItem = js.native
  def isCreateNewItem[T](): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  def isCreateNewItem[T](item: T): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  def isCreateNewItem[T](item: ICreateNewItem): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = js.native
  def renderFilteredItems(props: IItemListRendererProps[_]): ReactNode = js.native
  def renderFilteredItems(props: IItemListRendererProps[_], noResults: js.UndefOr[ReactNode], initialContent: ReactNode): ReactNode = js.native
  def renderFilteredItems(props: IItemListRendererProps[_], noResults: ReactNode): ReactNode = js.native
  @js.native
  object Classes extends js.Object {
    val MULTISELECT: String = js.native
    val MULTISELECT_POPOVER: String = js.native
    val MULTISELECT_TAG_INPUT_INPUT: String = js.native
    val OMNIBAR: String = js.native
    val OMNIBAR_OVERLAY: String = js.native
    val SELECT: String = js.native
    val SELECT_POPOVER: String = js.native
  }
  
}

