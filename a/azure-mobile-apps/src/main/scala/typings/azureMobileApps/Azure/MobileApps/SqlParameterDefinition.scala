package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlParameterDefinition extends StObject {
  
  var name: String
  
  var value: js.Any
}
object SqlParameterDefinition {
  
  @scala.inline
  def apply(name: String, value: js.Any): SqlParameterDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlParameterDefinition]
  }
  
  @scala.inline
  implicit class SqlParameterDefinitionMutableBuilder[Self <: SqlParameterDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
