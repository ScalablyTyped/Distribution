package typings
package cordovaDashPluginDashEmailDashComposerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CordovaPluginEmailComposer extends js.Object {
  /** Determine if the device is capable to send emails */
  def isAvailable(callback: js.Function1[/* isAvailable */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def isAvailable(callback: js.Function1[/* isAvailable */ scala.Boolean, scala.Unit], scope: js.Any): scala.Unit = js.native
  /** Open a pre-filled email draft */
  def open(): scala.Unit = js.native
  def open(options: ICordovaPluginEmailComposerOpenOptions): scala.Unit = js.native
  def open(options: ICordovaPluginEmailComposerOpenOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def open(options: ICordovaPluginEmailComposerOpenOptions, callback: js.Function0[scala.Unit], scope: js.Any): scala.Unit = js.native
  def openDraft(): scala.Unit = js.native
  def openDraft(options: ICordovaPluginEmailComposerOpenOptions): scala.Unit = js.native
  def openDraft(options: ICordovaPluginEmailComposerOpenOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def openDraft(options: ICordovaPluginEmailComposerOpenOptions, callback: js.Function0[scala.Unit], scope: js.Any): scala.Unit = js.native
}

