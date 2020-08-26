package typings.cassandraDriver.mappingMod.mapping

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelMapper[T] extends js.Object {
  var batching: ModelBatchMapper = js.native
  var name: String = js.native
  def find(doc: StringDictionary[js.Any]): js.Promise[Result[T]] = js.native
  def find(doc: StringDictionary[js.Any], docInfo: js.UndefOr[scala.Nothing], executionOptions: String): js.Promise[Result[T]] = js.native
  def find(
    doc: StringDictionary[js.Any],
    docInfo: js.UndefOr[scala.Nothing],
    executionOptions: MappingExecutionOptions
  ): js.Promise[Result[T]] = js.native
  def find(doc: StringDictionary[js.Any], docInfo: FindDocInfo): js.Promise[Result[T]] = js.native
  def find(doc: StringDictionary[js.Any], docInfo: FindDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
  def find(doc: StringDictionary[js.Any], docInfo: FindDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
  def findAll(): js.Promise[Result[T]] = js.native
  def findAll(docInfo: js.UndefOr[scala.Nothing], executionOptions: String): js.Promise[Result[T]] = js.native
  def findAll(docInfo: js.UndefOr[scala.Nothing], executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
  def findAll(docInfo: FindDocInfo): js.Promise[Result[T]] = js.native
  def findAll(docInfo: FindDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
  def findAll(docInfo: FindDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
  def get(doc: StringDictionary[js.Any]): js.Promise[Null | T] = js.native
  def get(doc: StringDictionary[js.Any], docInfo: js.UndefOr[scala.Nothing], executionOptions: String): js.Promise[Null | T] = js.native
  def get(
    doc: StringDictionary[js.Any],
    docInfo: js.UndefOr[scala.Nothing],
    executionOptions: MappingExecutionOptions
  ): js.Promise[Null | T] = js.native
  def get(doc: StringDictionary[js.Any], docInfo: Fields): js.Promise[Null | T] = js.native
  def get(doc: StringDictionary[js.Any], docInfo: Fields, executionOptions: String): js.Promise[Null | T] = js.native
  def get(doc: StringDictionary[js.Any], docInfo: Fields, executionOptions: MappingExecutionOptions): js.Promise[Null | T] = js.native
  def insert(doc: StringDictionary[js.Any]): js.Promise[Result[T]] = js.native
  def insert(doc: StringDictionary[js.Any], docInfo: js.UndefOr[scala.Nothing], executionOptions: String): js.Promise[Result[T]] = js.native
  def insert(
    doc: StringDictionary[js.Any],
    docInfo: js.UndefOr[scala.Nothing],
    executionOptions: MappingExecutionOptions
  ): js.Promise[Result[T]] = js.native
  def insert(doc: StringDictionary[js.Any], docInfo: InsertDocInfo): js.Promise[Result[T]] = js.native
  def insert(doc: StringDictionary[js.Any], docInfo: InsertDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
  def insert(doc: StringDictionary[js.Any], docInfo: InsertDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
  def mapWithQuery(query: String, paramsHandler: js.Function1[/* doc */ js.Any, js.Array[_]]): js.Function2[
    /* doc */ js.Any, 
    /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
    js.Promise[Result[T]]
  ] = js.native
  def mapWithQuery(
    query: String,
    paramsHandler: js.Function1[/* doc */ js.Any, js.Array[_]],
    executionOptions: String
  ): js.Function2[
    /* doc */ js.Any, 
    /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
    js.Promise[Result[T]]
  ] = js.native
  def mapWithQuery(
    query: String,
    paramsHandler: js.Function1[/* doc */ js.Any, js.Array[_]],
    executionOptions: MappingExecutionOptions
  ): js.Function2[
    /* doc */ js.Any, 
    /* executionOptions */ js.UndefOr[String | MappingExecutionOptions], 
    js.Promise[Result[T]]
  ] = js.native
  def remove(doc: StringDictionary[js.Any]): js.Promise[Result[T]] = js.native
  def remove(doc: StringDictionary[js.Any], docInfo: js.UndefOr[scala.Nothing], executionOptions: String): js.Promise[Result[T]] = js.native
  def remove(
    doc: StringDictionary[js.Any],
    docInfo: js.UndefOr[scala.Nothing],
    executionOptions: MappingExecutionOptions
  ): js.Promise[Result[T]] = js.native
  def remove(doc: StringDictionary[js.Any], docInfo: RemoveDocInfo): js.Promise[Result[T]] = js.native
  def remove(doc: StringDictionary[js.Any], docInfo: RemoveDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
  def remove(doc: StringDictionary[js.Any], docInfo: RemoveDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
  def update(doc: StringDictionary[js.Any]): js.Promise[Result[T]] = js.native
  def update(doc: StringDictionary[js.Any], docInfo: js.UndefOr[scala.Nothing], executionOptions: String): js.Promise[Result[T]] = js.native
  def update(
    doc: StringDictionary[js.Any],
    docInfo: js.UndefOr[scala.Nothing],
    executionOptions: MappingExecutionOptions
  ): js.Promise[Result[T]] = js.native
  def update(doc: StringDictionary[js.Any], docInfo: UpdateDocInfo): js.Promise[Result[T]] = js.native
  def update(doc: StringDictionary[js.Any], docInfo: UpdateDocInfo, executionOptions: String): js.Promise[Result[T]] = js.native
  def update(doc: StringDictionary[js.Any], docInfo: UpdateDocInfo, executionOptions: MappingExecutionOptions): js.Promise[Result[T]] = js.native
}

