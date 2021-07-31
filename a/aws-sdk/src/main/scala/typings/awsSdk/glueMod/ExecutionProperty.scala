package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionProperty extends StObject {
  
  /**
    * The maximum number of concurrent runs allowed for the job. The default is 1. An error is returned when this threshold is reached. The maximum value you can specify is controlled by a service limit.
    */
  var MaxConcurrentRuns: js.UndefOr[typings.awsSdk.glueMod.MaxConcurrentRuns] = js.undefined
}
object ExecutionProperty {
  
  @scala.inline
  def apply(): ExecutionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionProperty]
  }
  
  @scala.inline
  implicit class ExecutionPropertyMutableBuilder[Self <: ExecutionProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxConcurrentRuns(value: MaxConcurrentRuns): Self = StObject.set(x, "MaxConcurrentRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentRunsUndefined: Self = StObject.set(x, "MaxConcurrentRuns", js.undefined)
  }
}
