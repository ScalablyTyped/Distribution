package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Swanid extends StObject {
  
  var swanid: String
}
object Swanid {
  
  inline def apply(swanid: String): Swanid = {
    val __obj = js.Dynamic.literal(swanid = swanid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Swanid]
  }
  
  extension [Self <: Swanid](x: Self) {
    
    inline def setSwanid(value: String): Self = StObject.set(x, "swanid", value.asInstanceOf[js.Any])
  }
}
