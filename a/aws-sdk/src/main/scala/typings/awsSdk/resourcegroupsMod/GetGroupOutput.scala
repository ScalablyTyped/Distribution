package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupOutput extends StObject {
  
  /**
    * A full description of the resource group.
    */
  var Group: js.UndefOr[typings.awsSdk.resourcegroupsMod.Group] = js.undefined
}
object GetGroupOutput {
  
  inline def apply(): GetGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupOutput]
  }
  
  extension [Self <: GetGroupOutput](x: Self) {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
