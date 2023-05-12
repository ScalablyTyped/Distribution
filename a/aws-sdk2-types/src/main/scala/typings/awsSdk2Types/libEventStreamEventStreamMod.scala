package typings.awsSdk2Types

import typings.awsSdk2Types.awsSdk2TypesStrings.data
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventStreamEventStreamMod {
  
  type EventStream[Events] = StreamingEventStream[Events] | js.Array[Events]
  
  @js.native
  trait StreamingEventStream[Events]
    extends StObject
       with ReadableStream {
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* event */ Events, Unit]): this.type = js.native
  }
}
