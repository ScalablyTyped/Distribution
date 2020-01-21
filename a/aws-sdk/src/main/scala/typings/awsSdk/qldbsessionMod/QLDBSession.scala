package typings.awsSdk.qldbsessionMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QLDBSession extends Service {
  @JSName("config")
  var config_QLDBSession: ConfigBase with ClientConfiguration = js.native
  /**
    * Sends a command to an Amazon QLDB ledger.
    */
  def sendCommand(): Request[SendCommandResult, AWSError] = js.native
  def sendCommand(callback: js.Function2[/* err */ AWSError, /* data */ SendCommandResult, Unit]): Request[SendCommandResult, AWSError] = js.native
  /**
    * Sends a command to an Amazon QLDB ledger.
    */
  def sendCommand(params: SendCommandRequest): Request[SendCommandResult, AWSError] = js.native
  def sendCommand(
    params: SendCommandRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendCommandResult, Unit]
  ): Request[SendCommandResult, AWSError] = js.native
}

