package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesAttributeDimensionMod.AttributeDimension
import typings.awsSdkClientPinpointBrowser.typesAttributeDimensionMod.UnmarshalledAttributeDimension
import typings.awsSdkClientPinpointBrowser.typesMetricDimensionMod.MetricDimension
import typings.awsSdkClientPinpointBrowser.typesMetricDimensionMod.UnmarshalledMetricDimension
import typings.awsSdkClientPinpointBrowser.typesSegmentBehaviorsMod.SegmentBehaviors
import typings.awsSdkClientPinpointBrowser.typesSegmentBehaviorsMod.UnmarshalledSegmentBehaviors
import typings.awsSdkClientPinpointBrowser.typesSegmentDemographicsMod.SegmentDemographics
import typings.awsSdkClientPinpointBrowser.typesSegmentDemographicsMod.UnmarshalledSegmentDemographics
import typings.awsSdkClientPinpointBrowser.typesSegmentLocationMod.SegmentLocation
import typings.awsSdkClientPinpointBrowser.typesSegmentLocationMod.UnmarshalledSegmentLocation
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentDimensionsMod {
  
  trait SegmentDimensions extends StObject {
    
    /**
      * Custom segment attributes.
      */
    var Attributes: js.UndefOr[
        StringDictionary[AttributeDimension] | (Iterable[js.Tuple2[String, AttributeDimension]])
      ] = js.undefined
    
    /**
      * The segment behaviors attributes.
      */
    var Behavior: js.UndefOr[SegmentBehaviors] = js.undefined
    
    /**
      * The segment demographics attributes.
      */
    var Demographic: js.UndefOr[SegmentDemographics] = js.undefined
    
    /**
      * The segment location attributes.
      */
    var Location: js.UndefOr[SegmentLocation] = js.undefined
    
    /**
      * Custom segment metrics.
      */
    var Metrics: js.UndefOr[
        StringDictionary[MetricDimension] | (Iterable[js.Tuple2[String, MetricDimension]])
      ] = js.undefined
    
    /**
      * Custom segment user attributes.
      */
    var UserAttributes: js.UndefOr[
        StringDictionary[AttributeDimension] | (Iterable[js.Tuple2[String, AttributeDimension]])
      ] = js.undefined
  }
  object SegmentDimensions {
    
    inline def apply(): SegmentDimensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentDimensions]
    }
    
    extension [Self <: SegmentDimensions](x: Self) {
      
      inline def setAttributes(value: StringDictionary[AttributeDimension] | (Iterable[js.Tuple2[String, AttributeDimension]])): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      inline def setBehavior(value: SegmentBehaviors): Self = StObject.set(x, "Behavior", value.asInstanceOf[js.Any])
      
      inline def setBehaviorUndefined: Self = StObject.set(x, "Behavior", js.undefined)
      
      inline def setDemographic(value: SegmentDemographics): Self = StObject.set(x, "Demographic", value.asInstanceOf[js.Any])
      
      inline def setDemographicUndefined: Self = StObject.set(x, "Demographic", js.undefined)
      
      inline def setLocation(value: SegmentLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
      
      inline def setMetrics(value: StringDictionary[MetricDimension] | (Iterable[js.Tuple2[String, MetricDimension]])): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
      
      inline def setUserAttributes(value: StringDictionary[AttributeDimension] | (Iterable[js.Tuple2[String, AttributeDimension]])): Self = StObject.set(x, "UserAttributes", value.asInstanceOf[js.Any])
      
      inline def setUserAttributesUndefined: Self = StObject.set(x, "UserAttributes", js.undefined)
    }
  }
  
  trait UnmarshalledSegmentDimensions
    extends StObject
       with SegmentDimensions {
    
    /**
      * Custom segment attributes.
      */
    @JSName("Attributes")
    var Attributes_UnmarshalledSegmentDimensions: js.UndefOr[StringDictionary[UnmarshalledAttributeDimension]] = js.undefined
    
    /**
      * The segment behaviors attributes.
      */
    @JSName("Behavior")
    var Behavior_UnmarshalledSegmentDimensions: js.UndefOr[UnmarshalledSegmentBehaviors] = js.undefined
    
    /**
      * The segment demographics attributes.
      */
    @JSName("Demographic")
    var Demographic_UnmarshalledSegmentDimensions: js.UndefOr[UnmarshalledSegmentDemographics] = js.undefined
    
    /**
      * The segment location attributes.
      */
    @JSName("Location")
    var Location_UnmarshalledSegmentDimensions: js.UndefOr[UnmarshalledSegmentLocation] = js.undefined
    
    /**
      * Custom segment metrics.
      */
    @JSName("Metrics")
    var Metrics_UnmarshalledSegmentDimensions: js.UndefOr[StringDictionary[UnmarshalledMetricDimension]] = js.undefined
    
    /**
      * Custom segment user attributes.
      */
    @JSName("UserAttributes")
    var UserAttributes_UnmarshalledSegmentDimensions: js.UndefOr[StringDictionary[UnmarshalledAttributeDimension]] = js.undefined
  }
  object UnmarshalledSegmentDimensions {
    
    inline def apply(): UnmarshalledSegmentDimensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSegmentDimensions]
    }
    
    extension [Self <: UnmarshalledSegmentDimensions](x: Self) {
      
      inline def setAttributes(value: StringDictionary[UnmarshalledAttributeDimension]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      inline def setBehavior(value: UnmarshalledSegmentBehaviors): Self = StObject.set(x, "Behavior", value.asInstanceOf[js.Any])
      
      inline def setBehaviorUndefined: Self = StObject.set(x, "Behavior", js.undefined)
      
      inline def setDemographic(value: UnmarshalledSegmentDemographics): Self = StObject.set(x, "Demographic", value.asInstanceOf[js.Any])
      
      inline def setDemographicUndefined: Self = StObject.set(x, "Demographic", js.undefined)
      
      inline def setLocation(value: UnmarshalledSegmentLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
      
      inline def setMetrics(value: StringDictionary[UnmarshalledMetricDimension]): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
      
      inline def setUserAttributes(value: StringDictionary[UnmarshalledAttributeDimension]): Self = StObject.set(x, "UserAttributes", value.asInstanceOf[js.Any])
      
      inline def setUserAttributesUndefined: Self = StObject.set(x, "UserAttributes", js.undefined)
    }
  }
}
