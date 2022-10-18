package typings.awsSdkClientKmsNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEncryptInputMod {
  
  trait EncryptInput
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
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Name-value pair that specifies the encryption context to be used for authenticated encryption. If used here, the same value must be supplied to the <code>Decrypt</code> API or decryption will fail. For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a>.</p>
      */
    var EncryptionContext: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
    
    /**
      * <p>A list of grant tokens.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
      */
    var GrantTokens: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
    
    /**
      * <p>A unique identifier for the customer master key (CMK).</p> <p>To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with <code>"alias/"</code>. To specify a CMK in a different AWS account, you must use the key ARN or alias ARN.</p> <p>For example:</p> <ul> <li> <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> <li> <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> <li> <p>Alias name: <code>alias/ExampleAlias</code> </p> </li> <li> <p>Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code> </p> </li> </ul> <p>To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and alias ARN, use <a>ListAliases</a>.</p>
      */
    var KeyId: String
    
    /**
      * <p>Data to be encrypted.</p>
      */
    var Plaintext: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String
  }
  object EncryptInput {
    
    inline def apply(KeyId: String, Plaintext: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): EncryptInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Plaintext = Plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptInput]
    }
    
    extension [Self <: EncryptInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setEncryptionContext(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "EncryptionContext", value.asInstanceOf[js.Any])
      
      inline def setEncryptionContextUndefined: Self = StObject.set(x, "EncryptionContext", js.undefined)
      
      inline def setGrantTokens(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
      
      inline def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
      
      inline def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "GrantTokens", js.Array(value*))
      
      inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      inline def setPlaintext(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = StObject.set(x, "Plaintext", value.asInstanceOf[js.Any])
    }
  }
}
