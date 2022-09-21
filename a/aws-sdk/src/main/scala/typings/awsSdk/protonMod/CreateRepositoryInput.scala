package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRepositoryInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of your Amazon Web Services CodeStar connection. For more information, see Setting up for Proton in the Proton Administrator Guide.
    */
  var connectionArn: Arn
  
  /**
    * The ARN of your customer Amazon Web Services Key Management Service (Amazon Web Services KMS) key.
    */
  var encryptionKey: js.UndefOr[Arn] = js.undefined
  
  /**
    * The repository name (for example, myrepos/myrepo).
    */
  var name: RepositoryName
  
  /**
    * The repository provider.
    */
  var provider: RepositoryProvider
  
  /**
    * An optional list of metadata items that you can associate with the Proton repository. A tag is a key-value pair. For more information, see Proton resources and tagging in the Proton Administrator Guide or Proton User Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateRepositoryInput {
  
  inline def apply(connectionArn: Arn, name: RepositoryName, provider: RepositoryProvider): CreateRepositoryInput = {
    val __obj = js.Dynamic.literal(connectionArn = connectionArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryInput]
  }
  
  extension [Self <: CreateRepositoryInput](x: Self) {
    
    inline def setConnectionArn(value: Arn): Self = StObject.set(x, "connectionArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKey(value: Arn): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setName(value: RepositoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: RepositoryProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
