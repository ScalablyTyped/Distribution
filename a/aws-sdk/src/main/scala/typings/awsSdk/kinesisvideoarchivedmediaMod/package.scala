package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object kinesisvideoarchivedmediaMod {
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.kinesisvideoarchivedmediaMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type ClipFragmentSelectorType = typings.awsSdk.kinesisvideoarchivedmediaMod._ClipFragmentSelectorType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FRAGMENTED_MP4
    - typings.awsSdk.awsSdkStrings.MPEG_TS
    - java.lang.String
  */
  type ContainerFormat = typings.awsSdk.kinesisvideoarchivedmediaMod._ContainerFormat | java.lang.String
  
  type ContentType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALWAYS
    - typings.awsSdk.awsSdkStrings.NEVER
    - java.lang.String
  */
  type DASHDisplayFragmentNumber = typings.awsSdk.kinesisvideoarchivedmediaMod._DASHDisplayFragmentNumber | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALWAYS
    - typings.awsSdk.awsSdkStrings.NEVER
    - java.lang.String
  */
  type DASHDisplayFragmentTimestamp = typings.awsSdk.kinesisvideoarchivedmediaMod._DASHDisplayFragmentTimestamp | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type DASHFragmentSelectorType = typings.awsSdk.kinesisvideoarchivedmediaMod._DASHFragmentSelectorType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LIVE
    - typings.awsSdk.awsSdkStrings.LIVE_REPLAY
    - typings.awsSdk.awsSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type DASHPlaybackMode = typings.awsSdk.kinesisvideoarchivedmediaMod._DASHPlaybackMode | java.lang.String
  
  type DASHStreamingSessionURL = java.lang.String
  
  type Expires = scala.Double
  
  type FragmentList = js.Array[typings.awsSdk.kinesisvideoarchivedmediaMod.Fragment]
  
  type FragmentNumberList = js.Array[typings.awsSdk.kinesisvideoarchivedmediaMod.FragmentNumberString]
  
  type FragmentNumberString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type FragmentSelectorType = typings.awsSdk.kinesisvideoarchivedmediaMod._FragmentSelectorType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALWAYS
    - typings.awsSdk.awsSdkStrings.NEVER
    - typings.awsSdk.awsSdkStrings.ON_DISCONTINUITY
    - java.lang.String
  */
  type HLSDiscontinuityMode = typings.awsSdk.kinesisvideoarchivedmediaMod._HLSDiscontinuityMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALWAYS
    - typings.awsSdk.awsSdkStrings.NEVER
    - java.lang.String
  */
  type HLSDisplayFragmentTimestamp = typings.awsSdk.kinesisvideoarchivedmediaMod._HLSDisplayFragmentTimestamp | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type HLSFragmentSelectorType = typings.awsSdk.kinesisvideoarchivedmediaMod._HLSFragmentSelectorType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LIVE
    - typings.awsSdk.awsSdkStrings.LIVE_REPLAY
    - typings.awsSdk.awsSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type HLSPlaybackMode = typings.awsSdk.kinesisvideoarchivedmediaMod._HLSPlaybackMode | java.lang.String
  
  type HLSStreamingSessionURL = java.lang.String
  
  type Long = scala.Double
  
  type NextToken = java.lang.String
  
  type PageLimit = scala.Double
  
  type Payload = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.kinesisvideoarchivedmediaMod.Blob | java.lang.String | typings.node.streamMod.Readable
  
  type ResourceARN = java.lang.String
  
  type StreamName = java.lang.String
  
  type Timestamp = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-09-30`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.kinesisvideoarchivedmediaMod._apiVersion | java.lang.String
}
