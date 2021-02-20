package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/ui-extension.UIExtensionProps, 'sys'> */
@js.native
trait OmitUIExtensionPropssys extends StObject {
  
  var extension: FieldTypes = js.native
}
object OmitUIExtensionPropssys {
  
  @scala.inline
  def apply(extension: FieldTypes): OmitUIExtensionPropssys = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitUIExtensionPropssys]
  }
  
  @scala.inline
  implicit class OmitUIExtensionPropssysMutableBuilder[Self <: OmitUIExtensionPropssys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: FieldTypes): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
  }
}
