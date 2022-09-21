package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AthenaDatasetDefinition extends StObject {
  
  var Catalog: AthenaCatalog
  
  var Database: AthenaDatabase
  
  /**
    * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt data generated from an Athena query execution.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.undefined
  
  var OutputCompression: js.UndefOr[AthenaResultCompressionType] = js.undefined
  
  var OutputFormat: AthenaResultFormat
  
  /**
    * The location in Amazon S3 where Athena query results are stored.
    */
  var OutputS3Uri: S3Uri
  
  var QueryString: AthenaQueryString
  
  var WorkGroup: js.UndefOr[AthenaWorkGroup] = js.undefined
}
object AthenaDatasetDefinition {
  
  inline def apply(
    Catalog: AthenaCatalog,
    Database: AthenaDatabase,
    OutputFormat: AthenaResultFormat,
    OutputS3Uri: S3Uri,
    QueryString: AthenaQueryString
  ): AthenaDatasetDefinition = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], Database = Database.asInstanceOf[js.Any], OutputFormat = OutputFormat.asInstanceOf[js.Any], OutputS3Uri = OutputS3Uri.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[AthenaDatasetDefinition]
  }
  
  extension [Self <: AthenaDatasetDefinition](x: Self) {
    
    inline def setCatalog(value: AthenaCatalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    inline def setDatabase(value: AthenaDatabase): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setOutputCompression(value: AthenaResultCompressionType): Self = StObject.set(x, "OutputCompression", value.asInstanceOf[js.Any])
    
    inline def setOutputCompressionUndefined: Self = StObject.set(x, "OutputCompression", js.undefined)
    
    inline def setOutputFormat(value: AthenaResultFormat): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputS3Uri(value: S3Uri): Self = StObject.set(x, "OutputS3Uri", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: AthenaQueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    inline def setWorkGroup(value: AthenaWorkGroup): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
    
    inline def setWorkGroupUndefined: Self = StObject.set(x, "WorkGroup", js.undefined)
  }
}
