package typings.cytoscape.cytoscapeMod

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreExport extends js.Object {
  /**
    * Export the current graph view as a JPG image in Base64 representation.
    */
  def jpeg(): String = js.native
  def jpeg(options: ExportJpgBlobOptions): Blob = js.native
  def jpeg(options: ExportJpgStringOptions): String = js.native
  @JSName("jpeg")
  def jpeg_Blob(): Blob = js.native
  /**
    * Export the current graph view as a JPG image in Base64 representation.
    */
  def jpg(): String = js.native
  def jpg(options: ExportJpgBlobOptions): Blob = js.native
  def jpg(options: ExportJpgStringOptions): String = js.native
  @JSName("jpg")
  def jpg_Blob(): Blob = js.native
  /**
    * Export the graph as JSON, the same format used at initialisation.
    */
  def json(): js.Object = js.native
  def json(json: js.Object): this.type = js.native
  /**
    * Export the current graph view as a PNG image in Base64 representation.
    */
  def png(): String = js.native
  def png(options: ExportBlobOptions): Blob = js.native
  def png(options: ExportStringOptions): String = js.native
  @JSName("png")
  def png_Blob(): Blob = js.native
}

