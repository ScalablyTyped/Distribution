package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryMetadataMod {
  
  trait RepositoryMetadata extends StObject {
    
    /**
      * <p>The Amazon Resource Name (ARN) of the repository.</p>
      */
    var Arn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The ID of the AWS account associated with the repository.</p>
      */
    var accountId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The URL to use for cloning the repository over HTTPS.</p>
      */
    var cloneUrlHttp: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The URL to use for cloning the repository over SSH.</p>
      */
    var cloneUrlSsh: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The date and time the repository was created, in timestamp format.</p>
      */
    var creationDate: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>The repository's default branch name.</p>
      */
    var defaultBranch: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The date and time the repository was last modified, in timestamp format.</p>
      */
    var lastModifiedDate: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>A comment or description about the repository.</p>
      */
    var repositoryDescription: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The ID of the repository.</p>
      */
    var repositoryId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The repository's name.</p>
      */
    var repositoryName: js.UndefOr[String] = js.undefined
  }
  object RepositoryMetadata {
    
    inline def apply(): RepositoryMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepositoryMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RepositoryMetadata] (val x: Self) extends AnyVal {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
      
      inline def setCloneUrlHttp(value: String): Self = StObject.set(x, "cloneUrlHttp", value.asInstanceOf[js.Any])
      
      inline def setCloneUrlHttpUndefined: Self = StObject.set(x, "cloneUrlHttp", js.undefined)
      
      inline def setCloneUrlSsh(value: String): Self = StObject.set(x, "cloneUrlSsh", value.asInstanceOf[js.Any])
      
      inline def setCloneUrlSshUndefined: Self = StObject.set(x, "cloneUrlSsh", js.undefined)
      
      inline def setCreationDate(value: js.Date | String | Double): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      inline def setDefaultBranch(value: String): Self = StObject.set(x, "defaultBranch", value.asInstanceOf[js.Any])
      
      inline def setDefaultBranchUndefined: Self = StObject.set(x, "defaultBranch", js.undefined)
      
      inline def setLastModifiedDate(value: js.Date | String | Double): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
      
      inline def setRepositoryDescription(value: String): Self = StObject.set(x, "repositoryDescription", value.asInstanceOf[js.Any])
      
      inline def setRepositoryDescriptionUndefined: Self = StObject.set(x, "repositoryDescription", js.undefined)
      
      inline def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
      
      inline def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    }
  }
  
  trait UnmarshalledRepositoryMetadata
    extends StObject
       with RepositoryMetadata {
    
    /**
      * <p>The date and time the repository was created, in timestamp format.</p>
      */
    @JSName("creationDate")
    var creationDate_UnmarshalledRepositoryMetadata: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>The date and time the repository was last modified, in timestamp format.</p>
      */
    @JSName("lastModifiedDate")
    var lastModifiedDate_UnmarshalledRepositoryMetadata: js.UndefOr[js.Date] = js.undefined
  }
  object UnmarshalledRepositoryMetadata {
    
    inline def apply(): UnmarshalledRepositoryMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledRepositoryMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledRepositoryMetadata] (val x: Self) extends AnyVal {
      
      inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    }
  }
}
