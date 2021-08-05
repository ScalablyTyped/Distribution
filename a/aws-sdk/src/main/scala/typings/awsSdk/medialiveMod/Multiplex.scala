package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Multiplex extends StObject {
  
  /**
    * The unique arn of the multiplex.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * A list of availability zones for the multiplex.
    */
  var AvailabilityZones: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A list of the multiplex output destinations.
    */
  var Destinations: js.UndefOr[listOfMultiplexOutputDestination] = js.undefined
  
  /**
    * The unique id of the multiplex.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * Configuration for a multiplex event.
    */
  var MultiplexSettings: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexSettings] = js.undefined
  
  /**
    * The name of the multiplex.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The number of currently healthy pipelines.
    */
  var PipelinesRunningCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The number of programs in the multiplex.
    */
  var ProgramCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The current state of the multiplex.
    */
  var State: js.UndefOr[MultiplexState] = js.undefined
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.undefined
}
object Multiplex {
  
  inline def apply(): Multiplex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multiplex]
  }
  
  extension [Self <: Multiplex](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAvailabilityZones(value: listOfString): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: string*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    inline def setDestinations(value: listOfMultiplexOutputDestination): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: MultiplexOutputDestination*): Self = StObject.set(x, "Destinations", js.Array(value :_*))
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMultiplexSettings(value: MultiplexSettings): Self = StObject.set(x, "MultiplexSettings", value.asInstanceOf[js.Any])
    
    inline def setMultiplexSettingsUndefined: Self = StObject.set(x, "MultiplexSettings", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPipelinesRunningCount(value: integer): Self = StObject.set(x, "PipelinesRunningCount", value.asInstanceOf[js.Any])
    
    inline def setPipelinesRunningCountUndefined: Self = StObject.set(x, "PipelinesRunningCount", js.undefined)
    
    inline def setProgramCount(value: integer): Self = StObject.set(x, "ProgramCount", value.asInstanceOf[js.Any])
    
    inline def setProgramCountUndefined: Self = StObject.set(x, "ProgramCount", js.undefined)
    
    inline def setState(value: MultiplexState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
