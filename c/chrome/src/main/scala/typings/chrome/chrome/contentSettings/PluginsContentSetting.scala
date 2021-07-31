package typings.chrome.chrome.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginsContentSetting
  extends StObject
     with ContentSetting {
  
  def set(details: PluginsSetDetails): Unit = js.native
  def set(details: PluginsSetDetails, callback: js.Function0[Unit]): Unit = js.native
}
