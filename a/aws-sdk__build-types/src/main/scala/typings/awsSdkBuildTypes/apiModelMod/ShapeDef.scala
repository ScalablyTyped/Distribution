package typings.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeDef extends StObject {
  
  var deprecated: js.UndefOr[scala.Boolean] = js.undefined
  
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  
  var sensitive: js.UndefOr[scala.Boolean] = js.undefined
  
  val `type`: Type
}
object ShapeDef {
  
  @scala.inline
  def apply(`type`: Type): ShapeDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeDef]
  }
  
  @scala.inline
  implicit class ShapeDefMutableBuilder[Self <: ShapeDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecated(value: scala.Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDocumentation(value: java.lang.String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setSensitive(value: scala.Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
