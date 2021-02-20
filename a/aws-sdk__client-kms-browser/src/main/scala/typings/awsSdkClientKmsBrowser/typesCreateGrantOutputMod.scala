package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateGrantOutputMod {
  
  @js.native
  trait CreateGrantOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The unique identifier for the grant.</p> <p>You can use the <code>GrantId</code> in a subsequent <a>RetireGrant</a> or <a>RevokeGrant</a> operation.</p>
      */
    var GrantId: js.UndefOr[String] = js.native
    
    /**
      * <p>The grant token.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
      */
    var GrantToken: js.UndefOr[String] = js.native
  }
  object CreateGrantOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): CreateGrantOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateGrantOutput]
    }
    
    @scala.inline
    implicit class CreateGrantOutputMutableBuilder[Self <: CreateGrantOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantId(value: String): Self = StObject.set(x, "GrantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantIdUndefined: Self = StObject.set(x, "GrantId", js.undefined)
      
      @scala.inline
      def setGrantToken(value: String): Self = StObject.set(x, "GrantToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantTokenUndefined: Self = StObject.set(x, "GrantToken", js.undefined)
    }
  }
}
