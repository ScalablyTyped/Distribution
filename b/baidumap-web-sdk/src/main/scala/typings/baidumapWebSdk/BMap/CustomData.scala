package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomData extends StObject {
  
  var filter: String = js.native
  
  var geotableId: Double = js.native
  
  var tags: String = js.native
}
object CustomData {
  
  @scala.inline
  def apply(filter: String, geotableId: Double, tags: String): CustomData = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], geotableId = geotableId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomData]
  }
  
  @scala.inline
  implicit class CustomDataMutableBuilder[Self <: CustomData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeotableId(value: Double): Self = StObject.set(x, "geotableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
