package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesBackupSummaryMod.UnmarshalledBackupSummary
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListBackupsOutputMod {
  
  trait ListBackupsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>List of <code>BackupSummary</code> objects.</p>
      */
    var BackupSummaries: js.UndefOr[js.Array[UnmarshalledBackupSummary]] = js.undefined
    
    /**
      * <p> The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the next page of results. </p> <p> If <code>LastEvaluatedBackupArn</code> is empty, then the last page of results has been processed and there are no more results to be retrieved. </p> <p> If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not indicate there is more data to be returned. All results are guaranteed to have been returned if and only if no value for <code>LastEvaluatedBackupArn</code> is returned. </p>
      */
    var LastEvaluatedBackupArn: js.UndefOr[String] = js.undefined
  }
  object ListBackupsOutput {
    
    inline def apply($metadata: ResponseMetadata): ListBackupsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListBackupsOutput]
    }
    
    extension [Self <: ListBackupsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setBackupSummaries(value: js.Array[UnmarshalledBackupSummary]): Self = StObject.set(x, "BackupSummaries", value.asInstanceOf[js.Any])
      
      inline def setBackupSummariesUndefined: Self = StObject.set(x, "BackupSummaries", js.undefined)
      
      inline def setBackupSummariesVarargs(value: UnmarshalledBackupSummary*): Self = StObject.set(x, "BackupSummaries", js.Array(value :_*))
      
      inline def setLastEvaluatedBackupArn(value: String): Self = StObject.set(x, "LastEvaluatedBackupArn", value.asInstanceOf[js.Any])
      
      inline def setLastEvaluatedBackupArnUndefined: Self = StObject.set(x, "LastEvaluatedBackupArn", js.undefined)
    }
  }
}
