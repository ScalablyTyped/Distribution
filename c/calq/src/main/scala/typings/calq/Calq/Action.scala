package typings.calq.Calq

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  
  def setGlobalProperty(name: String, value: js.Any): Unit = js.native
  def setGlobalProperty(params: StringDictionary[js.Any]): Unit = js.native
  
  def track(action: String): Unit = js.native
  def track(action: String, params: StringDictionary[js.Any]): Unit = js.native
  
  def trackHTMLLink(action: String): Unit = js.native
  def trackHTMLLink(action: String, params: StringDictionary[js.Any]): Unit = js.native
  
  def trackPageView(): Unit = js.native
  def trackPageView(action: String): Unit = js.native
  
  def trackSale(action: String, params: StringDictionary[js.Any], currency: String, amount: Double): Unit = js.native
}
