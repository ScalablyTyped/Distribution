package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationResponse extends StObject {
  
  /**
    * In response to your CreateApplication request, Amazon Kinesis Analytics returns a response with a summary of the application it created, including the application Amazon Resource Name (ARN), name, and status.
    */
  var ApplicationSummary: typings.awsSdk.kinesisanalyticsMod.ApplicationSummary
}
object CreateApplicationResponse {
  
  inline def apply(ApplicationSummary: ApplicationSummary): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationSummary = ApplicationSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  
  extension [Self <: CreateApplicationResponse](x: Self) {
    
    inline def setApplicationSummary(value: ApplicationSummary): Self = StObject.set(x, "ApplicationSummary", value.asInstanceOf[js.Any])
  }
}
