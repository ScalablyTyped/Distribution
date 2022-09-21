package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallelDataProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the parallel data resource.
    */
  var Arn: js.UndefOr[ParallelDataArn] = js.undefined
  
  /**
    * The time at which the parallel data resource was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description assigned to the parallel data resource.
    */
  var Description: js.UndefOr[typings.awsSdk.translateMod.Description] = js.undefined
  
  var EncryptionKey: js.UndefOr[typings.awsSdk.translateMod.EncryptionKey] = js.undefined
  
  /**
    * The number of records unsuccessfully imported from the parallel data input file.
    */
  var FailedRecordCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of UTF-8 characters that Amazon Translate imported from the parallel data input file. This number includes only the characters in your translation examples. It does not include characters that are used to format your file. For example, if you provided a Translation Memory Exchange (.tmx) file, this number does not include the tags.
    */
  var ImportedDataSize: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of records successfully imported from the parallel data input file.
    */
  var ImportedRecordCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The time at which the parallel data resource was last updated.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that the most recent update was attempted.
    */
  var LatestUpdateAttemptAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the most recent update attempt for the parallel data resource.
    */
  var LatestUpdateAttemptStatus: js.UndefOr[ParallelDataStatus] = js.undefined
  
  /**
    * Additional information from Amazon Translate about the parallel data resource. 
    */
  var Message: js.UndefOr[UnboundedLengthString] = js.undefined
  
  /**
    * The custom name assigned to the parallel data resource.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * Specifies the format and S3 location of the parallel data input file.
    */
  var ParallelDataConfig: js.UndefOr[typings.awsSdk.translateMod.ParallelDataConfig] = js.undefined
  
  /**
    * The number of items in the input file that Amazon Translate skipped when you created or updated the parallel data resource. For example, Amazon Translate skips empty records, empty target texts, and empty lines.
    */
  var SkippedRecordCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The source language of the translations in the parallel data file.
    */
  var SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined
  
  /**
    * The status of the parallel data resource. When the parallel data is ready for you to use, the status is ACTIVE.
    */
  var Status: js.UndefOr[ParallelDataStatus] = js.undefined
  
  /**
    * The language codes for the target languages available in the parallel data file. All possible target languages are returned as an array.
    */
  var TargetLanguageCodes: js.UndefOr[LanguageCodeStringList] = js.undefined
}
object ParallelDataProperties {
  
  inline def apply(): ParallelDataProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelDataProperties]
  }
  
  extension [Self <: ParallelDataProperties](x: Self) {
    
    inline def setArn(value: ParallelDataArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEncryptionKey(value: EncryptionKey): Self = StObject.set(x, "EncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "EncryptionKey", js.undefined)
    
    inline def setFailedRecordCount(value: Long): Self = StObject.set(x, "FailedRecordCount", value.asInstanceOf[js.Any])
    
    inline def setFailedRecordCountUndefined: Self = StObject.set(x, "FailedRecordCount", js.undefined)
    
    inline def setImportedDataSize(value: Long): Self = StObject.set(x, "ImportedDataSize", value.asInstanceOf[js.Any])
    
    inline def setImportedDataSizeUndefined: Self = StObject.set(x, "ImportedDataSize", js.undefined)
    
    inline def setImportedRecordCount(value: Long): Self = StObject.set(x, "ImportedRecordCount", value.asInstanceOf[js.Any])
    
    inline def setImportedRecordCountUndefined: Self = StObject.set(x, "ImportedRecordCount", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setLatestUpdateAttemptAt(value: js.Date): Self = StObject.set(x, "LatestUpdateAttemptAt", value.asInstanceOf[js.Any])
    
    inline def setLatestUpdateAttemptAtUndefined: Self = StObject.set(x, "LatestUpdateAttemptAt", js.undefined)
    
    inline def setLatestUpdateAttemptStatus(value: ParallelDataStatus): Self = StObject.set(x, "LatestUpdateAttemptStatus", value.asInstanceOf[js.Any])
    
    inline def setLatestUpdateAttemptStatusUndefined: Self = StObject.set(x, "LatestUpdateAttemptStatus", js.undefined)
    
    inline def setMessage(value: UnboundedLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setParallelDataConfig(value: ParallelDataConfig): Self = StObject.set(x, "ParallelDataConfig", value.asInstanceOf[js.Any])
    
    inline def setParallelDataConfigUndefined: Self = StObject.set(x, "ParallelDataConfig", js.undefined)
    
    inline def setSkippedRecordCount(value: Long): Self = StObject.set(x, "SkippedRecordCount", value.asInstanceOf[js.Any])
    
    inline def setSkippedRecordCountUndefined: Self = StObject.set(x, "SkippedRecordCount", js.undefined)
    
    inline def setSourceLanguageCode(value: LanguageCodeString): Self = StObject.set(x, "SourceLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setSourceLanguageCodeUndefined: Self = StObject.set(x, "SourceLanguageCode", js.undefined)
    
    inline def setStatus(value: ParallelDataStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetLanguageCodes(value: LanguageCodeStringList): Self = StObject.set(x, "TargetLanguageCodes", value.asInstanceOf[js.Any])
    
    inline def setTargetLanguageCodesUndefined: Self = StObject.set(x, "TargetLanguageCodes", js.undefined)
    
    inline def setTargetLanguageCodesVarargs(value: LanguageCodeString*): Self = StObject.set(x, "TargetLanguageCodes", js.Array(value*))
  }
}
