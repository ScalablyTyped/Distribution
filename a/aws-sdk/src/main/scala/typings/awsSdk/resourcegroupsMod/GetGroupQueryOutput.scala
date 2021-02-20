package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroupQueryOutput extends StObject {
  
  /**
    * The resource query associated with the specified group.
    */
  var GroupQuery: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupQuery] = js.native
}
object GetGroupQueryOutput {
  
  @scala.inline
  def apply(): GetGroupQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupQueryOutput]
  }
  
  @scala.inline
  implicit class GetGroupQueryOutputMutableBuilder[Self <: GetGroupQueryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupQuery(value: GroupQuery): Self = StObject.set(x, "GroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupQueryUndefined: Self = StObject.set(x, "GroupQuery", js.undefined)
  }
}
