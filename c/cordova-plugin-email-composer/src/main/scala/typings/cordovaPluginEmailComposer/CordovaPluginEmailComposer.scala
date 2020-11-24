package typings.cordovaPluginEmailComposer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPluginEmailComposer extends js.Object {
  
  /** Determine if the device is capable to send emails */
  def isAvailable(callback: js.Function1[/* isAvailable */ Boolean, Unit]): Unit = js.native
  def isAvailable(callback: js.Function1[/* isAvailable */ Boolean, Unit], scope: js.Any): Unit = js.native
  
  /** Open a pre-filled email draft */
  def open(): Unit = js.native
  def open(options: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def open(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def open(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit], scope: js.Any): Unit = js.native
  def open(options: ICordovaPluginEmailComposerOpenOptions): Unit = js.native
  def open(
    options: ICordovaPluginEmailComposerOpenOptions,
    callback: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Unit = js.native
  def open(options: ICordovaPluginEmailComposerOpenOptions, callback: js.Function0[Unit]): Unit = js.native
  def open(options: ICordovaPluginEmailComposerOpenOptions, callback: js.Function0[Unit], scope: js.Any): Unit = js.native
  
  def openDraft(): Unit = js.native
  def openDraft(options: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def openDraft(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def openDraft(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit], scope: js.Any): Unit = js.native
  def openDraft(options: ICordovaPluginEmailComposerOpenOptions): Unit = js.native
  def openDraft(
    options: ICordovaPluginEmailComposerOpenOptions,
    callback: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Unit = js.native
  def openDraft(options: ICordovaPluginEmailComposerOpenOptions, callback: js.Function0[Unit]): Unit = js.native
  def openDraft(options: ICordovaPluginEmailComposerOpenOptions, callback: js.Function0[Unit], scope: js.Any): Unit = js.native
}
