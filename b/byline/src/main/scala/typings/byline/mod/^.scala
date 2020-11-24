package typings.byline.mod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("byline", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): LineStream = js.native
  def apply(stream: ReadableStream): LineStream = js.native
  def apply(stream: ReadableStream, options: LineStreamOptions): LineStream = js.native
  
  var LineStream: LineStreamCreatable = js.native
}
