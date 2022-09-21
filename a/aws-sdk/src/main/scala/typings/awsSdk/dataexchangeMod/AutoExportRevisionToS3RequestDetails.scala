package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoExportRevisionToS3RequestDetails extends StObject {
  
  /**
    * Encryption configuration for the auto export job.
    */
  var Encryption: js.UndefOr[ExportServerSideEncryption] = js.undefined
  
  /**
    * A revision destination is the Amazon S3 bucket folder destination to where the export will be sent.
    */
  var RevisionDestination: AutoExportRevisionDestinationEntry
}
object AutoExportRevisionToS3RequestDetails {
  
  inline def apply(RevisionDestination: AutoExportRevisionDestinationEntry): AutoExportRevisionToS3RequestDetails = {
    val __obj = js.Dynamic.literal(RevisionDestination = RevisionDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoExportRevisionToS3RequestDetails]
  }
  
  extension [Self <: AutoExportRevisionToS3RequestDetails](x: Self) {
    
    inline def setEncryption(value: ExportServerSideEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setRevisionDestination(value: AutoExportRevisionDestinationEntry): Self = StObject.set(x, "RevisionDestination", value.asInstanceOf[js.Any])
  }
}
