package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object groundstationMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEGREE_ANGLE
    - typings.awsSdk.awsSdkStrings.RADIAN
    - java.lang.String
  */
  type AngleUnits = typings.awsSdk.groundstationMod._AngleUnits | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GHz
    - typings.awsSdk.awsSdkStrings.MHz
    - typings.awsSdk.awsSdkStrings.kHz
    - java.lang.String
  */
  type BandwidthUnits = typings.awsSdk.groundstationMod._BandwidthUnits | java.lang.String
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.groundstationMod.ClientApiVersions
  
  type ConfigArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`antenna-downlink`
    - typings.awsSdk.awsSdkStrings.`antenna-downlink-demod-decode`
    - typings.awsSdk.awsSdkStrings.`antenna-uplink`
    - typings.awsSdk.awsSdkStrings.`dataflow-endpoint`
    - typings.awsSdk.awsSdkStrings.tracking
    - typings.awsSdk.awsSdkStrings.`uplink-echo`
    - java.lang.String
  */
  type ConfigCapabilityType = typings.awsSdk.groundstationMod._ConfigCapabilityType | java.lang.String
  
  type ConfigList = js.Array[typings.awsSdk.groundstationMod.ConfigListItem]
  
  type ContactList = js.Array[typings.awsSdk.groundstationMod.ContactData]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.AWS_CANCELLED
    - typings.awsSdk.awsSdkStrings.AWS_FAILED
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - typings.awsSdk.awsSdkStrings.CANCELLING
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.FAILED_TO_SCHEDULE
    - typings.awsSdk.awsSdkStrings.PASS
    - typings.awsSdk.awsSdkStrings.POSTPASS
    - typings.awsSdk.awsSdkStrings.PREPASS
    - typings.awsSdk.awsSdkStrings.SCHEDULED
    - typings.awsSdk.awsSdkStrings.SCHEDULING
    - java.lang.String
  */
  type ContactStatus = typings.awsSdk.groundstationMod._ContactStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PREFERRED
    - typings.awsSdk.awsSdkStrings.REMOVED
    - typings.awsSdk.awsSdkStrings.REQUIRED
    - java.lang.String
  */
  type Criticality = typings.awsSdk.groundstationMod._Criticality | java.lang.String
  
  type DataflowEdge = js.Array[typings.awsSdk.groundstationMod.ConfigArn]
  
  type DataflowEdgeList = js.Array[typings.awsSdk.groundstationMod.DataflowEdge]
  
  type DataflowEndpointGroupArn = java.lang.String
  
  type DataflowEndpointGroupList = js.Array[typings.awsSdk.groundstationMod.DataflowEndpointListItem]
  
  type DataflowEndpointmtuInteger = scala.Double
  
  type DataflowList = js.Array[typings.awsSdk.groundstationMod.DataflowDetail]
  
  type Double = scala.Double
  
  type DurationInSeconds = scala.Double
  
  type EirpUnits = typings.awsSdk.awsSdkStrings.dBW | java.lang.String
  
  type EndpointDetailsList = js.Array[typings.awsSdk.groundstationMod.EndpointDetails]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.created__
    - typings.awsSdk.awsSdkStrings.creating__
    - typings.awsSdk.awsSdkStrings.deleted__
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type EndpointStatus = typings.awsSdk.groundstationMod._EndpointStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GHz
    - typings.awsSdk.awsSdkStrings.MHz
    - typings.awsSdk.awsSdkStrings.kHz
    - java.lang.String
  */
  type FrequencyUnits = typings.awsSdk.groundstationMod._FrequencyUnits | java.lang.String
  
  type GroundStationIdList = js.Array[typings.awsSdk.groundstationMod.String]
  
  type GroundStationList = js.Array[typings.awsSdk.groundstationMod.GroundStationData]
  
  type Integer = scala.Double
  
  type JsonString = java.lang.String
  
  type MissionProfileArn = java.lang.String
  
  type MissionProfileList = js.Array[typings.awsSdk.groundstationMod.MissionProfileListItem]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LEFT_HAND
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.RIGHT_HAND
    - java.lang.String
  */
  type Polarization = typings.awsSdk.groundstationMod._Polarization | java.lang.String
  
  type RoleArn = java.lang.String
  
  type SafeName = java.lang.String
  
  type SatelliteList = js.Array[typings.awsSdk.groundstationMod.SatelliteListItem]
  
  type SecurityGroupIdList = js.Array[typings.awsSdk.groundstationMod.String]
  
  type StatusList = js.Array[typings.awsSdk.groundstationMod.ContactStatus]
  
  type String = java.lang.String
  
  type SubnetList = js.Array[typings.awsSdk.groundstationMod.String]
  
  type TagKeys = js.Array[typings.awsSdk.groundstationMod.String]
  
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.groundstationMod.String]
  
  type Timestamp = typings.std.Date
  
  type Uuid = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-05-23`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.groundstationMod._apiVersion | java.lang.String
  
  type noradSatelliteID = scala.Double
  
  type satelliteArn = java.lang.String
}
