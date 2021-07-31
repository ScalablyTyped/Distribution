package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchyGroupSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hierarchy group.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the hierarchy group.
    */
  var Id: js.UndefOr[HierarchyGroupId] = js.undefined
  
  /**
    * The name of the hierarchy group.
    */
  var Name: js.UndefOr[HierarchyGroupName] = js.undefined
}
object HierarchyGroupSummary {
  
  @scala.inline
  def apply(): HierarchyGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyGroupSummary]
  }
  
  @scala.inline
  implicit class HierarchyGroupSummaryMutableBuilder[Self <: HierarchyGroupSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: HierarchyGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: HierarchyGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
