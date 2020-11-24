package typings.ccaptureJs

import typings.std.Blob
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CCapture_ extends js.Object {
  
  def capture(canvas: HTMLElement): Unit = js.native
  
  def save(): Unit = js.native
  def save(cb: js.Function1[/* blob */ Blob, Unit]): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
