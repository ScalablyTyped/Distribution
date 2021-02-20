package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobResult extends StObject {
  
  /**
    * Information about a specific job, including shipping information, job status, and other important metadata.
    */
  var JobMetadata: js.UndefOr[typings.awsSdk.snowballMod.JobMetadata] = js.native
  
  /**
    * Information about a specific job part (in the case of an export job), including shipping information, job status, and other important metadata.
    */
  var SubJobMetadata: js.UndefOr[JobMetadataList] = js.native
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
    def setJobMetadata(value: JobMetadata): Self = StObject.set(x, "JobMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobMetadataUndefined: Self = StObject.set(x, "JobMetadata", js.undefined)
    
    @scala.inline
    def setSubJobMetadata(value: JobMetadataList): Self = StObject.set(x, "SubJobMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubJobMetadataUndefined: Self = StObject.set(x, "SubJobMetadata", js.undefined)
    
    @scala.inline
    def setSubJobMetadataVarargs(value: JobMetadata*): Self = StObject.set(x, "SubJobMetadata", js.Array(value :_*))
  }
}
