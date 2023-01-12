package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnsConfiguration extends StObject {
  
  /**
    * SNS topic ARN that the scheduled query status notifications will be sent to.
    */
  var TopicArn: AmazonResourceName
}
object SnsConfiguration {
  
  inline def apply(TopicArn: AmazonResourceName): SnsConfiguration = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTopicArn(value: AmazonResourceName): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
