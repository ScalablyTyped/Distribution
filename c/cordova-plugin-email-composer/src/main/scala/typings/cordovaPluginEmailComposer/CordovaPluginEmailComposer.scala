package typings.cordovaPluginEmailComposer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPluginEmailComposer extends StObject {
  
  /** Determine if the device is capable to send emails */
  def isAvailable(callback: js.Function1[/* isAvailable */ Boolean, Unit]): Unit = js.native
  def isAvailable(callback: js.Function1[/* isAvailable */ Boolean, Unit], scope: Any): Unit = js.native
  
  /** Open a pre-filled email draft */
  def open(): Unit = js.native
  def open(options: Unit, callback: js.Function0[Unit]): Unit = js.native
  def open(options: Unit, callback: js.Function0[Unit], scope: Any): Unit = js.native
  def open(options: Unit, callback: Unit, scope: Any): Unit = js.native
  def open(options: ICordovaPluginEmailComposerOpenOptions): Unit = js.native
  def open(options: ICordovaPluginEmailComposerOpenOptions, callback: js.Function0[Unit]): Unit = js.native
  def open(options: ICordovaPluginEmailComposerOpenOptions, callback: js.Function0[Unit], scope: Any): Unit = js.native
  def open(options: ICordovaPluginEmailComposerOpenOptions, callback: Unit, scope: Any): Unit = js.native
  
  def openDraft(): Unit = js.native
  def openDraft(options: Unit, callback: js.Function0[Unit]): Unit = js.native
  def openDraft(options: Unit, callback: js.Function0[Unit], scope: Any): Unit = js.native
  def openDraft(options: Unit, callback: Unit, scope: Any): Unit = js.native
  def openDraft(options: ICordovaPluginEmailComposerOpenOptions): Unit = js.native
  def openDraft(options: ICordovaPluginEmailComposerOpenOptions, callback: js.Function0[Unit]): Unit = js.native
  def openDraft(options: ICordovaPluginEmailComposerOpenOptions, callback: js.Function0[Unit], scope: Any): Unit = js.native
  def openDraft(options: ICordovaPluginEmailComposerOpenOptions, callback: Unit, scope: Any): Unit = js.native
}
