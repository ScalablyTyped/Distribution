package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ExportConfiguration extends StObject {
  
  /**
    * The Amazon S3 bucket name in which a journal export job writes the journal contents. The bucket name must comply with the Amazon S3 bucket naming conventions. For more information, see Bucket Restrictions and Limitations in the Amazon S3 Developer Guide.
    */
  var Bucket: S3Bucket
  
  /**
    * The encryption settings that are used by a journal export job to write data in an Amazon S3 bucket.
    */
  var EncryptionConfiguration: S3EncryptionConfiguration
  
  /**
    * The prefix for the Amazon S3 bucket in which a journal export job writes the journal contents. The prefix must comply with Amazon S3 key naming rules and restrictions. For more information, see Object Key and Metadata in the Amazon S3 Developer Guide. The following are examples of valid Prefix values:    JournalExports-ForMyLedger/Testing/     JournalExports     My:Tests/   
    */
  var Prefix: S3Prefix
}
object S3ExportConfiguration {
  
  inline def apply(Bucket: S3Bucket, EncryptionConfiguration: S3EncryptionConfiguration, Prefix: S3Prefix): S3ExportConfiguration = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], EncryptionConfiguration = EncryptionConfiguration.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ExportConfiguration]
  }
  
  extension [Self <: S3ExportConfiguration](x: Self) {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfiguration(value: S3EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: S3Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
  }
}
