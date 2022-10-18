package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericResourceFilter extends StObject {
  
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The tag name.
    */
  var tagname: js.UndefOr[String] = js.undefined
  
  /**
    * The tag value.
    */
  var tagvalue: js.UndefOr[String] = js.undefined
}
object GenericResourceFilter {
  
  inline def apply(): GenericResourceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericResourceFilter]
  }
  
  extension [Self <: GenericResourceFilter](x: Self) {
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setTagname(value: String): Self = StObject.set(x, "tagname", value.asInstanceOf[js.Any])
    
    inline def setTagnameUndefined: Self = StObject.set(x, "tagname", js.undefined)
    
    inline def setTagvalue(value: String): Self = StObject.set(x, "tagvalue", value.asInstanceOf[js.Any])
    
    inline def setTagvalueUndefined: Self = StObject.set(x, "tagvalue", js.undefined)
  }
}
