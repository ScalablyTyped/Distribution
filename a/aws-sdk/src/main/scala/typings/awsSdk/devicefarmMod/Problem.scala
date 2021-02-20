package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Problem extends StObject {
  
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
  implicit class ProblemMutableBuilder[Self <: Problem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setJob(value: ProblemDetail): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setResult(value: ExecutionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setRun(value: ProblemDetail): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    
    @scala.inline
    def setSuite(value: ProblemDetail): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuiteUndefined: Self = StObject.set(x, "suite", js.undefined)
    
    @scala.inline
    def setTest(value: ProblemDetail): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
