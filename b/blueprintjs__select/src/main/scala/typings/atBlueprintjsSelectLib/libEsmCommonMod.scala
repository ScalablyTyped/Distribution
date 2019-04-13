package typings
package atBlueprintjsSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/common", JSImport.Namespace)
@js.native
object libEsmCommonMod extends js.Object {
  def executeItemsEqual[T](): scala.Boolean = js.native
  def executeItemsEqual[T](
    itemsEqualProp: atBlueprintjsSelectLib.libEsmCommonListItemsPropsMod.ItemsEqualProp[T] | js.UndefOr[scala.Nothing],
    itemA: T
  ): scala.Boolean = js.native
  def executeItemsEqual[T](
    itemsEqualProp: atBlueprintjsSelectLib.libEsmCommonListItemsPropsMod.ItemsEqualProp[T] | js.UndefOr[scala.Nothing],
    itemA: T,
    itemB: T
  ): scala.Boolean = js.native
  def executeItemsEqual[T](
    itemsEqualProp: atBlueprintjsSelectLib.libEsmCommonListItemsPropsMod.ItemsEqualProp[T] | js.UndefOr[scala.Nothing],
    itemA: js.UndefOr[scala.Nothing],
    itemB: T
  ): scala.Boolean = js.native
  def executeItemsEqual[T](
    itemsEqualProp: atBlueprintjsSelectLib.libEsmCommonListItemsPropsMod.ItemsEqualProp[T] | js.UndefOr[scala.Nothing],
    itemA: scala.Null,
    itemB: T
  ): scala.Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: atBlueprintjsSelectLib.libEsmCommonListItemsPropsMod.ItemsEqualProp[T]): scala.Boolean = js.native
  def getActiveItem[T](): T | scala.Null = js.native
  def getActiveItem[T](activeItem: T): T | scala.Null = js.native
  def getActiveItem[T](activeItem: atBlueprintjsSelectLib.libEsmCommonListItemsUtilsMod.ICreateNewItem): T | scala.Null = js.native
  def getCreateNewItem(): atBlueprintjsSelectLib.libEsmCommonListItemsUtilsMod.ICreateNewItem = js.native
  def isCreateNewItem[T](): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ scala.Boolean = js.native
  def isCreateNewItem[T](item: T): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ scala.Boolean = js.native
  def isCreateNewItem[T](item: atBlueprintjsSelectLib.libEsmCommonListItemsUtilsMod.ICreateNewItem): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ scala.Boolean = js.native
  def renderFilteredItems(props: atBlueprintjsSelectLib.libEsmCommonItemListRendererMod.IItemListRendererProps[_]): reactLib.reactMod.ReactNode = js.native
  def renderFilteredItems(
    props: atBlueprintjsSelectLib.libEsmCommonItemListRendererMod.IItemListRendererProps[_],
    noResults: reactLib.reactMod.ReactNode
  ): reactLib.reactMod.ReactNode = js.native
  def renderFilteredItems(
    props: atBlueprintjsSelectLib.libEsmCommonItemListRendererMod.IItemListRendererProps[_],
    noResults: reactLib.reactMod.ReactNode,
    initialContent: reactLib.reactMod.ReactNode
  ): reactLib.reactMod.ReactNode = js.native
  @JSName("Classes")
  @js.native
  object ClassesNs extends js.Object {
    val MULTISELECT: java.lang.String = js.native
    val MULTISELECT_POPOVER: java.lang.String = js.native
    val OMNIBAR: java.lang.String = js.native
    val OMNIBAR_OVERLAY: java.lang.String = js.native
    val SELECT: java.lang.String = js.native
    val SELECT_POPOVER: java.lang.String = js.native
  }
  
}

