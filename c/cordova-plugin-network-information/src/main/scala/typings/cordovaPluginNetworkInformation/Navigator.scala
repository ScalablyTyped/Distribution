package typings.cordovaPluginNetworkInformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  /**
    * This plugin provides an implementation of an old version of the Network Information API.
    * It provides information about the device's cellular and wifi connection, and whether the device has an internet connection.
    */
  var connection: Connection
  
  // see https://github.com/apache/cordova-plugin-network-information/blob/dev/doc/index.md#api-change
  // for 
  var network: typings.cordovaPluginNetworkInformation.anon.Connection
}
object Navigator {
  
  @scala.inline
  def apply(connection: Connection, network: typings.cordovaPluginNetworkInformation.anon.Connection): Navigator = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetwork(value: typings.cordovaPluginNetworkInformation.anon.Connection): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
  }
}
