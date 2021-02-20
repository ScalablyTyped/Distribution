package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Validate {
  
  @JSImport("azure", "Validate.blobNameIsValid")
  @js.native
  def blobNameIsValid(containerName: String, blob: String): Boolean = js.native
  @JSImport("azure", "Validate.blobNameIsValid")
  @js.native
  def blobNameIsValid(containerName: String, blob: String, callback: ErrorCallback): Boolean = js.native
  
  @JSImport("azure", "Validate.containerNameIsValid")
  @js.native
  def containerNameIsValid(containerName: String): Boolean = js.native
  @JSImport("azure", "Validate.containerNameIsValid")
  @js.native
  def containerNameIsValid(containerName: String, callback: ErrorCallback): Boolean = js.native
  
  @JSImport("azure", "Validate.isBase64Encoded")
  @js.native
  def isBase64Encoded(key: String): Boolean = js.native
  
  @JSImport("azure", "Validate.isValidFunction")
  @js.native
  def isValidFunction(functionObject: js.Any, functionName: String): Unit = js.native
  
  @JSImport("azure", "Validate.isValidHDInsightCreationObject")
  @js.native
  def isValidHDInsightCreationObject(clusterCreationObject: ClusterCreationOptions): Unit = js.native
  @JSImport("azure", "Validate.isValidHDInsightCreationObject")
  @js.native
  def isValidHDInsightCreationObject(clusterCreationObject: ClusterCreationOptions, callback: ErrorCallback): Unit = js.native
  
  @JSImport("azure", "Validate.isValidUri")
  @js.native
  def isValidUri(uri: String): Boolean = js.native
  
  @JSImport("azure", "Validate.isValidUuid")
  @js.native
  def isValidUuid(uuid: String): Unit = js.native
  @JSImport("azure", "Validate.isValidUuid")
  @js.native
  def isValidUuid(uuid: String, callback: ErrorCallback): Unit = js.native
  
  @JSImport("azure", "Validate.namespaceNameIsValid")
  @js.native
  def namespaceNameIsValid(name: String): Boolean = js.native
  @JSImport("azure", "Validate.namespaceNameIsValid")
  @js.native
  def namespaceNameIsValid(name: String, callback: ErrorCallback): Boolean = js.native
  
  @JSImport("azure", "Validate.pageRangesAreValid")
  @js.native
  def pageRangesAreValid(rangeStart: Double, rangeEnd: Double, writeBlockSizeInBytes: Double): Boolean = js.native
  @JSImport("azure", "Validate.pageRangesAreValid")
  @js.native
  def pageRangesAreValid(rangeStart: Double, rangeEnd: Double, writeBlockSizeInBytes: Double, callback: ErrorCallback): Boolean = js.native
  
  @JSImport("azure", "Validate.queueNameIsValid")
  @js.native
  def queueNameIsValid(queueName: String): Boolean = js.native
  @JSImport("azure", "Validate.queueNameIsValid")
  @js.native
  def queueNameIsValid(queueName: String, callback: ErrorCallback): Boolean = js.native
  
  @JSImport("azure", "Validate.tableNameIsValid")
  @js.native
  def tableNameIsValid(tableName: String): Boolean = js.native
  @JSImport("azure", "Validate.tableNameIsValid")
  @js.native
  def tableNameIsValid(tableName: String, callback: ErrorCallback): Boolean = js.native
  
  @JSImport("azure", "Validate.validateArgs")
  @js.native
  def validateArgs(functionName: String, validationRules: js.Function): Boolean = js.native
}
