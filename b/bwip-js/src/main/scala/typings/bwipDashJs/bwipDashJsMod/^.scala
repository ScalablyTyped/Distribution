package typings.bwipDashJs.bwipDashJsMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bwip-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * The Browser version of the library's functionality, which makes use of an HTMLCanvasElement for rendering.
    * @param canvas ID string or HTML element of the canvas to render within
    * @param opts Options to use for rendering
    * @param callback Function to execute when rendering has completed or failed
    */
  def apply(
    canvas: String,
    opts: ToBufferOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[String | Error], 
      /* canvas */ js.UndefOr[HTMLCanvasElement], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    canvas: HTMLCanvasElement,
    opts: ToBufferOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[String | Error], 
      /* canvas */ js.UndefOr[HTMLCanvasElement], 
      Unit
    ]
  ): Unit = js.native
  def apply(req: IncomingMessage, res: ServerResponse): Unit = js.native
  def apply(req: IncomingMessage, res: ServerResponse, opts: ToBufferOptions): Unit = js.native
}

