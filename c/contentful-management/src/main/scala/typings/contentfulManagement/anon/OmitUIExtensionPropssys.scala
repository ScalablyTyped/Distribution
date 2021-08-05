package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/ui-extension.UIExtensionProps, 'sys'> */
trait OmitUIExtensionPropssys extends StObject {
  
  var `extension`: FieldTypes
}
object OmitUIExtensionPropssys {
  
  inline def apply(`extension`: FieldTypes): OmitUIExtensionPropssys = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitUIExtensionPropssys]
  }
  
  extension [Self <: OmitUIExtensionPropssys](x: Self) {
    
    inline def setExtension(value: FieldTypes): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
  }
}
