package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMultiplexRequest extends StObject {
  
  /**
    * A list of availability zones for the multiplex. You must specify exactly two.
    */
  var AvailabilityZones: listOfString
  
  /**
    * Configuration for a multiplex event.
    */
  var MultiplexSettings: typings.awsSdk.medialiveMod.MultiplexSettings
  
  /**
    * Name of multiplex.
    */
  var Name: string
  
  /**
    * Unique request ID. This prevents retries from creating multiple
  resources.
    */
  var RequestId: string
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.undefined
}
object CreateMultiplexRequest {
  
  inline def apply(
    AvailabilityZones: listOfString,
    MultiplexSettings: MultiplexSettings,
    Name: string,
    RequestId: string
  ): CreateMultiplexRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], MultiplexSettings = MultiplexSettings.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiplexRequest]
  }
  
  extension [Self <: CreateMultiplexRequest](x: Self) {
    
    inline def setAvailabilityZones(value: listOfString): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesVarargs(value: string*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    inline def setMultiplexSettings(value: MultiplexSettings): Self = StObject.set(x, "MultiplexSettings", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: string): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
