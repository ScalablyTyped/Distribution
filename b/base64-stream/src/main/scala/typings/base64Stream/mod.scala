package typings.base64Stream

import typings.base64Stream.anon.TransformOptionslineLengt
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("base64-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Base64Decode () extends Transform
  
  @js.native
  class Base64Encode () extends Transform {
    def this(options: TransformOptionslineLengt) = this()
  }
  
}

