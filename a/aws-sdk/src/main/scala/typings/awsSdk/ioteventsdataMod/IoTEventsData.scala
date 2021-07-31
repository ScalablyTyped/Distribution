package typings.awsSdk.ioteventsdataMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IoTEventsData extends Service {
  
  /**
    * Sends a set of messages to the AWS IoT Events system. Each message payload is transformed into the input you specify ("inputName") and ingested into any detectors that monitor that input. If multiple messages are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send messages one at a time and wait for a successful response.
    */
  def batchPutMessage(): Request[BatchPutMessageResponse, AWSError] = js.native
  def batchPutMessage(callback: js.Function2[/* err */ AWSError, /* data */ BatchPutMessageResponse, Unit]): Request[BatchPutMessageResponse, AWSError] = js.native
  /**
    * Sends a set of messages to the AWS IoT Events system. Each message payload is transformed into the input you specify ("inputName") and ingested into any detectors that monitor that input. If multiple messages are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send messages one at a time and wait for a successful response.
    */
  def batchPutMessage(params: BatchPutMessageRequest): Request[BatchPutMessageResponse, AWSError] = js.native
  def batchPutMessage(
    params: BatchPutMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchPutMessageResponse, Unit]
  ): Request[BatchPutMessageResponse, AWSError] = js.native
  
  /**
    * Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified detector model.
    */
  def batchUpdateDetector(): Request[BatchUpdateDetectorResponse, AWSError] = js.native
  def batchUpdateDetector(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateDetectorResponse, Unit]): Request[BatchUpdateDetectorResponse, AWSError] = js.native
  /**
    * Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified detector model.
    */
  def batchUpdateDetector(params: BatchUpdateDetectorRequest): Request[BatchUpdateDetectorResponse, AWSError] = js.native
  def batchUpdateDetector(
    params: BatchUpdateDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateDetectorResponse, Unit]
  ): Request[BatchUpdateDetectorResponse, AWSError] = js.native
  
  @JSName("config")
  var config_IoTEventsData: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Returns information about the specified detector (instance).
    */
  def describeDetector(): Request[DescribeDetectorResponse, AWSError] = js.native
  def describeDetector(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectorResponse, Unit]): Request[DescribeDetectorResponse, AWSError] = js.native
  /**
    * Returns information about the specified detector (instance).
    */
  def describeDetector(params: DescribeDetectorRequest): Request[DescribeDetectorResponse, AWSError] = js.native
  def describeDetector(
    params: DescribeDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectorResponse, Unit]
  ): Request[DescribeDetectorResponse, AWSError] = js.native
  
  /**
    * Lists detectors (the instances of a detector model).
    */
  def listDetectors(): Request[ListDetectorsResponse, AWSError] = js.native
  def listDetectors(callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorsResponse, Unit]): Request[ListDetectorsResponse, AWSError] = js.native
  /**
    * Lists detectors (the instances of a detector model).
    */
  def listDetectors(params: ListDetectorsRequest): Request[ListDetectorsResponse, AWSError] = js.native
  def listDetectors(
    params: ListDetectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorsResponse, Unit]
  ): Request[ListDetectorsResponse, AWSError] = js.native
}
