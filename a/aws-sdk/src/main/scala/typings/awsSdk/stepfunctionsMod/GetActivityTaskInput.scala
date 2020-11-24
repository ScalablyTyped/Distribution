package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetActivityTaskInput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the activity to retrieve tasks from (assigned when you create the task using CreateActivity.)
    */
  var activityArn: Arn = js.native
  
  /**
    * You can provide an arbitrary name in order to identify the worker that the task is assigned to. This name is used when it is logged in the execution history.
    */
  var workerName: js.UndefOr[Name] = js.native
}
object GetActivityTaskInput {
  
  @scala.inline
  def apply(activityArn: Arn): GetActivityTaskInput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActivityTaskInput]
  }
  
  @scala.inline
  implicit class GetActivityTaskInputOps[Self <: GetActivityTaskInput] (val x: Self) extends AnyVal {
    
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
    def setActivityArn(value: Arn): Self = this.set("activityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerName(value: Name): Self = this.set("workerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerName: Self = this.set("workerName", js.undefined)
  }
}
