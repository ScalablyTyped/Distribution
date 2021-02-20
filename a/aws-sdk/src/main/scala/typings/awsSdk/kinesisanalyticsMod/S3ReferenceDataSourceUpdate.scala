package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ReferenceDataSourceUpdate extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARNUpdate: js.UndefOr[BucketARN] = js.native
  
  /**
    * Object key name.
    */
  var FileKeyUpdate: js.UndefOr[FileKey] = js.native
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the in-application.
    */
  var ReferenceRoleARNUpdate: js.UndefOr[RoleARN] = js.native
}
object S3ReferenceDataSourceUpdate {
  
  @scala.inline
  def apply(): S3ReferenceDataSourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ReferenceDataSourceUpdate]
  }
  
  @scala.inline
  implicit class S3ReferenceDataSourceUpdateMutableBuilder[Self <: S3ReferenceDataSourceUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketARNUpdate(value: BucketARN): Self = StObject.set(x, "BucketARNUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketARNUpdateUndefined: Self = StObject.set(x, "BucketARNUpdate", js.undefined)
    
    @scala.inline
    def setFileKeyUpdate(value: FileKey): Self = StObject.set(x, "FileKeyUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileKeyUpdateUndefined: Self = StObject.set(x, "FileKeyUpdate", js.undefined)
    
    @scala.inline
    def setReferenceRoleARNUpdate(value: RoleARN): Self = StObject.set(x, "ReferenceRoleARNUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceRoleARNUpdateUndefined: Self = StObject.set(x, "ReferenceRoleARNUpdate", js.undefined)
  }
}
