package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchyGroupSummaryReference extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the hierarchy group. 
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The unique identifier for the hierarchy group.
    */
  var Id: js.UndefOr[HierarchyGroupId] = js.undefined
}
object HierarchyGroupSummaryReference {
  
  inline def apply(): HierarchyGroupSummaryReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyGroupSummaryReference]
  }
  
  extension [Self <: HierarchyGroupSummaryReference](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: HierarchyGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
