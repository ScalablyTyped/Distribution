package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Validate {
  
  @JSImport("azure", "Validate")
  @js.native
  val ^ : js.Any = js.native
  
  inline def blobNameIsValid(containerName: String, blob: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("blobNameIsValid")(containerName.asInstanceOf[js.Any], blob.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def blobNameIsValid(containerName: String, blob: String, callback: ErrorCallback): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("blobNameIsValid")(containerName.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def containerNameIsValid(containerName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containerNameIsValid")(containerName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def containerNameIsValid(containerName: String, callback: ErrorCallback): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containerNameIsValid")(containerName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isBase64Encoded(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64Encoded")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidFunction(functionObject: js.Any, functionName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidFunction")(functionObject.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isValidHDInsightCreationObject(clusterCreationObject: ClusterCreationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidHDInsightCreationObject")(clusterCreationObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isValidHDInsightCreationObject(clusterCreationObject: ClusterCreationOptions, callback: ErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidHDInsightCreationObject")(clusterCreationObject.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isValidUri(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUri")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidUuid(uuid: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUuid")(uuid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isValidUuid(uuid: String, callback: ErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidUuid")(uuid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def namespaceNameIsValid(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("namespaceNameIsValid")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def namespaceNameIsValid(name: String, callback: ErrorCallback): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("namespaceNameIsValid")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pageRangesAreValid(rangeStart: Double, rangeEnd: Double, writeBlockSizeInBytes: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pageRangesAreValid")(rangeStart.asInstanceOf[js.Any], rangeEnd.asInstanceOf[js.Any], writeBlockSizeInBytes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def pageRangesAreValid(rangeStart: Double, rangeEnd: Double, writeBlockSizeInBytes: Double, callback: ErrorCallback): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pageRangesAreValid")(rangeStart.asInstanceOf[js.Any], rangeEnd.asInstanceOf[js.Any], writeBlockSizeInBytes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def queueNameIsValid(queueName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("queueNameIsValid")(queueName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def queueNameIsValid(queueName: String, callback: ErrorCallback): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queueNameIsValid")(queueName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def tableNameIsValid(tableName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tableNameIsValid")(tableName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def tableNameIsValid(tableName: String, callback: ErrorCallback): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("tableNameIsValid")(tableName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validateArgs(functionName: String, validationRules: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateArgs")(functionName.asInstanceOf[js.Any], validationRules.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
