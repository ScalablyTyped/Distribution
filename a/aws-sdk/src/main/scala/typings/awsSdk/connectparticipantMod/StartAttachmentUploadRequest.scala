package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAttachmentUploadRequest extends StObject {
  
  /**
    * A case-sensitive name of the attachment being uploaded.
    */
  var AttachmentName: typings.awsSdk.connectparticipantMod.AttachmentName
  
  /**
    * The size of the attachment in bytes.
    */
  var AttachmentSizeInBytes: typings.awsSdk.connectparticipantMod.AttachmentSizeInBytes
  
  /**
    * A unique case sensitive identifier to support idempotency of request.
    */
  var ClientToken: NonEmptyClientToken
  
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken
  
  /**
    * Describes the MIME file type of the attachment. For a list of supported file types, see Feature specifications in the Amazon Connect Administrator Guide.
    */
  var ContentType: typings.awsSdk.connectparticipantMod.ContentType
}
object StartAttachmentUploadRequest {
  
  inline def apply(
    AttachmentName: AttachmentName,
    AttachmentSizeInBytes: AttachmentSizeInBytes,
    ClientToken: NonEmptyClientToken,
    ConnectionToken: ParticipantToken,
    ContentType: ContentType
  ): StartAttachmentUploadRequest = {
    val __obj = js.Dynamic.literal(AttachmentName = AttachmentName.asInstanceOf[js.Any], AttachmentSizeInBytes = AttachmentSizeInBytes.asInstanceOf[js.Any], ClientToken = ClientToken.asInstanceOf[js.Any], ConnectionToken = ConnectionToken.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAttachmentUploadRequest]
  }
  
  extension [Self <: StartAttachmentUploadRequest](x: Self) {
    
    inline def setAttachmentName(value: AttachmentName): Self = StObject.set(x, "AttachmentName", value.asInstanceOf[js.Any])
    
    inline def setAttachmentSizeInBytes(value: AttachmentSizeInBytes): Self = StObject.set(x, "AttachmentSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: NonEmptyClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setConnectionToken(value: ParticipantToken): Self = StObject.set(x, "ConnectionToken", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
  }
}
