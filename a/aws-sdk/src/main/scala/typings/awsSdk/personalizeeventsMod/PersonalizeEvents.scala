package typings.awsSdk.personalizeeventsMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonalizeEvents extends Service {
  @JSName("config")
  var config_PersonalizeEvents: ConfigBase with ClientConfiguration = js.native
  /**
    * Records user interaction event data.
    */
  def putEvents(): Request[js.Object, AWSError] = js.native
  def putEvents(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Records user interaction event data.
    */
  def putEvents(params: PutEventsRequest): Request[js.Object, AWSError] = js.native
  def putEvents(params: PutEventsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
}

