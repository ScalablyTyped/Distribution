package typings.azure

import org.scalablytyped.runtime.StringDictionary
import typings.azure.Anon_TableName
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object azureMod {
  type CreateTableIfNotExistsCallback = js.Function3[/* error */ Error, /* created */ Boolean, /* response */ WebResponse, Unit]
  type DeleteEntityCallback = js.Function3[/* error */ Error, /* successful */ Boolean, /* response */ WebResponse, Unit]
  type DeleteTableCallback = js.Function3[/* error */ Error, /* successful */ Boolean, /* response */ WebResponse, Unit]
  type Dictionary[T] = StringDictionary[T]
  type ErrorCallback = js.Function1[/* error */ Error, Unit]
  type GetBlobToTextCallback = js.Function4[
    /* err */ Error, 
    /* text */ String, 
    /* result */ BlobResult, 
    /* response */ WebResponse, 
    Unit
  ]
  type ListBlobsCallback = js.Function4[
    /* err */ Error, 
    /* blobs */ js.Array[BlobResult], 
    /* continuationToken */ ContinuationToken, 
    /* response */ WebResponse, 
    Unit
  ]
  type ListContainersCallback = js.Function4[
    /* err */ Error, 
    /* containers */ js.Array[ContainerResult], 
    /* continuationToken */ ContinuationToken, 
    /* response */ WebResponse, 
    Unit
  ]
  type ListQueuesCallback = js.Function4[
    /* err */ Error, 
    /* queues */ js.Array[QueueResult], 
    /* continuationToken */ ContinuationToken, 
    /* response */ WebResponse, 
    Unit
  ]
  type ModifyEntityCallback = js.Function3[/* error */ Error, /* entity */ Entity, /* response */ WebResponse, Unit]
  type QueryEntitiesCallback = js.Function4[
    /* error */ Error, 
    /* entities */ js.Array[Entity], 
    /* resultContinuation */ QueryEntitiesResultContinuation, 
    /* response */ WebResponse, 
    Unit
  ]
  type QueryEntityCallback = js.Function3[/* error */ Error, /* entity */ Entity, /* response */ WebResponse, Unit]
  type QueryTablesCallback = js.Function4[
    /* error */ Error, 
    /* queryTablesResult */ js.Array[TableResult], 
    /* resultsContinuation */ QueryResultContinuation, 
    /* response */ WebResponse, 
    Unit
  ]
  type SimpleCallback[T] = js.Function2[/* error */ Error, /* result */ T, Unit]
  type StorageCallback[T] = js.Function3[/* err */ Error, /* result */ T, /* response */ WebResponse, Unit]
  type StorageCallbackVoid = js.Function2[/* err */ Error, /* response */ WebResponse, Unit]
  type StorageMetadata = StringDictionary[String]
  type StorageServicePropertiesCallback = StorageCallback[StorageServiceProperties]
  type StorageServiceStatsCallback = StorageCallback[StorageServiceStats]
  type TableRequestCallback = js.Function3[/* error */ Error, /* tableResult */ Anon_TableName, /* response */ WebResponse, Unit]
  type ValidatorFunction = js.Function1[/* userSettings */ Dictionary[js.Any], js.Any]
}
