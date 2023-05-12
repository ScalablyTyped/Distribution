package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCallAnalyticsJobRequest extends StObject {
  
  /**
    * A unique name, chosen by you, for your Call Analytics job. This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If you try to create a new job with the same name as an existing job, you get a ConflictException error.
    */
  var CallAnalyticsJobName: typings.awsSdk.clientsTranscribeserviceMod.CallAnalyticsJobName
  
  /**
    * Makes it possible to specify which speaker is on which channel. For example, if your agent is the first participant to speak, you would set ChannelId to 0 (to indicate the first channel) and ParticipantRole to AGENT (to indicate that it's the agent speaking).
    */
  var ChannelDefinitions: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.ChannelDefinitions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains your input files. If the role that you specify doesn’t have the appropriate permissions to access the specified Amazon S3 location, your request fails. IAM role ARNs have the format arn:partition:iam::account:role/role-name-with-path. For example: arn:aws:iam::111122223333:role/Admin. For more information, see IAM ARNs.
    */
  var DataAccessRoleArn: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.DataAccessRoleArn] = js.undefined
  
  /**
    * Describes the Amazon S3 location of the media file you want to use in your Call Analytics request.
    */
  var Media: typings.awsSdk.clientsTranscribeserviceMod.Media
  
  /**
    * The KMS key you want to use to encrypt your Call Analytics output. If using a key located in the current Amazon Web Services account, you can specify your KMS key in one of four ways:   Use the KMS key ID itself. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.   Use an alias for the KMS key ID. For example, alias/ExampleAlias.   Use the Amazon Resource Name (ARN) for the KMS key ID. For example, arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab.   Use the ARN for the KMS key alias. For example, arn:aws:kms:region:account-ID:alias/ExampleAlias.   If using a key located in a different Amazon Web Services account than the current Amazon Web Services account, you can specify your KMS key in one of two ways:   Use the ARN for the KMS key ID. For example, arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab.   Use the ARN for the KMS key alias. For example, arn:aws:kms:region:account-ID:alias/ExampleAlias.   If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3). If you specify a KMS key to encrypt your output, you must also specify an output location using the OutputLocation parameter. Note that the role making the request must have permission to use the specified KMS key.
    */
  var OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId] = js.undefined
  
  /**
    * The Amazon S3 location where you want your Call Analytics transcription output stored. You can use any of the following formats to specify the output location:   s3://DOC-EXAMPLE-BUCKET   s3://DOC-EXAMPLE-BUCKET/my-output-folder/   s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job.json   Unless you specify a file name (option 3), the name of your output file has a default value that matches the name you specified for your transcription job using the CallAnalyticsJobName parameter. You can specify a KMS key to encrypt your output using the OutputEncryptionKMSKeyId parameter. If you don't specify a KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side encryption. If you don't specify OutputLocation, your transcript is placed in a service-managed Amazon S3 bucket and you are provided with a URI to access your transcript.
    */
  var OutputLocation: js.UndefOr[Uri] = js.undefined
  
  /**
    * Specify additional optional settings in your request, including content redaction; allows you to apply custom language models, vocabulary filters, and custom vocabularies to your Call Analytics job.
    */
  var Settings: js.UndefOr[CallAnalyticsJobSettings] = js.undefined
}
object StartCallAnalyticsJobRequest {
  
  inline def apply(CallAnalyticsJobName: CallAnalyticsJobName, Media: Media): StartCallAnalyticsJobRequest = {
    val __obj = js.Dynamic.literal(CallAnalyticsJobName = CallAnalyticsJobName.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCallAnalyticsJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartCallAnalyticsJobRequest] (val x: Self) extends AnyVal {
    
    inline def setCallAnalyticsJobName(value: CallAnalyticsJobName): Self = StObject.set(x, "CallAnalyticsJobName", value.asInstanceOf[js.Any])
    
    inline def setChannelDefinitions(value: ChannelDefinitions): Self = StObject.set(x, "ChannelDefinitions", value.asInstanceOf[js.Any])
    
    inline def setChannelDefinitionsUndefined: Self = StObject.set(x, "ChannelDefinitions", js.undefined)
    
    inline def setChannelDefinitionsVarargs(value: ChannelDefinition*): Self = StObject.set(x, "ChannelDefinitions", js.Array(value*))
    
    inline def setDataAccessRoleArn(value: DataAccessRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setMedia(value: Media): Self = StObject.set(x, "Media", value.asInstanceOf[js.Any])
    
    inline def setOutputEncryptionKMSKeyId(value: KMSKeyId): Self = StObject.set(x, "OutputEncryptionKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setOutputEncryptionKMSKeyIdUndefined: Self = StObject.set(x, "OutputEncryptionKMSKeyId", js.undefined)
    
    inline def setOutputLocation(value: Uri): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
    
    inline def setSettings(value: CallAnalyticsJobSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
  }
}
