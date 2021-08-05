package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionConfiguration extends StObject {
  
  /**
    * The name of the retention configuration object.
    */
  var Name: RetentionConfigurationName
  
  /**
    * Number of days AWS Config stores your historical information.  Currently, only applicable to the configuration item history. 
    */
  var RetentionPeriodInDays: typings.awsSdk.configserviceMod.RetentionPeriodInDays
}
object RetentionConfiguration {
  
  inline def apply(Name: RetentionConfigurationName, RetentionPeriodInDays: RetentionPeriodInDays): RetentionConfiguration = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RetentionPeriodInDays = RetentionPeriodInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionConfiguration]
  }
  
  extension [Self <: RetentionConfiguration](x: Self) {
    
    inline def setName(value: RetentionConfigurationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodInDays(value: RetentionPeriodInDays): Self = StObject.set(x, "RetentionPeriodInDays", value.asInstanceOf[js.Any])
  }
}
