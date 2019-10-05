package typings.cassandraDashDriver.cassandraDashDriverMod.mapping

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mapper extends js.Object {
  def batch(items: js.Array[ModelBatchItem]): js.Promise[Result] = js.native
  def batch(items: js.Array[ModelBatchItem], executionOptions: String): js.Promise[Result] = js.native
  def batch(items: js.Array[ModelBatchItem], executionOptions: MappingExecutionOptions): js.Promise[Result] = js.native
  def forModel(name: String): ModelMapper = js.native
}

@JSImport("cassandra-driver", "mapping.Mapper")
@js.native
object Mapper extends TopLevel[MapperStatic]

