package typings.cassandraDriver.policiesMod.policies.timestampGeneration

import typings.cassandraDriver.mod.Client
import typings.cassandraDriver.typesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimestampGenerator extends js.Object {
  
  def next(client: Client): Long | Double = js.native
}
object TimestampGenerator {
  
  @scala.inline
  def apply(next: Client => Long | Double): TimestampGenerator = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[TimestampGenerator]
  }
  
  @scala.inline
  implicit class TimestampGeneratorOps[Self <: TimestampGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNext(value: Client => Long | Double): Self = this.set("next", js.Any.fromFunction1(value))
  }
}
