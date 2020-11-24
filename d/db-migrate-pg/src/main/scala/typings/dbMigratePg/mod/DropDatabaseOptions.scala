package typings.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDatabaseOptions extends js.Object {
  
  var ifExists: js.UndefOr[Boolean] = js.native
}
object DropDatabaseOptions {
  
  @scala.inline
  def apply(): DropDatabaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDatabaseOptions]
  }
  
  @scala.inline
  implicit class DropDatabaseOptionsOps[Self <: DropDatabaseOptions] (val x: Self) extends AnyVal {
    
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
    def setIfExists(value: Boolean): Self = this.set("ifExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfExists: Self = this.set("ifExists", js.undefined)
  }
}
