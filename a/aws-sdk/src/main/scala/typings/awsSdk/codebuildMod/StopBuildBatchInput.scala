package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopBuildBatchInput extends js.Object {
  
  /**
    * The identifier of the batch build to stop.
    */
  var id: NonEmptyString = js.native
}
object StopBuildBatchInput {
  
  @scala.inline
  def apply(id: NonEmptyString): StopBuildBatchInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBuildBatchInput]
  }
  
  @scala.inline
  implicit class StopBuildBatchInputOps[Self <: StopBuildBatchInput] (val x: Self) extends AnyVal {
    
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
    def setId(value: NonEmptyString): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
