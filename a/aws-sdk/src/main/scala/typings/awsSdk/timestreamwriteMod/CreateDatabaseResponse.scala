package typings.awsSdk.timestreamwriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDatabaseResponse extends js.Object {
  
  /**
    * The newly created Timestream database.
    */
  var Database: js.UndefOr[typings.awsSdk.timestreamwriteMod.Database] = js.native
}
object CreateDatabaseResponse {
  
  @scala.inline
  def apply(): CreateDatabaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatabaseResponse]
  }
  
  @scala.inline
  implicit class CreateDatabaseResponseOps[Self <: CreateDatabaseResponse] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: Database): Self = this.set("Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("Database", js.undefined)
  }
}
