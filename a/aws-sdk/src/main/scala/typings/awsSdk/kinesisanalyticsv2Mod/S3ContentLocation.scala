package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ContentLocation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
    */
  var BucketARN: typings.awsSdk.kinesisanalyticsv2Mod.BucketARN
  
  /**
    * The file key for the object containing the application code.
    */
  var FileKey: typings.awsSdk.kinesisanalyticsv2Mod.FileKey
  
  /**
    * The version of the object containing the application code.
    */
  var ObjectVersion: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ObjectVersion] = js.undefined
}
object S3ContentLocation {
  
  inline def apply(BucketARN: BucketARN, FileKey: FileKey): S3ContentLocation = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ContentLocation]
  }
  
  extension [Self <: S3ContentLocation](x: Self) {
    
    inline def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    inline def setFileKey(value: FileKey): Self = StObject.set(x, "FileKey", value.asInstanceOf[js.Any])
    
    inline def setObjectVersion(value: ObjectVersion): Self = StObject.set(x, "ObjectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "ObjectVersion", js.undefined)
  }
}
