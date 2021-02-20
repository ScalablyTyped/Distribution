package typings.bootstrapGrowlIfightcrime

import typings.bootstrapGrowlIfightcrime.BootstrapGrowlIfightcrime.Options
import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  /**
    * Show standard Bootstrap alerts into hovering "Growl-like" notifications
    * @param message to show.
    * @param options should be an options object.
    * @returns The element.
    */
  def bootstrapGrowl(message: String): JQuery[HTMLElement] = js.native
  def bootstrapGrowl(message: String, options: Options): JQuery[HTMLElement] = js.native
}
