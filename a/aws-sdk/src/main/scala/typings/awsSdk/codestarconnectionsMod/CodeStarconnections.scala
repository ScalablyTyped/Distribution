package typings.awsSdk.codestarconnectionsMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeStarconnections extends Service {
  @JSName("config")
  var config_CodeStarconnections: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a connection that can then be given to other AWS services like CodePipeline so that it can access third-party code repositories. The connection is in pending status until the third-party connection handshake is completed from the console.
    */
  def createConnection(): Request[CreateConnectionOutput, AWSError] = js.native
  def createConnection(callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectionOutput, Unit]): Request[CreateConnectionOutput, AWSError] = js.native
  /**
    * Creates a connection that can then be given to other AWS services like CodePipeline so that it can access third-party code repositories. The connection is in pending status until the third-party connection handshake is completed from the console.
    */
  def createConnection(params: CreateConnectionInput): Request[CreateConnectionOutput, AWSError] = js.native
  def createConnection(
    params: CreateConnectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectionOutput, Unit]
  ): Request[CreateConnectionOutput, AWSError] = js.native
  /**
    * The connection to be deleted.
    */
  def deleteConnection(): Request[DeleteConnectionOutput, AWSError] = js.native
  def deleteConnection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionOutput, Unit]): Request[DeleteConnectionOutput, AWSError] = js.native
  /**
    * The connection to be deleted.
    */
  def deleteConnection(params: DeleteConnectionInput): Request[DeleteConnectionOutput, AWSError] = js.native
  def deleteConnection(
    params: DeleteConnectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionOutput, Unit]
  ): Request[DeleteConnectionOutput, AWSError] = js.native
  /**
    * Returns the connection ARN and details such as status, owner, and provider type.
    */
  def getConnection(): Request[GetConnectionOutput, AWSError] = js.native
  def getConnection(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionOutput, Unit]): Request[GetConnectionOutput, AWSError] = js.native
  /**
    * Returns the connection ARN and details such as status, owner, and provider type.
    */
  def getConnection(params: GetConnectionInput): Request[GetConnectionOutput, AWSError] = js.native
  def getConnection(
    params: GetConnectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionOutput, Unit]
  ): Request[GetConnectionOutput, AWSError] = js.native
  /**
    * Lists the connections associated with your account.
    */
  def listConnections(): Request[ListConnectionsOutput, AWSError] = js.native
  def listConnections(callback: js.Function2[/* err */ AWSError, /* data */ ListConnectionsOutput, Unit]): Request[ListConnectionsOutput, AWSError] = js.native
  /**
    * Lists the connections associated with your account.
    */
  def listConnections(params: ListConnectionsInput): Request[ListConnectionsOutput, AWSError] = js.native
  def listConnections(
    params: ListConnectionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConnectionsOutput, Unit]
  ): Request[ListConnectionsOutput, AWSError] = js.native
}

