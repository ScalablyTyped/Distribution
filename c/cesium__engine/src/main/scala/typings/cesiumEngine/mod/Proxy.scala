package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Proxy")
@js.native
open class Proxy () extends StObject {
  
  /**
    * Get the final URL to use to request a given resource.
    * @param resource - The resource to request.
    * @returns proxied resource
    */
  def getURL(resource: String): String = js.native
}
