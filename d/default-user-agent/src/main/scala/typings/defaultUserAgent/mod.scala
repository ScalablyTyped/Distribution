package typings.defaultUserAgent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Get the default user agent string for Node.js http request.
    *
    * @example
    * import ua = require('default-user-agent');
    *
    * // darwin
    * console.log(ua()); // 'Node.js/0.11.15 (OS X Yosemite; x64)'
    * console.log(ua('urllib', '0.0.1')); // 'urllib/0.0.1 Node.js/0.11.15 (OS X Yosemite; x64)'
    *
    * // linux
    * // 'Node.js/0.11.15 (Linux 3.13; x64)'
    */
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(name: String, version: String): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("default-user-agent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
