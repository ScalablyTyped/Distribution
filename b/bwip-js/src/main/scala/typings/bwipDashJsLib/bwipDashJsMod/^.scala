package typings
package bwipDashJsLib.bwipDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bwip-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): scala.Unit = js.native
  def apply(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse, opts: ToBufferOptions): scala.Unit = js.native
  def loadFont(fontName: java.lang.String, sizeMulti: scala.Double, fontFile: java.lang.String): scala.Unit = js.native
  def toBuffer(
    opts: ToBufferOptions,
    callback: js.Function2[/* err */ java.lang.String | stdLib.Error, /* png */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
}

