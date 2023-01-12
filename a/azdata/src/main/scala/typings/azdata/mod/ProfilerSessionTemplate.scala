package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerSessionTemplate extends StObject {
  
  /**
    * T-SQL for creating a session
    */
  var createStatement: String
  
  /**
    * Default view for template
    */
  var defaultView: String
  
  /**
    * Template name
    */
  var name: String
}
object ProfilerSessionTemplate {
  
  inline def apply(createStatement: String, defaultView: String, name: String): ProfilerSessionTemplate = {
    val __obj = js.Dynamic.literal(createStatement = createStatement.asInstanceOf[js.Any], defaultView = defaultView.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerSessionTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfilerSessionTemplate] (val x: Self) extends AnyVal {
    
    inline def setCreateStatement(value: String): Self = StObject.set(x, "createStatement", value.asInstanceOf[js.Any])
    
    inline def setDefaultView(value: String): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
