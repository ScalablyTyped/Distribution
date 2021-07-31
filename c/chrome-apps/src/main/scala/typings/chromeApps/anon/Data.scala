package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.Array[integer]
  
  var id: integer
}
object Data {
  
  @scala.inline
  def apply(data: js.Array[integer], id: integer): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[integer]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: integer*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setId(value: integer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
