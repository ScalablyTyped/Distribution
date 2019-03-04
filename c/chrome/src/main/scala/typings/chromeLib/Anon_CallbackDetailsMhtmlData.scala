package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackDetailsMhtmlData extends js.Object {
  def saveAsMHTML(
    details: chromeLib.chromeNs.pageCaptureNs.SaveDetails,
    callback: js.Function1[/* mhtmlData */ js.Any, scala.Unit]
  ): scala.Unit
}

object Anon_CallbackDetailsMhtmlData {
  @scala.inline
  def apply(
    saveAsMHTML: js.Function2[
      chromeLib.chromeNs.pageCaptureNs.SaveDetails, 
      js.Function1[/* mhtmlData */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): Anon_CallbackDetailsMhtmlData = {
    val __obj = js.Dynamic.literal(saveAsMHTML = saveAsMHTML)
  
    __obj.asInstanceOf[Anon_CallbackDetailsMhtmlData]
  }
}

