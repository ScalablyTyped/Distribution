package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScheduledQueryResponse extends StObject {
  
  /**
    * ARN for the created scheduled query.
    */
  var Arn: AmazonResourceName
}
object CreateScheduledQueryResponse {
  
  inline def apply(Arn: AmazonResourceName): CreateScheduledQueryResponse = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduledQueryResponse]
  }
  
  extension [Self <: CreateScheduledQueryResponse](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
