package typings.awsSdk.personalizeeventsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonalizeEvents extends Service {
  
  @JSName("config")
  var config_PersonalizeEvents: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Records user interaction event data. For more information see event-record-api.
    */
  def putEvents(): Request[js.Object, AWSError] = js.native
  def putEvents(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Records user interaction event data. For more information see event-record-api.
    */
  def putEvents(params: PutEventsRequest): Request[js.Object, AWSError] = js.native
  def putEvents(params: PutEventsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds one or more items to an Items dataset. For more information see importing-items.
    */
  def putItems(): Request[js.Object, AWSError] = js.native
  def putItems(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds one or more items to an Items dataset. For more information see importing-items.
    */
  def putItems(params: PutItemsRequest): Request[js.Object, AWSError] = js.native
  def putItems(params: PutItemsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds one or more users to a Users dataset. For more information see importing-users.
    */
  def putUsers(): Request[js.Object, AWSError] = js.native
  def putUsers(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds one or more users to a Users dataset. For more information see importing-users.
    */
  def putUsers(params: PutUsersRequest): Request[js.Object, AWSError] = js.native
  def putUsers(params: PutUsersRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
}
