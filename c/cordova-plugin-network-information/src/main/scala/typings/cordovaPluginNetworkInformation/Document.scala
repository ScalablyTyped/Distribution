package typings.cordovaPluginNetworkInformation

import typings.cordovaPluginNetworkInformation.cordovaPluginNetworkInformationStrings.offline
import typings.cordovaPluginNetworkInformation.cordovaPluginNetworkInformationStrings.online
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_offline(`type`: offline, connectionStateCallback: js.Function0[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(`type`: offline, connectionStateCallback: js.Function0[js.Any], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(`type`: online, connectionStateCallback: js.Function0[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(`type`: online, connectionStateCallback: js.Function0[js.Any], useCapture: Boolean): Unit = js.native
}
