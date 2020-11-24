package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBSubnetGroupResult extends js.Object {
  
  var DBSubnetGroup: js.UndefOr[typings.awsSdk.docdbMod.DBSubnetGroup] = js.native
}
object ModifyDBSubnetGroupResult {
  
  @scala.inline
  def apply(): ModifyDBSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBSubnetGroupResult]
  }
  
  @scala.inline
  implicit class ModifyDBSubnetGroupResultOps[Self <: ModifyDBSubnetGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDBSubnetGroup(value: DBSubnetGroup): Self = this.set("DBSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBSubnetGroup: Self = this.set("DBSubnetGroup", js.undefined)
  }
}
