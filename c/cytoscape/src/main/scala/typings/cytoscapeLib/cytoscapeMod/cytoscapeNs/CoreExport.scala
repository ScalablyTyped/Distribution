package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreExport extends js.Object {
  def jpeg(): stdLib.Blob = js.native
  def jpeg(options: ExportJpgBlobOptions): stdLib.Blob = js.native
  def jpeg(options: ExportJpgStringOptions): java.lang.String = js.native
  /**
    * Export the current graph view as a JPG image in Base64 representation.
    */
  @JSName("jpeg")
  def jpeg_String(): java.lang.String = js.native
  def jpg(): stdLib.Blob = js.native
  def jpg(options: ExportJpgBlobOptions): stdLib.Blob = js.native
  def jpg(options: ExportJpgStringOptions): java.lang.String = js.native
  /**
    * Export the current graph view as a JPG image in Base64 representation.
    */
  @JSName("jpg")
  def jpg_String(): java.lang.String = js.native
  /**
    * Export the graph as JSON, the same format used at initialisation.
    */
  def json(): js.Object = js.native
  def json(json: js.Object): this.type = js.native
  def png(): stdLib.Blob = js.native
  def png(options: ExportBlobOptions): stdLib.Blob = js.native
  def png(options: ExportStringOptions): java.lang.String = js.native
  /**
    * Export the current graph view as a PNG image in Base64 representation.
    */
  @JSName("png")
  def png_String(): java.lang.String = js.native
}

