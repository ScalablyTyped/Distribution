package typings.protobufjsEQaYEpP4.lightDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".protobufjs-eQaYEpP4/light.d.ts", "Reader")
@js.native
open class Reader protected ()
  extends typings.protobufjsEQaYEpP4.mod.Reader {
  /**
    * Constructs a new reader instance using the specified buffer.
    * @param buffer Buffer to read from
    */
  def this(buffer: js.typedarray.Uint8Array) = this()
}
/* static members */
object Reader {
  
  @JSImport(".protobufjs-eQaYEpP4/light.d.ts", "Reader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new reader using the specified buffer.
    * @param buffer Buffer to read from
    * @returns A {@link BufferReader} if `buffer` is a Buffer, otherwise a {@link Reader}
    * @throws {Error} If `buffer` is not a valid buffer
    */
  inline def create(buffer: js.typedarray.Uint8Array): typings.protobufjsEQaYEpP4.mod.Reader | typings.protobufjsEQaYEpP4.mod.BufferReader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjsEQaYEpP4.mod.Reader | typings.protobufjsEQaYEpP4.mod.BufferReader]
}
