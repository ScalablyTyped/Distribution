package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityHubConfiguration extends StObject {
  
  /**
    * Specifies whether to publish sensitive data findings to Security Hub. If you set this value to true, Amazon Macie automatically publishes all sensitive data findings that weren't suppressed by a findings filter. The default value is false.
    */
  var publishClassificationFindings: boolean
  
  /**
    * Specifies whether to publish policy findings to Security Hub. If you set this value to true, Amazon Macie automatically publishes all new and updated policy findings that weren't suppressed by a findings filter. The default value is true.
    */
  var publishPolicyFindings: boolean
}
object SecurityHubConfiguration {
  
  inline def apply(publishClassificationFindings: boolean, publishPolicyFindings: boolean): SecurityHubConfiguration = {
    val __obj = js.Dynamic.literal(publishClassificationFindings = publishClassificationFindings.asInstanceOf[js.Any], publishPolicyFindings = publishPolicyFindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityHubConfiguration]
  }
  
  extension [Self <: SecurityHubConfiguration](x: Self) {
    
    inline def setPublishClassificationFindings(value: boolean): Self = StObject.set(x, "publishClassificationFindings", value.asInstanceOf[js.Any])
    
    inline def setPublishPolicyFindings(value: boolean): Self = StObject.set(x, "publishPolicyFindings", value.asInstanceOf[js.Any])
  }
}
