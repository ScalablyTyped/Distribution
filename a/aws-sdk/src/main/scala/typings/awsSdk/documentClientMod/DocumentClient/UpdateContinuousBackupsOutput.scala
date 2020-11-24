package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContinuousBackupsOutput extends js.Object {
  
  /**
    * Represents the continuous backups and point in time recovery settings on the table.
    */
  var ContinuousBackupsDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ContinuousBackupsDescription] = js.native
}
object UpdateContinuousBackupsOutput {
  
  @scala.inline
  def apply(): UpdateContinuousBackupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContinuousBackupsOutput]
  }
  
  @scala.inline
  implicit class UpdateContinuousBackupsOutputOps[Self <: UpdateContinuousBackupsOutput] (val x: Self) extends AnyVal {
    
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
    def setContinuousBackupsDescription(value: ContinuousBackupsDescription): Self = this.set("ContinuousBackupsDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuousBackupsDescription: Self = this.set("ContinuousBackupsDescription", js.undefined)
  }
}
