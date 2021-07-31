package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalNodeGroup extends StObject {
  
  /**
    * The name of the global node group
    */
  var GlobalNodeGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The keyspace for this node group
    */
  var Slots: js.UndefOr[String] = js.undefined
}
object GlobalNodeGroup {
  
  @scala.inline
  def apply(): GlobalNodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalNodeGroup]
  }
  
  @scala.inline
  implicit class GlobalNodeGroupMutableBuilder[Self <: GlobalNodeGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalNodeGroupId(value: String): Self = StObject.set(x, "GlobalNodeGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNodeGroupIdUndefined: Self = StObject.set(x, "GlobalNodeGroupId", js.undefined)
    
    @scala.inline
    def setSlots(value: String): Self = StObject.set(x, "Slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsUndefined: Self = StObject.set(x, "Slots", js.undefined)
  }
}
