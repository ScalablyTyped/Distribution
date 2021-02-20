package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uuid extends StObject {
  
  var data: js.Array[integer] = js.native
  
  var uuid: String = js.native
}
object Uuid {
  
  @scala.inline
  def apply(data: js.Array[integer], uuid: String): Uuid = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uuid]
  }
  
  @scala.inline
  implicit class UuidMutableBuilder[Self <: Uuid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[integer]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: integer*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
