package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region RoleEnvironment
@js.native
trait RoleEnvironmentInterface
  extends nodeLib.eventsMod.EventEmitter {
  var EnvironmentVariables: azureLib.Anon_KeyVersionEndpointEnvironmentName = js.native
  var VersionEndpointFixedPath: java.lang.String = js.native
  var clientId: java.lang.String = js.native
  var incorrectCallbackErr: java.lang.String = js.native
  /**
    * Clears the status of the role instance.
    * An instance may indicate that it has completed communicating status by calling this method.
    */
  def clearStatus(callback: ErrorCallback): scala.Unit = js.native
  /**
    * Retrieves the settings in the service configuration file.
    *
    * A role's configuration settings are defined in the service definition file.
    * Values for configuration settings are set in the service configuration file.
    * For more information on configuration settings, see the [Service Definition Schema](http://msdn.microsoft.com/en-us/library/windowsazure/ee758711.aspx)
    * and [Service Configuration Schema](http://msdn.microsoft.com/en-us/library/windowsazure/ee758710.aspx).
    */
  def getConfigurationSettings(callback: SimpleCallback[Dictionary[java.lang.String]]): scala.Unit = js.native
  /**
    * Returns a RoleInstance object that represents the role instance
    * in which this code is currently executing.
    */
  def getCurrentRoleInstance(callback: SimpleCallback[RoleInstance]): scala.Unit = js.native
  /**
    * Returns the deployment ID that uniquely identifies the deployment in
    * which this role instance is running.
    */
  def getDeploymentId(callback: SimpleCallback[java.lang.String]): scala.Unit = js.native
  /**
    * Retrieves the set of named local storage resources, along with the path.
    * For example, the DiagnosticStore resource which is defined for every role
    * provides a location for runtime diagnostics and logs.
    */
  def getLocalResources(callback: SimpleCallback[Dictionary[RoleLocalResource]]): scala.Unit = js.native
  /**
    * Returns the set of Role objects defined for your service.
    * Roles are defined in the service definition file.
    */
  def getRoles(callback: SimpleCallback[Dictionary[Role]]): scala.Unit = js.native
  /**
    * Indicates whether the role instance is running in the Microsoft Azure
    * environment.  It is good practice to enclose any code that uses
    * service runtime in the isAvailable callback.
    */
  def isAvailable(callback: SimpleCallback[scala.Boolean]): scala.Unit = js.native
  /**
    * Indicates whether the role instance is running in the development fabric.
    */
  def isEmulated(callback: SimpleCallback[scala.Boolean]): scala.Unit = js.native
  /**
    * Requests that the current role instance be stopped and restarted.
    *
    * Before the role instance is recycled, the Microsoft Azure load balancer takes the role instance out of rotation.
    * This ensures that no new requests are routed to the instance while it is restarting.
    *
    * A call to `RequestRecycle` initiates the normal shutdown cycle. Microsoft Azure raises the
    * `Stopping` event and calls the `OnStop` method so that you can run the necessary code to
    * prepare the instance to be recycled.
    */
  def requestRecycle(callback: ErrorCallback): scala.Unit = js.native
  /**
    * Sets the status of the role instance.
    *
    * An instance may indicate that it is in one of two states: Ready or Busy. If an instance's state is Ready, it is
    * prepared to receive requests from the load balancer. If the instance's state is Busy, it will not receive
    * requests from the load balancer.
    */
  def setStatus(roleInstanceStatus: java.lang.String, expirationUtc: stdLib.Date, callback: ErrorCallback): scala.Unit = js.native
}

