package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the monitor resource to resume.
    */
  var ResourceArn: Arn
}
object ResumeResourceRequest {
  
  inline def apply(ResourceArn: Arn): ResumeResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeResourceRequest]
  }
  
  extension [Self <: ResumeResourceRequest](x: Self) {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
