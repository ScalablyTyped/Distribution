package typings.dbMigrateBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForeignKeySpec extends js.Object {
  
  var mapping: String | js.Any = js.native
  
  var name: String = js.native
  
  var rules: js.UndefOr[ForeignKeyRules] = js.native
  
  var table: String = js.native
}
object ForeignKeySpec {
  
  @scala.inline
  def apply(mapping: String | js.Any, name: String, table: String): ForeignKeySpec = {
    val __obj = js.Dynamic.literal(mapping = mapping.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeignKeySpec]
  }
  
  @scala.inline
  implicit class ForeignKeySpecOps[Self <: ForeignKeySpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMapping(value: String | js.Any): Self = this.set("mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: ForeignKeyRules): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
}
