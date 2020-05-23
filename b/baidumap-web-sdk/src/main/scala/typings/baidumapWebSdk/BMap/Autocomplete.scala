package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Fromitem
import typings.baidumapWebSdk.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autocomplete extends js.Object {
  def dispose(): Unit = js.native
  def getResults(): AutocompleteResult = js.native
  def hide(): Unit = js.native
  def onconfirm(event: Item): Unit = js.native
  def onhighlight(event: Fromitem): Unit = js.native
  def search(keywords: String): Unit = js.native
  def setInputValue(keyword: String): Unit = js.native
  def setLocation(location: String): Unit = js.native
  def setLocation(location: Map): Unit = js.native
  def setLocation(location: Point): Unit = js.native
  def setTypes(types: js.Array[String]): Unit = js.native
  def show(): Unit = js.native
}

