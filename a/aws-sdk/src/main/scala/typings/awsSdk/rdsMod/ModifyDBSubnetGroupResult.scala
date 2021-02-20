package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBSubnetGroupResult extends StObject {
  
  var DBSubnetGroup: js.UndefOr[typings.awsSdk.rdsMod.DBSubnetGroup] = js.native
}
object ModifyDBSubnetGroupResult {
  
  @scala.inline
  def apply(): ModifyDBSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBSubnetGroupResult]
  }
  
  @scala.inline
  implicit class ModifyDBSubnetGroupResultMutableBuilder[Self <: ModifyDBSubnetGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSubnetGroup(value: DBSubnetGroup): Self = StObject.set(x, "DBSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupUndefined: Self = StObject.set(x, "DBSubnetGroup", js.undefined)
  }
}
