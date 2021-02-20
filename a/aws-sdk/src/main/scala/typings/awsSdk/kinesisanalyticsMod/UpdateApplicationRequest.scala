package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApplicationRequest extends StObject {
  
  /**
    * Name of the Amazon Kinesis Analytics application to update.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  
  /**
    * Describes application updates.
    */
  var ApplicationUpdate: typings.awsSdk.kinesisanalyticsMod.ApplicationUpdate = js.native
  
  /**
    * The current application version ID. You can use the DescribeApplication operation to get this value.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
}
object UpdateApplicationRequest {
  
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    ApplicationUpdate: ApplicationUpdate,
    CurrentApplicationVersionId: ApplicationVersionId
  ): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationUpdate = ApplicationUpdate.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  @scala.inline
  implicit class UpdateApplicationRequestMutableBuilder[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationUpdate(value: ApplicationUpdate): Self = StObject.set(x, "ApplicationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
  }
}
