package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesAdmchannelrequestMod.ADMChannelRequest
import typings.awsSdkClientPinpointBrowser.typesApnschannelrequestMod.APNSChannelRequest
import typings.awsSdkClientPinpointBrowser.typesApnssandboxchannelrequestMod.APNSSandboxChannelRequest
import typings.awsSdkClientPinpointBrowser.typesApnsvoipchannelrequestMod.APNSVoipChannelRequest
import typings.awsSdkClientPinpointBrowser.typesApnsvoipsandboxchannelrequestMod.APNSVoipSandboxChannelRequest
import typings.awsSdkClientPinpointBrowser.typesBaiduChannelRequestMod.BaiduChannelRequest
import typings.awsSdkClientPinpointBrowser.typesCreateApplicationRequestMod.CreateApplicationRequest
import typings.awsSdkClientPinpointBrowser.typesEmailChannelRequestMod.EmailChannelRequest
import typings.awsSdkClientPinpointBrowser.typesEndpointBatchRequestMod.EndpointBatchRequest
import typings.awsSdkClientPinpointBrowser.typesEndpointRequestMod.EndpointRequest
import typings.awsSdkClientPinpointBrowser.typesEventsRequestMod.EventsRequest
import typings.awsSdkClientPinpointBrowser.typesExportJobRequestMod.ExportJobRequest
import typings.awsSdkClientPinpointBrowser.typesGcmchannelrequestMod.GCMChannelRequest
import typings.awsSdkClientPinpointBrowser.typesImportJobRequestMod.ImportJobRequest
import typings.awsSdkClientPinpointBrowser.typesMessageRequestMod.MessageRequest
import typings.awsSdkClientPinpointBrowser.typesNumberValidateRequestMod.NumberValidateRequest
import typings.awsSdkClientPinpointBrowser.typesSendUsersMessageRequestMod.SendUsersMessageRequest
import typings.awsSdkClientPinpointBrowser.typesSmschannelrequestMod.SMSChannelRequest
import typings.awsSdkClientPinpointBrowser.typesUpdateAttributesRequestMod.UpdateAttributesRequest
import typings.awsSdkClientPinpointBrowser.typesWriteApplicationSettingsRequestMod.WriteApplicationSettingsRequest
import typings.awsSdkClientPinpointBrowser.typesWriteCampaignRequestMod.WriteCampaignRequest
import typings.awsSdkClientPinpointBrowser.typesWriteEventStreamMod.WriteEventStream
import typings.awsSdkClientPinpointBrowser.typesWriteSegmentRequestMod.WriteSegmentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientPinpointBrowser.typesCreateAppInputMod.CreateAppInput
    - typings.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput
    - typings.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput
    - typings.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput
    - typings.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteAdmChannelInputMod.DeleteAdmChannelInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteApnsChannelInputMod.DeleteApnsChannelInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelInputMod.DeleteApnsSandboxChannelInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelInputMod.DeleteApnsVoipChannelInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelInputMod.DeleteApnsVoipSandboxChannelInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteAppInputMod.DeleteAppInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelInputMod.DeleteBaiduChannelInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteEmailChannelInputMod.DeleteEmailChannelInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteGcmChannelInputMod.DeleteGcmChannelInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteSmsChannelInputMod.DeleteSmsChannelInput
    - typings.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsInputMod.DeleteUserEndpointsInput
    - typings.awsSdkClientPinpointBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput
    - typings.awsSdkClientPinpointBrowser.typesGetApnsChannelInputMod.GetApnsChannelInput
    - typings.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelInputMod.GetApnsSandboxChannelInput
    - typings.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelInputMod.GetApnsVoipChannelInput
    - typings.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelInputMod.GetApnsVoipSandboxChannelInput
    - typings.awsSdkClientPinpointBrowser.typesGetAppInputMod.GetAppInput
    - typings.awsSdkClientPinpointBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput
    - typings.awsSdkClientPinpointBrowser.typesGetAppsInputMod.GetAppsInput
    - typings.awsSdkClientPinpointBrowser.typesGetBaiduChannelInputMod.GetBaiduChannelInput
    - typings.awsSdkClientPinpointBrowser.typesGetCampaignInputMod.GetCampaignInput
    - typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput
    - typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput
    - typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionsInputMod.GetCampaignVersionsInput
    - typings.awsSdkClientPinpointBrowser.typesGetCampaignsInputMod.GetCampaignsInput
    - typings.awsSdkClientPinpointBrowser.typesGetChannelsInputMod.GetChannelsInput
    - typings.awsSdkClientPinpointBrowser.typesGetEmailChannelInputMod.GetEmailChannelInput
    - typings.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput
    - typings.awsSdkClientPinpointBrowser.typesGetEventStreamInputMod.GetEventStreamInput
    - typings.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput
    - typings.awsSdkClientPinpointBrowser.typesGetExportJobsInputMod.GetExportJobsInput
    - typings.awsSdkClientPinpointBrowser.typesGetGcmChannelInputMod.GetGcmChannelInput
    - typings.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput
    - typings.awsSdkClientPinpointBrowser.typesGetImportJobsInputMod.GetImportJobsInput
    - typings.awsSdkClientPinpointBrowser.typesGetSegmentInputMod.GetSegmentInput
    - typings.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsInputMod.GetSegmentExportJobsInput
    - typings.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput
    - typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionInputMod.GetSegmentVersionInput
    - typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionsInputMod.GetSegmentVersionsInput
    - typings.awsSdkClientPinpointBrowser.typesGetSegmentsInputMod.GetSegmentsInput
    - typings.awsSdkClientPinpointBrowser.typesGetSmsChannelInputMod.GetSmsChannelInput
    - typings.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput
    - typings.awsSdkClientPinpointBrowser.typesPhoneNumberValidateInputMod.PhoneNumberValidateInput
    - typings.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput
    - typings.awsSdkClientPinpointBrowser.typesPutEventsInputMod.PutEventsInput
    - typings.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput
    - typings.awsSdkClientPinpointBrowser.typesSendMessagesInputMod.SendMessagesInput
    - typings.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateAdmChannelInputMod.UpdateAdmChannelInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateApnsChannelInputMod.UpdateApnsChannelInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelInputMod.UpdateApnsSandboxChannelInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelInputMod.UpdateApnsVoipChannelInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelInputMod.UpdateApnsVoipSandboxChannelInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelInputMod.UpdateBaiduChannelInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateEmailChannelInputMod.UpdateEmailChannelInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput
    - typings.awsSdkClientPinpointBrowser.typesUpdateSmsChannelInputMod.UpdateSmsChannelInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def CreateAppInput(CreateApplicationRequest: CreateApplicationRequest): typings.awsSdkClientPinpointBrowser.typesCreateAppInputMod.CreateAppInput = {
      val __obj = js.Dynamic.literal(CreateApplicationRequest = CreateApplicationRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesCreateAppInputMod.CreateAppInput]
    }
    
    inline def CreateCampaignInput(ApplicationId: String, WriteCampaignRequest: WriteCampaignRequest): typings.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteCampaignRequest = WriteCampaignRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput]
    }
    
    inline def CreateExportJobInput(ApplicationId: String, ExportJobRequest: ExportJobRequest): typings.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ExportJobRequest = ExportJobRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput]
    }
    
    inline def CreateImportJobInput(ApplicationId: String, ImportJobRequest: ImportJobRequest): typings.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ImportJobRequest = ImportJobRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput]
    }
    
    inline def CreateSegmentInput(ApplicationId: String, WriteSegmentRequest: WriteSegmentRequest): typings.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteSegmentRequest = WriteSegmentRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput]
    }
    
    inline def DeleteAdmChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesDeleteAdmChannelInputMod.DeleteAdmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteAdmChannelInputMod.DeleteAdmChannelInput]
    }
    
    inline def DeleteApnsChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesDeleteApnsChannelInputMod.DeleteApnsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteApnsChannelInputMod.DeleteApnsChannelInput]
    }
    
    inline def DeleteApnsSandboxChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelInputMod.DeleteApnsSandboxChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelInputMod.DeleteApnsSandboxChannelInput]
    }
    
    inline def DeleteApnsVoipChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelInputMod.DeleteApnsVoipChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelInputMod.DeleteApnsVoipChannelInput]
    }
    
    inline def DeleteApnsVoipSandboxChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelInputMod.DeleteApnsVoipSandboxChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelInputMod.DeleteApnsVoipSandboxChannelInput]
    }
    
    inline def DeleteAppInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesDeleteAppInputMod.DeleteAppInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteAppInputMod.DeleteAppInput]
    }
    
    inline def DeleteBaiduChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelInputMod.DeleteBaiduChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelInputMod.DeleteBaiduChannelInput]
    }
    
    inline def DeleteCampaignInput(ApplicationId: String, CampaignId: String): typings.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput]
    }
    
    inline def DeleteEmailChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesDeleteEmailChannelInputMod.DeleteEmailChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteEmailChannelInputMod.DeleteEmailChannelInput]
    }
    
    inline def DeleteEndpointInput(ApplicationId: String, EndpointId: String): typings.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput]
    }
    
    inline def DeleteEventStreamInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput]
    }
    
    inline def DeleteGcmChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesDeleteGcmChannelInputMod.DeleteGcmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteGcmChannelInputMod.DeleteGcmChannelInput]
    }
    
    inline def DeleteSegmentInput(ApplicationId: String, SegmentId: String): typings.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput]
    }
    
    inline def DeleteSmsChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesDeleteSmsChannelInputMod.DeleteSmsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteSmsChannelInputMod.DeleteSmsChannelInput]
    }
    
    inline def DeleteUserEndpointsInput(ApplicationId: String, UserId: String): typings.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsInputMod.DeleteUserEndpointsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsInputMod.DeleteUserEndpointsInput]
    }
    
    inline def GetAdmChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput]
    }
    
    inline def GetApnsChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetApnsChannelInputMod.GetApnsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetApnsChannelInputMod.GetApnsChannelInput]
    }
    
    inline def GetApnsSandboxChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelInputMod.GetApnsSandboxChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelInputMod.GetApnsSandboxChannelInput]
    }
    
    inline def GetApnsVoipChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelInputMod.GetApnsVoipChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelInputMod.GetApnsVoipChannelInput]
    }
    
    inline def GetApnsVoipSandboxChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelInputMod.GetApnsVoipSandboxChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelInputMod.GetApnsVoipSandboxChannelInput]
    }
    
    inline def GetAppInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetAppInputMod.GetAppInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetAppInputMod.GetAppInput]
    }
    
    inline def GetApplicationSettingsInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput]
    }
    
    inline def GetAppsInput(): typings.awsSdkClientPinpointBrowser.typesGetAppsInputMod.GetAppsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetAppsInputMod.GetAppsInput]
    }
    
    inline def GetBaiduChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetBaiduChannelInputMod.GetBaiduChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetBaiduChannelInputMod.GetBaiduChannelInput]
    }
    
    inline def GetCampaignActivitiesInput(ApplicationId: String, CampaignId: String): typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput]
    }
    
    inline def GetCampaignInput(ApplicationId: String, CampaignId: String): typings.awsSdkClientPinpointBrowser.typesGetCampaignInputMod.GetCampaignInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetCampaignInputMod.GetCampaignInput]
    }
    
    inline def GetCampaignVersionInput(ApplicationId: String, CampaignId: String, Version: String): typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput]
    }
    
    inline def GetCampaignVersionsInput(ApplicationId: String, CampaignId: String): typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionsInputMod.GetCampaignVersionsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionsInputMod.GetCampaignVersionsInput]
    }
    
    inline def GetCampaignsInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetCampaignsInputMod.GetCampaignsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetCampaignsInputMod.GetCampaignsInput]
    }
    
    inline def GetChannelsInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetChannelsInputMod.GetChannelsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetChannelsInputMod.GetChannelsInput]
    }
    
    inline def GetEmailChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetEmailChannelInputMod.GetEmailChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetEmailChannelInputMod.GetEmailChannelInput]
    }
    
    inline def GetEndpointInput(ApplicationId: String, EndpointId: String): typings.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput]
    }
    
    inline def GetEventStreamInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetEventStreamInputMod.GetEventStreamInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetEventStreamInputMod.GetEventStreamInput]
    }
    
    inline def GetExportJobInput(ApplicationId: String, JobId: String): typings.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput]
    }
    
    inline def GetExportJobsInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetExportJobsInputMod.GetExportJobsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetExportJobsInputMod.GetExportJobsInput]
    }
    
    inline def GetGcmChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetGcmChannelInputMod.GetGcmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetGcmChannelInputMod.GetGcmChannelInput]
    }
    
    inline def GetImportJobInput(ApplicationId: String, JobId: String): typings.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput]
    }
    
    inline def GetImportJobsInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetImportJobsInputMod.GetImportJobsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetImportJobsInputMod.GetImportJobsInput]
    }
    
    inline def GetSegmentExportJobsInput(ApplicationId: String, SegmentId: String): typings.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsInputMod.GetSegmentExportJobsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsInputMod.GetSegmentExportJobsInput]
    }
    
    inline def GetSegmentImportJobsInput(ApplicationId: String, SegmentId: String): typings.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput]
    }
    
    inline def GetSegmentInput(ApplicationId: String, SegmentId: String): typings.awsSdkClientPinpointBrowser.typesGetSegmentInputMod.GetSegmentInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSegmentInputMod.GetSegmentInput]
    }
    
    inline def GetSegmentVersionInput(ApplicationId: String, SegmentId: String, Version: String): typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionInputMod.GetSegmentVersionInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionInputMod.GetSegmentVersionInput]
    }
    
    inline def GetSegmentVersionsInput(ApplicationId: String, SegmentId: String): typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionsInputMod.GetSegmentVersionsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionsInputMod.GetSegmentVersionsInput]
    }
    
    inline def GetSegmentsInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetSegmentsInputMod.GetSegmentsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSegmentsInputMod.GetSegmentsInput]
    }
    
    inline def GetSmsChannelInput(ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesGetSmsChannelInputMod.GetSmsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSmsChannelInputMod.GetSmsChannelInput]
    }
    
    inline def GetUserEndpointsInput(ApplicationId: String, UserId: String): typings.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput]
    }
    
    inline def PhoneNumberValidateInput(NumberValidateRequest: NumberValidateRequest): typings.awsSdkClientPinpointBrowser.typesPhoneNumberValidateInputMod.PhoneNumberValidateInput = {
      val __obj = js.Dynamic.literal(NumberValidateRequest = NumberValidateRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesPhoneNumberValidateInputMod.PhoneNumberValidateInput]
    }
    
    inline def PutEventStreamInput(ApplicationId: String, WriteEventStream: WriteEventStream): typings.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteEventStream = WriteEventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput]
    }
    
    inline def PutEventsInput(ApplicationId: String, EventsRequest: EventsRequest): typings.awsSdkClientPinpointBrowser.typesPutEventsInputMod.PutEventsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EventsRequest = EventsRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesPutEventsInputMod.PutEventsInput]
    }
    
    inline def RemoveAttributesInput(ApplicationId: String, AttributeType: String, UpdateAttributesRequest: UpdateAttributesRequest): typings.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any], UpdateAttributesRequest = UpdateAttributesRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput]
    }
    
    inline def SendMessagesInput(ApplicationId: String, MessageRequest: MessageRequest): typings.awsSdkClientPinpointBrowser.typesSendMessagesInputMod.SendMessagesInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], MessageRequest = MessageRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesSendMessagesInputMod.SendMessagesInput]
    }
    
    inline def SendUsersMessagesInput(ApplicationId: String, SendUsersMessageRequest: SendUsersMessageRequest): typings.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SendUsersMessageRequest = SendUsersMessageRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput]
    }
    
    inline def UpdateAdmChannelInput(ADMChannelRequest: ADMChannelRequest, ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesUpdateAdmChannelInputMod.UpdateAdmChannelInput = {
      val __obj = js.Dynamic.literal(ADMChannelRequest = ADMChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateAdmChannelInputMod.UpdateAdmChannelInput]
    }
    
    inline def UpdateApnsChannelInput(APNSChannelRequest: APNSChannelRequest, ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesUpdateApnsChannelInputMod.UpdateApnsChannelInput = {
      val __obj = js.Dynamic.literal(APNSChannelRequest = APNSChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateApnsChannelInputMod.UpdateApnsChannelInput]
    }
    
    inline def UpdateApnsSandboxChannelInput(APNSSandboxChannelRequest: APNSSandboxChannelRequest, ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelInputMod.UpdateApnsSandboxChannelInput = {
      val __obj = js.Dynamic.literal(APNSSandboxChannelRequest = APNSSandboxChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelInputMod.UpdateApnsSandboxChannelInput]
    }
    
    inline def UpdateApnsVoipChannelInput(APNSVoipChannelRequest: APNSVoipChannelRequest, ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelInputMod.UpdateApnsVoipChannelInput = {
      val __obj = js.Dynamic.literal(APNSVoipChannelRequest = APNSVoipChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelInputMod.UpdateApnsVoipChannelInput]
    }
    
    inline def UpdateApnsVoipSandboxChannelInput(APNSVoipSandboxChannelRequest: APNSVoipSandboxChannelRequest, ApplicationId: String): typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelInputMod.UpdateApnsVoipSandboxChannelInput = {
      val __obj = js.Dynamic.literal(APNSVoipSandboxChannelRequest = APNSVoipSandboxChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelInputMod.UpdateApnsVoipSandboxChannelInput]
    }
    
    inline def UpdateApplicationSettingsInput(ApplicationId: String, WriteApplicationSettingsRequest: WriteApplicationSettingsRequest): typings.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteApplicationSettingsRequest = WriteApplicationSettingsRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput]
    }
    
    inline def UpdateBaiduChannelInput(ApplicationId: String, BaiduChannelRequest: BaiduChannelRequest): typings.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelInputMod.UpdateBaiduChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], BaiduChannelRequest = BaiduChannelRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelInputMod.UpdateBaiduChannelInput]
    }
    
    inline def UpdateCampaignInput(ApplicationId: String, CampaignId: String, WriteCampaignRequest: WriteCampaignRequest): typings.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], WriteCampaignRequest = WriteCampaignRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput]
    }
    
    inline def UpdateEmailChannelInput(ApplicationId: String, EmailChannelRequest: EmailChannelRequest): typings.awsSdkClientPinpointBrowser.typesUpdateEmailChannelInputMod.UpdateEmailChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EmailChannelRequest = EmailChannelRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateEmailChannelInputMod.UpdateEmailChannelInput]
    }
    
    inline def UpdateEndpointInput(ApplicationId: String, EndpointId: String, EndpointRequest: EndpointRequest): typings.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any], EndpointRequest = EndpointRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput]
    }
    
    inline def UpdateEndpointsBatchInput(ApplicationId: String, EndpointBatchRequest: EndpointBatchRequest): typings.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointBatchRequest = EndpointBatchRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput]
    }
    
    inline def UpdateGcmChannelInput(ApplicationId: String, GCMChannelRequest: GCMChannelRequest): typings.awsSdkClientPinpointBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], GCMChannelRequest = GCMChannelRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput]
    }
    
    inline def UpdateSegmentInput(ApplicationId: String, SegmentId: String, WriteSegmentRequest: WriteSegmentRequest): typings.awsSdkClientPinpointBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], WriteSegmentRequest = WriteSegmentRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput]
    }
    
    inline def UpdateSmsChannelInput(ApplicationId: String, SMSChannelRequest: SMSChannelRequest): typings.awsSdkClientPinpointBrowser.typesUpdateSmsChannelInputMod.UpdateSmsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SMSChannelRequest = SMSChannelRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateSmsChannelInputMod.UpdateSmsChannelInput]
    }
  }
}
