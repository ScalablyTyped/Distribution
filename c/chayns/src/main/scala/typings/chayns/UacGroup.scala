package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.getUacGroups()
@js.native
trait UacGroup extends StObject {
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var showName: String = js.native
}
object UacGroup {
  
  @scala.inline
  def apply(id: Double, name: String, showName: String): UacGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], showName = showName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UacGroup]
  }
  
  @scala.inline
  implicit class UacGroupMutableBuilder[Self <: UacGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowName(value: String): Self = StObject.set(x, "showName", value.asInstanceOf[js.Any])
  }
}
