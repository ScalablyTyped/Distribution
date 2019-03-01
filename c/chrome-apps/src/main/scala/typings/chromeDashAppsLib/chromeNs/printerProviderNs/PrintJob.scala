package typings
package chromeDashAppsLib.chromeNs.printerProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintJob extends js.Object {
  /** The document content type. Supported formats are 'application/pdf' and 'image/pwg-raster'. */
  var contentType: java.lang.String
  /** Blob containing the document data to print. Format must match |contentType|. */
  var document: stdLib.Blob
  /** ID of the printer which should handle the job. */
  var printerId: java.lang.String
  /** Print ticket in  CJT format. */
  var ticket: js.Object
  /** The print job title. */
  var title: java.lang.String
}

object PrintJob {
  @scala.inline
  def apply(
    contentType: java.lang.String,
    document: stdLib.Blob,
    printerId: java.lang.String,
    ticket: js.Object,
    title: java.lang.String
  ): PrintJob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("document")(document)
    __obj.updateDynamic("printerId")(printerId)
    __obj.updateDynamic("ticket")(ticket)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PrintJob]
  }
}

