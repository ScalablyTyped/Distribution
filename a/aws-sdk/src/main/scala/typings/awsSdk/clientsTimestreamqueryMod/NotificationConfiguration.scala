package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConfiguration extends StObject {
  
  /**
    * Details on SNS configuration. 
    */
  var SnsConfiguration: typings.awsSdk.clientsTimestreamqueryMod.SnsConfiguration
}
object NotificationConfiguration {
  
  inline def apply(SnsConfiguration: SnsConfiguration): NotificationConfiguration = {
    val __obj = js.Dynamic.literal(SnsConfiguration = SnsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSnsConfiguration(value: SnsConfiguration): Self = StObject.set(x, "SnsConfiguration", value.asInstanceOf[js.Any])
  }
}
