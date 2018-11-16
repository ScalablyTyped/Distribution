package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends Events {
  var handlers: js.Array[_] = js.native
  var interval: scala.Double = js.native
  var options: js.Any = js.native
  /* private */ def _updateHash(location: stdLib.Location, fragment: java.lang.String, replace: scala.Boolean): scala.Unit = js.native
  def atRoot(): scala.Boolean = js.native
  def checkUrl(): scala.Unit = js.native
  def checkUrl(e: js.Any): scala.Unit = js.native
  def decodeFragment(fragment: java.lang.String): java.lang.String = js.native
  def getFragment(): java.lang.String = js.native
  def getFragment(fragment: java.lang.String): java.lang.String = js.native
  def getHash(): java.lang.String = js.native
  def getHash(window: stdLib.Window): java.lang.String = js.native
  def getPath(): java.lang.String = js.native
  def getSearch(): java.lang.String = js.native
  def loadUrl(): scala.Boolean = js.native
  def loadUrl(fragmentOverride: java.lang.String): scala.Boolean = js.native
  def matchRoot(): scala.Boolean = js.native
  def navigate(fragment: java.lang.String): scala.Boolean = js.native
  def navigate(fragment: java.lang.String, options: js.Any): scala.Boolean = js.native
  def route(route: java.lang.String, callback: js.Function): scala.Double = js.native
  def route(route: stdLib.RegExp, callback: js.Function): scala.Double = js.native
  def start(): scala.Boolean = js.native
  def start(options: HistoryOptions): scala.Boolean = js.native
  def stop(): scala.Unit = js.native
}

