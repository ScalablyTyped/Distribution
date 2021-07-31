package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBSubnetGroupResult extends StObject {
  
  var DBSubnetGroup: js.UndefOr[typings.awsSdk.docdbMod.DBSubnetGroup] = js.undefined
}
object CreateDBSubnetGroupResult {
  
  @scala.inline
  def apply(): CreateDBSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBSubnetGroupResult]
  }
  
  @scala.inline
  implicit class CreateDBSubnetGroupResultMutableBuilder[Self <: CreateDBSubnetGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSubnetGroup(value: DBSubnetGroup): Self = StObject.set(x, "DBSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupUndefined: Self = StObject.set(x, "DBSubnetGroup", js.undefined)
  }
}
