package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesMetricsFilterMod.MetricsFilter
import typings.awsSdkClientS3Node.typesMetricsFilterMod.UnmarshalledMetricsFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMetricsConfigurationMod {
  
  trait MetricsConfiguration extends StObject {
    
    /**
      * <p>Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).</p>
      */
    var Filter: js.UndefOr[MetricsFilter] = js.undefined
    
    /**
      * <p>The ID used to identify the metrics configuration.</p>
      */
    var Id: String
  }
  object MetricsConfiguration {
    
    inline def apply(Id: String): MetricsConfiguration = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricsConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetricsConfiguration] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: MetricsFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledMetricsConfiguration
    extends StObject
       with MetricsConfiguration {
    
    /**
      * <p>Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).</p>
      */
    @JSName("Filter")
    var Filter_UnmarshalledMetricsConfiguration: js.UndefOr[UnmarshalledMetricsFilter] = js.undefined
  }
  object UnmarshalledMetricsConfiguration {
    
    inline def apply(Id: String): UnmarshalledMetricsConfiguration = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledMetricsConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledMetricsConfiguration] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: UnmarshalledMetricsFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    }
  }
}
