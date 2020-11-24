package typings.awsSdkTypes.eventStreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStreamMarshaller extends js.Object {
  
  def deserialize(body: js.Any, deserializer: js.Function1[/* input */ StringDictionary[Message], _]): AsyncIterable[_] = js.native
  
  def serialize(input: AsyncIterable[_], serializer: js.Function1[/* event */ js.Any, Message]): js.Any = js.native
}
object EventStreamMarshaller {
  
  @scala.inline
  def apply(
    deserialize: (js.Any, js.Function1[/* input */ StringDictionary[Message], _]) => AsyncIterable[_],
    serialize: (AsyncIterable[_], js.Function1[/* event */ js.Any, Message]) => js.Any
  ): EventStreamMarshaller = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction2(deserialize), serialize = js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[EventStreamMarshaller]
  }
  
  @scala.inline
  implicit class EventStreamMarshallerOps[Self <: EventStreamMarshaller] (val x: Self) extends AnyVal {
    
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
    def setDeserialize(value: (js.Any, js.Function1[/* input */ StringDictionary[Message], _]) => AsyncIterable[_]): Self = this.set("deserialize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSerialize(value: (AsyncIterable[_], js.Function1[/* event */ js.Any, Message]) => js.Any): Self = this.set("serialize", js.Any.fromFunction2(value))
  }
}
