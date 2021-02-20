package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobResult extends StObject {
  
  /**
    * Contains the configuration parameters and status for the job specified in the Describe Job request.
    */
  var Job: js.UndefOr[JobDescriptor] = js.native
}
object DescribeJobResult {
  
  @scala.inline
  def apply(): DescribeJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobResult]
  }
  
  @scala.inline
  implicit class DescribeJobResultMutableBuilder[Self <: DescribeJobResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: JobDescriptor): Self = StObject.set(x, "Job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "Job", js.undefined)
  }
}
