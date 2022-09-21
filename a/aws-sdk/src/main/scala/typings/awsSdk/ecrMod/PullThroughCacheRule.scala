package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullThroughCacheRule extends StObject {
  
  /**
    * The date and time the pull through cache was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon ECR repository prefix associated with the pull through cache rule.
    */
  var ecrRepositoryPrefix: js.UndefOr[PullThroughCacheRuleRepositoryPrefix] = js.undefined
  
  /**
    * The Amazon Web Services account ID associated with the registry the pull through cache rule is associated with.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The upstream registry URL associated with the pull through cache rule.
    */
  var upstreamRegistryUrl: js.UndefOr[Url] = js.undefined
}
object PullThroughCacheRule {
  
  inline def apply(): PullThroughCacheRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullThroughCacheRule]
  }
  
  extension [Self <: PullThroughCacheRule](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setEcrRepositoryPrefix(value: PullThroughCacheRuleRepositoryPrefix): Self = StObject.set(x, "ecrRepositoryPrefix", value.asInstanceOf[js.Any])
    
    inline def setEcrRepositoryPrefixUndefined: Self = StObject.set(x, "ecrRepositoryPrefix", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setUpstreamRegistryUrl(value: Url): Self = StObject.set(x, "upstreamRegistryUrl", value.asInstanceOf[js.Any])
    
    inline def setUpstreamRegistryUrlUndefined: Self = StObject.set(x, "upstreamRegistryUrl", js.undefined)
  }
}
