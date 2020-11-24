package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseResult extends js.Object {
  
  /**
    * An object describing the specified database.
    */
  var relationalDatabase: js.UndefOr[RelationalDatabase] = js.native
}
object GetRelationalDatabaseResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseResultOps[Self <: GetRelationalDatabaseResult] (val x: Self) extends AnyVal {
    
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
    def setRelationalDatabase(value: RelationalDatabase): Self = this.set("relationalDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationalDatabase: Self = this.set("relationalDatabase", js.undefined)
  }
}
