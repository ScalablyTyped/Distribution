package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = java.lang.String

type ArnList = js.Array[Arn]

type BatchDeleteDevicePositionHistoryErrorList = js.Array[BatchDeleteDevicePositionHistoryError]

type BatchDeleteDevicePositionHistoryRequestDeviceIdsList = js.Array[Id]

type BatchDeleteGeofenceErrorList = js.Array[BatchDeleteGeofenceError]

type BatchDeleteGeofenceRequestGeofenceIdsList = js.Array[Id]

type BatchEvaluateGeofencesErrorList = js.Array[BatchEvaluateGeofencesError]

type BatchEvaluateGeofencesRequestDevicePositionUpdatesList = js.Array[DevicePositionUpdate]

type BatchGetDevicePositionErrorList = js.Array[BatchGetDevicePositionError]

type BatchGetDevicePositionRequestDeviceIdsList = js.Array[Id]

type BatchGetDevicePositionRequestTrackerNameString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AccessDeniedError
  - typings.awsSdk.awsSdkStrings.ConflictError
  - typings.awsSdk.awsSdkStrings.InternalServerError
  - typings.awsSdk.awsSdkStrings.ResourceNotFoundError
  - typings.awsSdk.awsSdkStrings.ThrottlingError
  - typings.awsSdk.awsSdkStrings.ValidationError
  - java.lang.String
*/
type BatchItemErrorCode = _BatchItemErrorCode | java.lang.String

type BatchPutGeofenceErrorList = js.Array[BatchPutGeofenceError]

type BatchPutGeofenceRequestEntriesList = js.Array[BatchPutGeofenceRequestEntry]

type BatchPutGeofenceSuccessList = js.Array[BatchPutGeofenceSuccess]

type BatchUpdateDevicePositionErrorList = js.Array[BatchUpdateDevicePositionError]

type BatchUpdateDevicePositionRequestUpdatesList = js.Array[DevicePositionUpdate]

type Boolean = scala.Boolean

type BoundingBox = js.Array[Double]

type CalculateRouteMatrixRequestDeparturePositionsList = js.Array[Position]

type CalculateRouteMatrixRequestDestinationPositionsList = js.Array[Position]

type CalculateRouteMatrixResponseSnappedDeparturePositionsList = js.Array[Position]

type CalculateRouteMatrixResponseSnappedDestinationPositionsList = js.Array[Position]

type CalculateRouteMatrixSummaryErrorCountInteger = scala.Double

type CalculateRouteMatrixSummaryRouteCountInteger = scala.Double

type CalculateRouteRequestWaypointPositionsList = js.Array[Position]

type CalculateRouteSummaryDistanceDouble = scala.Double

type CalculateRouteSummaryDurationSecondsDouble = scala.Double

type CountryCode = java.lang.String

type CountryCodeList = js.Array[CountryCode]

type DevicePositionList = js.Array[DevicePosition]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Meters
  - typings.awsSdk.awsSdkStrings.Feet_
  - java.lang.String
*/
type DimensionUnit = _DimensionUnit | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Kilometers
  - typings.awsSdk.awsSdkStrings.Miles
  - java.lang.String
*/
type DistanceUnit = _DistanceUnit | java.lang.String

type Double = scala.Double

type GeoArn = java.lang.String

type GetDevicePositionHistoryRequestMaxResultsInteger = scala.Double

type GetMapGlyphsRequestFontUnicodeRangeString = java.lang.String

type GetMapSpritesRequestFileNameString = java.lang.String

type GetMapTileRequestXString = java.lang.String

type GetMapTileRequestYString = java.lang.String

type GetMapTileRequestZString = java.lang.String

type Id = java.lang.String

type Integer = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SingleUse
  - typings.awsSdk.awsSdkStrings.Storage
  - java.lang.String
*/
type IntendedUse = _IntendedUse | java.lang.String

type KmsKeyId = java.lang.String

type LanguageTag = java.lang.String

type LegDistanceDouble = scala.Double

type LegDurationSecondsDouble = scala.Double

type LegList = js.Array[Leg]

type LineString = js.Array[Position]

type LinearRing = js.Array[Position]

type LinearRings = js.Array[LinearRing]

type ListDevicePositionsRequestMaxResultsInteger = scala.Double

type ListDevicePositionsResponseEntryList = js.Array[ListDevicePositionsResponseEntry]

type ListGeofenceCollectionsRequestMaxResultsInteger = scala.Double

type ListGeofenceCollectionsResponseEntryList = js.Array[ListGeofenceCollectionsResponseEntry]

type ListGeofenceResponseEntryList = js.Array[ListGeofenceResponseEntry]

type ListGeofencesRequestMaxResultsInteger = scala.Double

type ListMapsRequestMaxResultsInteger = scala.Double

type ListMapsResponseEntryList = js.Array[ListMapsResponseEntry]

type ListPlaceIndexesRequestMaxResultsInteger = scala.Double

type ListPlaceIndexesResponseEntryList = js.Array[ListPlaceIndexesResponseEntry]

type ListRouteCalculatorsRequestMaxResultsInteger = scala.Double

type ListRouteCalculatorsResponseEntryList = js.Array[ListRouteCalculatorsResponseEntry]

type ListTrackerConsumersRequestMaxResultsInteger = scala.Double

type ListTrackersRequestMaxResultsInteger = scala.Double

type ListTrackersResponseEntryList = js.Array[ListTrackersResponseEntry]

type MapStyle = java.lang.String

type PlaceId = java.lang.String

type PlaceIndexSearchResultLimit = scala.Double

type Position = js.Array[Double]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TimeBased
  - typings.awsSdk.awsSdkStrings.DistanceBased
  - typings.awsSdk.awsSdkStrings.AccuracyBased
  - java.lang.String
*/
type PositionFiltering = _PositionFiltering | java.lang.String

type PositionalAccuracyHorizontalDouble = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RequestBasedUsage
  - typings.awsSdk.awsSdkStrings.MobileAssetTracking
  - typings.awsSdk.awsSdkStrings.MobileAssetManagement
  - java.lang.String
*/
type PricingPlan = _PricingPlan | java.lang.String

type PropertyMap = StringDictionary[PropertyMapValueString]

type PropertyMapKeyString = java.lang.String

type PropertyMapValueString = java.lang.String

type ResourceDescription = java.lang.String

type ResourceName = java.lang.String

type RouteMatrix = js.Array[RouteMatrixRow]

type RouteMatrixEntryDistanceDouble = scala.Double

type RouteMatrixEntryDurationSecondsDouble = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RouteNotFound
  - typings.awsSdk.awsSdkStrings.RouteTooLong
  - typings.awsSdk.awsSdkStrings.PositionsNotFound
  - typings.awsSdk.awsSdkStrings.DestinationPositionNotFound
  - typings.awsSdk.awsSdkStrings.DeparturePositionNotFound
  - typings.awsSdk.awsSdkStrings.OtherValidationError
  - java.lang.String
*/
type RouteMatrixErrorCode = _RouteMatrixErrorCode | java.lang.String

type RouteMatrixRow = js.Array[RouteMatrixEntry]

type SearchForPositionResultDistanceDouble = scala.Double

type SearchForPositionResultList = js.Array[SearchForPositionResult]

type SearchForSuggestionsResultList = js.Array[SearchForSuggestionsResult]

type SearchForTextResultDistanceDouble = scala.Double

type SearchForTextResultList = js.Array[SearchForTextResult]

type SearchForTextResultRelevanceDouble = scala.Double

type SearchPlaceIndexForSuggestionsRequestMaxResultsInteger = scala.Double

type SearchPlaceIndexForSuggestionsRequestTextString = java.lang.String

type SearchPlaceIndexForTextRequestTextString = java.lang.String

type SensitiveString = java.lang.String

type StepDistanceDouble = scala.Double

type StepDurationSecondsDouble = scala.Double

type StepGeometryOffsetInteger = scala.Double

type StepList = js.Array[Step]

type String = java.lang.String

type TagKey = java.lang.String

type TagKeys = js.Array[String]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Timestamp = js.Date

type Token = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Car
  - typings.awsSdk.awsSdkStrings.Truck
  - typings.awsSdk.awsSdkStrings.Walking
  - java.lang.String
*/
type TravelMode = _TravelMode | java.lang.String

type TruckDimensionsHeightDouble = scala.Double

type TruckDimensionsLengthDouble = scala.Double

type TruckDimensionsWidthDouble = scala.Double

type TruckWeightTotalDouble = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Kilograms
  - typings.awsSdk.awsSdkStrings.Pounds
  - java.lang.String
*/
type VehicleWeightUnit = _VehicleWeightUnit | java.lang.String

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-11-19`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
