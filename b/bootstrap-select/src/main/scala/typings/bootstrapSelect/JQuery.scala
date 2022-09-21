package typings.bootstrapSelect

import typings.bootstrapSelect.anon.PartialBootstrapSelectOpt
import typings.bootstrapSelect.bootstrapSelectStrings.`val`
import typings.bootstrapSelect.bootstrapSelectStrings.add
import typings.bootstrapSelect.bootstrapSelectStrings.changedDotbsDotselect
import typings.bootstrapSelect.bootstrapSelectStrings.deselectAll
import typings.bootstrapSelect.bootstrapSelectStrings.destroy
import typings.bootstrapSelect.bootstrapSelectStrings.hiddenDotbsDotselect
import typings.bootstrapSelect.bootstrapSelectStrings.hide
import typings.bootstrapSelect.bootstrapSelectStrings.hideDotbsDotselect
import typings.bootstrapSelect.bootstrapSelectStrings.loadedDotbsDotselect
import typings.bootstrapSelect.bootstrapSelectStrings.mobile
import typings.bootstrapSelect.bootstrapSelectStrings.refresh
import typings.bootstrapSelect.bootstrapSelectStrings.refreshedDotbsDotselect
import typings.bootstrapSelect.bootstrapSelectStrings.remove
import typings.bootstrapSelect.bootstrapSelectStrings.render
import typings.bootstrapSelect.bootstrapSelectStrings.renderedDotbsDotselect
import typings.bootstrapSelect.bootstrapSelectStrings.selectAll
import typings.bootstrapSelect.bootstrapSelectStrings.setStyle
import typings.bootstrapSelect.bootstrapSelectStrings.show
import typings.bootstrapSelect.bootstrapSelectStrings.showDotbsDotselect
import typings.bootstrapSelect.bootstrapSelectStrings.shownDotbsDotselect
import typings.bootstrapSelect.bootstrapSelectStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery[TElement] extends StObject {
  
  def on[K /* <: /* keyof bootstrap-select.BootstrapSelectEvents */ showDotbsDotselect | shownDotbsDotselect | hideDotbsDotselect | hiddenDotbsDotselect | loadedDotbsDotselect | renderedDotbsDotselect | refreshedDotbsDotselect | changedDotbsDotselect */](
    eventName: K,
    handler: /* import warning: importer.ImportType#apply Failed type conversion: bootstrap-select.BootstrapSelectEvents[K] */ js.Any
  ): this.type
  
  /**
    * Main function
    */
  def selectpicker(): JQuery[TElement]
  def selectpicker(method: selectAll | deselectAll | render | mobile | refresh | toggle | hide | show | destroy): JQuery[TElement]
  def selectpicker(method: setStyle, className: String, action: add | remove): JQuery[TElement]
  def selectpicker(method: setStyle, className: Unit, action: add | remove): JQuery[TElement]
  def selectpicker(opts: PartialBootstrapSelectOpt): JQuery[TElement]
  @JSName("selectpicker")
  var selectpicker_Original: BootstrapSelect[TElement]
  @JSName("selectpicker")
  def selectpicker_setStyle(method: setStyle): JQuery[TElement]
  @JSName("selectpicker")
  def selectpicker_setStyle(method: setStyle, className: String): JQuery[TElement]
  /**
    * Methods
    * @see {@link https://developer.snapappointments.com/bootstrap-select/methods/}
    */
  @JSName("selectpicker")
  def selectpicker_val(method: `val`, value: String): JQuery[TElement]
  @JSName("selectpicker")
  def selectpicker_val(method: `val`, value: js.Array[String]): JQuery[TElement]
}
object JQuery {
  
  inline def apply[TElement](
    on: (Any, /* import warning: importer.ImportType#apply Failed type conversion: bootstrap-select.BootstrapSelectEvents[K] */ js.Any) => JQuery[TElement],
    selectpicker: BootstrapSelect[TElement]
  ): JQuery[TElement] = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), selectpicker = selectpicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery[TElement]]
  }
  
  extension [Self <: JQuery[?], TElement](x: Self & JQuery[TElement]) {
    
    inline def setOn(
      value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: bootstrap-select.BootstrapSelectEvents[K] */ js.Any) => JQuery[TElement]
    ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setSelectpicker(value: BootstrapSelect[TElement]): Self = StObject.set(x, "selectpicker", value.asInstanceOf[js.Any])
  }
}
