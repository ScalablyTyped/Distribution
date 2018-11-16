package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Autocomplete")
@js.native
class Autocomplete () extends js.Object {
  def this(opts: AutocompleteOptions) = this()
  def dispose(): scala.Unit = js.native
  def getResults(): AutocompleteResult = js.native
  def hide(): scala.Unit = js.native
  def onconfirm(event: baidumapDashWebDashSdkLib.Anon_TypeTargetItem): scala.Unit = js.native
  def onhighlight(event: baidumapDashWebDashSdkLib.Anon_TypeTargetToitem): scala.Unit = js.native
  def search(keywords: java.lang.String): scala.Unit = js.native
  def setInputValue(keyword: java.lang.String): scala.Unit = js.native
  def setLocation(location: Map): scala.Unit = js.native
  def setLocation(location: Point): scala.Unit = js.native
  def setLocation(location: java.lang.String): scala.Unit = js.native
  def setTypes(types: js.Array[java.lang.String]): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

