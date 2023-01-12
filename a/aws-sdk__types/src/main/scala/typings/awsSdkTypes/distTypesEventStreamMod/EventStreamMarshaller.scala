package typings.awsSdkTypes.distTypesEventStreamMod

import typings.std.AsyncIterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStreamMarshaller[StreamType] extends StObject {
  
  def deserialize[T](body: StreamType, deserializer: js.Function1[/* input */ Record[String, Message], js.Promise[T]]): AsyncIterable[T]
  @JSName("deserialize")
  var deserialize_Original: EventStreamMarshallerDeserFn[StreamType]
  
  def serialize[T](input: AsyncIterable[T], serializer: js.Function1[/* event */ T, Message]): StreamType
  @JSName("serialize")
  var serialize_Original: EventStreamMarshallerSerFn[StreamType]
}
object EventStreamMarshaller {
  
  inline def apply[StreamType](
    deserialize: (StreamType, /* deserializer */ js.Function1[/* input */ Record[String, Message], js.Promise[Any]]) => AsyncIterable[Any],
    serialize: (/* input */ AsyncIterable[Any], /* serializer */ js.Function1[/* event */ Any, Message]) => StreamType
  ): EventStreamMarshaller[StreamType] = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction2(deserialize), serialize = js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[EventStreamMarshaller[StreamType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventStreamMarshaller[?], StreamType] (val x: Self & EventStreamMarshaller[StreamType]) extends AnyVal {
    
    inline def setDeserialize(
      value: (StreamType, /* deserializer */ js.Function1[/* input */ Record[String, Message], js.Promise[Any]]) => AsyncIterable[Any]
    ): Self = StObject.set(x, "deserialize", js.Any.fromFunction2(value))
    
    inline def setSerialize(
      value: (/* input */ AsyncIterable[Any], /* serializer */ js.Function1[/* event */ Any, Message]) => StreamType
    ): Self = StObject.set(x, "serialize", js.Any.fromFunction2(value))
  }
}
