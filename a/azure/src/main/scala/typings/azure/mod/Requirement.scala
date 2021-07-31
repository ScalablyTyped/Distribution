package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requirement extends StObject {
  
  var SettingName: String
  
  var SettingPredicate: js.Function
}
object Requirement {
  
  @scala.inline
  def apply(SettingName: String, SettingPredicate: js.Function): Requirement = {
    val __obj = js.Dynamic.literal(SettingName = SettingName.asInstanceOf[js.Any], SettingPredicate = SettingPredicate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requirement]
  }
  
  @scala.inline
  implicit class RequirementMutableBuilder[Self <: Requirement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSettingName(value: String): Self = StObject.set(x, "SettingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingPredicate(value: js.Function): Self = StObject.set(x, "SettingPredicate", value.asInstanceOf[js.Any])
  }
}
