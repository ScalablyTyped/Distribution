package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rekognitionMod {
  type Assets = js.Array[typings.awsSdk.rekognitionMod.Asset]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEFAULT
    - typings.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type Attribute = typings.awsSdk.rekognitionMod._Attribute | java.lang.String
  type Attributes = js.Array[typings.awsSdk.rekognitionMod.Attribute]
  type AudioMetadataList = js.Array[typings.awsSdk.rekognitionMod.AudioMetadata]
  type Boolean = scala.Boolean
  type BoundingBoxHeight = scala.Double
  type BoundingBoxWidth = scala.Double
  type CelebrityList = js.Array[typings.awsSdk.rekognitionMod.Celebrity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ID
    - typings.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type CelebrityRecognitionSortBy = typings.awsSdk.rekognitionMod._CelebrityRecognitionSortBy | java.lang.String
  type CelebrityRecognitions = js.Array[typings.awsSdk.rekognitionMod.CelebrityRecognition]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.rekognitionMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CollectionId = java.lang.String
  type CollectionIdList = js.Array[typings.awsSdk.rekognitionMod.CollectionId]
  type CompareFacesMatchList = js.Array[typings.awsSdk.rekognitionMod.CompareFacesMatch]
  type CompareFacesUnmatchList = js.Array[typings.awsSdk.rekognitionMod.ComparedFace]
  type ComparedFaceList = js.Array[typings.awsSdk.rekognitionMod.ComparedFace]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typings.awsSdk.awsSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = typings.awsSdk.rekognitionMod._ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[typings.awsSdk.rekognitionMod.ContentClassifier]
  type ContentModerationDetections = js.Array[typings.awsSdk.rekognitionMod.ContentModerationDetection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NAME
    - typings.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type ContentModerationSortBy = typings.awsSdk.rekognitionMod._ContentModerationSortBy | java.lang.String
  type CustomLabels = js.Array[typings.awsSdk.rekognitionMod.CustomLabel]
  type DateTime = typings.std.Date
  type Degree = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HAPPY
    - typings.awsSdk.awsSdkStrings.SAD
    - typings.awsSdk.awsSdkStrings.ANGRY
    - typings.awsSdk.awsSdkStrings.CONFUSED
    - typings.awsSdk.awsSdkStrings.DISGUSTED
    - typings.awsSdk.awsSdkStrings.SURPRISED
    - typings.awsSdk.awsSdkStrings.CALM
    - typings.awsSdk.awsSdkStrings.UNKNOWN
    - typings.awsSdk.awsSdkStrings.FEAR
    - java.lang.String
  */
  type EmotionName = typings.awsSdk.rekognitionMod._EmotionName | java.lang.String
  type Emotions = js.Array[typings.awsSdk.rekognitionMod.Emotion]
  type ExtendedPaginationToken = java.lang.String
  type ExternalImageId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEFAULT
    - typings.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type FaceAttributes = typings.awsSdk.rekognitionMod._FaceAttributes | java.lang.String
  type FaceDetailList = js.Array[typings.awsSdk.rekognitionMod.FaceDetail]
  type FaceDetections = js.Array[typings.awsSdk.rekognitionMod.FaceDetection]
  type FaceId = java.lang.String
  type FaceIdList = js.Array[typings.awsSdk.rekognitionMod.FaceId]
  type FaceList = js.Array[typings.awsSdk.rekognitionMod.Face]
  type FaceMatchList = js.Array[typings.awsSdk.rekognitionMod.FaceMatch]
  type FaceModelVersionList = js.Array[typings.awsSdk.rekognitionMod.String]
  type FaceRecordList = js.Array[typings.awsSdk.rekognitionMod.FaceRecord]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INDEX
    - typings.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type FaceSearchSortBy = typings.awsSdk.rekognitionMod._FaceSearchSortBy | java.lang.String
  type Float = scala.Double
  type FlowDefinitionArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Male
    - typings.awsSdk.awsSdkStrings.Female
    - java.lang.String
  */
  type GenderType = typings.awsSdk.rekognitionMod._GenderType | java.lang.String
  type HumanLoopActivationConditionsEvaluationResults = java.lang.String
  type HumanLoopActivationReason = java.lang.String
  type HumanLoopActivationReasons = js.Array[typings.awsSdk.rekognitionMod.HumanLoopActivationReason]
  type HumanLoopArn = java.lang.String
  type HumanLoopName = java.lang.String
  type ImageBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.rekognitionMod.Blob | java.lang.String
  type ImageId = java.lang.String
  type InferenceUnits = scala.Double
  type Instances = js.Array[typings.awsSdk.rekognitionMod.Instance]
  type JobId = java.lang.String
  type JobTag = java.lang.String
  type KinesisDataArn = java.lang.String
  type KinesisVideoArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NAME
    - typings.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type LabelDetectionSortBy = typings.awsSdk.rekognitionMod._LabelDetectionSortBy | java.lang.String
  type LabelDetections = js.Array[typings.awsSdk.rekognitionMod.LabelDetection]
  type Labels = js.Array[typings.awsSdk.rekognitionMod.Label]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.eyeLeft
    - typings.awsSdk.awsSdkStrings.eyeRight
    - typings.awsSdk.awsSdkStrings.nose
    - typings.awsSdk.awsSdkStrings.mouthLeft
    - typings.awsSdk.awsSdkStrings.mouthRight
    - typings.awsSdk.awsSdkStrings.leftEyeBrowLeft
    - typings.awsSdk.awsSdkStrings.leftEyeBrowRight
    - typings.awsSdk.awsSdkStrings.leftEyeBrowUp
    - typings.awsSdk.awsSdkStrings.rightEyeBrowLeft
    - typings.awsSdk.awsSdkStrings.rightEyeBrowRight
    - typings.awsSdk.awsSdkStrings.rightEyeBrowUp
    - typings.awsSdk.awsSdkStrings.leftEyeLeft
    - typings.awsSdk.awsSdkStrings.leftEyeRight
    - typings.awsSdk.awsSdkStrings.leftEyeUp
    - typings.awsSdk.awsSdkStrings.leftEyeDown
    - typings.awsSdk.awsSdkStrings.rightEyeLeft
    - typings.awsSdk.awsSdkStrings.rightEyeRight
    - typings.awsSdk.awsSdkStrings.rightEyeUp
    - typings.awsSdk.awsSdkStrings.rightEyeDown
    - typings.awsSdk.awsSdkStrings.noseLeft
    - typings.awsSdk.awsSdkStrings.noseRight
    - typings.awsSdk.awsSdkStrings.mouthUp
    - typings.awsSdk.awsSdkStrings.mouthDown
    - typings.awsSdk.awsSdkStrings.leftPupil
    - typings.awsSdk.awsSdkStrings.rightPupil
    - typings.awsSdk.awsSdkStrings.upperJawlineLeft
    - typings.awsSdk.awsSdkStrings.midJawlineLeft
    - typings.awsSdk.awsSdkStrings.chinBottom
    - typings.awsSdk.awsSdkStrings.midJawlineRight
    - typings.awsSdk.awsSdkStrings.upperJawlineRight
    - java.lang.String
  */
  type LandmarkType = typings.awsSdk.rekognitionMod._LandmarkType | java.lang.String
  type Landmarks = js.Array[typings.awsSdk.rekognitionMod.Landmark]
  type MaxFaces = scala.Double
  type MaxFacesToIndex = scala.Double
  type MaxResults = scala.Double
  type ModerationLabels = js.Array[typings.awsSdk.rekognitionMod.ModerationLabel]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ROTATE_0
    - typings.awsSdk.awsSdkStrings.ROTATE_90
    - typings.awsSdk.awsSdkStrings.ROTATE_180
    - typings.awsSdk.awsSdkStrings.ROTATE_270
    - java.lang.String
  */
  type OrientationCorrection = typings.awsSdk.rekognitionMod._OrientationCorrection | java.lang.String
  type PageSize = scala.Double
  type PaginationToken = java.lang.String
  type Parents = js.Array[typings.awsSdk.rekognitionMod.Parent]
  type Percent = scala.Double
  type PersonDetections = js.Array[typings.awsSdk.rekognitionMod.PersonDetection]
  type PersonIndex = scala.Double
  type PersonMatches = js.Array[typings.awsSdk.rekognitionMod.PersonMatch]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INDEX
    - typings.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type PersonTrackingSortBy = typings.awsSdk.rekognitionMod._PersonTrackingSortBy | java.lang.String
  type Polygon = js.Array[typings.awsSdk.rekognitionMod.Point]
  type ProjectArn = java.lang.String
  type ProjectDescriptions = js.Array[typings.awsSdk.rekognitionMod.ProjectDescription]
  type ProjectName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.CREATED
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ProjectStatus = typings.awsSdk.rekognitionMod._ProjectStatus | java.lang.String
  type ProjectVersionArn = java.lang.String
  type ProjectVersionDescriptions = js.Array[typings.awsSdk.rekognitionMod.ProjectVersionDescription]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TRAINING_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.TRAINING_COMPLETED
    - typings.awsSdk.awsSdkStrings.TRAINING_FAILED
    - typings.awsSdk.awsSdkStrings.STARTING
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.STOPPING
    - typings.awsSdk.awsSdkStrings.STOPPED
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ProjectVersionStatus = typings.awsSdk.rekognitionMod._ProjectVersionStatus | java.lang.String
  type ProjectVersionsPageSize = scala.Double
  type ProjectsPageSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.AUTO
    - typings.awsSdk.awsSdkStrings.LOW
    - typings.awsSdk.awsSdkStrings.MEDIUM
    - typings.awsSdk.awsSdkStrings.HIGH
    - java.lang.String
  */
  type QualityFilter = typings.awsSdk.rekognitionMod._QualityFilter | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EXCEEDS_MAX_FACES
    - typings.awsSdk.awsSdkStrings.EXTREME_POSE
    - typings.awsSdk.awsSdkStrings.LOW_BRIGHTNESS
    - typings.awsSdk.awsSdkStrings.LOW_SHARPNESS
    - typings.awsSdk.awsSdkStrings.LOW_CONFIDENCE
    - typings.awsSdk.awsSdkStrings.SMALL_BOUNDING_BOX
    - typings.awsSdk.awsSdkStrings.LOW_FACE_QUALITY
    - java.lang.String
  */
  type Reason = typings.awsSdk.rekognitionMod._Reason | java.lang.String
  type Reasons = js.Array[typings.awsSdk.rekognitionMod.Reason]
  type RegionsOfInterest = js.Array[typings.awsSdk.rekognitionMod.RegionOfInterest]
  type RekognitionUniqueId = java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3KeyPrefix = java.lang.String
  type S3ObjectName = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SNSTopicArn = java.lang.String
  type SegmentConfidence = scala.Double
  type SegmentDetections = js.Array[typings.awsSdk.rekognitionMod.SegmentDetection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TECHNICAL_CUE
    - typings.awsSdk.awsSdkStrings.SHOT
    - java.lang.String
  */
  type SegmentType = typings.awsSdk.rekognitionMod._SegmentType | java.lang.String
  type SegmentTypes = js.Array[typings.awsSdk.rekognitionMod.SegmentType]
  type SegmentTypesInfo = js.Array[typings.awsSdk.rekognitionMod.SegmentTypeInfo]
  type StatusMessage = java.lang.String
  type StreamProcessorArn = java.lang.String
  type StreamProcessorList = js.Array[typings.awsSdk.rekognitionMod.StreamProcessor]
  type StreamProcessorName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STOPPED
    - typings.awsSdk.awsSdkStrings.STARTING
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.STOPPING
    - java.lang.String
  */
  type StreamProcessorStatus = typings.awsSdk.rekognitionMod._StreamProcessorStatus | java.lang.String
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ColorBars
    - typings.awsSdk.awsSdkStrings.EndCredits
    - typings.awsSdk.awsSdkStrings.BlackFrames
    - java.lang.String
  */
  type TechnicalCueType = typings.awsSdk.rekognitionMod._TechnicalCueType | java.lang.String
  type TextDetectionList = js.Array[typings.awsSdk.rekognitionMod.TextDetection]
  type TextDetectionResults = js.Array[typings.awsSdk.rekognitionMod.TextDetectionResult]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LINE
    - typings.awsSdk.awsSdkStrings.WORD
    - java.lang.String
  */
  type TextTypes = typings.awsSdk.rekognitionMod._TextTypes | java.lang.String
  type Timecode = java.lang.String
  type Timestamp = scala.Double
  type UInteger = scala.Double
  type ULong = scala.Double
  type UnindexedFaces = js.Array[typings.awsSdk.rekognitionMod.UnindexedFace]
  type Url = java.lang.String
  type Urls = js.Array[typings.awsSdk.rekognitionMod.Url]
  type VersionName = java.lang.String
  type VersionNames = js.Array[typings.awsSdk.rekognitionMod.VersionName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type VideoJobStatus = typings.awsSdk.rekognitionMod._VideoJobStatus | java.lang.String
  type VideoMetadataList = js.Array[typings.awsSdk.rekognitionMod.VideoMetadata]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-06-27`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.rekognitionMod._apiVersion | java.lang.String
}
