package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEntitiesDetectionV2JobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with a detection job.
    */
  var ComprehendMedicalAsyncJobProperties: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobProperties] = js.native
}
object DescribeEntitiesDetectionV2JobResponse {
  
  @scala.inline
  def apply(): DescribeEntitiesDetectionV2JobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntitiesDetectionV2JobResponse]
  }
  
  @scala.inline
  implicit class DescribeEntitiesDetectionV2JobResponseMutableBuilder[Self <: DescribeEntitiesDetectionV2JobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComprehendMedicalAsyncJobProperties(value: ComprehendMedicalAsyncJobProperties): Self = StObject.set(x, "ComprehendMedicalAsyncJobProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehendMedicalAsyncJobPropertiesUndefined: Self = StObject.set(x, "ComprehendMedicalAsyncJobProperties", js.undefined)
  }
}
