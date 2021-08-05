package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDistributionConfigurationRequest extends StObject {
  
  /**
    *  The idempotency token of the distribution configuration. 
    */
  var clientToken: ClientToken
  
  /**
    *  The description of the distribution configuration. 
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The distributions of the distribution configuration. 
    */
  var distributions: DistributionList
  
  /**
    *  The name of the distribution configuration. 
    */
  var name: ResourceName
  
  /**
    *  The tags of the distribution configuration. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateDistributionConfigurationRequest {
  
  inline def apply(clientToken: ClientToken, distributions: DistributionList, name: ResourceName): CreateDistributionConfigurationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDistributionConfigurationRequest]
  }
  
  extension [Self <: CreateDistributionConfigurationRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDistributions(value: DistributionList): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    inline def setDistributionsVarargs(value: Distribution*): Self = StObject.set(x, "distributions", js.Array(value :_*))
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
