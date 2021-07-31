package typings.chrome.chrome.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MicrophoneContentSetting
  extends StObject
     with ContentSetting {
  
  def set(details: MicrophoneSetDetails): Unit = js.native
  def set(details: MicrophoneSetDetails, callback: js.Function0[Unit]): Unit = js.native
}
