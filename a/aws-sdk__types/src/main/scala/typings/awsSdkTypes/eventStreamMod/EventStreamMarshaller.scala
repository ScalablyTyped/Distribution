package typings.awsSdkTypes.eventStreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStreamMarshaller extends StObject {
  
  def deserialize(body: js.Any, deserializer: js.Function1[/* input */ StringDictionary[Message], js.Any]): AsyncIterable[js.Any]
  
  def serialize(input: AsyncIterable[js.Any], serializer: js.Function1[/* event */ js.Any, Message]): js.Any
}
object EventStreamMarshaller {
  
  @scala.inline
  def apply(
    deserialize: (js.Any, js.Function1[/* input */ StringDictionary[Message], js.Any]) => AsyncIterable[js.Any],
    serialize: (AsyncIterable[js.Any], js.Function1[/* event */ js.Any, Message]) => js.Any
  ): EventStreamMarshaller = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction2(deserialize), serialize = js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[EventStreamMarshaller]
  }
  
  @scala.inline
  implicit class EventStreamMarshallerMutableBuilder[Self <: EventStreamMarshaller] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeserialize(
      value: (js.Any, js.Function1[/* input */ StringDictionary[Message], js.Any]) => AsyncIterable[js.Any]
    ): Self = StObject.set(x, "deserialize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSerialize(value: (AsyncIterable[js.Any], js.Function1[/* event */ js.Any, Message]) => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction2(value))
  }
}
