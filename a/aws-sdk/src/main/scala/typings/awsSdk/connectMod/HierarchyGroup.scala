package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchyGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hierarchy group.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Information about the levels in the hierarchy group.
    */
  var HierarchyPath: js.UndefOr[typings.awsSdk.connectMod.HierarchyPath] = js.undefined
  
  /**
    * The identifier of the hierarchy group.
    */
  var Id: js.UndefOr[HierarchyGroupId] = js.undefined
  
  /**
    * The identifier of the level in the hierarchy group.
    */
  var LevelId: js.UndefOr[HierarchyLevelId] = js.undefined
  
  /**
    * The name of the hierarchy group.
    */
  var Name: js.UndefOr[HierarchyGroupName] = js.undefined
}
object HierarchyGroup {
  
  @scala.inline
  def apply(): HierarchyGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyGroup]
  }
  
  @scala.inline
  implicit class HierarchyGroupMutableBuilder[Self <: HierarchyGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setHierarchyPath(value: HierarchyPath): Self = StObject.set(x, "HierarchyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyPathUndefined: Self = StObject.set(x, "HierarchyPath", js.undefined)
    
    @scala.inline
    def setId(value: HierarchyGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLevelId(value: HierarchyLevelId): Self = StObject.set(x, "LevelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelIdUndefined: Self = StObject.set(x, "LevelId", js.undefined)
    
    @scala.inline
    def setName(value: HierarchyGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
