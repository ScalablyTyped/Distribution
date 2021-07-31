package typings.chrome.chrome.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouselockContentSetting
  extends StObject
     with ContentSetting {
  
  def set(details: MouselockSetDetails): Unit = js.native
  def set(details: MouselockSetDetails, callback: js.Function0[Unit]): Unit = js.native
}
