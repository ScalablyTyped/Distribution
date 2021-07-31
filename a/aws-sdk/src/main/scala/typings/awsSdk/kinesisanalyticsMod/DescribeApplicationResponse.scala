package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationResponse extends StObject {
  
  /**
    * Provides a description of the application, such as the application Amazon Resource Name (ARN), status, latest version, and input and output configuration details.
    */
  var ApplicationDetail: typings.awsSdk.kinesisanalyticsMod.ApplicationDetail
}
object DescribeApplicationResponse {
  
  @scala.inline
  def apply(ApplicationDetail: ApplicationDetail): DescribeApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationDetail = ApplicationDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationResponse]
  }
  
  @scala.inline
  implicit class DescribeApplicationResponseMutableBuilder[Self <: DescribeApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationDetail(value: ApplicationDetail): Self = StObject.set(x, "ApplicationDetail", value.asInstanceOf[js.Any])
  }
}
