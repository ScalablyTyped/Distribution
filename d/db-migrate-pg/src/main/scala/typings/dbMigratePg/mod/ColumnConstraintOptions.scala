package typings.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnConstraintOptions extends js.Object {
  
  var emitPrimaryKey: js.UndefOr[Boolean] = js.native
}
object ColumnConstraintOptions {
  
  @scala.inline
  def apply(): ColumnConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnConstraintOptions]
  }
  
  @scala.inline
  implicit class ColumnConstraintOptionsOps[Self <: ColumnConstraintOptions] (val x: Self) extends AnyVal {
    
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
    def setEmitPrimaryKey(value: Boolean): Self = this.set("emitPrimaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitPrimaryKey: Self = this.set("emitPrimaryKey", js.undefined)
  }
}
