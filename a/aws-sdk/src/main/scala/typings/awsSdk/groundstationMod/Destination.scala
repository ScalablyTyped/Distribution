package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destination extends StObject {
  
  /**
    * Additional details for a Config, if type is dataflow endpoint or antenna demod decode.
    */
  var configDetails: js.UndefOr[ConfigDetails] = js.native
  
  /**
    * UUID of a Config.
    */
  var configId: js.UndefOr[String] = js.native
  
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.native
  
  /**
    * Region of a dataflow destination.
    */
  var dataflowDestinationRegion: js.UndefOr[String] = js.native
}
object Destination {
  
  @scala.inline
  def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigDetails(value: ConfigDetails): Self = StObject.set(x, "configDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigDetailsUndefined: Self = StObject.set(x, "configDetails", js.undefined)
    
    @scala.inline
    def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
    
    @scala.inline
    def setConfigType(value: ConfigCapabilityType): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigTypeUndefined: Self = StObject.set(x, "configType", js.undefined)
    
    @scala.inline
    def setDataflowDestinationRegion(value: String): Self = StObject.set(x, "dataflowDestinationRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataflowDestinationRegionUndefined: Self = StObject.set(x, "dataflowDestinationRegion", js.undefined)
  }
}
