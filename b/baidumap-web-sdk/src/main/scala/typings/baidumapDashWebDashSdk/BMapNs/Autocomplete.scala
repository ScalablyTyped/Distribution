package typings.baidumapDashWebDashSdk.BMapNs

import typings.baidumapDashWebDashSdk.Anon_Fromitem
import typings.baidumapDashWebDashSdk.Anon_Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Autocomplete")
@js.native
class Autocomplete () extends js.Object {
  def this(opts: AutocompleteOptions) = this()
  def dispose(): Unit = js.native
  def getResults(): AutocompleteResult = js.native
  def hide(): Unit = js.native
  def onconfirm(event: Anon_Item): Unit = js.native
  def onhighlight(event: Anon_Fromitem): Unit = js.native
  def search(keywords: String): Unit = js.native
  def setInputValue(keyword: String): Unit = js.native
  def setLocation(location: String): Unit = js.native
  def setLocation(location: Map): Unit = js.native
  def setLocation(location: Point): Unit = js.native
  def setTypes(types: js.Array[String]): Unit = js.native
  def show(): Unit = js.native
}

