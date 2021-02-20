package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyDBParameterGroupResult extends StObject {
  
  var DBParameterGroup: js.UndefOr[typings.awsSdk.neptuneMod.DBParameterGroup] = js.native
}
object CopyDBParameterGroupResult {
  
  @scala.inline
  def apply(): CopyDBParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDBParameterGroupResult]
  }
  
  @scala.inline
  implicit class CopyDBParameterGroupResultMutableBuilder[Self <: CopyDBParameterGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBParameterGroup(value: DBParameterGroup): Self = StObject.set(x, "DBParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBParameterGroupUndefined: Self = StObject.set(x, "DBParameterGroup", js.undefined)
  }
}
