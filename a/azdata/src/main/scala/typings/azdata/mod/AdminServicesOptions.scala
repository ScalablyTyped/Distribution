package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminServicesOptions extends js.Object {
  
  var databaseFileInfoOptions: js.Array[ServiceOption] = js.native
  
  var databaseInfoOptions: js.Array[ServiceOption] = js.native
  
  var fileGroupInfoOptions: js.Array[ServiceOption] = js.native
}
object AdminServicesOptions {
  
  @scala.inline
  def apply(
    databaseFileInfoOptions: js.Array[ServiceOption],
    databaseInfoOptions: js.Array[ServiceOption],
    fileGroupInfoOptions: js.Array[ServiceOption]
  ): AdminServicesOptions = {
    val __obj = js.Dynamic.literal(databaseFileInfoOptions = databaseFileInfoOptions.asInstanceOf[js.Any], databaseInfoOptions = databaseInfoOptions.asInstanceOf[js.Any], fileGroupInfoOptions = fileGroupInfoOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminServicesOptions]
  }
  
  @scala.inline
  implicit class AdminServicesOptionsOps[Self <: AdminServicesOptions] (val x: Self) extends AnyVal {
    
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
    def setDatabaseFileInfoOptionsVarargs(value: ServiceOption*): Self = this.set("databaseFileInfoOptions", js.Array(value :_*))
    
    @scala.inline
    def setDatabaseFileInfoOptions(value: js.Array[ServiceOption]): Self = this.set("databaseFileInfoOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseInfoOptionsVarargs(value: ServiceOption*): Self = this.set("databaseInfoOptions", js.Array(value :_*))
    
    @scala.inline
    def setDatabaseInfoOptions(value: js.Array[ServiceOption]): Self = this.set("databaseInfoOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileGroupInfoOptionsVarargs(value: ServiceOption*): Self = this.set("fileGroupInfoOptions", js.Array(value :_*))
    
    @scala.inline
    def setFileGroupInfoOptions(value: js.Array[ServiceOption]): Self = this.set("fileGroupInfoOptions", value.asInstanceOf[js.Any])
  }
}
