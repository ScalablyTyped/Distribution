package typings.awsSdkClientCodecommitNode

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryMetadataMod {
  
  @js.native
  trait RepositoryMetadata extends StObject {
    
    /**
      * <p>The Amazon Resource Name (ARN) of the repository.</p>
      */
    var Arn: js.UndefOr[String] = js.native
    
    /**
      * <p>The ID of the AWS account associated with the repository.</p>
      */
    var accountId: js.UndefOr[String] = js.native
    
    /**
      * <p>The URL to use for cloning the repository over HTTPS.</p>
      */
    var cloneUrlHttp: js.UndefOr[String] = js.native
    
    /**
      * <p>The URL to use for cloning the repository over SSH.</p>
      */
    var cloneUrlSsh: js.UndefOr[String] = js.native
    
    /**
      * <p>The date and time the repository was created, in timestamp format.</p>
      */
    var creationDate: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p>The repository's default branch name.</p>
      */
    var defaultBranch: js.UndefOr[String] = js.native
    
    /**
      * <p>The date and time the repository was last modified, in timestamp format.</p>
      */
    var lastModifiedDate: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p>A comment or description about the repository.</p>
      */
    var repositoryDescription: js.UndefOr[String] = js.native
    
    /**
      * <p>The ID of the repository.</p>
      */
    var repositoryId: js.UndefOr[String] = js.native
    
    /**
      * <p>The repository's name.</p>
      */
    var repositoryName: js.UndefOr[String] = js.native
  }
  object RepositoryMetadata {
    
    @scala.inline
    def apply(): RepositoryMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepositoryMetadata]
    }
    
    @scala.inline
    implicit class RepositoryMetadataMutableBuilder[Self <: RepositoryMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
      
      @scala.inline
      def setCloneUrlHttp(value: String): Self = StObject.set(x, "cloneUrlHttp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloneUrlHttpUndefined: Self = StObject.set(x, "cloneUrlHttp", js.undefined)
      
      @scala.inline
      def setCloneUrlSsh(value: String): Self = StObject.set(x, "cloneUrlSsh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloneUrlSshUndefined: Self = StObject.set(x, "cloneUrlSsh", js.undefined)
      
      @scala.inline
      def setCreationDate(value: Date | String | Double): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      @scala.inline
      def setDefaultBranch(value: String): Self = StObject.set(x, "defaultBranch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultBranchUndefined: Self = StObject.set(x, "defaultBranch", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: Date | String | Double): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
      
      @scala.inline
      def setRepositoryDescription(value: String): Self = StObject.set(x, "repositoryDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryDescriptionUndefined: Self = StObject.set(x, "repositoryDescription", js.undefined)
      
      @scala.inline
      def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledRepositoryMetadata extends RepositoryMetadata {
    
    /**
      * <p>The date and time the repository was created, in timestamp format.</p>
      */
    @JSName("creationDate")
    var creationDate_UnmarshalledRepositoryMetadata: js.UndefOr[Date] = js.native
    
    /**
      * <p>The date and time the repository was last modified, in timestamp format.</p>
      */
    @JSName("lastModifiedDate")
    var lastModifiedDate_UnmarshalledRepositoryMetadata: js.UndefOr[Date] = js.native
  }
  object UnmarshalledRepositoryMetadata {
    
    @scala.inline
    def apply(): UnmarshalledRepositoryMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledRepositoryMetadata]
    }
    
    @scala.inline
    implicit class UnmarshalledRepositoryMetadataMutableBuilder[Self <: UnmarshalledRepositoryMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    }
  }
}
