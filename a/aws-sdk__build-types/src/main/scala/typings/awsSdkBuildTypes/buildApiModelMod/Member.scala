package typings.awsSdkBuildTypes.buildApiModelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Member extends StObject {
  
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  
  var flattened: js.UndefOr[scala.Boolean] = js.undefined
  
  var locationName: js.UndefOr[java.lang.String] = js.undefined
  
  var shape: java.lang.String
  
  var xmlAttribute: js.UndefOr[scala.Boolean] = js.undefined
}
object Member {
  
  inline def apply(shape: java.lang.String): Member = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Member] (val x: Self) extends AnyVal {
    
    inline def setDocumentation(value: java.lang.String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setFlattened(value: scala.Boolean): Self = StObject.set(x, "flattened", value.asInstanceOf[js.Any])
    
    inline def setFlattenedUndefined: Self = StObject.set(x, "flattened", js.undefined)
    
    inline def setLocationName(value: java.lang.String): Self = StObject.set(x, "locationName", value.asInstanceOf[js.Any])
    
    inline def setLocationNameUndefined: Self = StObject.set(x, "locationName", js.undefined)
    
    inline def setShape(value: java.lang.String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setXmlAttribute(value: scala.Boolean): Self = StObject.set(x, "xmlAttribute", value.asInstanceOf[js.Any])
    
    inline def setXmlAttributeUndefined: Self = StObject.set(x, "xmlAttribute", js.undefined)
  }
}
