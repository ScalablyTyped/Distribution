package typings
package atBlueprintjsSelectLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select", JSImport.Namespace)
@js.native
object selectModMembers extends js.Object {
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

