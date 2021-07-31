package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationStateRequest extends StObject {
  
  /**
    * The configurationId in Application Discovery Service that uniquely identifies the grouped application.
    */
  var ApplicationId: typings.awsSdk.migrationhubMod.ApplicationId
}
object DescribeApplicationStateRequest {
  
  @scala.inline
  def apply(ApplicationId: ApplicationId): DescribeApplicationStateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationStateRequest]
  }
  
  @scala.inline
  implicit class DescribeApplicationStateRequestMutableBuilder[Self <: DescribeApplicationStateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
