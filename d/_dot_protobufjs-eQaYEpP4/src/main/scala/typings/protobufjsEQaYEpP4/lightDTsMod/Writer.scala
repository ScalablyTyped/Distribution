package typings.protobufjsEQaYEpP4.lightDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".protobufjs-eQaYEpP4/light.d.ts", "Writer")
@js.native
/** Constructs a new writer instance. */
open class Writer ()
  extends typings.protobufjsEQaYEpP4.mod.Writer
/* static members */
object Writer {
  
  @JSImport(".protobufjs-eQaYEpP4/light.d.ts", "Writer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  inline def alloc(size: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * Creates a new writer.
    * @returns A {@link BufferWriter} when Buffers are supported, otherwise a {@link Writer}
    */
  inline def create(): typings.protobufjsEQaYEpP4.mod.BufferWriter | typings.protobufjsEQaYEpP4.mod.Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.protobufjsEQaYEpP4.mod.BufferWriter | typings.protobufjsEQaYEpP4.mod.Writer]
}
