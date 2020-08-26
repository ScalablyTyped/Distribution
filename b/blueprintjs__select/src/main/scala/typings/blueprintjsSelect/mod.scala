package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsSelect.anon.Disabled
import typings.blueprintjsSelect.anon.Fill
import typings.blueprintjsSelect.anon.PartialISuggestPropsany
import typings.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typings.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typings.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typings.blueprintjsSelect.multiSelectMod.IMultiSelectProps
import typings.blueprintjsSelect.omnibarMod.IOmnibarProps
import typings.blueprintjsSelect.queryListMod.IQueryListProps
import typings.blueprintjsSelect.selectMod.ISelectProps
import typings.blueprintjsSelect.suggestMod.ISuggestProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MultiSelect[T] ()
    extends typings.blueprintjsSelect.componentsMod.MultiSelect[T]
  
  @js.native
  class Omnibar[T] ()
    extends typings.blueprintjsSelect.componentsMod.Omnibar[T]
  
  @js.native
  class QueryList[T] protected ()
    extends typings.blueprintjsSelect.componentsMod.QueryList[T] {
    def this(props: IQueryListProps[T]) = this()
    def this(props: IQueryListProps[T], context: js.Any) = this()
  }
  
  @js.native
  class Select[T] ()
    extends typings.blueprintjsSelect.componentsMod.Select[T]
  
  @js.native
  class Suggest[T] ()
    extends typings.blueprintjsSelect.componentsMod.Suggest[T]
  
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
  def getFirstEnabledItem[T](items: js.Array[T]): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.UndefOr[scala.Nothing],
    direction: js.UndefOr[scala.Nothing],
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.UndefOr[scala.Nothing], direction: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.UndefOr[scala.Nothing], direction: Double, startIndex: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: /* keyof T */ String,
    direction: js.UndefOr[scala.Nothing],
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double, startIndex: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean]): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: js.UndefOr[scala.Nothing],
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double
  ): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double,
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
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
  
  /* static members */
  @js.native
  object MultiSelect extends js.Object {
    var defaultProps: Fill = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ IMultiSelectProps[T], 
        typings.blueprintjsSelect.multiSelectMod.MultiSelect[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Omnibar extends js.Object {
    var displayName: String = js.native
    def ofType[T](): Instantiable1[/* props */ IOmnibarProps[T], typings.blueprintjsSelect.omnibarMod.Omnibar[T]] = js.native
  }
  
  /* static members */
  @js.native
  object QueryList extends js.Object {
    var defaultProps: Disabled = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ IQueryListProps[T], 
        typings.blueprintjsSelect.queryListMod.QueryList[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Select extends js.Object {
    var displayName: String = js.native
    def ofType[T](): Instantiable1[/* props */ ISelectProps[T], typings.blueprintjsSelect.selectMod.Select[T]] = js.native
  }
  
  /* static members */
  @js.native
  object Suggest extends js.Object {
    var defaultProps: PartialISuggestPropsany = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[/* props */ ISuggestProps[T], typings.blueprintjsSelect.suggestMod.Suggest[T]] = js.native
  }
  
}

