package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows manipulation of the browser session history, that is the pages visited in the tab or frame that the current page is loaded in. */
@js.native
trait History extends StObject {
  
  def back(): Unit = js.native
  
  def forward(): Unit = js.native
  
  def go(): Unit = js.native
  def go(delta: Double): Unit = js.native
  
  val length: Double = js.native
  
  def pushState(data: Any, unused: java.lang.String): Unit = js.native
  def pushState(data: Any, unused: java.lang.String, url: java.lang.String): Unit = js.native
  def pushState(data: Any, unused: java.lang.String, url: URL): Unit = js.native
  
  def replaceState(data: Any, unused: java.lang.String): Unit = js.native
  def replaceState(data: Any, unused: java.lang.String, url: java.lang.String): Unit = js.native
  def replaceState(data: Any, unused: java.lang.String, url: URL): Unit = js.native
  
  var scrollRestoration: ScrollRestoration = js.native
  
  val state: Any = js.native
}
