package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overlay
  extends StObject
     with /* x */ StringDictionary[Any] {
  
  def addEventListener(event: String, handler: Callback): Unit = js.native
  
  var draw: js.UndefOr[js.Function0[Unit]] = js.native
  
  def getZIndex(lat: Double): Double = js.native
  def getZIndex(lat: Double, coordTyppe: String): Double = js.native
  
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var initialize: js.UndefOr[js.Function1[/* map */ Map, HTMLElement]] = js.native
  
  var isVisible: js.UndefOr[js.Function0[Boolean]] = js.native
  
  def removeEventListener(event: String, handler: Callback): Unit = js.native
  
  def setOptions(obj: js.Object): Unit = js.native
  
  var show: js.UndefOr[js.Function0[Unit]] = js.native
}
