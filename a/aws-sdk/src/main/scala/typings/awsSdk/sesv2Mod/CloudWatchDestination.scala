package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchDestination extends StObject {
  
  /**
    * An array of objects that define the dimensions to use when you send email events to Amazon CloudWatch.
    */
  var DimensionConfigurations: CloudWatchDimensionConfigurations
}
object CloudWatchDestination {
  
  inline def apply(DimensionConfigurations: CloudWatchDimensionConfigurations): CloudWatchDestination = {
    val __obj = js.Dynamic.literal(DimensionConfigurations = DimensionConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchDestination]
  }
  
  extension [Self <: CloudWatchDestination](x: Self) {
    
    inline def setDimensionConfigurations(value: CloudWatchDimensionConfigurations): Self = StObject.set(x, "DimensionConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDimensionConfigurationsVarargs(value: CloudWatchDimensionConfiguration*): Self = StObject.set(x, "DimensionConfigurations", js.Array(value :_*))
  }
}
