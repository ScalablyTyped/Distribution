package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatelessCustomActionDefinition extends StObject {
  
  /**
    * Information about metrics to publish to CloudWatch.
    */
  var PublishMetricAction: js.UndefOr[StatelessCustomPublishMetricAction] = js.undefined
}
object StatelessCustomActionDefinition {
  
  inline def apply(): StatelessCustomActionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatelessCustomActionDefinition]
  }
  
  extension [Self <: StatelessCustomActionDefinition](x: Self) {
    
    inline def setPublishMetricAction(value: StatelessCustomPublishMetricAction): Self = StObject.set(x, "PublishMetricAction", value.asInstanceOf[js.Any])
    
    inline def setPublishMetricActionUndefined: Self = StObject.set(x, "PublishMetricAction", js.undefined)
  }
}
