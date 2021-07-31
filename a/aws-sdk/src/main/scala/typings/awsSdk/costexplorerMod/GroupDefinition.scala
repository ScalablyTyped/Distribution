package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupDefinition extends StObject {
  
  /**
    * The string that represents a key for a specified group.
    */
  var Key: js.UndefOr[GroupDefinitionKey] = js.undefined
  
  /**
    * The string that represents the type of group.
    */
  var Type: js.UndefOr[GroupDefinitionType] = js.undefined
}
object GroupDefinition {
  
  @scala.inline
  def apply(): GroupDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupDefinition]
  }
  
  @scala.inline
  implicit class GroupDefinitionMutableBuilder[Self <: GroupDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: GroupDefinitionKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setType(value: GroupDefinitionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
