package typings.dbMigrateBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnSpec extends js.Object {
  
  var autoIncrement: js.UndefOr[Boolean] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var foreignKey: js.UndefOr[ForeignKeySpec] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var notNull: js.UndefOr[Boolean] = js.native
  
  var primaryKey: js.UndefOr[Boolean] = js.native
  
  var `type`: String = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
  
  var unsigned: js.UndefOr[Boolean] = js.native
}
object ColumnSpec {
  
  @scala.inline
  def apply(`type`: String): ColumnSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSpec]
  }
  
  @scala.inline
  implicit class ColumnSpecOps[Self <: ColumnSpec] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIncrement(value: Boolean): Self = this.set("autoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoIncrement: Self = this.set("autoIncrement", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setForeignKey(value: ForeignKeySpec): Self = this.set("foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeignKey: Self = this.set("foreignKey", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setNotNull(value: Boolean): Self = this.set("notNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotNull: Self = this.set("notNull", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: Boolean): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    
    @scala.inline
    def setUnsigned(value: Boolean): Self = this.set("unsigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsigned: Self = this.set("unsigned", js.undefined)
  }
}
