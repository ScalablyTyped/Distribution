package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWebACLMigrationStackResponse extends StObject {
  
  /**
    * The URL of the template created in Amazon S3. 
    */
  var S3ObjectUrl: typings.awsSdk.clientsWafregionalMod.S3ObjectUrl
}
object CreateWebACLMigrationStackResponse {
  
  inline def apply(S3ObjectUrl: S3ObjectUrl): CreateWebACLMigrationStackResponse = {
    val __obj = js.Dynamic.literal(S3ObjectUrl = S3ObjectUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebACLMigrationStackResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWebACLMigrationStackResponse] (val x: Self) extends AnyVal {
    
    inline def setS3ObjectUrl(value: S3ObjectUrl): Self = StObject.set(x, "S3ObjectUrl", value.asInstanceOf[js.Any])
  }
}
