package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NielsenConfiguration extends StObject {
  
  /**
    * Enter the Distributor ID assigned to your organization by Nielsen.
    */
  var DistributorId: js.UndefOr[string] = js.undefined
  
  /**
    * Enables Nielsen PCM to ID3 tagging
    */
  var NielsenPcmToId3Tagging: js.UndefOr[NielsenPcmToId3TaggingState] = js.undefined
}
object NielsenConfiguration {
  
  @scala.inline
  def apply(): NielsenConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NielsenConfiguration]
  }
  
  @scala.inline
  implicit class NielsenConfigurationMutableBuilder[Self <: NielsenConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributorId(value: string): Self = StObject.set(x, "DistributorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributorIdUndefined: Self = StObject.set(x, "DistributorId", js.undefined)
    
    @scala.inline
    def setNielsenPcmToId3Tagging(value: NielsenPcmToId3TaggingState): Self = StObject.set(x, "NielsenPcmToId3Tagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNielsenPcmToId3TaggingUndefined: Self = StObject.set(x, "NielsenPcmToId3Tagging", js.undefined)
  }
}
