package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/environment.EnvironmentProps, 'sys'> */
@js.native
trait OmitEnvironmentPropssys extends StObject {
  
  var name: String = js.native
}
object OmitEnvironmentPropssys {
  
  @scala.inline
  def apply(name: String): OmitEnvironmentPropssys = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitEnvironmentPropssys]
  }
  
  @scala.inline
  implicit class OmitEnvironmentPropssysMutableBuilder[Self <: OmitEnvironmentPropssys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
