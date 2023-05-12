package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVocabularyFilterRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains your input files (in this case, your custom vocabulary filter). If the role that you specify doesn’t have the appropriate permissions to access the specified Amazon S3 location, your request fails. IAM role ARNs have the format arn:partition:iam::account:role/role-name-with-path. For example: arn:aws:iam::111122223333:role/Admin. For more information, see IAM ARNs.
    */
  var DataAccessRoleArn: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.DataAccessRoleArn] = js.undefined
  
  /**
    * The Amazon S3 location of the text file that contains your custom vocabulary filter terms. The URI must be located in the same Amazon Web Services Region as the resource you're calling. Here's an example URI path: s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt  Note that if you include VocabularyFilterFileUri in your request, you cannot use Words; you must choose one or the other.
    */
  var VocabularyFilterFileUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * The name of the custom vocabulary filter you want to update. Custom vocabulary filter names are case sensitive.
    */
  var VocabularyFilterName: typings.awsSdk.clientsTranscribeserviceMod.VocabularyFilterName
  
  /**
    * Use this parameter if you want to update your custom vocabulary filter by including all desired terms, as comma-separated values, within your request. The other option for updating your vocabulary filter is to save your entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the VocabularyFilterFileUri parameter. Note that if you include Words in your request, you cannot use VocabularyFilterFileUri; you must choose one or the other. Each language has a character set that contains all allowed characters for that specific language. If you use unsupported characters, your custom vocabulary filter request fails. Refer to Character Sets for Custom Vocabularies to get the character set for your language.
    */
  var Words: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.Words] = js.undefined
}
object UpdateVocabularyFilterRequest {
  
  inline def apply(VocabularyFilterName: VocabularyFilterName): UpdateVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVocabularyFilterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVocabularyFilterRequest] (val x: Self) extends AnyVal {
    
    inline def setDataAccessRoleArn(value: DataAccessRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setVocabularyFilterFileUri(value: Uri): Self = StObject.set(x, "VocabularyFilterFileUri", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterFileUriUndefined: Self = StObject.set(x, "VocabularyFilterFileUri", js.undefined)
    
    inline def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
    
    inline def setWords(value: Words): Self = StObject.set(x, "Words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "Words", js.undefined)
    
    inline def setWordsVarargs(value: Word*): Self = StObject.set(x, "Words", js.Array(value*))
  }
}
