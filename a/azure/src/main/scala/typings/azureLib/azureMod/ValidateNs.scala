package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "Validate")
@js.native
object ValidateNs extends js.Object {
  def blobNameIsValid(containerName: java.lang.String, blob: java.lang.String): scala.Boolean = js.native
  def blobNameIsValid(containerName: java.lang.String, blob: java.lang.String, callback: azureLib.azureMod.ErrorCallback): scala.Boolean = js.native
  def containerNameIsValid(containerName: java.lang.String): scala.Boolean = js.native
  def containerNameIsValid(containerName: java.lang.String, callback: azureLib.azureMod.ErrorCallback): scala.Boolean = js.native
  def isBase64Encoded(key: java.lang.String): scala.Boolean = js.native
  def isValidFunction(functionObject: js.Any, functionName: java.lang.String): scala.Unit = js.native
  def isValidHDInsightCreationObject(clusterCreationObject: azureLib.azureMod.ClusterCreationOptions): scala.Unit = js.native
  def isValidHDInsightCreationObject(
    clusterCreationObject: azureLib.azureMod.ClusterCreationOptions,
    callback: azureLib.azureMod.ErrorCallback
  ): scala.Unit = js.native
  def isValidUri(uri: java.lang.String): scala.Boolean = js.native
  def isValidUuid(uuid: java.lang.String): scala.Unit = js.native
  def isValidUuid(uuid: java.lang.String, callback: azureLib.azureMod.ErrorCallback): scala.Unit = js.native
  def namespaceNameIsValid(name: java.lang.String): scala.Boolean = js.native
  def namespaceNameIsValid(name: java.lang.String, callback: azureLib.azureMod.ErrorCallback): scala.Boolean = js.native
  def pageRangesAreValid(rangeStart: scala.Double, rangeEnd: scala.Double, writeBlockSizeInBytes: scala.Double): scala.Boolean = js.native
  def pageRangesAreValid(
    rangeStart: scala.Double,
    rangeEnd: scala.Double,
    writeBlockSizeInBytes: scala.Double,
    callback: azureLib.azureMod.ErrorCallback
  ): scala.Boolean = js.native
  def queueNameIsValid(queueName: java.lang.String): scala.Boolean = js.native
  def queueNameIsValid(queueName: java.lang.String, callback: azureLib.azureMod.ErrorCallback): scala.Boolean = js.native
  def tableNameIsValid(tableName: java.lang.String): scala.Boolean = js.native
  def tableNameIsValid(tableName: java.lang.String, callback: azureLib.azureMod.ErrorCallback): scala.Boolean = js.native
  def validateArgs(functionName: java.lang.String, validationRules: js.Function): scala.Boolean = js.native
}

