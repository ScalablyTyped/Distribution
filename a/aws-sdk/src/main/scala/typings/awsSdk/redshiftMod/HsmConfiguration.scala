package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HsmConfiguration extends StObject {
  
  /**
    * A text description of the HSM configuration.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon Redshift HSM configuration.
    */
  var HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address that the Amazon Redshift cluster must use to access the HSM.
    */
  var HsmIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
    */
  var HsmPartitionName: js.UndefOr[String] = js.undefined
  
  /**
    * The list of tags for the HSM configuration.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object HsmConfiguration {
  
  @scala.inline
  def apply(): HsmConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HsmConfiguration]
  }
  
  @scala.inline
  implicit class HsmConfigurationMutableBuilder[Self <: HsmConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setHsmConfigurationIdentifier(value: String): Self = StObject.set(x, "HsmConfigurationIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmConfigurationIdentifierUndefined: Self = StObject.set(x, "HsmConfigurationIdentifier", js.undefined)
    
    @scala.inline
    def setHsmIpAddress(value: String): Self = StObject.set(x, "HsmIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmIpAddressUndefined: Self = StObject.set(x, "HsmIpAddress", js.undefined)
    
    @scala.inline
    def setHsmPartitionName(value: String): Self = StObject.set(x, "HsmPartitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmPartitionNameUndefined: Self = StObject.set(x, "HsmPartitionName", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
