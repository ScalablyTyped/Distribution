package typings.byline.bylineMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.Anon_End
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineStreamCreatable
  extends Transform
     with Instantiable0[LineStream]
     with Instantiable1[/* options */ LineStreamOptions, LineStream] {
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}

