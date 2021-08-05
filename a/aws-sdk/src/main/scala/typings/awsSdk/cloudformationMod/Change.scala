package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  /**
    * A ResourceChange structure that describes the resource and action that AWS CloudFormation will perform.
    */
  var ResourceChange: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceChange] = js.undefined
  
  /**
    * The type of entity that AWS CloudFormation changes. Currently, the only entity type is Resource.
    */
  var Type: js.UndefOr[ChangeType] = js.undefined
}
object Change {
  
  inline def apply(): Change = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Change]
  }
  
  extension [Self <: Change](x: Self) {
    
    inline def setResourceChange(value: ResourceChange): Self = StObject.set(x, "ResourceChange", value.asInstanceOf[js.Any])
    
    inline def setResourceChangeUndefined: Self = StObject.set(x, "ResourceChange", js.undefined)
    
    inline def setType(value: ChangeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
