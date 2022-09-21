package typings.bogon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Check if an IP is a bogon.
    *
    * @param ip The IP to check
    *
    * @example
    * import bogon = require('bogon');
    *
    * console.log(bogon('192.168.0.1')); // true
    * console.log(bogon('8.8.8.8')); // false
    */
  inline def apply(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("bogon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if an IP is a bogon.
    *
    * @param ip The IP to check
    *
    * @example
    * import bogon = require('bogon');
    *
    * console.log(bogon.isBogon('192.168.0.1')); // true
    * console.log(bogon.isBogon('8.8.8.8')); // false
    */
  @JSImport("bogon", "isBogon")
  @js.native
  val isBogon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof bogon */ Any = js.native
  
  /**
    * Detect if a bogon IP is a private IP address on a local network.
    *
    * @param ip The IP to check
    *
    * @example
    * import bogon = require('bogon');
    *
    * console.log(bogon.isPrivate('192.168.0.1')) // true
    * console.log(bogon('224.0.1.1')) // true
    * console.log(bogon.isPrivate('224.0.1.1')) // false
    */
  inline def isPrivate(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
