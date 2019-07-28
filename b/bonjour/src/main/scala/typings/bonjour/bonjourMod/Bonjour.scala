package typings.bonjour.bonjourMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bonjour extends js.Object {
  def apply(): Bonjour = js.native
  def apply(opts: BonjourOptions): Bonjour = js.native
  def destroy(): Unit = js.native
  def find(options: BrowserOptions): Browser = js.native
  def find(options: BrowserOptions, onUp: js.Function1[/* service */ Service, Unit]): Browser = js.native
  def findOne(options: BrowserOptions): Browser = js.native
  def findOne(options: BrowserOptions, cb: js.Function1[/* service */ Service, Unit]): Browser = js.native
  def publish(options: ServiceOptions): Service = js.native
  def unpublishAll(): Unit = js.native
  def unpublishAll(cb: js.Function0[Unit]): Unit = js.native
}

