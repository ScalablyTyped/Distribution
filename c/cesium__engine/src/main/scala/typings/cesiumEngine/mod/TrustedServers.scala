package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TrustedServers {
  
  @JSImport("@cesium/engine", "TrustedServers")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds a trusted server to the registry
    * @example
    * // Add a trusted server
    * TrustedServers.add('my.server.com', 80);
    * @param host - The host to be added.
    * @param port - The port used to access the host.
    */
  inline def add(host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Clears the registry
    * @example
    * // Remove a trusted server
    * TrustedServers.clear();
    */
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  /**
    * Tests whether a server is trusted or not. The server must have been added with the port if it is included in the url.
    * @example
    * // Add server
    * TrustedServers.add('my.server.com', 81);
    *
    * // Check if server is trusted
    * if (TrustedServers.contains('https://my.server.com:81/path/to/file.png')) {
    *     // my.server.com:81 is trusted
    * }
    * if (TrustedServers.contains('https://my.server.com/path/to/file.png')) {
    *     // my.server.com isn't trusted
    * }
    * @param url - The url to be tested against the trusted list
    * @returns Returns true if url is trusted, false otherwise.
    */
  inline def contains(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Removes a trusted server from the registry
    * @example
    * // Remove a trusted server
    * TrustedServers.remove('my.server.com', 80);
    * @param host - The host to be removed.
    * @param port - The port used to access the host.
    */
  inline def remove(host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
