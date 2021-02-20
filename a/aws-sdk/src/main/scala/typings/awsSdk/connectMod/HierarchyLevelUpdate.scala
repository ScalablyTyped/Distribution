package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyLevelUpdate extends StObject {
  
  /**
    * The name of the user hierarchy level. Must not be more than 50 characters.
    */
  var Name: HierarchyLevelName = js.native
}
object HierarchyLevelUpdate {
  
  @scala.inline
  def apply(Name: HierarchyLevelName): HierarchyLevelUpdate = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyLevelUpdate]
  }
  
  @scala.inline
  implicit class HierarchyLevelUpdateMutableBuilder[Self <: HierarchyLevelUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: HierarchyLevelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
