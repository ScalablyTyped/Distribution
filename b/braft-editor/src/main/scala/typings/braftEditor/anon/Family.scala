package typings.braftEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Family extends StObject {
  
  var family: String = js.native
  
  var name: String = js.native
}
object Family {
  
  @scala.inline
  def apply(family: String, name: String): Family = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Family]
  }
  
  @scala.inline
  implicit class FamilyMutableBuilder[Self <: Family] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
