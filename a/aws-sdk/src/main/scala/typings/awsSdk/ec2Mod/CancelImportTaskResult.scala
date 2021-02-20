package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelImportTaskResult extends StObject {
  
  /**
    * The ID of the task being canceled.
    */
  var ImportTaskId: js.UndefOr[String] = js.native
  
  /**
    * The current state of the task being canceled.
    */
  var PreviousState: js.UndefOr[String] = js.native
  
  /**
    * The current state of the task being canceled.
    */
  var State: js.UndefOr[String] = js.native
}
object CancelImportTaskResult {
  
  @scala.inline
  def apply(): CancelImportTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelImportTaskResult]
  }
  
  @scala.inline
  implicit class CancelImportTaskResultMutableBuilder[Self <: CancelImportTaskResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportTaskId(value: String): Self = StObject.set(x, "ImportTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportTaskIdUndefined: Self = StObject.set(x, "ImportTaskId", js.undefined)
    
    @scala.inline
    def setPreviousState(value: String): Self = StObject.set(x, "PreviousState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousStateUndefined: Self = StObject.set(x, "PreviousState", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
