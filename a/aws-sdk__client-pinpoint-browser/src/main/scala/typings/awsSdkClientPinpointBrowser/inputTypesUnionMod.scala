package typings.awsSdkClientPinpointBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/InputTypesUnion", JSImport.Namespace)
@js.native
object inputTypesUnionMod extends js.Object {
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
  trait InputTypesUnion extends js.Object
  
}

