package typings.cassandraDashDriver.cassandraDashDriverMod.mapping

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelMapper extends js.Object {
  var batching: ModelBatchMapper = js.native
  var name: String = js.native
  def find(doc: StringDictionary[js.Any]): js.Promise[Result] = js.native
  def find(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
  def find(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: String): js.Promise[Result] = js.native
  def find(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
  def findAll(): js.Promise[Result] = js.native
  def findAll(docInfo: MappingDocInfo): js.Promise[Result] = js.native
  def findAll(docInfo: MappingDocInfo, executionOptions: String): js.Promise[Result] = js.native
  def findAll(docInfo: MappingDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
  def get(doc: StringDictionary[js.Any]): js.Promise[Result] = js.native
  def get(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
  def get(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: String): js.Promise[Result] = js.native
  def get(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
  def insert(doc: StringDictionary[js.Any]): js.Promise[Result] = js.native
  def insert(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
  def insert(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: String): js.Promise[Result] = js.native
  def insert(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
  def mapWithQuery(query: String, paramsHandler: js.Function1[/* doc */ StringDictionary[js.Any], _]): js.Function2[
    /* doc */ StringDictionary[js.Any], 
    /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
    js.Promise[Result]
  ] = js.native
  def mapWithQuery(
    query: String,
    paramsHandler: js.Function1[/* doc */ StringDictionary[js.Any], _],
    executionOptions: String
  ): js.Function2[
    /* doc */ StringDictionary[js.Any], 
    /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
    js.Promise[Result]
  ] = js.native
  def mapWithQuery(
    query: String,
    paramsHandler: js.Function1[/* doc */ StringDictionary[js.Any], _],
    executionOptions: MappingExecutionOptions
  ): js.Function2[
    /* doc */ StringDictionary[js.Any], 
    /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
    js.Promise[Result]
  ] = js.native
  def remove(doc: StringDictionary[js.Any]): js.Promise[Result] = js.native
  def remove(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
  def remove(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: String): js.Promise[Result] = js.native
  def remove(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
  def update(doc: StringDictionary[js.Any]): js.Promise[Result] = js.native
  def update(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): js.Promise[Result] = js.native
  def update(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: String): js.Promise[Result] = js.native
  def update(doc: StringDictionary[js.Any], docInfo: MappingDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
}

@JSImport("cassandra-driver", "mapping.ModelMapper")
@js.native
object ModelMapper extends TopLevel[ModelMapperStatic]

