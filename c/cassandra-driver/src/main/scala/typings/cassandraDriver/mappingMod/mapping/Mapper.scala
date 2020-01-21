package typings.cassandraDriver.mappingMod.mapping

import typings.cassandraDriver.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/mapping", "mapping.Mapper")
@js.native
class Mapper protected () extends js.Object {
  def this(client: Client) = this()
  def this(client: Client, options: MappingOptions) = this()
  def batch(items: js.Array[ModelBatchItem]): js.Promise[Result[_]] = js.native
  def batch(items: js.Array[ModelBatchItem], executionOptions: String): js.Promise[Result[_]] = js.native
  def batch(items: js.Array[ModelBatchItem], executionOptions: MappingExecutionOptions): js.Promise[Result[_]] = js.native
  def forModel[T](name: String): ModelMapper[T] = js.native
}

