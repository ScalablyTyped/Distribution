package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBSecurityGroupResult extends StObject {
  
  var DBSecurityGroup: js.UndefOr[typings.awsSdk.rdsMod.DBSecurityGroup] = js.undefined
}
object CreateDBSecurityGroupResult {
  
  @scala.inline
  def apply(): CreateDBSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBSecurityGroupResult]
  }
  
  @scala.inline
  implicit class CreateDBSecurityGroupResultMutableBuilder[Self <: CreateDBSecurityGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSecurityGroup(value: DBSecurityGroup): Self = StObject.set(x, "DBSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSecurityGroupUndefined: Self = StObject.set(x, "DBSecurityGroup", js.undefined)
  }
}
