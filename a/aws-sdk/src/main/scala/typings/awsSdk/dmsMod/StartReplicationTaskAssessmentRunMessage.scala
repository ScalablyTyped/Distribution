package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartReplicationTaskAssessmentRunMessage extends StObject {
  
  /**
    * Unique name to identify the assessment run.
    */
  var AssessmentRunName: String = js.native
  
  /**
    * Space-separated list of names for specific individual assessments that you want to exclude. These names come from the default list of individual assessments that AWS DMS supports for the associated migration task. This task is specified by ReplicationTaskArn.  You can't set a value for Exclude if you also set a value for IncludeOnly in the API operation. To identify the names of the default individual assessments that AWS DMS supports for the associated migration task, run the DescribeApplicableIndividualAssessments operation using its own ReplicationTaskArn request parameter. 
    */
  var Exclude: js.UndefOr[ExcludeTestList] = js.native
  
  /**
    * Space-separated list of names for specific individual assessments that you want to include. These names come from the default list of individual assessments that AWS DMS supports for the associated migration task. This task is specified by ReplicationTaskArn.  You can't set a value for IncludeOnly if you also set a value for Exclude in the API operation.  To identify the names of the default individual assessments that AWS DMS supports for the associated migration task, run the DescribeApplicableIndividualAssessments operation using its own ReplicationTaskArn request parameter. 
    */
  var IncludeOnly: js.UndefOr[IncludeTestList] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the migration task associated with the premigration assessment run that you want to start.
    */
  var ReplicationTaskArn: String = js.native
  
  /**
    * Encryption mode that you can specify to encrypt the results of this assessment run. If you don't specify this request parameter, AWS DMS stores the assessment run results without encryption. You can specify one of the options following:    "SSE_S3" – The server-side encryption provided as a default by Amazon S3.    "SSE_KMS" – AWS Key Management Service (AWS KMS) encryption. This encryption can use either a custom KMS encryption key that you specify or the default KMS encryption key that DMS provides.  
    */
  var ResultEncryptionMode: js.UndefOr[String] = js.native
  
  /**
    * ARN of a custom KMS encryption key that you specify when you set ResultEncryptionMode to "SSE_KMS".
    */
  var ResultKmsKeyArn: js.UndefOr[String] = js.native
  
  /**
    * Amazon S3 bucket where you want AWS DMS to store the results of this assessment run.
    */
  var ResultLocationBucket: String = js.native
  
  /**
    * Folder within an Amazon S3 bucket where you want AWS DMS to store the results of this assessment run.
    */
  var ResultLocationFolder: js.UndefOr[String] = js.native
  
  /**
    * ARN of a service role needed to start the assessment run.
    */
  var ServiceAccessRoleArn: String = js.native
}
object StartReplicationTaskAssessmentRunMessage {
  
  @scala.inline
  def apply(
    AssessmentRunName: String,
    ReplicationTaskArn: String,
    ResultLocationBucket: String,
    ServiceAccessRoleArn: String
  ): StartReplicationTaskAssessmentRunMessage = {
    val __obj = js.Dynamic.literal(AssessmentRunName = AssessmentRunName.asInstanceOf[js.Any], ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any], ResultLocationBucket = ResultLocationBucket.asInstanceOf[js.Any], ServiceAccessRoleArn = ServiceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReplicationTaskAssessmentRunMessage]
  }
  
  @scala.inline
  implicit class StartReplicationTaskAssessmentRunMessageMutableBuilder[Self <: StartReplicationTaskAssessmentRunMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentRunName(value: String): Self = StObject.set(x, "AssessmentRunName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude(value: ExcludeTestList): Self = StObject.set(x, "Exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "Exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "Exclude", js.Array(value :_*))
    
    @scala.inline
    def setIncludeOnly(value: IncludeTestList): Self = StObject.set(x, "IncludeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeOnlyUndefined: Self = StObject.set(x, "IncludeOnly", js.undefined)
    
    @scala.inline
    def setIncludeOnlyVarargs(value: String*): Self = StObject.set(x, "IncludeOnly", js.Array(value :_*))
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultEncryptionMode(value: String): Self = StObject.set(x, "ResultEncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultEncryptionModeUndefined: Self = StObject.set(x, "ResultEncryptionMode", js.undefined)
    
    @scala.inline
    def setResultKmsKeyArn(value: String): Self = StObject.set(x, "ResultKmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultKmsKeyArnUndefined: Self = StObject.set(x, "ResultKmsKeyArn", js.undefined)
    
    @scala.inline
    def setResultLocationBucket(value: String): Self = StObject.set(x, "ResultLocationBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultLocationFolder(value: String): Self = StObject.set(x, "ResultLocationFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultLocationFolderUndefined: Self = StObject.set(x, "ResultLocationFolder", js.undefined)
    
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
  }
}
