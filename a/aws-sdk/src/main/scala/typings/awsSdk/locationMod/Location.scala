package typings.awsSdk.locationMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends Service {
  
  /**
    * Creates an association between a geofence collection and a tracker resource. This allows the tracker resource to communicate location data to the linked geofence collection.  You can associate up to five geofence collections to each tracker resource.  Currently not supported — Cross-account configurations, such as creating associations between a tracker resource in one account and a geofence collection in another account. 
    */
  def associateTrackerConsumer(): Request[AssociateTrackerConsumerResponse, AWSError] = js.native
  def associateTrackerConsumer(callback: js.Function2[/* err */ AWSError, /* data */ AssociateTrackerConsumerResponse, Unit]): Request[AssociateTrackerConsumerResponse, AWSError] = js.native
  /**
    * Creates an association between a geofence collection and a tracker resource. This allows the tracker resource to communicate location data to the linked geofence collection.  You can associate up to five geofence collections to each tracker resource.  Currently not supported — Cross-account configurations, such as creating associations between a tracker resource in one account and a geofence collection in another account. 
    */
  def associateTrackerConsumer(params: AssociateTrackerConsumerRequest): Request[AssociateTrackerConsumerResponse, AWSError] = js.native
  def associateTrackerConsumer(
    params: AssociateTrackerConsumerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateTrackerConsumerResponse, Unit]
  ): Request[AssociateTrackerConsumerResponse, AWSError] = js.native
  
  /**
    * Deletes the position history of one or more devices from a tracker resource.
    */
  def batchDeleteDevicePositionHistory(): Request[BatchDeleteDevicePositionHistoryResponse, AWSError] = js.native
  def batchDeleteDevicePositionHistory(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteDevicePositionHistoryResponse, Unit]
  ): Request[BatchDeleteDevicePositionHistoryResponse, AWSError] = js.native
  /**
    * Deletes the position history of one or more devices from a tracker resource.
    */
  def batchDeleteDevicePositionHistory(params: BatchDeleteDevicePositionHistoryRequest): Request[BatchDeleteDevicePositionHistoryResponse, AWSError] = js.native
  def batchDeleteDevicePositionHistory(
    params: BatchDeleteDevicePositionHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteDevicePositionHistoryResponse, Unit]
  ): Request[BatchDeleteDevicePositionHistoryResponse, AWSError] = js.native
  
  /**
    * Deletes a batch of geofences from a geofence collection.  This operation deletes the resource permanently. 
    */
  def batchDeleteGeofence(): Request[BatchDeleteGeofenceResponse, AWSError] = js.native
  def batchDeleteGeofence(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteGeofenceResponse, Unit]): Request[BatchDeleteGeofenceResponse, AWSError] = js.native
  /**
    * Deletes a batch of geofences from a geofence collection.  This operation deletes the resource permanently. 
    */
  def batchDeleteGeofence(params: BatchDeleteGeofenceRequest): Request[BatchDeleteGeofenceResponse, AWSError] = js.native
  def batchDeleteGeofence(
    params: BatchDeleteGeofenceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteGeofenceResponse, Unit]
  ): Request[BatchDeleteGeofenceResponse, AWSError] = js.native
  
  /**
    * Evaluates device positions against the geofence geometries from a given geofence collection. This operation always returns an empty response because geofences are asynchronously evaluated. The evaluation determines if the device has entered or exited a geofenced area, and then publishes one of the following events to Amazon EventBridge:    ENTER if Amazon Location determines that the tracked device has entered a geofenced area.    EXIT if Amazon Location determines that the tracked device has exited a geofenced area.    The last geofence that a device was observed within is tracked for 30 days after the most recent device position update.   Geofence evaluation uses the given device position. It does not account for the optional Accuracy of a DevicePositionUpdate.   The DeviceID is used as a string to represent the device. You do not need to have a Tracker associated with the DeviceID. 
    */
  def batchEvaluateGeofences(): Request[BatchEvaluateGeofencesResponse, AWSError] = js.native
  def batchEvaluateGeofences(callback: js.Function2[/* err */ AWSError, /* data */ BatchEvaluateGeofencesResponse, Unit]): Request[BatchEvaluateGeofencesResponse, AWSError] = js.native
  /**
    * Evaluates device positions against the geofence geometries from a given geofence collection. This operation always returns an empty response because geofences are asynchronously evaluated. The evaluation determines if the device has entered or exited a geofenced area, and then publishes one of the following events to Amazon EventBridge:    ENTER if Amazon Location determines that the tracked device has entered a geofenced area.    EXIT if Amazon Location determines that the tracked device has exited a geofenced area.    The last geofence that a device was observed within is tracked for 30 days after the most recent device position update.   Geofence evaluation uses the given device position. It does not account for the optional Accuracy of a DevicePositionUpdate.   The DeviceID is used as a string to represent the device. You do not need to have a Tracker associated with the DeviceID. 
    */
  def batchEvaluateGeofences(params: BatchEvaluateGeofencesRequest): Request[BatchEvaluateGeofencesResponse, AWSError] = js.native
  def batchEvaluateGeofences(
    params: BatchEvaluateGeofencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchEvaluateGeofencesResponse, Unit]
  ): Request[BatchEvaluateGeofencesResponse, AWSError] = js.native
  
  /**
    * Lists the latest device positions for requested devices.
    */
  def batchGetDevicePosition(): Request[BatchGetDevicePositionResponse, AWSError] = js.native
  def batchGetDevicePosition(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDevicePositionResponse, Unit]): Request[BatchGetDevicePositionResponse, AWSError] = js.native
  /**
    * Lists the latest device positions for requested devices.
    */
  def batchGetDevicePosition(params: BatchGetDevicePositionRequest): Request[BatchGetDevicePositionResponse, AWSError] = js.native
  def batchGetDevicePosition(
    params: BatchGetDevicePositionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDevicePositionResponse, Unit]
  ): Request[BatchGetDevicePositionResponse, AWSError] = js.native
  
  /**
    * A batch request for storing geofence geometries into a given geofence collection, or updates the geometry of an existing geofence if a geofence ID is included in the request.
    */
  def batchPutGeofence(): Request[BatchPutGeofenceResponse, AWSError] = js.native
  def batchPutGeofence(callback: js.Function2[/* err */ AWSError, /* data */ BatchPutGeofenceResponse, Unit]): Request[BatchPutGeofenceResponse, AWSError] = js.native
  /**
    * A batch request for storing geofence geometries into a given geofence collection, or updates the geometry of an existing geofence if a geofence ID is included in the request.
    */
  def batchPutGeofence(params: BatchPutGeofenceRequest): Request[BatchPutGeofenceResponse, AWSError] = js.native
  def batchPutGeofence(
    params: BatchPutGeofenceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchPutGeofenceResponse, Unit]
  ): Request[BatchPutGeofenceResponse, AWSError] = js.native
  
  /**
    * Uploads position update data for one or more devices to a tracker resource. Amazon Location uses the data when it reports the last known device position and position history. Amazon Location retains location data for 30 days.  Position updates are handled based on the PositionFiltering property of the tracker. When PositionFiltering is set to TimeBased, updates are evaluated against linked geofence collections, and location data is stored at a maximum of one position per 30 second interval. If your update frequency is more often than every 30 seconds, only one update per 30 seconds is stored for each unique device ID. When PositionFiltering is set to DistanceBased filtering, location data is stored and evaluated against linked geofence collections only if the device has moved more than 30 m (98.4 ft). When PositionFiltering is set to AccuracyBased filtering, location data is stored and evaluated against linked geofence collections only if the device has moved more than the measured accuracy. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m, the second update is neither stored or evaluated if the device has moved less than 15 m. If PositionFiltering is set to AccuracyBased filtering, Amazon Location uses the default value { "Horizontal": 0} when accuracy is not provided on a DevicePositionUpdate. 
    */
  def batchUpdateDevicePosition(): Request[BatchUpdateDevicePositionResponse, AWSError] = js.native
  def batchUpdateDevicePosition(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateDevicePositionResponse, Unit]): Request[BatchUpdateDevicePositionResponse, AWSError] = js.native
  /**
    * Uploads position update data for one or more devices to a tracker resource. Amazon Location uses the data when it reports the last known device position and position history. Amazon Location retains location data for 30 days.  Position updates are handled based on the PositionFiltering property of the tracker. When PositionFiltering is set to TimeBased, updates are evaluated against linked geofence collections, and location data is stored at a maximum of one position per 30 second interval. If your update frequency is more often than every 30 seconds, only one update per 30 seconds is stored for each unique device ID. When PositionFiltering is set to DistanceBased filtering, location data is stored and evaluated against linked geofence collections only if the device has moved more than 30 m (98.4 ft). When PositionFiltering is set to AccuracyBased filtering, location data is stored and evaluated against linked geofence collections only if the device has moved more than the measured accuracy. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m, the second update is neither stored or evaluated if the device has moved less than 15 m. If PositionFiltering is set to AccuracyBased filtering, Amazon Location uses the default value { "Horizontal": 0} when accuracy is not provided on a DevicePositionUpdate. 
    */
  def batchUpdateDevicePosition(params: BatchUpdateDevicePositionRequest): Request[BatchUpdateDevicePositionResponse, AWSError] = js.native
  def batchUpdateDevicePosition(
    params: BatchUpdateDevicePositionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateDevicePositionResponse, Unit]
  ): Request[BatchUpdateDevicePositionResponse, AWSError] = js.native
  
  /**
    *  Calculates a route given the following required parameters: DeparturePosition and DestinationPosition. Requires that you first create a route calculator resource. By default, a request that doesn't specify a departure time uses the best time of day to travel with the best traffic conditions when calculating the route. Additional options include:    Specifying a departure time using either DepartureTime or DepartNow. This calculates a route based on predictive traffic data at the given time.   You can't specify both DepartureTime and DepartNow in a single request. Specifying both parameters returns a validation error.     Specifying a travel mode using TravelMode sets the transportation mode used to calculate the routes. This also lets you specify additional route preferences in CarModeOptions if traveling by Car, or TruckModeOptions if traveling by Truck.  If you specify walking for the travel mode and your data provider is Esri, the start and destination must be within 40km.   
    */
  def calculateRoute(): Request[CalculateRouteResponse, AWSError] = js.native
  def calculateRoute(callback: js.Function2[/* err */ AWSError, /* data */ CalculateRouteResponse, Unit]): Request[CalculateRouteResponse, AWSError] = js.native
  /**
    *  Calculates a route given the following required parameters: DeparturePosition and DestinationPosition. Requires that you first create a route calculator resource. By default, a request that doesn't specify a departure time uses the best time of day to travel with the best traffic conditions when calculating the route. Additional options include:    Specifying a departure time using either DepartureTime or DepartNow. This calculates a route based on predictive traffic data at the given time.   You can't specify both DepartureTime and DepartNow in a single request. Specifying both parameters returns a validation error.     Specifying a travel mode using TravelMode sets the transportation mode used to calculate the routes. This also lets you specify additional route preferences in CarModeOptions if traveling by Car, or TruckModeOptions if traveling by Truck.  If you specify walking for the travel mode and your data provider is Esri, the start and destination must be within 40km.   
    */
  def calculateRoute(params: CalculateRouteRequest): Request[CalculateRouteResponse, AWSError] = js.native
  def calculateRoute(
    params: CalculateRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CalculateRouteResponse, Unit]
  ): Request[CalculateRouteResponse, AWSError] = js.native
  
  /**
    *   Calculates a route matrix given the following required parameters: DeparturePositions and DestinationPositions. CalculateRouteMatrix calculates routes and returns the travel time and travel distance from each departure position to each destination position in the request. For example, given departure positions A and B, and destination positions X and Y, CalculateRouteMatrix will return time and distance for routes from A to X, A to Y, B to X, and B to Y (in that order). The number of results returned (and routes calculated) will be the number of DeparturePositions times the number of DestinationPositions.  Your account is charged for each route calculated, not the number of requests.  Requires that you first create a route calculator resource. By default, a request that doesn't specify a departure time uses the best time of day to travel with the best traffic conditions when calculating routes. Additional options include:     Specifying a departure time using either DepartureTime or DepartNow. This calculates routes based on predictive traffic data at the given time.   You can't specify both DepartureTime and DepartNow in a single request. Specifying both parameters returns a validation error.     Specifying a travel mode using TravelMode sets the transportation mode used to calculate the routes. This also lets you specify additional route preferences in CarModeOptions if traveling by Car, or TruckModeOptions if traveling by Truck.  
    */
  def calculateRouteMatrix(): Request[CalculateRouteMatrixResponse, AWSError] = js.native
  def calculateRouteMatrix(callback: js.Function2[/* err */ AWSError, /* data */ CalculateRouteMatrixResponse, Unit]): Request[CalculateRouteMatrixResponse, AWSError] = js.native
  /**
    *   Calculates a route matrix given the following required parameters: DeparturePositions and DestinationPositions. CalculateRouteMatrix calculates routes and returns the travel time and travel distance from each departure position to each destination position in the request. For example, given departure positions A and B, and destination positions X and Y, CalculateRouteMatrix will return time and distance for routes from A to X, A to Y, B to X, and B to Y (in that order). The number of results returned (and routes calculated) will be the number of DeparturePositions times the number of DestinationPositions.  Your account is charged for each route calculated, not the number of requests.  Requires that you first create a route calculator resource. By default, a request that doesn't specify a departure time uses the best time of day to travel with the best traffic conditions when calculating routes. Additional options include:     Specifying a departure time using either DepartureTime or DepartNow. This calculates routes based on predictive traffic data at the given time.   You can't specify both DepartureTime and DepartNow in a single request. Specifying both parameters returns a validation error.     Specifying a travel mode using TravelMode sets the transportation mode used to calculate the routes. This also lets you specify additional route preferences in CarModeOptions if traveling by Car, or TruckModeOptions if traveling by Truck.  
    */
  def calculateRouteMatrix(params: CalculateRouteMatrixRequest): Request[CalculateRouteMatrixResponse, AWSError] = js.native
  def calculateRouteMatrix(
    params: CalculateRouteMatrixRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CalculateRouteMatrixResponse, Unit]
  ): Request[CalculateRouteMatrixResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Location: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a geofence collection, which manages and stores geofences.
    */
  def createGeofenceCollection(): Request[CreateGeofenceCollectionResponse, AWSError] = js.native
  def createGeofenceCollection(callback: js.Function2[/* err */ AWSError, /* data */ CreateGeofenceCollectionResponse, Unit]): Request[CreateGeofenceCollectionResponse, AWSError] = js.native
  /**
    * Creates a geofence collection, which manages and stores geofences.
    */
  def createGeofenceCollection(params: CreateGeofenceCollectionRequest): Request[CreateGeofenceCollectionResponse, AWSError] = js.native
  def createGeofenceCollection(
    params: CreateGeofenceCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGeofenceCollectionResponse, Unit]
  ): Request[CreateGeofenceCollectionResponse, AWSError] = js.native
  
  /**
    * Creates a map resource in your AWS account, which provides map tiles of different styles sourced from global location data providers.  If your application is tracking or routing assets you use in your business, such as delivery vehicles or employees, you may only use HERE as your geolocation provider. See section 82 of the AWS service terms for more details. 
    */
  def createMap(): Request[CreateMapResponse, AWSError] = js.native
  def createMap(callback: js.Function2[/* err */ AWSError, /* data */ CreateMapResponse, Unit]): Request[CreateMapResponse, AWSError] = js.native
  /**
    * Creates a map resource in your AWS account, which provides map tiles of different styles sourced from global location data providers.  If your application is tracking or routing assets you use in your business, such as delivery vehicles or employees, you may only use HERE as your geolocation provider. See section 82 of the AWS service terms for more details. 
    */
  def createMap(params: CreateMapRequest): Request[CreateMapResponse, AWSError] = js.native
  def createMap(
    params: CreateMapRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMapResponse, Unit]
  ): Request[CreateMapResponse, AWSError] = js.native
  
  /**
    * Creates a place index resource in your AWS account. Use a place index resource to geocode addresses and other text queries by using the SearchPlaceIndexForText operation, and reverse geocode coordinates by using the SearchPlaceIndexForPosition operation, and enable autosuggestions by using the SearchPlaceIndexForSuggestions operation.  If your application is tracking or routing assets you use in your business, such as delivery vehicles or employees, you may only use HERE as your geolocation provider. See section 82 of the AWS service terms for more details. 
    */
  def createPlaceIndex(): Request[CreatePlaceIndexResponse, AWSError] = js.native
  def createPlaceIndex(callback: js.Function2[/* err */ AWSError, /* data */ CreatePlaceIndexResponse, Unit]): Request[CreatePlaceIndexResponse, AWSError] = js.native
  /**
    * Creates a place index resource in your AWS account. Use a place index resource to geocode addresses and other text queries by using the SearchPlaceIndexForText operation, and reverse geocode coordinates by using the SearchPlaceIndexForPosition operation, and enable autosuggestions by using the SearchPlaceIndexForSuggestions operation.  If your application is tracking or routing assets you use in your business, such as delivery vehicles or employees, you may only use HERE as your geolocation provider. See section 82 of the AWS service terms for more details. 
    */
  def createPlaceIndex(params: CreatePlaceIndexRequest): Request[CreatePlaceIndexResponse, AWSError] = js.native
  def createPlaceIndex(
    params: CreatePlaceIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePlaceIndexResponse, Unit]
  ): Request[CreatePlaceIndexResponse, AWSError] = js.native
  
  /**
    * Creates a route calculator resource in your AWS account. You can send requests to a route calculator resource to estimate travel time, distance, and get directions. A route calculator sources traffic and road network data from your chosen data provider.  If your application is tracking or routing assets you use in your business, such as delivery vehicles or employees, you may only use HERE as your geolocation provider. See section 82 of the AWS service terms for more details. 
    */
  def createRouteCalculator(): Request[CreateRouteCalculatorResponse, AWSError] = js.native
  def createRouteCalculator(callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteCalculatorResponse, Unit]): Request[CreateRouteCalculatorResponse, AWSError] = js.native
  /**
    * Creates a route calculator resource in your AWS account. You can send requests to a route calculator resource to estimate travel time, distance, and get directions. A route calculator sources traffic and road network data from your chosen data provider.  If your application is tracking or routing assets you use in your business, such as delivery vehicles or employees, you may only use HERE as your geolocation provider. See section 82 of the AWS service terms for more details. 
    */
  def createRouteCalculator(params: CreateRouteCalculatorRequest): Request[CreateRouteCalculatorResponse, AWSError] = js.native
  def createRouteCalculator(
    params: CreateRouteCalculatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteCalculatorResponse, Unit]
  ): Request[CreateRouteCalculatorResponse, AWSError] = js.native
  
  /**
    * Creates a tracker resource in your AWS account, which lets you retrieve current and historical location of devices.
    */
  def createTracker(): Request[CreateTrackerResponse, AWSError] = js.native
  def createTracker(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrackerResponse, Unit]): Request[CreateTrackerResponse, AWSError] = js.native
  /**
    * Creates a tracker resource in your AWS account, which lets you retrieve current and historical location of devices.
    */
  def createTracker(params: CreateTrackerRequest): Request[CreateTrackerResponse, AWSError] = js.native
  def createTracker(
    params: CreateTrackerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrackerResponse, Unit]
  ): Request[CreateTrackerResponse, AWSError] = js.native
  
  /**
    * Deletes a geofence collection from your AWS account.  This operation deletes the resource permanently. If the geofence collection is the target of a tracker resource, the devices will no longer be monitored. 
    */
  def deleteGeofenceCollection(): Request[DeleteGeofenceCollectionResponse, AWSError] = js.native
  def deleteGeofenceCollection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGeofenceCollectionResponse, Unit]): Request[DeleteGeofenceCollectionResponse, AWSError] = js.native
  /**
    * Deletes a geofence collection from your AWS account.  This operation deletes the resource permanently. If the geofence collection is the target of a tracker resource, the devices will no longer be monitored. 
    */
  def deleteGeofenceCollection(params: DeleteGeofenceCollectionRequest): Request[DeleteGeofenceCollectionResponse, AWSError] = js.native
  def deleteGeofenceCollection(
    params: DeleteGeofenceCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGeofenceCollectionResponse, Unit]
  ): Request[DeleteGeofenceCollectionResponse, AWSError] = js.native
  
  /**
    * Deletes a map resource from your AWS account.  This operation deletes the resource permanently. If the map is being used in an application, the map may not render. 
    */
  def deleteMap(): Request[DeleteMapResponse, AWSError] = js.native
  def deleteMap(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMapResponse, Unit]): Request[DeleteMapResponse, AWSError] = js.native
  /**
    * Deletes a map resource from your AWS account.  This operation deletes the resource permanently. If the map is being used in an application, the map may not render. 
    */
  def deleteMap(params: DeleteMapRequest): Request[DeleteMapResponse, AWSError] = js.native
  def deleteMap(
    params: DeleteMapRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMapResponse, Unit]
  ): Request[DeleteMapResponse, AWSError] = js.native
  
  /**
    * Deletes a place index resource from your AWS account.  This operation deletes the resource permanently. 
    */
  def deletePlaceIndex(): Request[DeletePlaceIndexResponse, AWSError] = js.native
  def deletePlaceIndex(callback: js.Function2[/* err */ AWSError, /* data */ DeletePlaceIndexResponse, Unit]): Request[DeletePlaceIndexResponse, AWSError] = js.native
  /**
    * Deletes a place index resource from your AWS account.  This operation deletes the resource permanently. 
    */
  def deletePlaceIndex(params: DeletePlaceIndexRequest): Request[DeletePlaceIndexResponse, AWSError] = js.native
  def deletePlaceIndex(
    params: DeletePlaceIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePlaceIndexResponse, Unit]
  ): Request[DeletePlaceIndexResponse, AWSError] = js.native
  
  /**
    * Deletes a route calculator resource from your AWS account.  This operation deletes the resource permanently. 
    */
  def deleteRouteCalculator(): Request[DeleteRouteCalculatorResponse, AWSError] = js.native
  def deleteRouteCalculator(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRouteCalculatorResponse, Unit]): Request[DeleteRouteCalculatorResponse, AWSError] = js.native
  /**
    * Deletes a route calculator resource from your AWS account.  This operation deletes the resource permanently. 
    */
  def deleteRouteCalculator(params: DeleteRouteCalculatorRequest): Request[DeleteRouteCalculatorResponse, AWSError] = js.native
  def deleteRouteCalculator(
    params: DeleteRouteCalculatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRouteCalculatorResponse, Unit]
  ): Request[DeleteRouteCalculatorResponse, AWSError] = js.native
  
  /**
    * Deletes a tracker resource from your AWS account.  This operation deletes the resource permanently. If the tracker resource is in use, you may encounter an error. Make sure that the target resource isn't a dependency for your applications. 
    */
  def deleteTracker(): Request[DeleteTrackerResponse, AWSError] = js.native
  def deleteTracker(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrackerResponse, Unit]): Request[DeleteTrackerResponse, AWSError] = js.native
  /**
    * Deletes a tracker resource from your AWS account.  This operation deletes the resource permanently. If the tracker resource is in use, you may encounter an error. Make sure that the target resource isn't a dependency for your applications. 
    */
  def deleteTracker(params: DeleteTrackerRequest): Request[DeleteTrackerResponse, AWSError] = js.native
  def deleteTracker(
    params: DeleteTrackerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrackerResponse, Unit]
  ): Request[DeleteTrackerResponse, AWSError] = js.native
  
  /**
    * Retrieves the geofence collection details.
    */
  def describeGeofenceCollection(): Request[DescribeGeofenceCollectionResponse, AWSError] = js.native
  def describeGeofenceCollection(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGeofenceCollectionResponse, Unit]): Request[DescribeGeofenceCollectionResponse, AWSError] = js.native
  /**
    * Retrieves the geofence collection details.
    */
  def describeGeofenceCollection(params: DescribeGeofenceCollectionRequest): Request[DescribeGeofenceCollectionResponse, AWSError] = js.native
  def describeGeofenceCollection(
    params: DescribeGeofenceCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGeofenceCollectionResponse, Unit]
  ): Request[DescribeGeofenceCollectionResponse, AWSError] = js.native
  
  /**
    * Retrieves the map resource details.
    */
  def describeMap(): Request[DescribeMapResponse, AWSError] = js.native
  def describeMap(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMapResponse, Unit]): Request[DescribeMapResponse, AWSError] = js.native
  /**
    * Retrieves the map resource details.
    */
  def describeMap(params: DescribeMapRequest): Request[DescribeMapResponse, AWSError] = js.native
  def describeMap(
    params: DescribeMapRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMapResponse, Unit]
  ): Request[DescribeMapResponse, AWSError] = js.native
  
  /**
    * Retrieves the place index resource details.
    */
  def describePlaceIndex(): Request[DescribePlaceIndexResponse, AWSError] = js.native
  def describePlaceIndex(callback: js.Function2[/* err */ AWSError, /* data */ DescribePlaceIndexResponse, Unit]): Request[DescribePlaceIndexResponse, AWSError] = js.native
  /**
    * Retrieves the place index resource details.
    */
  def describePlaceIndex(params: DescribePlaceIndexRequest): Request[DescribePlaceIndexResponse, AWSError] = js.native
  def describePlaceIndex(
    params: DescribePlaceIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePlaceIndexResponse, Unit]
  ): Request[DescribePlaceIndexResponse, AWSError] = js.native
  
  /**
    * Retrieves the route calculator resource details.
    */
  def describeRouteCalculator(): Request[DescribeRouteCalculatorResponse, AWSError] = js.native
  def describeRouteCalculator(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRouteCalculatorResponse, Unit]): Request[DescribeRouteCalculatorResponse, AWSError] = js.native
  /**
    * Retrieves the route calculator resource details.
    */
  def describeRouteCalculator(params: DescribeRouteCalculatorRequest): Request[DescribeRouteCalculatorResponse, AWSError] = js.native
  def describeRouteCalculator(
    params: DescribeRouteCalculatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRouteCalculatorResponse, Unit]
  ): Request[DescribeRouteCalculatorResponse, AWSError] = js.native
  
  /**
    * Retrieves the tracker resource details.
    */
  def describeTracker(): Request[DescribeTrackerResponse, AWSError] = js.native
  def describeTracker(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrackerResponse, Unit]): Request[DescribeTrackerResponse, AWSError] = js.native
  /**
    * Retrieves the tracker resource details.
    */
  def describeTracker(params: DescribeTrackerRequest): Request[DescribeTrackerResponse, AWSError] = js.native
  def describeTracker(
    params: DescribeTrackerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrackerResponse, Unit]
  ): Request[DescribeTrackerResponse, AWSError] = js.native
  
  /**
    * Removes the association between a tracker resource and a geofence collection.  Once you unlink a tracker resource from a geofence collection, the tracker positions will no longer be automatically evaluated against geofences. 
    */
  def disassociateTrackerConsumer(): Request[DisassociateTrackerConsumerResponse, AWSError] = js.native
  def disassociateTrackerConsumer(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTrackerConsumerResponse, Unit]): Request[DisassociateTrackerConsumerResponse, AWSError] = js.native
  /**
    * Removes the association between a tracker resource and a geofence collection.  Once you unlink a tracker resource from a geofence collection, the tracker positions will no longer be automatically evaluated against geofences. 
    */
  def disassociateTrackerConsumer(params: DisassociateTrackerConsumerRequest): Request[DisassociateTrackerConsumerResponse, AWSError] = js.native
  def disassociateTrackerConsumer(
    params: DisassociateTrackerConsumerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTrackerConsumerResponse, Unit]
  ): Request[DisassociateTrackerConsumerResponse, AWSError] = js.native
  
  /**
    * Retrieves a device's most recent position according to its sample time.  Device positions are deleted after 30 days. 
    */
  def getDevicePosition(): Request[GetDevicePositionResponse, AWSError] = js.native
  def getDevicePosition(callback: js.Function2[/* err */ AWSError, /* data */ GetDevicePositionResponse, Unit]): Request[GetDevicePositionResponse, AWSError] = js.native
  /**
    * Retrieves a device's most recent position according to its sample time.  Device positions are deleted after 30 days. 
    */
  def getDevicePosition(params: GetDevicePositionRequest): Request[GetDevicePositionResponse, AWSError] = js.native
  def getDevicePosition(
    params: GetDevicePositionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDevicePositionResponse, Unit]
  ): Request[GetDevicePositionResponse, AWSError] = js.native
  
  /**
    * Retrieves the device position history from a tracker resource within a specified range of time.  Device positions are deleted after 30 days. 
    */
  def getDevicePositionHistory(): Request[GetDevicePositionHistoryResponse, AWSError] = js.native
  def getDevicePositionHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetDevicePositionHistoryResponse, Unit]): Request[GetDevicePositionHistoryResponse, AWSError] = js.native
  /**
    * Retrieves the device position history from a tracker resource within a specified range of time.  Device positions are deleted after 30 days. 
    */
  def getDevicePositionHistory(params: GetDevicePositionHistoryRequest): Request[GetDevicePositionHistoryResponse, AWSError] = js.native
  def getDevicePositionHistory(
    params: GetDevicePositionHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDevicePositionHistoryResponse, Unit]
  ): Request[GetDevicePositionHistoryResponse, AWSError] = js.native
  
  /**
    * Retrieves the geofence details from a geofence collection.
    */
  def getGeofence(): Request[GetGeofenceResponse, AWSError] = js.native
  def getGeofence(callback: js.Function2[/* err */ AWSError, /* data */ GetGeofenceResponse, Unit]): Request[GetGeofenceResponse, AWSError] = js.native
  /**
    * Retrieves the geofence details from a geofence collection.
    */
  def getGeofence(params: GetGeofenceRequest): Request[GetGeofenceResponse, AWSError] = js.native
  def getGeofence(
    params: GetGeofenceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGeofenceResponse, Unit]
  ): Request[GetGeofenceResponse, AWSError] = js.native
  
  /**
    * Retrieves glyphs used to display labels on a map.
    */
  def getMapGlyphs(): Request[GetMapGlyphsResponse, AWSError] = js.native
  def getMapGlyphs(callback: js.Function2[/* err */ AWSError, /* data */ GetMapGlyphsResponse, Unit]): Request[GetMapGlyphsResponse, AWSError] = js.native
  /**
    * Retrieves glyphs used to display labels on a map.
    */
  def getMapGlyphs(params: GetMapGlyphsRequest): Request[GetMapGlyphsResponse, AWSError] = js.native
  def getMapGlyphs(
    params: GetMapGlyphsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMapGlyphsResponse, Unit]
  ): Request[GetMapGlyphsResponse, AWSError] = js.native
  
  /**
    * Retrieves the sprite sheet corresponding to a map resource. The sprite sheet is a PNG image paired with a JSON document describing the offsets of individual icons that will be displayed on a rendered map.
    */
  def getMapSprites(): Request[GetMapSpritesResponse, AWSError] = js.native
  def getMapSprites(callback: js.Function2[/* err */ AWSError, /* data */ GetMapSpritesResponse, Unit]): Request[GetMapSpritesResponse, AWSError] = js.native
  /**
    * Retrieves the sprite sheet corresponding to a map resource. The sprite sheet is a PNG image paired with a JSON document describing the offsets of individual icons that will be displayed on a rendered map.
    */
  def getMapSprites(params: GetMapSpritesRequest): Request[GetMapSpritesResponse, AWSError] = js.native
  def getMapSprites(
    params: GetMapSpritesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMapSpritesResponse, Unit]
  ): Request[GetMapSpritesResponse, AWSError] = js.native
  
  /**
    * Retrieves the map style descriptor from a map resource.  The style descriptor contains speciﬁcations on how features render on a map. For example, what data to display, what order to display the data in, and the style for the data. Style descriptors follow the Mapbox Style Specification.
    */
  def getMapStyleDescriptor(): Request[GetMapStyleDescriptorResponse, AWSError] = js.native
  def getMapStyleDescriptor(callback: js.Function2[/* err */ AWSError, /* data */ GetMapStyleDescriptorResponse, Unit]): Request[GetMapStyleDescriptorResponse, AWSError] = js.native
  /**
    * Retrieves the map style descriptor from a map resource.  The style descriptor contains speciﬁcations on how features render on a map. For example, what data to display, what order to display the data in, and the style for the data. Style descriptors follow the Mapbox Style Specification.
    */
  def getMapStyleDescriptor(params: GetMapStyleDescriptorRequest): Request[GetMapStyleDescriptorResponse, AWSError] = js.native
  def getMapStyleDescriptor(
    params: GetMapStyleDescriptorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMapStyleDescriptorResponse, Unit]
  ): Request[GetMapStyleDescriptorResponse, AWSError] = js.native
  
  /**
    * Retrieves a vector data tile from the map resource. Map tiles are used by clients to render a map. they're addressed using a grid arrangement with an X coordinate, Y coordinate, and Z (zoom) level.  The origin (0, 0) is the top left of the map. Increasing the zoom level by 1 doubles both the X and Y dimensions, so a tile containing data for the entire world at (0/0/0) will be split into 4 tiles at zoom 1 (1/0/0, 1/0/1, 1/1/0, 1/1/1).
    */
  def getMapTile(): Request[GetMapTileResponse, AWSError] = js.native
  def getMapTile(callback: js.Function2[/* err */ AWSError, /* data */ GetMapTileResponse, Unit]): Request[GetMapTileResponse, AWSError] = js.native
  /**
    * Retrieves a vector data tile from the map resource. Map tiles are used by clients to render a map. they're addressed using a grid arrangement with an X coordinate, Y coordinate, and Z (zoom) level.  The origin (0, 0) is the top left of the map. Increasing the zoom level by 1 doubles both the X and Y dimensions, so a tile containing data for the entire world at (0/0/0) will be split into 4 tiles at zoom 1 (1/0/0, 1/0/1, 1/1/0, 1/1/1).
    */
  def getMapTile(params: GetMapTileRequest): Request[GetMapTileResponse, AWSError] = js.native
  def getMapTile(
    params: GetMapTileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMapTileResponse, Unit]
  ): Request[GetMapTileResponse, AWSError] = js.native
  
  /**
    * Finds a place by its unique ID. A PlaceId is returned by other search operations.  A PlaceId is valid only if all of the following are the same in the original search request and the call to GetPlace.   Customer AWS account   AWS Region   Data provider specified in the place index resource   
    */
  def getPlace(): Request[GetPlaceResponse, AWSError] = js.native
  def getPlace(callback: js.Function2[/* err */ AWSError, /* data */ GetPlaceResponse, Unit]): Request[GetPlaceResponse, AWSError] = js.native
  /**
    * Finds a place by its unique ID. A PlaceId is returned by other search operations.  A PlaceId is valid only if all of the following are the same in the original search request and the call to GetPlace.   Customer AWS account   AWS Region   Data provider specified in the place index resource   
    */
  def getPlace(params: GetPlaceRequest): Request[GetPlaceResponse, AWSError] = js.native
  def getPlace(
    params: GetPlaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPlaceResponse, Unit]
  ): Request[GetPlaceResponse, AWSError] = js.native
  
  /**
    * A batch request to retrieve all device positions.
    */
  def listDevicePositions(): Request[ListDevicePositionsResponse, AWSError] = js.native
  def listDevicePositions(callback: js.Function2[/* err */ AWSError, /* data */ ListDevicePositionsResponse, Unit]): Request[ListDevicePositionsResponse, AWSError] = js.native
  /**
    * A batch request to retrieve all device positions.
    */
  def listDevicePositions(params: ListDevicePositionsRequest): Request[ListDevicePositionsResponse, AWSError] = js.native
  def listDevicePositions(
    params: ListDevicePositionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDevicePositionsResponse, Unit]
  ): Request[ListDevicePositionsResponse, AWSError] = js.native
  
  /**
    * Lists geofence collections in your AWS account.
    */
  def listGeofenceCollections(): Request[ListGeofenceCollectionsResponse, AWSError] = js.native
  def listGeofenceCollections(callback: js.Function2[/* err */ AWSError, /* data */ ListGeofenceCollectionsResponse, Unit]): Request[ListGeofenceCollectionsResponse, AWSError] = js.native
  /**
    * Lists geofence collections in your AWS account.
    */
  def listGeofenceCollections(params: ListGeofenceCollectionsRequest): Request[ListGeofenceCollectionsResponse, AWSError] = js.native
  def listGeofenceCollections(
    params: ListGeofenceCollectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGeofenceCollectionsResponse, Unit]
  ): Request[ListGeofenceCollectionsResponse, AWSError] = js.native
  
  /**
    * Lists geofences stored in a given geofence collection.
    */
  def listGeofences(): Request[ListGeofencesResponse, AWSError] = js.native
  def listGeofences(callback: js.Function2[/* err */ AWSError, /* data */ ListGeofencesResponse, Unit]): Request[ListGeofencesResponse, AWSError] = js.native
  /**
    * Lists geofences stored in a given geofence collection.
    */
  def listGeofences(params: ListGeofencesRequest): Request[ListGeofencesResponse, AWSError] = js.native
  def listGeofences(
    params: ListGeofencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGeofencesResponse, Unit]
  ): Request[ListGeofencesResponse, AWSError] = js.native
  
  /**
    * Lists map resources in your AWS account.
    */
  def listMaps(): Request[ListMapsResponse, AWSError] = js.native
  def listMaps(callback: js.Function2[/* err */ AWSError, /* data */ ListMapsResponse, Unit]): Request[ListMapsResponse, AWSError] = js.native
  /**
    * Lists map resources in your AWS account.
    */
  def listMaps(params: ListMapsRequest): Request[ListMapsResponse, AWSError] = js.native
  def listMaps(
    params: ListMapsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMapsResponse, Unit]
  ): Request[ListMapsResponse, AWSError] = js.native
  
  /**
    * Lists place index resources in your AWS account.
    */
  def listPlaceIndexes(): Request[ListPlaceIndexesResponse, AWSError] = js.native
  def listPlaceIndexes(callback: js.Function2[/* err */ AWSError, /* data */ ListPlaceIndexesResponse, Unit]): Request[ListPlaceIndexesResponse, AWSError] = js.native
  /**
    * Lists place index resources in your AWS account.
    */
  def listPlaceIndexes(params: ListPlaceIndexesRequest): Request[ListPlaceIndexesResponse, AWSError] = js.native
  def listPlaceIndexes(
    params: ListPlaceIndexesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPlaceIndexesResponse, Unit]
  ): Request[ListPlaceIndexesResponse, AWSError] = js.native
  
  /**
    * Lists route calculator resources in your AWS account.
    */
  def listRouteCalculators(): Request[ListRouteCalculatorsResponse, AWSError] = js.native
  def listRouteCalculators(callback: js.Function2[/* err */ AWSError, /* data */ ListRouteCalculatorsResponse, Unit]): Request[ListRouteCalculatorsResponse, AWSError] = js.native
  /**
    * Lists route calculator resources in your AWS account.
    */
  def listRouteCalculators(params: ListRouteCalculatorsRequest): Request[ListRouteCalculatorsResponse, AWSError] = js.native
  def listRouteCalculators(
    params: ListRouteCalculatorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRouteCalculatorsResponse, Unit]
  ): Request[ListRouteCalculatorsResponse, AWSError] = js.native
  
  /**
    * Returns a list of tags that are applied to the specified Amazon Location resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of tags that are applied to the specified Amazon Location resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists geofence collections currently associated to the given tracker resource.
    */
  def listTrackerConsumers(): Request[ListTrackerConsumersResponse, AWSError] = js.native
  def listTrackerConsumers(callback: js.Function2[/* err */ AWSError, /* data */ ListTrackerConsumersResponse, Unit]): Request[ListTrackerConsumersResponse, AWSError] = js.native
  /**
    * Lists geofence collections currently associated to the given tracker resource.
    */
  def listTrackerConsumers(params: ListTrackerConsumersRequest): Request[ListTrackerConsumersResponse, AWSError] = js.native
  def listTrackerConsumers(
    params: ListTrackerConsumersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrackerConsumersResponse, Unit]
  ): Request[ListTrackerConsumersResponse, AWSError] = js.native
  
  /**
    * Lists tracker resources in your AWS account.
    */
  def listTrackers(): Request[ListTrackersResponse, AWSError] = js.native
  def listTrackers(callback: js.Function2[/* err */ AWSError, /* data */ ListTrackersResponse, Unit]): Request[ListTrackersResponse, AWSError] = js.native
  /**
    * Lists tracker resources in your AWS account.
    */
  def listTrackers(params: ListTrackersRequest): Request[ListTrackersResponse, AWSError] = js.native
  def listTrackers(
    params: ListTrackersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrackersResponse, Unit]
  ): Request[ListTrackersResponse, AWSError] = js.native
  
  /**
    * Stores a geofence geometry in a given geofence collection, or updates the geometry of an existing geofence if a geofence ID is included in the request. 
    */
  def putGeofence(): Request[PutGeofenceResponse, AWSError] = js.native
  def putGeofence(callback: js.Function2[/* err */ AWSError, /* data */ PutGeofenceResponse, Unit]): Request[PutGeofenceResponse, AWSError] = js.native
  /**
    * Stores a geofence geometry in a given geofence collection, or updates the geometry of an existing geofence if a geofence ID is included in the request. 
    */
  def putGeofence(params: PutGeofenceRequest): Request[PutGeofenceResponse, AWSError] = js.native
  def putGeofence(
    params: PutGeofenceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutGeofenceResponse, Unit]
  ): Request[PutGeofenceResponse, AWSError] = js.native
  
  /**
    * Reverse geocodes a given coordinate and returns a legible address. Allows you to search for Places or points of interest near a given position.
    */
  def searchPlaceIndexForPosition(): Request[SearchPlaceIndexForPositionResponse, AWSError] = js.native
  def searchPlaceIndexForPosition(callback: js.Function2[/* err */ AWSError, /* data */ SearchPlaceIndexForPositionResponse, Unit]): Request[SearchPlaceIndexForPositionResponse, AWSError] = js.native
  /**
    * Reverse geocodes a given coordinate and returns a legible address. Allows you to search for Places or points of interest near a given position.
    */
  def searchPlaceIndexForPosition(params: SearchPlaceIndexForPositionRequest): Request[SearchPlaceIndexForPositionResponse, AWSError] = js.native
  def searchPlaceIndexForPosition(
    params: SearchPlaceIndexForPositionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchPlaceIndexForPositionResponse, Unit]
  ): Request[SearchPlaceIndexForPositionResponse, AWSError] = js.native
  
  /**
    * Generates suggestions for addresses and points of interest based on partial or misspelled free-form text. This operation is also known as autocomplete, autosuggest, or fuzzy matching. Optional parameters let you narrow your search results by bounding box or country, or bias your search toward a specific position on the globe.  You can search for suggested place names near a specified position by using BiasPosition, or filter results within a bounding box by using FilterBBox. These parameters are mutually exclusive; using both BiasPosition and FilterBBox in the same command returns an error. 
    */
  def searchPlaceIndexForSuggestions(): Request[SearchPlaceIndexForSuggestionsResponse, AWSError] = js.native
  def searchPlaceIndexForSuggestions(
    callback: js.Function2[/* err */ AWSError, /* data */ SearchPlaceIndexForSuggestionsResponse, Unit]
  ): Request[SearchPlaceIndexForSuggestionsResponse, AWSError] = js.native
  /**
    * Generates suggestions for addresses and points of interest based on partial or misspelled free-form text. This operation is also known as autocomplete, autosuggest, or fuzzy matching. Optional parameters let you narrow your search results by bounding box or country, or bias your search toward a specific position on the globe.  You can search for suggested place names near a specified position by using BiasPosition, or filter results within a bounding box by using FilterBBox. These parameters are mutually exclusive; using both BiasPosition and FilterBBox in the same command returns an error. 
    */
  def searchPlaceIndexForSuggestions(params: SearchPlaceIndexForSuggestionsRequest): Request[SearchPlaceIndexForSuggestionsResponse, AWSError] = js.native
  def searchPlaceIndexForSuggestions(
    params: SearchPlaceIndexForSuggestionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchPlaceIndexForSuggestionsResponse, Unit]
  ): Request[SearchPlaceIndexForSuggestionsResponse, AWSError] = js.native
  
  /**
    * Geocodes free-form text, such as an address, name, city, or region to allow you to search for Places or points of interest.  Optional parameters let you narrow your search results by bounding box or country, or bias your search toward a specific position on the globe.  You can search for places near a given position using BiasPosition, or filter results within a bounding box using FilterBBox. Providing both parameters simultaneously returns an error.  Search results are returned in order of highest to lowest relevance.
    */
  def searchPlaceIndexForText(): Request[SearchPlaceIndexForTextResponse, AWSError] = js.native
  def searchPlaceIndexForText(callback: js.Function2[/* err */ AWSError, /* data */ SearchPlaceIndexForTextResponse, Unit]): Request[SearchPlaceIndexForTextResponse, AWSError] = js.native
  /**
    * Geocodes free-form text, such as an address, name, city, or region to allow you to search for Places or points of interest.  Optional parameters let you narrow your search results by bounding box or country, or bias your search toward a specific position on the globe.  You can search for places near a given position using BiasPosition, or filter results within a bounding box using FilterBBox. Providing both parameters simultaneously returns an error.  Search results are returned in order of highest to lowest relevance.
    */
  def searchPlaceIndexForText(params: SearchPlaceIndexForTextRequest): Request[SearchPlaceIndexForTextResponse, AWSError] = js.native
  def searchPlaceIndexForText(
    params: SearchPlaceIndexForTextRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchPlaceIndexForTextResponse, Unit]
  ): Request[SearchPlaceIndexForTextResponse, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified Amazon Location Service resource.  &lt;p&gt;Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values.&lt;/p&gt; &lt;p&gt;You can use the &lt;code&gt;TagResource&lt;/code&gt; operation with an Amazon Location Service resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the tags already associated with the resource. If you specify a tag key that's already associated with the resource, the new tag value that you specify replaces the previous value for that tag. &lt;/p&gt; &lt;p&gt;You can associate up to 50 tags with a resource.&lt;/p&gt; 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified Amazon Location Service resource.  &lt;p&gt;Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values.&lt;/p&gt; &lt;p&gt;You can use the &lt;code&gt;TagResource&lt;/code&gt; operation with an Amazon Location Service resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the tags already associated with the resource. If you specify a tag key that's already associated with the resource, the new tag value that you specify replaces the previous value for that tag. &lt;/p&gt; &lt;p&gt;You can associate up to 50 tags with a resource.&lt;/p&gt; 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified Amazon Location resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from the specified Amazon Location resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the specified properties of a given geofence collection.
    */
  def updateGeofenceCollection(): Request[UpdateGeofenceCollectionResponse, AWSError] = js.native
  def updateGeofenceCollection(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGeofenceCollectionResponse, Unit]): Request[UpdateGeofenceCollectionResponse, AWSError] = js.native
  /**
    * Updates the specified properties of a given geofence collection.
    */
  def updateGeofenceCollection(params: UpdateGeofenceCollectionRequest): Request[UpdateGeofenceCollectionResponse, AWSError] = js.native
  def updateGeofenceCollection(
    params: UpdateGeofenceCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGeofenceCollectionResponse, Unit]
  ): Request[UpdateGeofenceCollectionResponse, AWSError] = js.native
  
  /**
    * Updates the specified properties of a given map resource.
    */
  def updateMap(): Request[UpdateMapResponse, AWSError] = js.native
  def updateMap(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMapResponse, Unit]): Request[UpdateMapResponse, AWSError] = js.native
  /**
    * Updates the specified properties of a given map resource.
    */
  def updateMap(params: UpdateMapRequest): Request[UpdateMapResponse, AWSError] = js.native
  def updateMap(
    params: UpdateMapRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMapResponse, Unit]
  ): Request[UpdateMapResponse, AWSError] = js.native
  
  /**
    * Updates the specified properties of a given place index resource.
    */
  def updatePlaceIndex(): Request[UpdatePlaceIndexResponse, AWSError] = js.native
  def updatePlaceIndex(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePlaceIndexResponse, Unit]): Request[UpdatePlaceIndexResponse, AWSError] = js.native
  /**
    * Updates the specified properties of a given place index resource.
    */
  def updatePlaceIndex(params: UpdatePlaceIndexRequest): Request[UpdatePlaceIndexResponse, AWSError] = js.native
  def updatePlaceIndex(
    params: UpdatePlaceIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePlaceIndexResponse, Unit]
  ): Request[UpdatePlaceIndexResponse, AWSError] = js.native
  
  /**
    * Updates the specified properties for a given route calculator resource.
    */
  def updateRouteCalculator(): Request[UpdateRouteCalculatorResponse, AWSError] = js.native
  def updateRouteCalculator(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRouteCalculatorResponse, Unit]): Request[UpdateRouteCalculatorResponse, AWSError] = js.native
  /**
    * Updates the specified properties for a given route calculator resource.
    */
  def updateRouteCalculator(params: UpdateRouteCalculatorRequest): Request[UpdateRouteCalculatorResponse, AWSError] = js.native
  def updateRouteCalculator(
    params: UpdateRouteCalculatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRouteCalculatorResponse, Unit]
  ): Request[UpdateRouteCalculatorResponse, AWSError] = js.native
  
  /**
    * Updates the specified properties of a given tracker resource.
    */
  def updateTracker(): Request[UpdateTrackerResponse, AWSError] = js.native
  def updateTracker(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrackerResponse, Unit]): Request[UpdateTrackerResponse, AWSError] = js.native
  /**
    * Updates the specified properties of a given tracker resource.
    */
  def updateTracker(params: UpdateTrackerRequest): Request[UpdateTrackerResponse, AWSError] = js.native
  def updateTracker(
    params: UpdateTrackerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrackerResponse, Unit]
  ): Request[UpdateTrackerResponse, AWSError] = js.native
}
