package typings.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetCredentialsForIdentityInputMod {
  
  trait GetCredentialsForIdentityInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token from the identity provider. For example, a SAML-based identity provider. This parameter is optional for identity providers that do not support role customization.</p>
      */
    var CustomRoleArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A unique identifier in the format REGION:GUID.</p>
      */
    var IdentityId: String
    
    /**
      * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
      */
    var Logins: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
  }
  object GetCredentialsForIdentityInput {
    
    @scala.inline
    def apply(IdentityId: String): GetCredentialsForIdentityInput = {
      val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCredentialsForIdentityInput]
    }
    
    @scala.inline
    implicit class GetCredentialsForIdentityInputMutableBuilder[Self <: GetCredentialsForIdentityInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def setCustomRoleArn(value: String): Self = StObject.set(x, "CustomRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRoleArnUndefined: Self = StObject.set(x, "CustomRoleArn", js.undefined)
      
      @scala.inline
      def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogins(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
    }
  }
}
