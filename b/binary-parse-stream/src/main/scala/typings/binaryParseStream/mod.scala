package typings.binaryParseStream

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("binary-parse-stream", JSImport.Namespace)
  @js.native
  class ^ () extends Transform {
    def this(options: TransformOptions) = this()
  }
  
  @JSImport("binary-parse-stream", "One")
  @js.native
  val One: Double = js.native
  
  /* static member */
  @JSImport("binary-parse-stream", "extend")
  @js.native
  def extend(parser: BinaryParseStream): BinaryParseStream = js.native
  
  type BinaryParseStream = Transform
}
