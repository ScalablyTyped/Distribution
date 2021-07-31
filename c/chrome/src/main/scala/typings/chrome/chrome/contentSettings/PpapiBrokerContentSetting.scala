package typings.chrome.chrome.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PpapiBrokerContentSetting
  extends StObject
     with ContentSetting {
  
  def set(details: PpapiBrokerSetDetails): Unit = js.native
  def set(details: PpapiBrokerSetDetails, callback: js.Function0[Unit]): Unit = js.native
}
