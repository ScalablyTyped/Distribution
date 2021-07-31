package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopExecutionOutput extends StObject {
  
  /**
    * The date the execution is stopped.
    */
  var stopDate: Timestamp
}
object StopExecutionOutput {
  
  @scala.inline
  def apply(stopDate: Timestamp): StopExecutionOutput = {
    val __obj = js.Dynamic.literal(stopDate = stopDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopExecutionOutput]
  }
  
  @scala.inline
  implicit class StopExecutionOutputMutableBuilder[Self <: StopExecutionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStopDate(value: Timestamp): Self = StObject.set(x, "stopDate", value.asInstanceOf[js.Any])
  }
}
