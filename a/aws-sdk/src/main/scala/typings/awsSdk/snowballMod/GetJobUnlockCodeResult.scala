package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobUnlockCodeResult extends js.Object {
  
  /**
    * The UnlockCode value for the specified job. The UnlockCode value can be accessed for up to 90 days after the job has been created.
    */
  var UnlockCode: js.UndefOr[String] = js.native
}
object GetJobUnlockCodeResult {
  
  @scala.inline
  def apply(): GetJobUnlockCodeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobUnlockCodeResult]
  }
  
  @scala.inline
  implicit class GetJobUnlockCodeResultOps[Self <: GetJobUnlockCodeResult] (val x: Self) extends AnyVal {
    
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
    def setUnlockCode(value: String): Self = this.set("UnlockCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnlockCode: Self = this.set("UnlockCode", js.undefined)
  }
}
