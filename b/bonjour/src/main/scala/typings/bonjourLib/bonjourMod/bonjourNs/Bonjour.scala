package typings
package bonjourLib.bonjourMod.bonjourNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bonjour extends js.Object {
  def apply(): Bonjour = js.native
  def apply(opts: BonjourOptions): Bonjour = js.native
  def destroy(): scala.Unit = js.native
  def find(options: BrowserOptions): Browser = js.native
  def find(options: BrowserOptions, onUp: js.Function1[/* service */ Service, scala.Unit]): Browser = js.native
  def findOne(options: BrowserOptions): Browser = js.native
  def findOne(options: BrowserOptions, cb: js.Function1[/* service */ Service, scala.Unit]): Browser = js.native
  def publish(options: ServiceOptions): Service = js.native
  def unpublishAll(): scala.Unit = js.native
  def unpublishAll(cb: js.Function0[scala.Unit]): scala.Unit = js.native
}

