package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFaqResponse extends StObject {
  
  /**
    * The date and time that the FAQ was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the FAQ that you provided when it was created.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.undefined
  
  /**
    * If the Status field is FAILED, the ErrorMessage field contains the reason why the FAQ failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kendraMod.ErrorMessage] = js.undefined
  
  /**
    * The file format used by the input files for the FAQ.
    */
  var FileFormat: js.UndefOr[FaqFileFormat] = js.undefined
  
  /**
    * The identifier of the FAQ.
    */
  var Id: js.UndefOr[FaqId] = js.undefined
  
  /**
    * The identifier of the index for the FAQ.
    */
  var IndexId: js.UndefOr[typings.awsSdk.kendraMod.IndexId] = js.undefined
  
  /**
    * The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see Adding documents in languages other than English.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.kendraMod.LanguageCode] = js.undefined
  
  /**
    * The name that you gave the FAQ when it was created.
    */
  var Name: js.UndefOr[FaqName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role that provides access to the S3 bucket containing the input files for the FAQ.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.undefined
  
  var S3Path: js.UndefOr[typings.awsSdk.kendraMod.S3Path] = js.undefined
  
  /**
    * The status of the FAQ. It is ready to use when the status is ACTIVE.
    */
  var Status: js.UndefOr[FaqStatus] = js.undefined
  
  /**
    * The date and time that the FAQ was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object DescribeFaqResponse {
  
  inline def apply(): DescribeFaqResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFaqResponse]
  }
  
  extension [Self <: DescribeFaqResponse](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setFileFormat(value: FaqFileFormat): Self = StObject.set(x, "FileFormat", value.asInstanceOf[js.Any])
    
    inline def setFileFormatUndefined: Self = StObject.set(x, "FileFormat", js.undefined)
    
    inline def setId(value: FaqId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setIndexIdUndefined: Self = StObject.set(x, "IndexId", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setName(value: FaqName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setS3Path(value: S3Path): Self = StObject.set(x, "S3Path", value.asInstanceOf[js.Any])
    
    inline def setS3PathUndefined: Self = StObject.set(x, "S3Path", js.undefined)
    
    inline def setStatus(value: FaqStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
