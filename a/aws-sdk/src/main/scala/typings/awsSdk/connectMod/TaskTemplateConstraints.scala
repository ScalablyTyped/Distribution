package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskTemplateConstraints extends StObject {
  
  /**
    * Lists the fields that are invisible to agents.
    */
  var InvisibleFields: js.UndefOr[InvisibleTaskTemplateFields] = js.undefined
  
  /**
    * Lists the fields that are read-only to agents, and cannot be edited.
    */
  var ReadOnlyFields: js.UndefOr[ReadOnlyTaskTemplateFields] = js.undefined
  
  /**
    * Lists the fields that are required to be filled by agents.
    */
  var RequiredFields: js.UndefOr[RequiredTaskTemplateFields] = js.undefined
}
object TaskTemplateConstraints {
  
  inline def apply(): TaskTemplateConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskTemplateConstraints]
  }
  
  extension [Self <: TaskTemplateConstraints](x: Self) {
    
    inline def setInvisibleFields(value: InvisibleTaskTemplateFields): Self = StObject.set(x, "InvisibleFields", value.asInstanceOf[js.Any])
    
    inline def setInvisibleFieldsUndefined: Self = StObject.set(x, "InvisibleFields", js.undefined)
    
    inline def setInvisibleFieldsVarargs(value: InvisibleFieldInfo*): Self = StObject.set(x, "InvisibleFields", js.Array(value*))
    
    inline def setReadOnlyFields(value: ReadOnlyTaskTemplateFields): Self = StObject.set(x, "ReadOnlyFields", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyFieldsUndefined: Self = StObject.set(x, "ReadOnlyFields", js.undefined)
    
    inline def setReadOnlyFieldsVarargs(value: ReadOnlyFieldInfo*): Self = StObject.set(x, "ReadOnlyFields", js.Array(value*))
    
    inline def setRequiredFields(value: RequiredTaskTemplateFields): Self = StObject.set(x, "RequiredFields", value.asInstanceOf[js.Any])
    
    inline def setRequiredFieldsUndefined: Self = StObject.set(x, "RequiredFields", js.undefined)
    
    inline def setRequiredFieldsVarargs(value: RequiredFieldInfo*): Self = StObject.set(x, "RequiredFields", js.Array(value*))
  }
}
