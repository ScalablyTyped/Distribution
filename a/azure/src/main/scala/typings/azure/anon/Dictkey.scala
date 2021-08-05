package typings.azure.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[String] {
  
  var VersionEndpointEnvironmentName: String
}
object Dictkey {
  
  inline def apply(VersionEndpointEnvironmentName: String): Dictkey = {
    val __obj = js.Dynamic.literal(VersionEndpointEnvironmentName = VersionEndpointEnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setVersionEndpointEnvironmentName(value: String): Self = StObject.set(x, "VersionEndpointEnvironmentName", value.asInstanceOf[js.Any])
  }
}
