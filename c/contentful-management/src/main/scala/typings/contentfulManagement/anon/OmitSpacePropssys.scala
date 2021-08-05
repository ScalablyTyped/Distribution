package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/space.SpaceProps, 'sys'> */
trait OmitSpacePropssys extends StObject {
  
  var name: String
}
object OmitSpacePropssys {
  
  inline def apply(name: String): OmitSpacePropssys = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitSpacePropssys]
  }
  
  extension [Self <: OmitSpacePropssys](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
