package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetConfiguration extends StObject {
  
  /**
    * Configuration needed to write data into the Timestream database and table.
    */
  var TimestreamConfiguration: typings.awsSdk.clientsTimestreamqueryMod.TimestreamConfiguration
}
object TargetConfiguration {
  
  inline def apply(TimestreamConfiguration: TimestreamConfiguration): TargetConfiguration = {
    val __obj = js.Dynamic.literal(TimestreamConfiguration = TimestreamConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTimestreamConfiguration(value: TimestreamConfiguration): Self = StObject.set(x, "TimestreamConfiguration", value.asInstanceOf[js.Any])
  }
}
