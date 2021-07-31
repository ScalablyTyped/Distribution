package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesActivitiesResponseMod.UnmarshalledActivitiesResponse
import typings.awsSdkClientPinpointBrowser.typesAdmchannelresponseMod.UnmarshalledADMChannelResponse
import typings.awsSdkClientPinpointBrowser.typesApnschannelresponseMod.UnmarshalledAPNSChannelResponse
import typings.awsSdkClientPinpointBrowser.typesApnssandboxchannelresponseMod.UnmarshalledAPNSSandboxChannelResponse
import typings.awsSdkClientPinpointBrowser.typesApnsvoipchannelresponseMod.UnmarshalledAPNSVoipChannelResponse
import typings.awsSdkClientPinpointBrowser.typesApnsvoipsandboxchannelresponseMod.UnmarshalledAPNSVoipSandboxChannelResponse
import typings.awsSdkClientPinpointBrowser.typesApplicationResponseMod.UnmarshalledApplicationResponse
import typings.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod.UnmarshalledApplicationSettingsResource
import typings.awsSdkClientPinpointBrowser.typesApplicationsResponseMod.UnmarshalledApplicationsResponse
import typings.awsSdkClientPinpointBrowser.typesAttributesResourceMod.UnmarshalledAttributesResource
import typings.awsSdkClientPinpointBrowser.typesBaiduChannelResponseMod.UnmarshalledBaiduChannelResponse
import typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import typings.awsSdkClientPinpointBrowser.typesCampaignsResponseMod.UnmarshalledCampaignsResponse
import typings.awsSdkClientPinpointBrowser.typesChannelsResponseMod.UnmarshalledChannelsResponse
import typings.awsSdkClientPinpointBrowser.typesEmailChannelResponseMod.UnmarshalledEmailChannelResponse
import typings.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import typings.awsSdkClientPinpointBrowser.typesEndpointsResponseMod.UnmarshalledEndpointsResponse
import typings.awsSdkClientPinpointBrowser.typesEventStreamMod.UnmarshalledEventStream
import typings.awsSdkClientPinpointBrowser.typesEventsResponseMod.UnmarshalledEventsResponse
import typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod.UnmarshalledExportJobResponse
import typings.awsSdkClientPinpointBrowser.typesExportJobsResponseMod.UnmarshalledExportJobsResponse
import typings.awsSdkClientPinpointBrowser.typesGcmchannelresponseMod.UnmarshalledGCMChannelResponse
import typings.awsSdkClientPinpointBrowser.typesImportJobResponseMod.UnmarshalledImportJobResponse
import typings.awsSdkClientPinpointBrowser.typesImportJobsResponseMod.UnmarshalledImportJobsResponse
import typings.awsSdkClientPinpointBrowser.typesMessageBodyMod.UnmarshalledMessageBody
import typings.awsSdkClientPinpointBrowser.typesMessageResponseMod.UnmarshalledMessageResponse
import typings.awsSdkClientPinpointBrowser.typesNumberValidateResponseMod.UnmarshalledNumberValidateResponse
import typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod.UnmarshalledSegmentResponse
import typings.awsSdkClientPinpointBrowser.typesSegmentsResponseMod.UnmarshalledSegmentsResponse
import typings.awsSdkClientPinpointBrowser.typesSendUsersMessageResponseMod.UnmarshalledSendUsersMessageResponse
import typings.awsSdkClientPinpointBrowser.typesSmschannelresponseMod.UnmarshalledSMSChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput
    - typings.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod.CreateCampaignOutput
    - typings.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput
    - typings.awsSdkClientPinpointBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput
    - typings.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteAdmChannelOutputMod.DeleteAdmChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteApnsChannelOutputMod.DeleteApnsChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelOutputMod.DeleteApnsSandboxChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelOutputMod.DeleteApnsVoipChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelOutputMod.DeleteApnsVoipSandboxChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteAppOutputMod.DeleteAppOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelOutputMod.DeleteBaiduChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteEmailChannelOutputMod.DeleteEmailChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteGcmChannelOutputMod.DeleteGcmChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteSmsChannelOutputMod.DeleteSmsChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod.DeleteUserEndpointsOutput
    - typings.awsSdkClientPinpointBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesGetApnsChannelOutputMod.GetApnsChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelOutputMod.GetApnsSandboxChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelOutputMod.GetApnsVoipChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelOutputMod.GetApnsVoipSandboxChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesGetAppOutputMod.GetAppOutput
    - typings.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput
    - typings.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput
    - typings.awsSdkClientPinpointBrowser.typesGetBaiduChannelOutputMod.GetBaiduChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesGetCampaignOutputMod.GetCampaignOutput
    - typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput
    - typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput
    - typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionsOutputMod.GetCampaignVersionsOutput
    - typings.awsSdkClientPinpointBrowser.typesGetCampaignsOutputMod.GetCampaignsOutput
    - typings.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput
    - typings.awsSdkClientPinpointBrowser.typesGetEmailChannelOutputMod.GetEmailChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput
    - typings.awsSdkClientPinpointBrowser.typesGetEventStreamOutputMod.GetEventStreamOutput
    - typings.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput
    - typings.awsSdkClientPinpointBrowser.typesGetExportJobsOutputMod.GetExportJobsOutput
    - typings.awsSdkClientPinpointBrowser.typesGetGcmChannelOutputMod.GetGcmChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput
    - typings.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput
    - typings.awsSdkClientPinpointBrowser.typesGetSegmentOutputMod.GetSegmentOutput
    - typings.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsOutputMod.GetSegmentExportJobsOutput
    - typings.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsOutputMod.GetSegmentImportJobsOutput
    - typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionOutputMod.GetSegmentVersionOutput
    - typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput
    - typings.awsSdkClientPinpointBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput
    - typings.awsSdkClientPinpointBrowser.typesGetSmsChannelOutputMod.GetSmsChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput
    - typings.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput
    - typings.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput
    - typings.awsSdkClientPinpointBrowser.typesPutEventsOutputMod.PutEventsOutput
    - typings.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod.RemoveAttributesOutput
    - typings.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod.SendMessagesOutput
    - typings.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateAdmChannelOutputMod.UpdateAdmChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateApnsChannelOutputMod.UpdateApnsChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelOutputMod.UpdateApnsSandboxChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelOutputMod.UpdateApnsVoipChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelOutputMod.UpdateApnsVoipSandboxChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelOutputMod.UpdateBaiduChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateEmailChannelOutputMod.UpdateEmailChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchOutputMod.UpdateEndpointsBatchOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateGcmChannelOutputMod.UpdateGcmChannelOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateSegmentOutputMod.UpdateSegmentOutput
    - typings.awsSdkClientPinpointBrowser.typesUpdateSmsChannelOutputMod.UpdateSmsChannelOutput
  */
  trait OutputTypesUnion extends StObject
  object OutputTypesUnion {
    
    @scala.inline
    def CreateAppOutput($metadata: ResponseMetadata, ApplicationResponse: UnmarshalledApplicationResponse): typings.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput]
    }
    
    @scala.inline
    def CreateCampaignOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typings.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod.CreateCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod.CreateCampaignOutput]
    }
    
    @scala.inline
    def CreateExportJobOutput($metadata: ResponseMetadata, ExportJobResponse: UnmarshalledExportJobResponse): typings.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput]
    }
    
    @scala.inline
    def CreateImportJobOutput($metadata: ResponseMetadata, ImportJobResponse: UnmarshalledImportJobResponse): typings.awsSdkClientPinpointBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput]
    }
    
    @scala.inline
    def CreateSegmentOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typings.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput]
    }
    
    @scala.inline
    def DeleteAdmChannelOutput($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): typings.awsSdkClientPinpointBrowser.typesDeleteAdmChannelOutputMod.DeleteAdmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteAdmChannelOutputMod.DeleteAdmChannelOutput]
    }
    
    @scala.inline
    def DeleteApnsChannelOutput($metadata: ResponseMetadata, APNSChannelResponse: UnmarshalledAPNSChannelResponse): typings.awsSdkClientPinpointBrowser.typesDeleteApnsChannelOutputMod.DeleteApnsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteApnsChannelOutputMod.DeleteApnsChannelOutput]
    }
    
    @scala.inline
    def DeleteApnsSandboxChannelOutput($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): typings.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelOutputMod.DeleteApnsSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelOutputMod.DeleteApnsSandboxChannelOutput]
    }
    
    @scala.inline
    def DeleteApnsVoipChannelOutput($metadata: ResponseMetadata, APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse): typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelOutputMod.DeleteApnsVoipChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelOutputMod.DeleteApnsVoipChannelOutput]
    }
    
    @scala.inline
    def DeleteApnsVoipSandboxChannelOutput(
      $metadata: ResponseMetadata,
      APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
    ): typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelOutputMod.DeleteApnsVoipSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelOutputMod.DeleteApnsVoipSandboxChannelOutput]
    }
    
    @scala.inline
    def DeleteAppOutput($metadata: ResponseMetadata, ApplicationResponse: UnmarshalledApplicationResponse): typings.awsSdkClientPinpointBrowser.typesDeleteAppOutputMod.DeleteAppOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteAppOutputMod.DeleteAppOutput]
    }
    
    @scala.inline
    def DeleteBaiduChannelOutput($metadata: ResponseMetadata, BaiduChannelResponse: UnmarshalledBaiduChannelResponse): typings.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelOutputMod.DeleteBaiduChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelOutputMod.DeleteBaiduChannelOutput]
    }
    
    @scala.inline
    def DeleteCampaignOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typings.awsSdkClientPinpointBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput]
    }
    
    @scala.inline
    def DeleteEmailChannelOutput($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): typings.awsSdkClientPinpointBrowser.typesDeleteEmailChannelOutputMod.DeleteEmailChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteEmailChannelOutputMod.DeleteEmailChannelOutput]
    }
    
    @scala.inline
    def DeleteEndpointOutput($metadata: ResponseMetadata, EndpointResponse: UnmarshalledEndpointResponse): typings.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput]
    }
    
    @scala.inline
    def DeleteEventStreamOutput($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): typings.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput]
    }
    
    @scala.inline
    def DeleteGcmChannelOutput($metadata: ResponseMetadata, GCMChannelResponse: UnmarshalledGCMChannelResponse): typings.awsSdkClientPinpointBrowser.typesDeleteGcmChannelOutputMod.DeleteGcmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteGcmChannelOutputMod.DeleteGcmChannelOutput]
    }
    
    @scala.inline
    def DeleteSegmentOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typings.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput]
    }
    
    @scala.inline
    def DeleteSmsChannelOutput($metadata: ResponseMetadata, SMSChannelResponse: UnmarshalledSMSChannelResponse): typings.awsSdkClientPinpointBrowser.typesDeleteSmsChannelOutputMod.DeleteSmsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteSmsChannelOutputMod.DeleteSmsChannelOutput]
    }
    
    @scala.inline
    def DeleteUserEndpointsOutput($metadata: ResponseMetadata, EndpointsResponse: UnmarshalledEndpointsResponse): typings.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod.DeleteUserEndpointsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod.DeleteUserEndpointsOutput]
    }
    
    @scala.inline
    def GetAdmChannelOutput($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): typings.awsSdkClientPinpointBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput]
    }
    
    @scala.inline
    def GetApnsChannelOutput($metadata: ResponseMetadata, APNSChannelResponse: UnmarshalledAPNSChannelResponse): typings.awsSdkClientPinpointBrowser.typesGetApnsChannelOutputMod.GetApnsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetApnsChannelOutputMod.GetApnsChannelOutput]
    }
    
    @scala.inline
    def GetApnsSandboxChannelOutput($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): typings.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelOutputMod.GetApnsSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelOutputMod.GetApnsSandboxChannelOutput]
    }
    
    @scala.inline
    def GetApnsVoipChannelOutput($metadata: ResponseMetadata, APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse): typings.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelOutputMod.GetApnsVoipChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelOutputMod.GetApnsVoipChannelOutput]
    }
    
    @scala.inline
    def GetApnsVoipSandboxChannelOutput(
      $metadata: ResponseMetadata,
      APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
    ): typings.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelOutputMod.GetApnsVoipSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelOutputMod.GetApnsVoipSandboxChannelOutput]
    }
    
    @scala.inline
    def GetAppOutput($metadata: ResponseMetadata, ApplicationResponse: UnmarshalledApplicationResponse): typings.awsSdkClientPinpointBrowser.typesGetAppOutputMod.GetAppOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetAppOutputMod.GetAppOutput]
    }
    
    @scala.inline
    def GetApplicationSettingsOutput($metadata: ResponseMetadata, ApplicationSettingsResource: UnmarshalledApplicationSettingsResource): typings.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput]
    }
    
    @scala.inline
    def GetAppsOutput($metadata: ResponseMetadata, ApplicationsResponse: UnmarshalledApplicationsResponse): typings.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationsResponse = ApplicationsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput]
    }
    
    @scala.inline
    def GetBaiduChannelOutput($metadata: ResponseMetadata, BaiduChannelResponse: UnmarshalledBaiduChannelResponse): typings.awsSdkClientPinpointBrowser.typesGetBaiduChannelOutputMod.GetBaiduChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetBaiduChannelOutputMod.GetBaiduChannelOutput]
    }
    
    @scala.inline
    def GetCampaignActivitiesOutput($metadata: ResponseMetadata, ActivitiesResponse: UnmarshalledActivitiesResponse): typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ActivitiesResponse = ActivitiesResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput]
    }
    
    @scala.inline
    def GetCampaignOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typings.awsSdkClientPinpointBrowser.typesGetCampaignOutputMod.GetCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetCampaignOutputMod.GetCampaignOutput]
    }
    
    @scala.inline
    def GetCampaignVersionOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput]
    }
    
    @scala.inline
    def GetCampaignVersionsOutput($metadata: ResponseMetadata, CampaignsResponse: UnmarshalledCampaignsResponse): typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionsOutputMod.GetCampaignVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionsOutputMod.GetCampaignVersionsOutput]
    }
    
    @scala.inline
    def GetCampaignsOutput($metadata: ResponseMetadata, CampaignsResponse: UnmarshalledCampaignsResponse): typings.awsSdkClientPinpointBrowser.typesGetCampaignsOutputMod.GetCampaignsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetCampaignsOutputMod.GetCampaignsOutput]
    }
    
    @scala.inline
    def GetChannelsOutput($metadata: ResponseMetadata, ChannelsResponse: UnmarshalledChannelsResponse): typings.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ChannelsResponse = ChannelsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput]
    }
    
    @scala.inline
    def GetEmailChannelOutput($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): typings.awsSdkClientPinpointBrowser.typesGetEmailChannelOutputMod.GetEmailChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetEmailChannelOutputMod.GetEmailChannelOutput]
    }
    
    @scala.inline
    def GetEndpointOutput($metadata: ResponseMetadata, EndpointResponse: UnmarshalledEndpointResponse): typings.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput]
    }
    
    @scala.inline
    def GetEventStreamOutput($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): typings.awsSdkClientPinpointBrowser.typesGetEventStreamOutputMod.GetEventStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetEventStreamOutputMod.GetEventStreamOutput]
    }
    
    @scala.inline
    def GetExportJobOutput($metadata: ResponseMetadata, ExportJobResponse: UnmarshalledExportJobResponse): typings.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput]
    }
    
    @scala.inline
    def GetExportJobsOutput($metadata: ResponseMetadata, ExportJobsResponse: UnmarshalledExportJobsResponse): typings.awsSdkClientPinpointBrowser.typesGetExportJobsOutputMod.GetExportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetExportJobsOutputMod.GetExportJobsOutput]
    }
    
    @scala.inline
    def GetGcmChannelOutput($metadata: ResponseMetadata, GCMChannelResponse: UnmarshalledGCMChannelResponse): typings.awsSdkClientPinpointBrowser.typesGetGcmChannelOutputMod.GetGcmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetGcmChannelOutputMod.GetGcmChannelOutput]
    }
    
    @scala.inline
    def GetImportJobOutput($metadata: ResponseMetadata, ImportJobResponse: UnmarshalledImportJobResponse): typings.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput]
    }
    
    @scala.inline
    def GetImportJobsOutput($metadata: ResponseMetadata, ImportJobsResponse: UnmarshalledImportJobsResponse): typings.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput]
    }
    
    @scala.inline
    def GetSegmentExportJobsOutput($metadata: ResponseMetadata, ExportJobsResponse: UnmarshalledExportJobsResponse): typings.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsOutputMod.GetSegmentExportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsOutputMod.GetSegmentExportJobsOutput]
    }
    
    @scala.inline
    def GetSegmentImportJobsOutput($metadata: ResponseMetadata, ImportJobsResponse: UnmarshalledImportJobsResponse): typings.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsOutputMod.GetSegmentImportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsOutputMod.GetSegmentImportJobsOutput]
    }
    
    @scala.inline
    def GetSegmentOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typings.awsSdkClientPinpointBrowser.typesGetSegmentOutputMod.GetSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSegmentOutputMod.GetSegmentOutput]
    }
    
    @scala.inline
    def GetSegmentVersionOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionOutputMod.GetSegmentVersionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionOutputMod.GetSegmentVersionOutput]
    }
    
    @scala.inline
    def GetSegmentVersionsOutput($metadata: ResponseMetadata, SegmentsResponse: UnmarshalledSegmentsResponse): typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput]
    }
    
    @scala.inline
    def GetSegmentsOutput($metadata: ResponseMetadata, SegmentsResponse: UnmarshalledSegmentsResponse): typings.awsSdkClientPinpointBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput]
    }
    
    @scala.inline
    def GetSmsChannelOutput($metadata: ResponseMetadata, SMSChannelResponse: UnmarshalledSMSChannelResponse): typings.awsSdkClientPinpointBrowser.typesGetSmsChannelOutputMod.GetSmsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetSmsChannelOutputMod.GetSmsChannelOutput]
    }
    
    @scala.inline
    def GetUserEndpointsOutput($metadata: ResponseMetadata, EndpointsResponse: UnmarshalledEndpointsResponse): typings.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput]
    }
    
    @scala.inline
    def PhoneNumberValidateOutput($metadata: ResponseMetadata, NumberValidateResponse: UnmarshalledNumberValidateResponse): typings.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], NumberValidateResponse = NumberValidateResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput]
    }
    
    @scala.inline
    def PutEventStreamOutput($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): typings.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput]
    }
    
    @scala.inline
    def PutEventsOutput($metadata: ResponseMetadata, EventsResponse: UnmarshalledEventsResponse): typings.awsSdkClientPinpointBrowser.typesPutEventsOutputMod.PutEventsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventsResponse = EventsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesPutEventsOutputMod.PutEventsOutput]
    }
    
    @scala.inline
    def RemoveAttributesOutput($metadata: ResponseMetadata, AttributesResource: UnmarshalledAttributesResource): typings.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod.RemoveAttributesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], AttributesResource = AttributesResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod.RemoveAttributesOutput]
    }
    
    @scala.inline
    def SendMessagesOutput($metadata: ResponseMetadata, MessageResponse: UnmarshalledMessageResponse): typings.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod.SendMessagesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageResponse = MessageResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod.SendMessagesOutput]
    }
    
    @scala.inline
    def SendUsersMessagesOutput($metadata: ResponseMetadata, SendUsersMessageResponse: UnmarshalledSendUsersMessageResponse): typings.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SendUsersMessageResponse = SendUsersMessageResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput]
    }
    
    @scala.inline
    def UpdateAdmChannelOutput($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): typings.awsSdkClientPinpointBrowser.typesUpdateAdmChannelOutputMod.UpdateAdmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateAdmChannelOutputMod.UpdateAdmChannelOutput]
    }
    
    @scala.inline
    def UpdateApnsChannelOutput($metadata: ResponseMetadata, APNSChannelResponse: UnmarshalledAPNSChannelResponse): typings.awsSdkClientPinpointBrowser.typesUpdateApnsChannelOutputMod.UpdateApnsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateApnsChannelOutputMod.UpdateApnsChannelOutput]
    }
    
    @scala.inline
    def UpdateApnsSandboxChannelOutput($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): typings.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelOutputMod.UpdateApnsSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelOutputMod.UpdateApnsSandboxChannelOutput]
    }
    
    @scala.inline
    def UpdateApnsVoipChannelOutput($metadata: ResponseMetadata, APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse): typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelOutputMod.UpdateApnsVoipChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelOutputMod.UpdateApnsVoipChannelOutput]
    }
    
    @scala.inline
    def UpdateApnsVoipSandboxChannelOutput(
      $metadata: ResponseMetadata,
      APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
    ): typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelOutputMod.UpdateApnsVoipSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelOutputMod.UpdateApnsVoipSandboxChannelOutput]
    }
    
    @scala.inline
    def UpdateApplicationSettingsOutput($metadata: ResponseMetadata, ApplicationSettingsResource: UnmarshalledApplicationSettingsResource): typings.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput]
    }
    
    @scala.inline
    def UpdateBaiduChannelOutput($metadata: ResponseMetadata, BaiduChannelResponse: UnmarshalledBaiduChannelResponse): typings.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelOutputMod.UpdateBaiduChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelOutputMod.UpdateBaiduChannelOutput]
    }
    
    @scala.inline
    def UpdateCampaignOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typings.awsSdkClientPinpointBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput]
    }
    
    @scala.inline
    def UpdateEmailChannelOutput($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): typings.awsSdkClientPinpointBrowser.typesUpdateEmailChannelOutputMod.UpdateEmailChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateEmailChannelOutputMod.UpdateEmailChannelOutput]
    }
    
    @scala.inline
    def UpdateEndpointOutput($metadata: ResponseMetadata, MessageBody: UnmarshalledMessageBody): typings.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput]
    }
    
    @scala.inline
    def UpdateEndpointsBatchOutput($metadata: ResponseMetadata, MessageBody: UnmarshalledMessageBody): typings.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchOutputMod.UpdateEndpointsBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchOutputMod.UpdateEndpointsBatchOutput]
    }
    
    @scala.inline
    def UpdateGcmChannelOutput($metadata: ResponseMetadata, GCMChannelResponse: UnmarshalledGCMChannelResponse): typings.awsSdkClientPinpointBrowser.typesUpdateGcmChannelOutputMod.UpdateGcmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateGcmChannelOutputMod.UpdateGcmChannelOutput]
    }
    
    @scala.inline
    def UpdateSegmentOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typings.awsSdkClientPinpointBrowser.typesUpdateSegmentOutputMod.UpdateSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateSegmentOutputMod.UpdateSegmentOutput]
    }
    
    @scala.inline
    def UpdateSmsChannelOutput($metadata: ResponseMetadata, SMSChannelResponse: UnmarshalledSMSChannelResponse): typings.awsSdkClientPinpointBrowser.typesUpdateSmsChannelOutputMod.UpdateSmsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientPinpointBrowser.typesUpdateSmsChannelOutputMod.UpdateSmsChannelOutput]
    }
  }
}
