package typings.bootstrapMaxlength

import typings.bootstrapMaxlength.BootstrapMaxlength.Options
import typings.bootstrapMaxlength.bootstrapMaxlengthStrings.maxlengthDothidden
import typings.bootstrapMaxlength.bootstrapMaxlengthStrings.maxlengthDotreposition
import typings.bootstrapMaxlength.bootstrapMaxlengthStrings.maxlengthDotshown
import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /** Apply the maxlength plugin on the selected elemens */
  def maxlength(): JQuery = js.native
  def maxlength(options: Options): JQuery = js.native
  
  @JSName("on")
  def on_maxlengthhidden(
    events: maxlengthDothidden,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
  @JSName("on")
  def on_maxlengthshown(
    events: maxlengthDotshown,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
  
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDotreposition): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDotreposition, extraParameters: js.Array[Any]): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDotreposition, extraParameters: js.Object): JQuery = js.native
}
