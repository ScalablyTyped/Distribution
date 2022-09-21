package typings.bootstrapMultiselect

import typings.bootstrapMultiselect.bootstrapMultiselectStrings.dataprovider
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.deselect
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.deselectAll
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.destroy
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.disable
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.enable
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.rebuild
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.refresh
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.select
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.selectAll
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.setAllSelectedText
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.setOptions
import typings.bootstrapMultiselect.bootstrapMultiselectStrings.updateButtonText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def multiselect(): JQuery = js.native
  def multiselect(
    method: deselectAll | destroy | disable | enable | rebuild | refresh | selectAll | updateButtonText
  ): JQuery = js.native
  def multiselect(method: selectAll | deselectAll, justVisible: Boolean): JQuery = js.native
  def multiselect(method: select | deselect, value: String): JQuery = js.native
  def multiselect(method: select | deselect, value: String, triggerOnChange: Boolean): JQuery = js.native
  def multiselect(method: select | deselect, value: js.Array[String]): JQuery = js.native
  def multiselect(method: select | deselect, value: js.Array[String], triggerOnChange: Boolean): JQuery = js.native
  def multiselect(method: select | deselect, value: Double): JQuery = js.native
  def multiselect(method: select | deselect, value: Double, triggerOnChange: Boolean): JQuery = js.native
  def multiselect(options: MultiSelectOptions): JQuery = js.native
  @JSName("multiselect")
  def multiselect_dataprovider(method: dataprovider, data: js.Array[MultiSelectOptionElement]): JQuery = js.native
  @JSName("multiselect")
  def multiselect_setAllSelectedText(method: setAllSelectedText, value: String): JQuery = js.native
  @JSName("multiselect")
  def multiselect_setOptions(method: setOptions, options: MultiSelectOptions): JQuery = js.native
}
