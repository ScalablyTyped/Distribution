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
    * Sends a command to an Amazon QLDB ledger.  Instead of interacting directly with this API, we recommend that you use the Amazon QLDB Driver or the QLDB Shell to execute data transactions on a ledger.   If you are working with an AWS SDK, use the QLDB Driver. The driver provides a high-level abstraction layer above this qldbsession data plane and manages SendCommand API calls for you. For information and a list of supported programming languages, see Getting started with the driver in the Amazon QLDB Developer Guide.   If you are working with the AWS Command Line Interface (AWS CLI), use the QLDB Shell. The shell is a command line interface that uses the QLDB Driver to interact with a ledger. For information, see Accessing Amazon QLDB using the QLDB Shell.   
    */
  def sendCommand(): Request[SendCommandResult, AWSError] = js.native
  def sendCommand(callback: js.Function2[/* err */ AWSError, /* data */ SendCommandResult, Unit]): Request[SendCommandResult, AWSError] = js.native
  /**
    * Sends a command to an Amazon QLDB ledger.  Instead of interacting directly with this API, we recommend that you use the Amazon QLDB Driver or the QLDB Shell to execute data transactions on a ledger.   If you are working with an AWS SDK, use the QLDB Driver. The driver provides a high-level abstraction layer above this qldbsession data plane and manages SendCommand API calls for you. For information and a list of supported programming languages, see Getting started with the driver in the Amazon QLDB Developer Guide.   If you are working with the AWS Command Line Interface (AWS CLI), use the QLDB Shell. The shell is a command line interface that uses the QLDB Driver to interact with a ledger. For information, see Accessing Amazon QLDB using the QLDB Shell.   
    */
  def sendCommand(params: SendCommandRequest): Request[SendCommandResult, AWSError] = js.native
  def sendCommand(
    params: SendCommandRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendCommandResult, Unit]
  ): Request[SendCommandResult, AWSError] = js.native
}

