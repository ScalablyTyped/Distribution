package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTableInput extends StObject {
  
  /**
    * <p>Providing a <code>ClientToken</code> makes the call to <code>ImportTableInput</code>
    *             idempotent, meaning that multiple identical calls have the same effect as one single
    *             call.</p>
    *          <p>A client token is valid for 8 hours after the first request that uses it is completed.
    *             After 8 hours, any request with the same client token is treated as a new request. Do
    *             not resubmit the same request with the same client token for more than 8 hours, or the
    *             result might not be idempotent.</p>
    *          <p>If you submit a request with the same client token but a change in other parameters
    *             within the 8-hour idempotency window, DynamoDB returns an
    *                 <code>IdempotentParameterMismatch</code> exception.</p>
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p> Type of compression to be used on the input coming from the imported table. </p>
    */
  var InputCompressionType: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.InputCompressionType | String
  ] = js.undefined
  
  /**
    * <p> The format of the source data. Valid values for <code>ImportFormat</code> are
    *                 <code>CSV</code>, <code>DYNAMODB_JSON</code> or <code>ION</code>. </p>
    */
  var InputFormat: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.InputFormat | String] = js.undefined
  
  /**
    * <p> Additional properties that specify how the input is formatted, </p>
    */
  var InputFormatOptions: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.InputFormatOptions] = js.undefined
  
  /**
    * <p> The S3 bucket that provides the source for the import. </p>
    */
  var S3BucketSource: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.S3BucketSource] = js.undefined
  
  /**
    * <p>Parameters for the table to import the data into. </p>
    */
  var TableCreationParameters: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TableCreationParameters] = js.undefined
}
object ImportTableInput {
  
  inline def apply(): ImportTableInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportTableInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setInputCompressionType(value: InputCompressionType | String): Self = StObject.set(x, "InputCompressionType", value.asInstanceOf[js.Any])
    
    inline def setInputCompressionTypeUndefined: Self = StObject.set(x, "InputCompressionType", js.undefined)
    
    inline def setInputFormat(value: InputFormat | String): Self = StObject.set(x, "InputFormat", value.asInstanceOf[js.Any])
    
    inline def setInputFormatOptions(value: InputFormatOptions): Self = StObject.set(x, "InputFormatOptions", value.asInstanceOf[js.Any])
    
    inline def setInputFormatOptionsUndefined: Self = StObject.set(x, "InputFormatOptions", js.undefined)
    
    inline def setInputFormatUndefined: Self = StObject.set(x, "InputFormat", js.undefined)
    
    inline def setS3BucketSource(value: S3BucketSource): Self = StObject.set(x, "S3BucketSource", value.asInstanceOf[js.Any])
    
    inline def setS3BucketSourceUndefined: Self = StObject.set(x, "S3BucketSource", js.undefined)
    
    inline def setTableCreationParameters(value: TableCreationParameters): Self = StObject.set(x, "TableCreationParameters", value.asInstanceOf[js.Any])
    
    inline def setTableCreationParametersUndefined: Self = StObject.set(x, "TableCreationParameters", js.undefined)
  }
}
