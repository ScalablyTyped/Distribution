package typings.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CreateTableIfNotExistsCallback = js.Function3[
    /* error */ typings.std.Error, 
    /* created */ scala.Boolean, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type DeleteEntityCallback = js.Function3[
    /* error */ typings.std.Error, 
    /* successful */ scala.Boolean, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type DeleteTableCallback = js.Function3[
    /* error */ typings.std.Error, 
    /* successful */ scala.Boolean, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ErrorCallback = js.Function1[/* error */ typings.std.Error, scala.Unit]
  type GetBlobToTextCallback = js.Function4[
    /* err */ typings.std.Error, 
    /* text */ java.lang.String, 
    /* result */ typings.azure.mod.BlobResult, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type ListBlobsCallback = js.Function4[
    /* err */ typings.std.Error, 
    /* blobs */ js.Array[typings.azure.mod.BlobResult], 
    /* continuationToken */ typings.azure.mod.ContinuationToken, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type ListContainersCallback = js.Function4[
    /* err */ typings.std.Error, 
    /* containers */ js.Array[typings.azure.mod.ContainerResult], 
    /* continuationToken */ typings.azure.mod.ContinuationToken, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type ListQueuesCallback = js.Function4[
    /* err */ typings.std.Error, 
    /* queues */ js.Array[typings.azure.mod.QueueResult], 
    /* continuationToken */ typings.azure.mod.ContinuationToken, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type ModifyEntityCallback = js.Function3[
    /* error */ typings.std.Error, 
    /* entity */ typings.azure.mod.Entity, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type QueryEntitiesCallback = js.Function4[
    /* error */ typings.std.Error, 
    /* entities */ js.Array[typings.azure.mod.Entity], 
    /* resultContinuation */ typings.azure.mod.QueryEntitiesResultContinuation, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type QueryEntityCallback = js.Function3[
    /* error */ typings.std.Error, 
    /* entity */ typings.azure.mod.Entity, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type QueryTablesCallback = js.Function4[
    /* error */ typings.std.Error, 
    /* queryTablesResult */ js.Array[typings.azure.mod.TableResult], 
    /* resultsContinuation */ typings.azure.mod.QueryResultContinuation, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type SimpleCallback[T] = js.Function2[/* error */ typings.std.Error, /* result */ T, scala.Unit]
  type StorageCallback[T] = js.Function3[
    /* err */ typings.std.Error, 
    /* result */ T, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type StorageCallbackVoid = js.Function2[
    /* err */ typings.std.Error, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type StorageMetadata = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type StorageServicePropertiesCallback = typings.azure.mod.StorageCallback[typings.azure.mod.StorageServiceProperties]
  type StorageServiceStatsCallback = typings.azure.mod.StorageCallback[typings.azure.mod.StorageServiceStats]
  type TableRequestCallback = js.Function3[
    /* error */ typings.std.Error, 
    /* tableResult */ typings.azure.anon.TableName, 
    /* response */ typings.azure.mod.WebResponse, 
    scala.Unit
  ]
  type ValidatorFunction = js.Function1[/* userSettings */ typings.azure.mod.Dictionary[js.Any], js.Any]
}
