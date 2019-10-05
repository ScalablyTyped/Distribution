package typings.cassandraDashDriver.cassandraDashDriverMod.policies.timestampGeneration

import typings.cassandraDashDriver.cassandraDashDriverMod.Client
import typings.long.longMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimestampGenerator extends js.Object {
  def next(client: Client): Null | Double | ^ 
}

object TimestampGenerator {
  @scala.inline
  def apply(next: Client => Null | Double | ^ ): TimestampGenerator = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
  
    __obj.asInstanceOf[TimestampGenerator]
  }
}

