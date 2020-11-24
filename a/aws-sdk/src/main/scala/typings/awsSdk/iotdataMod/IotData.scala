package typings.awsSdk.iotdataMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IotData extends Service {
  
  @JSName("config")
  var config_IotData: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Deletes the shadow for the specified thing. For more information, see DeleteThingShadow in the AWS IoT Developer Guide.
    */
  def deleteThingShadow(): Request[DeleteThingShadowResponse, AWSError] = js.native
  def deleteThingShadow(callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingShadowResponse, Unit]): Request[DeleteThingShadowResponse, AWSError] = js.native
  /**
    * Deletes the shadow for the specified thing. For more information, see DeleteThingShadow in the AWS IoT Developer Guide.
    */
  def deleteThingShadow(params: DeleteThingShadowRequest): Request[DeleteThingShadowResponse, AWSError] = js.native
  def deleteThingShadow(
    params: DeleteThingShadowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingShadowResponse, Unit]
  ): Request[DeleteThingShadowResponse, AWSError] = js.native
  
  /**
    * Gets the shadow for the specified thing. For more information, see GetThingShadow in the AWS IoT Developer Guide.
    */
  def getThingShadow(): Request[GetThingShadowResponse, AWSError] = js.native
  def getThingShadow(callback: js.Function2[/* err */ AWSError, /* data */ GetThingShadowResponse, Unit]): Request[GetThingShadowResponse, AWSError] = js.native
  /**
    * Gets the shadow for the specified thing. For more information, see GetThingShadow in the AWS IoT Developer Guide.
    */
  def getThingShadow(params: GetThingShadowRequest): Request[GetThingShadowResponse, AWSError] = js.native
  def getThingShadow(
    params: GetThingShadowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetThingShadowResponse, Unit]
  ): Request[GetThingShadowResponse, AWSError] = js.native
  
  /**
    * Lists the shadows for the specified thing.
    */
  def listNamedShadowsForThing(): Request[ListNamedShadowsForThingResponse, AWSError] = js.native
  def listNamedShadowsForThing(callback: js.Function2[/* err */ AWSError, /* data */ ListNamedShadowsForThingResponse, Unit]): Request[ListNamedShadowsForThingResponse, AWSError] = js.native
  /**
    * Lists the shadows for the specified thing.
    */
  def listNamedShadowsForThing(params: ListNamedShadowsForThingRequest): Request[ListNamedShadowsForThingResponse, AWSError] = js.native
  def listNamedShadowsForThing(
    params: ListNamedShadowsForThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNamedShadowsForThingResponse, Unit]
  ): Request[ListNamedShadowsForThingResponse, AWSError] = js.native
  
  /**
    * Publishes state information. For more information, see HTTP Protocol in the AWS IoT Developer Guide.
    */
  def publish(): Request[js.Object, AWSError] = js.native
  def publish(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Publishes state information. For more information, see HTTP Protocol in the AWS IoT Developer Guide.
    */
  def publish(params: PublishRequest): Request[js.Object, AWSError] = js.native
  def publish(params: PublishRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the shadow for the specified thing. For more information, see UpdateThingShadow in the AWS IoT Developer Guide.
    */
  def updateThingShadow(): Request[UpdateThingShadowResponse, AWSError] = js.native
  def updateThingShadow(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingShadowResponse, Unit]): Request[UpdateThingShadowResponse, AWSError] = js.native
  /**
    * Updates the shadow for the specified thing. For more information, see UpdateThingShadow in the AWS IoT Developer Guide.
    */
  def updateThingShadow(params: UpdateThingShadowRequest): Request[UpdateThingShadowResponse, AWSError] = js.native
  def updateThingShadow(
    params: UpdateThingShadowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingShadowResponse, Unit]
  ): Request[UpdateThingShadowResponse, AWSError] = js.native
}
