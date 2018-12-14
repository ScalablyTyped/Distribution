package typings
package calqLib.CalqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  def setGlobalProperty(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setGlobalProperty(params: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def track(action: java.lang.String): scala.Unit = js.native
  def track(action: java.lang.String, params: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def trackHTMLLink(action: java.lang.String): scala.Unit = js.native
  def trackHTMLLink(action: java.lang.String, params: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def trackPageView(): scala.Unit = js.native
  def trackPageView(action: java.lang.String): scala.Unit = js.native
  def trackSale(
    action: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[js.Any],
    currency: java.lang.String,
    amount: scala.Double
  ): scala.Unit = js.native
}

