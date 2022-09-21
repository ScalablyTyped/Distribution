package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrammarSlotTypeSource extends StObject {
  
  /**
    * The Amazon KMS key required to decrypt the contents of the grammar, if any.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  
  /**
    * The name of the S3 bucket that contains the grammar source.
    */
  var s3BucketName: S3BucketName
  
  /**
    * The path to the grammar in the S3 bucket.
    */
  var s3ObjectKey: S3ObjectPath
}
object GrammarSlotTypeSource {
  
  inline def apply(s3BucketName: S3BucketName, s3ObjectKey: S3ObjectPath): GrammarSlotTypeSource = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any], s3ObjectKey = s3ObjectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrammarSlotTypeSource]
  }
  
  extension [Self <: GrammarSlotTypeSource](x: Self) {
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectKey(value: S3ObjectPath): Self = StObject.set(x, "s3ObjectKey", value.asInstanceOf[js.Any])
  }
}
