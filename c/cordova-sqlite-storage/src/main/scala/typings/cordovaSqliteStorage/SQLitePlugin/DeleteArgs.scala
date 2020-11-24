package typings.cordovaSqliteStorage.SQLitePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteArgs extends js.Object {
  
  var iosDatabaseLocation: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var name: String = js.native
}
object DeleteArgs {
  
  @scala.inline
  def apply(name: String): DeleteArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteArgs]
  }
  
  @scala.inline
  implicit class DeleteArgsOps[Self <: DeleteArgs] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosDatabaseLocation(value: String): Self = this.set("iosDatabaseLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosDatabaseLocation: Self = this.set("iosDatabaseLocation", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
