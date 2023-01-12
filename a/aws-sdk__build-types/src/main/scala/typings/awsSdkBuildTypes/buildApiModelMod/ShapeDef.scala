package typings.awsSdkBuildTypes.buildApiModelMod

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
  
  inline def apply(`type`: Type): ShapeDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeDef] (val x: Self) extends AnyVal {
    
    inline def setDeprecated(value: scala.Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDocumentation(value: java.lang.String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setSensitive(value: scala.Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
    
    inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
