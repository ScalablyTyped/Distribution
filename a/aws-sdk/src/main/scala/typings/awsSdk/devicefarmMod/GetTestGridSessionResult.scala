package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTestGridSessionResult extends js.Object {
  
  /**
    * The TestGridSession that was requested.
    */
  var testGridSession: js.UndefOr[TestGridSession] = js.native
}
object GetTestGridSessionResult {
  
  @scala.inline
  def apply(): GetTestGridSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTestGridSessionResult]
  }
  
  @scala.inline
  implicit class GetTestGridSessionResultOps[Self <: GetTestGridSessionResult] (val x: Self) extends AnyVal {
    
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
    def setTestGridSession(value: TestGridSession): Self = this.set("testGridSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestGridSession: Self = this.set("testGridSession", js.undefined)
  }
}
