package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/team.TeamProps, 'sys'> */
@js.native
trait OmitTeamPropssys extends StObject {
  
  var description: String = js.native
  
  var name: String = js.native
}
object OmitTeamPropssys {
  
  @scala.inline
  def apply(description: String, name: String): OmitTeamPropssys = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTeamPropssys]
  }
  
  @scala.inline
  implicit class OmitTeamPropssysMutableBuilder[Self <: OmitTeamPropssys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
