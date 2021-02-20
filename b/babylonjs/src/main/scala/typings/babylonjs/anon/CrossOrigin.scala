package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossOrigin extends StObject {
  
  var crossOrigin: String | Null = js.native
}
object CrossOrigin {
  
  @scala.inline
  def apply(): CrossOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossOrigin]
  }
  
  @scala.inline
  implicit class CrossOriginMutableBuilder[Self <: CrossOrigin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
  }
}
