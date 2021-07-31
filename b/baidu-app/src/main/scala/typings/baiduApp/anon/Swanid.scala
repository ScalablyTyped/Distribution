package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Swanid extends StObject {
  
  var swanid: String
}
object Swanid {
  
  @scala.inline
  def apply(swanid: String): Swanid = {
    val __obj = js.Dynamic.literal(swanid = swanid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Swanid]
  }
  
  @scala.inline
  implicit class SwanidMutableBuilder[Self <: Swanid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSwanid(value: String): Self = StObject.set(x, "swanid", value.asInstanceOf[js.Any])
  }
}
