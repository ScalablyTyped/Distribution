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
  /**
    * Gets the set of key-value pairs (metadata) that are used to manage the resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Gets the set of key-value pairs (metadata) that are used to manage the resource.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Removes tags from an AWS resource.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes tags from an AWS resource.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
}

