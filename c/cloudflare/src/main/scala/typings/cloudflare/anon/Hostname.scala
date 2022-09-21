package typings.cloudflare.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hostname extends StObject {
  
  var hostname: String
  
  var ssl: Bundlemethod
}
object Hostname {
  
  inline def apply(hostname: String, ssl: Bundlemethod): Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hostname]
  }
  
  extension [Self <: Hostname](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setSsl(value: Bundlemethod): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
  }
}
