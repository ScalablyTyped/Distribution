package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requirement extends StObject {
  
  var SettingName: String
  
  var SettingPredicate: js.Function
}
object Requirement {
  
  inline def apply(SettingName: String, SettingPredicate: js.Function): Requirement = {
    val __obj = js.Dynamic.literal(SettingName = SettingName.asInstanceOf[js.Any], SettingPredicate = SettingPredicate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requirement]
  }
  
  extension [Self <: Requirement](x: Self) {
    
    inline def setSettingName(value: String): Self = StObject.set(x, "SettingName", value.asInstanceOf[js.Any])
    
    inline def setSettingPredicate(value: js.Function): Self = StObject.set(x, "SettingPredicate", value.asInstanceOf[js.Any])
  }
}
