package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repository extends StObject {
  
  /**
    * The repository Amazon Resource Name (ARN).
    */
  var arn: RepositoryArn
  
  /**
    * The repository Amazon Web Services CodeStar connection that connects Proton to your repository.
    */
  var connectionArn: Arn
  
  /**
    * Your customer Amazon Web Services KMS encryption key.
    */
  var encryptionKey: js.UndefOr[Arn] = js.undefined
  
  /**
    * The repository name.
    */
  var name: RepositoryName
  
  /**
    * The repository provider.
    */
  var provider: RepositoryProvider
}
object Repository {
  
  inline def apply(arn: RepositoryArn, connectionArn: Arn, name: RepositoryName, provider: RepositoryProvider): Repository = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], connectionArn = connectionArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repository]
  }
  
  extension [Self <: Repository](x: Self) {
    
    inline def setArn(value: RepositoryArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArn(value: Arn): Self = StObject.set(x, "connectionArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKey(value: Arn): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setName(value: RepositoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: RepositoryProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
