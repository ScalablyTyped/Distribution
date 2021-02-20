package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationResponse extends StObject {
  
  /**
    * In response to your CreateApplication request, Amazon Kinesis Analytics returns a response with a summary of the application it created, including the application Amazon Resource Name (ARN), name, and status.
    */
  var ApplicationSummary: typings.awsSdk.kinesisanalyticsMod.ApplicationSummary = js.native
}
object CreateApplicationResponse {
  
  @scala.inline
  def apply(ApplicationSummary: ApplicationSummary): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationSummary = ApplicationSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  
  @scala.inline
  implicit class CreateApplicationResponseMutableBuilder[Self <: CreateApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationSummary(value: ApplicationSummary): Self = StObject.set(x, "ApplicationSummary", value.asInstanceOf[js.Any])
  }
}
