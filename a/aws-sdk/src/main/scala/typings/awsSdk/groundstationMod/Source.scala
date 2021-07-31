package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /**
    * Additional details for a Config, if type is dataflow endpoint or antenna demod decode.
    */
  var configDetails: js.UndefOr[ConfigDetails] = js.undefined
  
  /**
    * UUID of a Config.
    */
  var configId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.undefined
  
  /**
    * Region of a dataflow source.
    */
  var dataflowSourceRegion: js.UndefOr[String] = js.undefined
}
object Source {
  
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
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
    def setDataflowSourceRegion(value: String): Self = StObject.set(x, "dataflowSourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataflowSourceRegionUndefined: Self = StObject.set(x, "dataflowSourceRegion", js.undefined)
  }
}
