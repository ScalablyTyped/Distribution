package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomData extends StObject {
  
  var filter: String
  
  var geotableId: Double
  
  var tags: String
}
object CustomData {
  
  inline def apply(filter: String, geotableId: Double, tags: String): CustomData = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], geotableId = geotableId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomData]
  }
  
  extension [Self <: CustomData](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setGeotableId(value: Double): Self = StObject.set(x, "geotableId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
