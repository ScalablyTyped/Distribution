package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSimpleEmailPartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SimpleEmailPart extends js.Object {
  /**
    * The character set of the content.
    */
  var Charset: js.UndefOr[String] = js.undefined
  /**
    * The textual data of the content.
    */
  var Data: js.UndefOr[String] = js.undefined
}

object _SimpleEmailPart {
  @scala.inline
  def apply(Charset: String = null, Data: String = null): _SimpleEmailPart = {
    val __obj = js.Dynamic.literal()
    if (Charset != null) __obj.updateDynamic("Charset")(Charset.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SimpleEmailPart]
  }
}

