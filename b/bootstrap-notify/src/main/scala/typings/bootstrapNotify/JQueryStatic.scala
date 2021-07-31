package typings.bootstrapNotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  def notify(message: String): NotifyReturn = js.native
  def notify(opts: NotifyOptions): NotifyReturn = js.native
  def notify(opts: NotifyOptions, settings: NotifySettings): NotifyReturn = js.native
  
  def notifyClose(): Unit = js.native
  def notifyClose(command: String): Unit = js.native
  
  def notifyDefaults(settings: NotifySettings): Unit = js.native
}
