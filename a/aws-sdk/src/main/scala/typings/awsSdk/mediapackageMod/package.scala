package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.SCTE35_ENHANCED
  - typings.awsSdk.awsSdkStrings.PASSTHROUGH
  - typings.awsSdk.awsSdkStrings.DATERANGE
  - java.lang.String
*/
type AdMarkers = typings.awsSdk.mediapackageMod._AdMarkers | java.lang.String

type AdTriggers = js.Array[typings.awsSdk.mediapackageMod.AdTriggersElement]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SPLICE_INSERT
  - typings.awsSdk.awsSdkStrings.BREAK
  - typings.awsSdk.awsSdkStrings.PROVIDER_ADVERTISEMENT
  - typings.awsSdk.awsSdkStrings.DISTRIBUTOR_ADVERTISEMENT
  - typings.awsSdk.awsSdkStrings.PROVIDER_PLACEMENT_OPPORTUNITY
  - typings.awsSdk.awsSdkStrings.DISTRIBUTOR_PLACEMENT_OPPORTUNITY
  - typings.awsSdk.awsSdkStrings.PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY
  - typings.awsSdk.awsSdkStrings.DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY
  - java.lang.String
*/
type AdTriggersElement = typings.awsSdk.mediapackageMod._AdTriggersElement | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.RESTRICTED
  - typings.awsSdk.awsSdkStrings.UNRESTRICTED
  - typings.awsSdk.awsSdkStrings.BOTH
  - java.lang.String
*/
type AdsOnDeliveryRestrictions = typings.awsSdk.mediapackageMod._AdsOnDeliveryRestrictions | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AES_128
  - typings.awsSdk.awsSdkStrings.SAMPLE_AES
  - java.lang.String
*/
type EncryptionMethod = typings.awsSdk.mediapackageMod._EncryptionMethod | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL
  - typings.awsSdk.awsSdkStrings.COMPACT
  - java.lang.String
*/
type ManifestLayout = typings.awsSdk.mediapackageMod._ManifestLayout | java.lang.String

type MaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALLOW
  - typings.awsSdk.awsSdkStrings.DENY
  - java.lang.String
*/
type Origination = typings.awsSdk.mediapackageMod._Origination | java.lang.String

type PeriodTriggersElement = typings.awsSdk.awsSdkStrings.ADS | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.EVENT
  - typings.awsSdk.awsSdkStrings.VOD
  - java.lang.String
*/
type PlaylistType = typings.awsSdk.mediapackageMod._PlaylistType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.HBBTV_1_5
  - java.lang.String
*/
type Profile = typings.awsSdk.mediapackageMod._Profile | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NUMBER_WITH_TIMELINE
  - typings.awsSdk.awsSdkStrings.TIME_WITH_TIMELINE
  - typings.awsSdk.awsSdkStrings.NUMBER_WITH_DURATION
  - java.lang.String
*/
type SegmentTemplateFormat = typings.awsSdk.mediapackageMod._SegmentTemplateFormat | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type Status = typings.awsSdk.mediapackageMod._Status | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ORIGINAL
  - typings.awsSdk.awsSdkStrings.VIDEO_BITRATE_ASCENDING
  - typings.awsSdk.awsSdkStrings.VIDEO_BITRATE_DESCENDING
  - java.lang.String
*/
type StreamOrder = typings.awsSdk.mediapackageMod._StreamOrder | java.lang.String

type Tags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.mediapackageMod.string]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.`HTTP-HEAD`
  - typings.awsSdk.awsSdkStrings.`HTTP-ISO`
  - java.lang.String
*/
type UtcTiming = typings.awsSdk.mediapackageMod._UtcTiming | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-10-12`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.mediapackageMod._apiVersion | java.lang.String

type boolean = scala.Boolean

type integer = scala.Double

type listOfChannel = js.Array[typings.awsSdk.mediapackageMod.Channel]

type listOfHarvestJob = js.Array[typings.awsSdk.mediapackageMod.HarvestJob]

type listOfHlsManifest = js.Array[typings.awsSdk.mediapackageMod.HlsManifest]

type listOfHlsManifestCreateOrUpdateParameters = js.Array[typings.awsSdk.mediapackageMod.HlsManifestCreateOrUpdateParameters]

type listOfIngestEndpoint = js.Array[typings.awsSdk.mediapackageMod.IngestEndpoint]

type listOfOriginEndpoint = js.Array[typings.awsSdk.mediapackageMod.OriginEndpoint]

type listOfPeriodTriggersElement = js.Array[typings.awsSdk.mediapackageMod.PeriodTriggersElement]

type listOfString = js.Array[typings.awsSdk.mediapackageMod.string]

type mapOfString = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.mediapackageMod.string]

type string = java.lang.String
