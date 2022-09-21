package typings.awsSdk.kafkaconnectMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KafkaConnect extends Service {
  
  @JSName("config")
  var config_KafkaConnect: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a connector using the specified properties.
    */
  def createConnector(): Request[CreateConnectorResponse, AWSError] = js.native
  def createConnector(callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectorResponse, Unit]): Request[CreateConnectorResponse, AWSError] = js.native
  /**
    * Creates a connector using the specified properties.
    */
  def createConnector(params: CreateConnectorRequest): Request[CreateConnectorResponse, AWSError] = js.native
  def createConnector(
    params: CreateConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectorResponse, Unit]
  ): Request[CreateConnectorResponse, AWSError] = js.native
  
  /**
    * Creates a custom plugin using the specified properties.
    */
  def createCustomPlugin(): Request[CreateCustomPluginResponse, AWSError] = js.native
  def createCustomPlugin(callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomPluginResponse, Unit]): Request[CreateCustomPluginResponse, AWSError] = js.native
  /**
    * Creates a custom plugin using the specified properties.
    */
  def createCustomPlugin(params: CreateCustomPluginRequest): Request[CreateCustomPluginResponse, AWSError] = js.native
  def createCustomPlugin(
    params: CreateCustomPluginRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomPluginResponse, Unit]
  ): Request[CreateCustomPluginResponse, AWSError] = js.native
  
  /**
    * Creates a worker configuration using the specified properties.
    */
  def createWorkerConfiguration(): Request[CreateWorkerConfigurationResponse, AWSError] = js.native
  def createWorkerConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkerConfigurationResponse, Unit]): Request[CreateWorkerConfigurationResponse, AWSError] = js.native
  /**
    * Creates a worker configuration using the specified properties.
    */
  def createWorkerConfiguration(params: CreateWorkerConfigurationRequest): Request[CreateWorkerConfigurationResponse, AWSError] = js.native
  def createWorkerConfiguration(
    params: CreateWorkerConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkerConfigurationResponse, Unit]
  ): Request[CreateWorkerConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes the specified connector.
    */
  def deleteConnector(): Request[DeleteConnectorResponse, AWSError] = js.native
  def deleteConnector(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectorResponse, Unit]): Request[DeleteConnectorResponse, AWSError] = js.native
  /**
    * Deletes the specified connector.
    */
  def deleteConnector(params: DeleteConnectorRequest): Request[DeleteConnectorResponse, AWSError] = js.native
  def deleteConnector(
    params: DeleteConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectorResponse, Unit]
  ): Request[DeleteConnectorResponse, AWSError] = js.native
  
  /**
    * Deletes a custom plugin.
    */
  def deleteCustomPlugin(): Request[DeleteCustomPluginResponse, AWSError] = js.native
  def deleteCustomPlugin(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomPluginResponse, Unit]): Request[DeleteCustomPluginResponse, AWSError] = js.native
  /**
    * Deletes a custom plugin.
    */
  def deleteCustomPlugin(params: DeleteCustomPluginRequest): Request[DeleteCustomPluginResponse, AWSError] = js.native
  def deleteCustomPlugin(
    params: DeleteCustomPluginRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomPluginResponse, Unit]
  ): Request[DeleteCustomPluginResponse, AWSError] = js.native
  
  /**
    * Returns summary information about the connector.
    */
  def describeConnector(): Request[DescribeConnectorResponse, AWSError] = js.native
  def describeConnector(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectorResponse, Unit]): Request[DescribeConnectorResponse, AWSError] = js.native
  /**
    * Returns summary information about the connector.
    */
  def describeConnector(params: DescribeConnectorRequest): Request[DescribeConnectorResponse, AWSError] = js.native
  def describeConnector(
    params: DescribeConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectorResponse, Unit]
  ): Request[DescribeConnectorResponse, AWSError] = js.native
  
  /**
    * A summary description of the custom plugin.
    */
  def describeCustomPlugin(): Request[DescribeCustomPluginResponse, AWSError] = js.native
  def describeCustomPlugin(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomPluginResponse, Unit]): Request[DescribeCustomPluginResponse, AWSError] = js.native
  /**
    * A summary description of the custom plugin.
    */
  def describeCustomPlugin(params: DescribeCustomPluginRequest): Request[DescribeCustomPluginResponse, AWSError] = js.native
  def describeCustomPlugin(
    params: DescribeCustomPluginRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomPluginResponse, Unit]
  ): Request[DescribeCustomPluginResponse, AWSError] = js.native
  
  /**
    * Returns information about a worker configuration.
    */
  def describeWorkerConfiguration(): Request[DescribeWorkerConfigurationResponse, AWSError] = js.native
  def describeWorkerConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkerConfigurationResponse, Unit]): Request[DescribeWorkerConfigurationResponse, AWSError] = js.native
  /**
    * Returns information about a worker configuration.
    */
  def describeWorkerConfiguration(params: DescribeWorkerConfigurationRequest): Request[DescribeWorkerConfigurationResponse, AWSError] = js.native
  def describeWorkerConfiguration(
    params: DescribeWorkerConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkerConfigurationResponse, Unit]
  ): Request[DescribeWorkerConfigurationResponse, AWSError] = js.native
  
  /**
    * Returns a list of all the connectors in this account and Region. The list is limited to connectors whose name starts with the specified prefix. The response also includes a description of each of the listed connectors.
    */
  def listConnectors(): Request[ListConnectorsResponse, AWSError] = js.native
  def listConnectors(callback: js.Function2[/* err */ AWSError, /* data */ ListConnectorsResponse, Unit]): Request[ListConnectorsResponse, AWSError] = js.native
  /**
    * Returns a list of all the connectors in this account and Region. The list is limited to connectors whose name starts with the specified prefix. The response also includes a description of each of the listed connectors.
    */
  def listConnectors(params: ListConnectorsRequest): Request[ListConnectorsResponse, AWSError] = js.native
  def listConnectors(
    params: ListConnectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConnectorsResponse, Unit]
  ): Request[ListConnectorsResponse, AWSError] = js.native
  
  /**
    * Returns a list of all of the custom plugins in this account and Region.
    */
  def listCustomPlugins(): Request[ListCustomPluginsResponse, AWSError] = js.native
  def listCustomPlugins(callback: js.Function2[/* err */ AWSError, /* data */ ListCustomPluginsResponse, Unit]): Request[ListCustomPluginsResponse, AWSError] = js.native
  /**
    * Returns a list of all of the custom plugins in this account and Region.
    */
  def listCustomPlugins(params: ListCustomPluginsRequest): Request[ListCustomPluginsResponse, AWSError] = js.native
  def listCustomPlugins(
    params: ListCustomPluginsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomPluginsResponse, Unit]
  ): Request[ListCustomPluginsResponse, AWSError] = js.native
  
  /**
    * Returns a list of all of the worker configurations in this account and Region.
    */
  def listWorkerConfigurations(): Request[ListWorkerConfigurationsResponse, AWSError] = js.native
  def listWorkerConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkerConfigurationsResponse, Unit]): Request[ListWorkerConfigurationsResponse, AWSError] = js.native
  /**
    * Returns a list of all of the worker configurations in this account and Region.
    */
  def listWorkerConfigurations(params: ListWorkerConfigurationsRequest): Request[ListWorkerConfigurationsResponse, AWSError] = js.native
  def listWorkerConfigurations(
    params: ListWorkerConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkerConfigurationsResponse, Unit]
  ): Request[ListWorkerConfigurationsResponse, AWSError] = js.native
  
  /**
    * Updates the specified connector.
    */
  def updateConnector(): Request[UpdateConnectorResponse, AWSError] = js.native
  def updateConnector(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectorResponse, Unit]): Request[UpdateConnectorResponse, AWSError] = js.native
  /**
    * Updates the specified connector.
    */
  def updateConnector(params: UpdateConnectorRequest): Request[UpdateConnectorResponse, AWSError] = js.native
  def updateConnector(
    params: UpdateConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectorResponse, Unit]
  ): Request[UpdateConnectorResponse, AWSError] = js.native
}
