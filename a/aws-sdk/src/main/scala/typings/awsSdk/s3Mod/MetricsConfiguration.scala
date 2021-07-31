package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsConfiguration extends StObject {
  
  /**
    * Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).
    */
  var Filter: js.UndefOr[MetricsFilter] = js.undefined
  
  /**
    * The ID used to identify the metrics configuration.
    */
  var Id: MetricsId
}
object MetricsConfiguration {
  
  @scala.inline
  def apply(Id: MetricsId): MetricsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsConfiguration]
  }
  
  @scala.inline
  implicit class MetricsConfigurationMutableBuilder[Self <: MetricsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: MetricsFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setId(value: MetricsId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
