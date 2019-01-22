package typings
package atBlueprintjsSelectLib.atBlueprintjsSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def getFirstEnabledItem[T](items: js.Array[T]): T | scala.Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: java.lang.String): T | scala.Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: java.lang.String, direction: scala.Double): T | scala.Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: java.lang.String,
    direction: scala.Double,
    startIndex: scala.Double
  ): T | scala.Null = js.native
  def renderFilteredItems(props: atBlueprintjsSelectLib.libEsmCommonItemListRendererMod.IItemListRendererProps[_]): reactLib.reactMod.ReactNs.ReactNode = js.native
  def renderFilteredItems(
    props: atBlueprintjsSelectLib.libEsmCommonItemListRendererMod.IItemListRendererProps[_],
    noResults: reactLib.reactMod.ReactNs.ReactNode
  ): reactLib.reactMod.ReactNs.ReactNode = js.native
  def renderFilteredItems(
    props: atBlueprintjsSelectLib.libEsmCommonItemListRendererMod.IItemListRendererProps[_],
    noResults: reactLib.reactMod.ReactNs.ReactNode,
    initialContent: reactLib.reactMod.ReactNs.ReactNode
  ): reactLib.reactMod.ReactNs.ReactNode = js.native
}

