package typings.awsSdkTypes.eventStreamMod

import typings.std.AsyncIterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type EventStreamMarshallerDeserFn[StreamType] = js.Function2[
/* body */ StreamType, 
/* deserializer */ js.Function1[/* input */ Record[String, Message], js.Promise[Any]], 
AsyncIterable[Any]]

type EventStreamMarshallerSerFn[StreamType] = js.Function2[
/* input */ AsyncIterable[Any], 
/* serializer */ js.Function1[/* event */ Any, Message], 
StreamType]

type EventStreamPayloadHandlerProvider = js.Function1[/* options */ Any, EventStreamPayloadHandler]

type EventStreamSerdeProvider = js.Function1[/* options */ Any, EventStreamMarshaller[Any]]

type EventStreamSignerProvider = js.Function1[/* options */ Any, EventStreamRequestSigner]

type MessageHeaders = Record[String, MessageHeaderValue]
