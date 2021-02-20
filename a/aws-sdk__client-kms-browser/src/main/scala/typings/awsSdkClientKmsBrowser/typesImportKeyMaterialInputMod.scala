package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KEY_MATERIAL_DOES_NOT_EXPIRE
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KEY_MATERIAL_EXPIRES
import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesImportKeyMaterialInputMod {
  
  @js.native
  trait ImportKeyMaterialInput extends InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.native
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    
    /**
      * <p>The encrypted key material to import. It must be encrypted with the public key that you received in the response to a previous <a>GetParametersForImport</a> request, using the wrapping algorithm that you specified in that request.</p>
      */
    var EncryptedKeyMaterial: ArrayBuffer | ArrayBufferView | String = js.native
    
    /**
      * <p>Specifies whether the key material expires. The default is <code>KEY_MATERIAL_EXPIRES</code>, in which case you must include the <code>ValidTo</code> parameter. When this parameter is set to <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code> parameter.</p>
      */
    var ExpirationModel: js.UndefOr[KEY_MATERIAL_EXPIRES | KEY_MATERIAL_DOES_NOT_EXPIRE | String] = js.native
    
    /**
      * <p>The import token that you received in the response to a previous <a>GetParametersForImport</a> request. It must be from the same response that contained the public key that you used to encrypt the key material.</p>
      */
    var ImportToken: ArrayBuffer | ArrayBufferView | String = js.native
    
    /**
      * <p>The identifier of the CMK to import the key material into. The CMK's <code>Origin</code> must be <code>EXTERNAL</code>.</p> <p>Specify the key ID or the Amazon Resource Name (ARN) of the CMK.</p> <p>For example:</p> <ul> <li> <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> <li> <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> </ul> <p>To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.</p>
      */
    var KeyId: String = js.native
    
    /**
      * <p>The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. You must omit this parameter when the <code>ExpirationModel</code> parameter is set to <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>. Otherwise it is required.</p>
      */
    var ValidTo: js.UndefOr[Date | String | Double] = js.native
  }
  object ImportKeyMaterialInput {
    
    @scala.inline
    def apply(
      EncryptedKeyMaterial: ArrayBuffer | ArrayBufferView | String,
      ImportToken: ArrayBuffer | ArrayBufferView | String,
      KeyId: String
    ): ImportKeyMaterialInput = {
      val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportKeyMaterialInput]
    }
    
    @scala.inline
    implicit class ImportKeyMaterialInputMutableBuilder[Self <: ImportKeyMaterialInput] (val x: Self) extends AnyVal {
      
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
      def setEncryptedKeyMaterial(value: ArrayBuffer | ArrayBufferView | String): Self = StObject.set(x, "EncryptedKeyMaterial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationModel(value: KEY_MATERIAL_EXPIRES | KEY_MATERIAL_DOES_NOT_EXPIRE | String): Self = StObject.set(x, "ExpirationModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationModelUndefined: Self = StObject.set(x, "ExpirationModel", js.undefined)
      
      @scala.inline
      def setImportToken(value: ArrayBuffer | ArrayBufferView | String): Self = StObject.set(x, "ImportToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidTo(value: Date | String | Double): Self = StObject.set(x, "ValidTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidToUndefined: Self = StObject.set(x, "ValidTo", js.undefined)
    }
  }
}
