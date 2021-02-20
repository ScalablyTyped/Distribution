package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBParameterGroupResult extends StObject {
  
  var DBParameterGroup: js.UndefOr[typings.awsSdk.rdsMod.DBParameterGroup] = js.native
}
object CreateDBParameterGroupResult {
  
  @scala.inline
  def apply(): CreateDBParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBParameterGroupResult]
  }
  
  @scala.inline
  implicit class CreateDBParameterGroupResultMutableBuilder[Self <: CreateDBParameterGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBParameterGroup(value: DBParameterGroup): Self = StObject.set(x, "DBParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBParameterGroupUndefined: Self = StObject.set(x, "DBParameterGroup", js.undefined)
  }
}
