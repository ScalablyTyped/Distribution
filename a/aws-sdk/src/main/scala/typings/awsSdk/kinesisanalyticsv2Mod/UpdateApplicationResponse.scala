package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationResponse extends StObject {
  
  /**
    * Describes application updates.
    */
  var ApplicationDetail: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationDetail
}
object UpdateApplicationResponse {
  
  @scala.inline
  def apply(ApplicationDetail: ApplicationDetail): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationDetail = ApplicationDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
  
  @scala.inline
  implicit class UpdateApplicationResponseMutableBuilder[Self <: UpdateApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationDetail(value: ApplicationDetail): Self = StObject.set(x, "ApplicationDetail", value.asInstanceOf[js.Any])
  }
}
