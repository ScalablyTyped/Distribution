package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConflictingAlias extends StObject {
  
  /**
    * The (partially hidden) ID of the Amazon Web Services account that owns the distribution that’s associated with the alias.
    */
  var AccountId: js.UndefOr[String] = js.undefined
  
  /**
    * An alias (also called a CNAME).
    */
  var Alias: js.UndefOr[String] = js.undefined
  
  /**
    * The (partially hidden) ID of the CloudFront distribution associated with the alias.
    */
  var DistributionId: js.UndefOr[String] = js.undefined
}
object ConflictingAlias {
  
  inline def apply(): ConflictingAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConflictingAlias]
  }
  
  extension [Self <: ConflictingAlias](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAlias(value: String): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setDistributionId(value: String): Self = StObject.set(x, "DistributionId", value.asInstanceOf[js.Any])
    
    inline def setDistributionIdUndefined: Self = StObject.set(x, "DistributionId", js.undefined)
  }
}
