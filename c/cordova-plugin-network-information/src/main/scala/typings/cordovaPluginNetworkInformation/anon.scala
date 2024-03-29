package typings.cordovaPluginNetworkInformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Connection extends StObject {
    
    /**
      * This plugin provides an implementation of an old version of the Network Information API.
      * It provides information about the device's cellular and wifi connection, and whether the device has an internet connection.
      */
    var connection: typings.cordovaPluginNetworkInformation.Connection
  }
  object Connection {
    
    inline def apply(connection: typings.cordovaPluginNetworkInformation.Connection): typings.cordovaPluginNetworkInformation.anon.Connection = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cordovaPluginNetworkInformation.anon.Connection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.cordovaPluginNetworkInformation.anon.Connection] (val x: Self) extends AnyVal {
      
      inline def setConnection(value: typings.cordovaPluginNetworkInformation.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    }
  }
}
