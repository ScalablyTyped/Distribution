package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreIndexDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IndexDocument extends js.Object {
  /**
    * <p>A suffix that is appended to a request that is for a directory on the website endpoint (e.g. if the suffix is index.html and you make a request to samplebucket/images/ the data that is returned will be for the object with the key name images/index.html) The suffix must not be empty and must not include a slash character.</p>
    */
  var Suffix: String
}

object _IndexDocument {
  @scala.inline
  def apply(Suffix: String): _IndexDocument = {
    val __obj = js.Dynamic.literal(Suffix = Suffix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_IndexDocument]
  }
}

