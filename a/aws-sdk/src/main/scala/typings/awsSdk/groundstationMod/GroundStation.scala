package typings.awsSdk.groundstationMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundStation extends Service {
  @JSName("config")
  var config_GroundStation: ConfigBase with ClientConfiguration = js.native
  /**
    * Cancels a contact with a specified contact ID.
    */
  def cancelContact(): Request[ContactIdResponse, AWSError] = js.native
  def cancelContact(callback: js.Function2[/* err */ AWSError, /* data */ ContactIdResponse, Unit]): Request[ContactIdResponse, AWSError] = js.native
  /**
    * Cancels a contact with a specified contact ID.
    */
  def cancelContact(params: CancelContactRequest): Request[ContactIdResponse, AWSError] = js.native
  def cancelContact(
    params: CancelContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ContactIdResponse, Unit]
  ): Request[ContactIdResponse, AWSError] = js.native
  /**
    * Creates a Config with the specified configData parameters.
    Only one type of configData can be specified.
    */
  def createConfig(): Request[ConfigIdResponse, AWSError] = js.native
  def createConfig(callback: js.Function2[/* err */ AWSError, /* data */ ConfigIdResponse, Unit]): Request[ConfigIdResponse, AWSError] = js.native
  /**
    * Creates a Config with the specified configData parameters.
    Only one type of configData can be specified.
    */
  def createConfig(params: CreateConfigRequest): Request[ConfigIdResponse, AWSError] = js.native
  def createConfig(
    params: CreateConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigIdResponse, Unit]
  ): Request[ConfigIdResponse, AWSError] = js.native
  /**
    * Creates a DataflowEndpoint group containing the specified list of DataflowEndpoint objects.
    The name field in each endpoint is used in your mission profile DataflowEndpointConfig 
    to specify which endpoints to use during a contact. 
    When a contact uses multiple DataflowEndpointConfig objects, each Config 
    must match a DataflowEndpoint in the same group.
    */
  def createDataflowEndpointGroup(): Request[DataflowEndpointGroupIdResponse, AWSError] = js.native
  def createDataflowEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ DataflowEndpointGroupIdResponse, Unit]): Request[DataflowEndpointGroupIdResponse, AWSError] = js.native
  /**
    * Creates a DataflowEndpoint group containing the specified list of DataflowEndpoint objects.
    The name field in each endpoint is used in your mission profile DataflowEndpointConfig 
    to specify which endpoints to use during a contact. 
    When a contact uses multiple DataflowEndpointConfig objects, each Config 
    must match a DataflowEndpoint in the same group.
    */
  def createDataflowEndpointGroup(params: CreateDataflowEndpointGroupRequest): Request[DataflowEndpointGroupIdResponse, AWSError] = js.native
  def createDataflowEndpointGroup(
    params: CreateDataflowEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DataflowEndpointGroupIdResponse, Unit]
  ): Request[DataflowEndpointGroupIdResponse, AWSError] = js.native
  /**
    * Creates a mission profile.
    
    dataflowEdges is a list of lists of strings. Each lower level list of strings
    has two elements: a from ARN and a to ARN.
    */
  def createMissionProfile(): Request[MissionProfileIdResponse, AWSError] = js.native
  def createMissionProfile(callback: js.Function2[/* err */ AWSError, /* data */ MissionProfileIdResponse, Unit]): Request[MissionProfileIdResponse, AWSError] = js.native
  /**
    * Creates a mission profile.
    
    dataflowEdges is a list of lists of strings. Each lower level list of strings
    has two elements: a from ARN and a to ARN.
    */
  def createMissionProfile(params: CreateMissionProfileRequest): Request[MissionProfileIdResponse, AWSError] = js.native
  def createMissionProfile(
    params: CreateMissionProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ MissionProfileIdResponse, Unit]
  ): Request[MissionProfileIdResponse, AWSError] = js.native
  /**
    * Deletes a Config.
    */
  def deleteConfig(): Request[ConfigIdResponse, AWSError] = js.native
  def deleteConfig(callback: js.Function2[/* err */ AWSError, /* data */ ConfigIdResponse, Unit]): Request[ConfigIdResponse, AWSError] = js.native
  /**
    * Deletes a Config.
    */
  def deleteConfig(params: DeleteConfigRequest): Request[ConfigIdResponse, AWSError] = js.native
  def deleteConfig(
    params: DeleteConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigIdResponse, Unit]
  ): Request[ConfigIdResponse, AWSError] = js.native
  /**
    * Deletes a dataflow endpoint group.
    */
  def deleteDataflowEndpointGroup(): Request[DataflowEndpointGroupIdResponse, AWSError] = js.native
  def deleteDataflowEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ DataflowEndpointGroupIdResponse, Unit]): Request[DataflowEndpointGroupIdResponse, AWSError] = js.native
  /**
    * Deletes a dataflow endpoint group.
    */
  def deleteDataflowEndpointGroup(params: DeleteDataflowEndpointGroupRequest): Request[DataflowEndpointGroupIdResponse, AWSError] = js.native
  def deleteDataflowEndpointGroup(
    params: DeleteDataflowEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DataflowEndpointGroupIdResponse, Unit]
  ): Request[DataflowEndpointGroupIdResponse, AWSError] = js.native
  /**
    * Deletes a mission profile.
    */
  def deleteMissionProfile(): Request[MissionProfileIdResponse, AWSError] = js.native
  def deleteMissionProfile(callback: js.Function2[/* err */ AWSError, /* data */ MissionProfileIdResponse, Unit]): Request[MissionProfileIdResponse, AWSError] = js.native
  /**
    * Deletes a mission profile.
    */
  def deleteMissionProfile(params: DeleteMissionProfileRequest): Request[MissionProfileIdResponse, AWSError] = js.native
  def deleteMissionProfile(
    params: DeleteMissionProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ MissionProfileIdResponse, Unit]
  ): Request[MissionProfileIdResponse, AWSError] = js.native
  /**
    * Describes an existing contact.
    */
  def describeContact(): Request[DescribeContactResponse, AWSError] = js.native
  def describeContact(callback: js.Function2[/* err */ AWSError, /* data */ DescribeContactResponse, Unit]): Request[DescribeContactResponse, AWSError] = js.native
  /**
    * Describes an existing contact.
    */
  def describeContact(params: DescribeContactRequest): Request[DescribeContactResponse, AWSError] = js.native
  def describeContact(
    params: DescribeContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeContactResponse, Unit]
  ): Request[DescribeContactResponse, AWSError] = js.native
  /**
    * Returns Config information.
    Only one Config response can be returned.
    */
  def getConfig(): Request[GetConfigResponse, AWSError] = js.native
  def getConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetConfigResponse, Unit]): Request[GetConfigResponse, AWSError] = js.native
  /**
    * Returns Config information.
    Only one Config response can be returned.
    */
  def getConfig(params: GetConfigRequest): Request[GetConfigResponse, AWSError] = js.native
  def getConfig(
    params: GetConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConfigResponse, Unit]
  ): Request[GetConfigResponse, AWSError] = js.native
  /**
    * Returns the dataflow endpoint group.
    */
  def getDataflowEndpointGroup(): Request[GetDataflowEndpointGroupResponse, AWSError] = js.native
  def getDataflowEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetDataflowEndpointGroupResponse, Unit]): Request[GetDataflowEndpointGroupResponse, AWSError] = js.native
  /**
    * Returns the dataflow endpoint group.
    */
  def getDataflowEndpointGroup(params: GetDataflowEndpointGroupRequest): Request[GetDataflowEndpointGroupResponse, AWSError] = js.native
  def getDataflowEndpointGroup(
    params: GetDataflowEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataflowEndpointGroupResponse, Unit]
  ): Request[GetDataflowEndpointGroupResponse, AWSError] = js.native
  /**
    * Returns the number of minutes used by account.
    */
  def getMinuteUsage(): Request[GetMinuteUsageResponse, AWSError] = js.native
  def getMinuteUsage(callback: js.Function2[/* err */ AWSError, /* data */ GetMinuteUsageResponse, Unit]): Request[GetMinuteUsageResponse, AWSError] = js.native
  /**
    * Returns the number of minutes used by account.
    */
  def getMinuteUsage(params: GetMinuteUsageRequest): Request[GetMinuteUsageResponse, AWSError] = js.native
  def getMinuteUsage(
    params: GetMinuteUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMinuteUsageResponse, Unit]
  ): Request[GetMinuteUsageResponse, AWSError] = js.native
  /**
    * Returns a mission profile.
    */
  def getMissionProfile(): Request[GetMissionProfileResponse, AWSError] = js.native
  def getMissionProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetMissionProfileResponse, Unit]): Request[GetMissionProfileResponse, AWSError] = js.native
  /**
    * Returns a mission profile.
    */
  def getMissionProfile(params: GetMissionProfileRequest): Request[GetMissionProfileResponse, AWSError] = js.native
  def getMissionProfile(
    params: GetMissionProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMissionProfileResponse, Unit]
  ): Request[GetMissionProfileResponse, AWSError] = js.native
  /**
    * Returns a satellite.
    */
  def getSatellite(): Request[GetSatelliteResponse, AWSError] = js.native
  def getSatellite(callback: js.Function2[/* err */ AWSError, /* data */ GetSatelliteResponse, Unit]): Request[GetSatelliteResponse, AWSError] = js.native
  /**
    * Returns a satellite.
    */
  def getSatellite(params: GetSatelliteRequest): Request[GetSatelliteResponse, AWSError] = js.native
  def getSatellite(
    params: GetSatelliteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSatelliteResponse, Unit]
  ): Request[GetSatelliteResponse, AWSError] = js.native
  /**
    * Returns a list of Config objects.
    */
  def listConfigs(): Request[ListConfigsResponse, AWSError] = js.native
  def listConfigs(callback: js.Function2[/* err */ AWSError, /* data */ ListConfigsResponse, Unit]): Request[ListConfigsResponse, AWSError] = js.native
  /**
    * Returns a list of Config objects.
    */
  def listConfigs(params: ListConfigsRequest): Request[ListConfigsResponse, AWSError] = js.native
  def listConfigs(
    params: ListConfigsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConfigsResponse, Unit]
  ): Request[ListConfigsResponse, AWSError] = js.native
  /**
    * Returns a list of contacts.
    If statusList contains AVAILABLE, the request must include
    groundstation, missionprofileArn, and satelliteArn.
    
    */
  def listContacts(): Request[ListContactsResponse, AWSError] = js.native
  def listContacts(callback: js.Function2[/* err */ AWSError, /* data */ ListContactsResponse, Unit]): Request[ListContactsResponse, AWSError] = js.native
  /**
    * Returns a list of contacts.
    If statusList contains AVAILABLE, the request must include
    groundstation, missionprofileArn, and satelliteArn.
    
    */
  def listContacts(params: ListContactsRequest): Request[ListContactsResponse, AWSError] = js.native
  def listContacts(
    params: ListContactsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListContactsResponse, Unit]
  ): Request[ListContactsResponse, AWSError] = js.native
  /**
    * Returns a list of DataflowEndpoint groups.
    */
  def listDataflowEndpointGroups(): Request[ListDataflowEndpointGroupsResponse, AWSError] = js.native
  def listDataflowEndpointGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListDataflowEndpointGroupsResponse, Unit]): Request[ListDataflowEndpointGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of DataflowEndpoint groups.
    */
  def listDataflowEndpointGroups(params: ListDataflowEndpointGroupsRequest): Request[ListDataflowEndpointGroupsResponse, AWSError] = js.native
  def listDataflowEndpointGroups(
    params: ListDataflowEndpointGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataflowEndpointGroupsResponse, Unit]
  ): Request[ListDataflowEndpointGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of ground stations. 
    */
  def listGroundStations(): Request[ListGroundStationsResponse, AWSError] = js.native
  def listGroundStations(callback: js.Function2[/* err */ AWSError, /* data */ ListGroundStationsResponse, Unit]): Request[ListGroundStationsResponse, AWSError] = js.native
  /**
    * Returns a list of ground stations. 
    */
  def listGroundStations(params: ListGroundStationsRequest): Request[ListGroundStationsResponse, AWSError] = js.native
  def listGroundStations(
    params: ListGroundStationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroundStationsResponse, Unit]
  ): Request[ListGroundStationsResponse, AWSError] = js.native
  /**
    * Returns a list of mission profiles.
    */
  def listMissionProfiles(): Request[ListMissionProfilesResponse, AWSError] = js.native
  def listMissionProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListMissionProfilesResponse, Unit]): Request[ListMissionProfilesResponse, AWSError] = js.native
  /**
    * Returns a list of mission profiles.
    */
  def listMissionProfiles(params: ListMissionProfilesRequest): Request[ListMissionProfilesResponse, AWSError] = js.native
  def listMissionProfiles(
    params: ListMissionProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMissionProfilesResponse, Unit]
  ): Request[ListMissionProfilesResponse, AWSError] = js.native
  /**
    * Returns a list of satellites.
    */
  def listSatellites(): Request[ListSatellitesResponse, AWSError] = js.native
  def listSatellites(callback: js.Function2[/* err */ AWSError, /* data */ ListSatellitesResponse, Unit]): Request[ListSatellitesResponse, AWSError] = js.native
  /**
    * Returns a list of satellites.
    */
  def listSatellites(params: ListSatellitesRequest): Request[ListSatellitesResponse, AWSError] = js.native
  def listSatellites(
    params: ListSatellitesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSatellitesResponse, Unit]
  ): Request[ListSatellitesResponse, AWSError] = js.native
  /**
    * Returns a list of tags or a specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of tags or a specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Reserves a contact using specified parameters.
    */
  def reserveContact(): Request[ContactIdResponse, AWSError] = js.native
  def reserveContact(callback: js.Function2[/* err */ AWSError, /* data */ ContactIdResponse, Unit]): Request[ContactIdResponse, AWSError] = js.native
  /**
    * Reserves a contact using specified parameters.
    */
  def reserveContact(params: ReserveContactRequest): Request[ContactIdResponse, AWSError] = js.native
  def reserveContact(
    params: ReserveContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ContactIdResponse, Unit]
  ): Request[ContactIdResponse, AWSError] = js.native
  /**
    * Assigns a tag to a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns a tag to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Deassigns a resource tag.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Deassigns a resource tag.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates the Config used when scheduling contacts.
    Updating a Config will not update the execution parameters
    for existing future contacts scheduled with this Config.
    */
  def updateConfig(): Request[ConfigIdResponse, AWSError] = js.native
  def updateConfig(callback: js.Function2[/* err */ AWSError, /* data */ ConfigIdResponse, Unit]): Request[ConfigIdResponse, AWSError] = js.native
  /**
    * Updates the Config used when scheduling contacts.
    Updating a Config will not update the execution parameters
    for existing future contacts scheduled with this Config.
    */
  def updateConfig(params: UpdateConfigRequest): Request[ConfigIdResponse, AWSError] = js.native
  def updateConfig(
    params: UpdateConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigIdResponse, Unit]
  ): Request[ConfigIdResponse, AWSError] = js.native
  /**
    * Updates a mission profile.
    Updating a mission profile will not update the execution parameters
    for existing future contacts.
    */
  def updateMissionProfile(): Request[MissionProfileIdResponse, AWSError] = js.native
  def updateMissionProfile(callback: js.Function2[/* err */ AWSError, /* data */ MissionProfileIdResponse, Unit]): Request[MissionProfileIdResponse, AWSError] = js.native
  /**
    * Updates a mission profile.
    Updating a mission profile will not update the execution parameters
    for existing future contacts.
    */
  def updateMissionProfile(params: UpdateMissionProfileRequest): Request[MissionProfileIdResponse, AWSError] = js.native
  def updateMissionProfile(
    params: UpdateMissionProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ MissionProfileIdResponse, Unit]
  ): Request[MissionProfileIdResponse, AWSError] = js.native
}

