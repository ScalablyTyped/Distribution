package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableLoggingMessage extends StObject {
  
  /**
    * The name of an existing S3 bucket where the log files are to be stored. Constraints:   Must be in the same region as the cluster   The cluster must have read bucket and put object permissions  
    */
  var BucketName: String
  
  /**
    * The identifier of the cluster on which logging is to be started. Example: examplecluster 
    */
  var ClusterIdentifier: String
  
  /**
    * The prefix applied to the log file names. Constraints:   Cannot exceed 512 characters   Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (\), or control characters. The hexadecimal codes for invalid characters are:    x00 to x20   x22   x27   x5c   x7f or larger    
    */
  var S3KeyPrefix: js.UndefOr[String] = js.undefined
}
object EnableLoggingMessage {
  
  inline def apply(BucketName: String, ClusterIdentifier: String): EnableLoggingMessage = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableLoggingMessage]
  }
  
  extension [Self <: EnableLoggingMessage](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefix(value: String): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
  }
}
