package typings.bootstrapDatepicker

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatepickerEventObject
  extends StObject
     with JQueryEventObject {
  
  var date: js.Date = js.native
  
  var dates: js.Array[js.Date] = js.native
  
  def format(): String = js.native
  def format(format: String): String = js.native
  def format(ix: Double): String = js.native
  def format(ix: Double, format: String): String = js.native
  def format(ix: Unit, format: String): String = js.native
}
