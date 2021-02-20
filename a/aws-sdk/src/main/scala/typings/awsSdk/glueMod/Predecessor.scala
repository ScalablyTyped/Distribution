package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Predecessor extends StObject {
  
  /**
    * The name of the job definition used by the predecessor job run.
    */
  var JobName: js.UndefOr[NameString] = js.native
  
  /**
    * The job-run ID of the predecessor job run.
    */
  var RunId: js.UndefOr[IdString] = js.native
}
object Predecessor {
  
  @scala.inline
  def apply(): Predecessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Predecessor]
  }
  
  @scala.inline
  implicit class PredecessorMutableBuilder[Self <: Predecessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
  }
}
