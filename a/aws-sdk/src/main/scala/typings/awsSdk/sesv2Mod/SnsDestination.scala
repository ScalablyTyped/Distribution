package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnsDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish email events to. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: AmazonResourceName
}
object SnsDestination {
  
  inline def apply(TopicArn: AmazonResourceName): SnsDestination = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnsDestination]
  }
  
  extension [Self <: SnsDestination](x: Self) {
    
    inline def setTopicArn(value: AmazonResourceName): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
