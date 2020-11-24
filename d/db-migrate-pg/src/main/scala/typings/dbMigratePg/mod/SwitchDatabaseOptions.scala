package typings.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchDatabaseOptions extends js.Object {
  
  var database: js.UndefOr[String] = js.native
}
object SwitchDatabaseOptions {
  
  @scala.inline
  def apply(): SwitchDatabaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchDatabaseOptions]
  }
  
  @scala.inline
  implicit class SwitchDatabaseOptionsOps[Self <: SwitchDatabaseOptions] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
  }
}
