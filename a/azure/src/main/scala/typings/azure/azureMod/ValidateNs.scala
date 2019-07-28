package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "Validate")
@js.native
object ValidateNs extends js.Object {
  def blobNameIsValid(containerName: String, blob: String): Boolean = js.native
  def blobNameIsValid(containerName: String, blob: String, callback: ErrorCallback): Boolean = js.native
  def containerNameIsValid(containerName: String): Boolean = js.native
  def containerNameIsValid(containerName: String, callback: ErrorCallback): Boolean = js.native
  def isBase64Encoded(key: String): Boolean = js.native
  def isValidFunction(functionObject: js.Any, functionName: String): Unit = js.native
  def isValidHDInsightCreationObject(clusterCreationObject: ClusterCreationOptions): Unit = js.native
  def isValidHDInsightCreationObject(clusterCreationObject: ClusterCreationOptions, callback: ErrorCallback): Unit = js.native
  def isValidUri(uri: String): Boolean = js.native
  def isValidUuid(uuid: String): Unit = js.native
  def isValidUuid(uuid: String, callback: ErrorCallback): Unit = js.native
  def namespaceNameIsValid(name: String): Boolean = js.native
  def namespaceNameIsValid(name: String, callback: ErrorCallback): Boolean = js.native
  def pageRangesAreValid(rangeStart: Double, rangeEnd: Double, writeBlockSizeInBytes: Double): Boolean = js.native
  def pageRangesAreValid(rangeStart: Double, rangeEnd: Double, writeBlockSizeInBytes: Double, callback: ErrorCallback): Boolean = js.native
  def queueNameIsValid(queueName: String): Boolean = js.native
  def queueNameIsValid(queueName: String, callback: ErrorCallback): Boolean = js.native
  def tableNameIsValid(tableName: String): Boolean = js.native
  def tableNameIsValid(tableName: String, callback: ErrorCallback): Boolean = js.native
  def validateArgs(functionName: String, validationRules: js.Function): Boolean = js.native
}

