package typings.bootstrapDatepicker

import typings.jquery.JQueryEventObject
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatepickerEventObject extends JQueryEventObject {
  
  var date: Date = js.native
  
  var dates: js.Array[Date] = js.native
  
  def format(): String = js.native
  def format(format: String): String = js.native
  def format(ix: js.UndefOr[scala.Nothing], format: String): String = js.native
  def format(ix: Double): String = js.native
  def format(ix: Double, format: String): String = js.native
}
