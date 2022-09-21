package typings.backbone.mod

import typings.std.Location
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone", "History")
@js.native
open class History_ () extends StObject {
  
  /* private */ def _updateHash(location: Location, fragment: String, replace: Boolean): Unit = js.native
  
  def atRoot(): Boolean = js.native
  
  def checkUrl(): Unit = js.native
  def checkUrl(e: Any): Unit = js.native
  
  def decodeFragment(fragment: String): String = js.native
  
  def getFragment(): String = js.native
  def getFragment(fragment: String): String = js.native
  
  def getHash(): String = js.native
  def getHash(window: Window): String = js.native
  
  def getPath(): String = js.native
  
  def getSearch(): String = js.native
  
  var handlers: js.Array[Any] = js.native
  
  var interval: Double = js.native
  
  def loadUrl(): Boolean = js.native
  def loadUrl(fragmentOverride: String): Boolean = js.native
  
  def matchRoot(): Boolean = js.native
  
  def navigate(fragment: String): Boolean = js.native
  def navigate(fragment: String, options: Any): Boolean = js.native
  
  var options: Any = js.native
  
  def route(route: String, callback: js.Function1[/* fragment */ String, Unit]): Double = js.native
  def route(route: js.RegExp, callback: js.Function1[/* fragment */ String, Unit]): Double = js.native
  
  def start(): Boolean = js.native
  def start(options: HistoryOptions): Boolean = js.native
  
  def stop(): Unit = js.native
}
object History_ {
  
  @JSImport("backbone", "History")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("backbone", "History.started")
  @js.native
  def started: Boolean = js.native
  inline def started_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("started")(x.asInstanceOf[js.Any])
}
