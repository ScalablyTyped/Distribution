package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Problem extends js.Object {
  
  /**
    * Information about the associated device.
    */
  var device: js.UndefOr[Device] = js.native
  
  /**
    * Information about the associated job.
    */
  var job: js.UndefOr[ProblemDetail] = js.native
  
  /**
    * A message about the problem's result.
    */
  var message: js.UndefOr[Message] = js.native
  
  /**
    * The problem's result. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var result: js.UndefOr[ExecutionResult] = js.native
  
  /**
    * Information about the associated run.
    */
  var run: js.UndefOr[ProblemDetail] = js.native
  
  /**
    * Information about the associated suite.
    */
  var suite: js.UndefOr[ProblemDetail] = js.native
  
  /**
    * Information about the associated test.
    */
  var test: js.UndefOr[ProblemDetail] = js.native
}
object Problem {
  
  @scala.inline
  def apply(): Problem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Problem]
  }
  
  @scala.inline
  implicit class ProblemOps[Self <: Problem] (val x: Self) extends AnyVal {
    
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
    def setDevice(value: Device): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setJob(value: ProblemDetail): Self = this.set("job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob: Self = this.set("job", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setResult(value: ExecutionResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setRun(value: ProblemDetail): Self = this.set("run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
    
    @scala.inline
    def setSuite(value: ProblemDetail): Self = this.set("suite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuite: Self = this.set("suite", js.undefined)
    
    @scala.inline
    def setTest(value: ProblemDetail): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
