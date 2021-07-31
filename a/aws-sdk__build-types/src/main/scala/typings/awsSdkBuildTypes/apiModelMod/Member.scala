package typings.awsSdkBuildTypes.apiModelMod

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
  
  @scala.inline
  def apply(shape: java.lang.String): Member = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
  
  @scala.inline
  implicit class MemberMutableBuilder[Self <: Member] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentation(value: java.lang.String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setFlattened(value: scala.Boolean): Self = StObject.set(x, "flattened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenedUndefined: Self = StObject.set(x, "flattened", js.undefined)
    
    @scala.inline
    def setLocationName(value: java.lang.String): Self = StObject.set(x, "locationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNameUndefined: Self = StObject.set(x, "locationName", js.undefined)
    
    @scala.inline
    def setShape(value: java.lang.String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlAttribute(value: scala.Boolean): Self = StObject.set(x, "xmlAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlAttributeUndefined: Self = StObject.set(x, "xmlAttribute", js.undefined)
  }
}
