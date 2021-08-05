package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonElasticsearchParameters extends StObject {
  
  /**
    * The Amazon Elasticsearch Service domain.
    */
  var Domain: typings.awsSdk.quicksightMod.Domain
}
object AmazonElasticsearchParameters {
  
  inline def apply(Domain: Domain): AmazonElasticsearchParameters = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmazonElasticsearchParameters]
  }
  
  extension [Self <: AmazonElasticsearchParameters](x: Self) {
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
  }
}
