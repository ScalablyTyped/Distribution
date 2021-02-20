package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGroupQueryOutput extends StObject {
  
  /**
    * The updated resource query associated with the resource group after the update.
    */
  var GroupQuery: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupQuery] = js.native
}
object UpdateGroupQueryOutput {
  
  @scala.inline
  def apply(): UpdateGroupQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupQueryOutput]
  }
  
  @scala.inline
  implicit class UpdateGroupQueryOutputMutableBuilder[Self <: UpdateGroupQueryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupQuery(value: GroupQuery): Self = StObject.set(x, "GroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupQueryUndefined: Self = StObject.set(x, "GroupQuery", js.undefined)
  }
}
