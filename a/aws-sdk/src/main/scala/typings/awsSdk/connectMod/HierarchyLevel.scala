package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchyLevel extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hierarchy level.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the hierarchy level.
    */
  var Id: js.UndefOr[HierarchyLevelId] = js.undefined
  
  /**
    * The name of the hierarchy level.
    */
  var Name: js.UndefOr[HierarchyLevelName] = js.undefined
}
object HierarchyLevel {
  
  @scala.inline
  def apply(): HierarchyLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyLevel]
  }
  
  @scala.inline
  implicit class HierarchyLevelMutableBuilder[Self <: HierarchyLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: HierarchyLevelId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: HierarchyLevelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
