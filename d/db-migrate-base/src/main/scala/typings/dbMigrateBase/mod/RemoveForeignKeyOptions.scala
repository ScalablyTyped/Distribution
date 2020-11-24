package typings.dbMigrateBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveForeignKeyOptions extends js.Object {
  
  var dropIndex: js.UndefOr[Boolean] = js.native
}
object RemoveForeignKeyOptions {
  
  @scala.inline
  def apply(): RemoveForeignKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveForeignKeyOptions]
  }
  
  @scala.inline
  implicit class RemoveForeignKeyOptionsOps[Self <: RemoveForeignKeyOptions] (val x: Self) extends AnyVal {
    
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
    def setDropIndex(value: Boolean): Self = this.set("dropIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropIndex: Self = this.set("dropIndex", js.undefined)
  }
}
