package typings.cassandraDriver.policiesMod.policies.timestampGeneration

import typings.cassandraDriver.mod.Client
import typings.cassandraDriver.typesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimestampGenerator extends js.Object {
  def next(client: Client): Long | Double
}

object TimestampGenerator {
  @scala.inline
  def apply(next: Client => Long | Double): TimestampGenerator = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
  
    __obj.asInstanceOf[TimestampGenerator]
  }
}

