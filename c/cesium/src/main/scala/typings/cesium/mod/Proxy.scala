package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Proxy extends StObject {
  
  def getURL(resource: String): String
}
object Proxy {
  
  inline def apply(getURL: String => String): Proxy = {
    val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction1(getURL))
    __obj.asInstanceOf[Proxy]
  }
  
  extension [Self <: Proxy](x: Self) {
    
    inline def setGetURL(value: String => String): Self = StObject.set(x, "getURL", js.Any.fromFunction1(value))
  }
}
