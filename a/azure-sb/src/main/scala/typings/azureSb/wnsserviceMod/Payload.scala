package typings.azureSb.wnsserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  text1  :string,   text2  :string,   text3  :string,   text4  :string,   image1src  :string,   image1alt  :string,   image2src  :string,   image2alt  :string,   image3src  :string,   image3alt  :string,   image4src  :string,   image4alt  :string,   lang  :string,   type  :string}> */
trait Payload extends js.Object {
  var image1alt: js.UndefOr[String] = js.undefined
  var image1src: js.UndefOr[String] = js.undefined
  var image2alt: js.UndefOr[String] = js.undefined
  var image2src: js.UndefOr[String] = js.undefined
  var image3alt: js.UndefOr[String] = js.undefined
  var image3src: js.UndefOr[String] = js.undefined
  var image4alt: js.UndefOr[String] = js.undefined
  var image4src: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var text1: js.UndefOr[String] = js.undefined
  var text2: js.UndefOr[String] = js.undefined
  var text3: js.UndefOr[String] = js.undefined
  var text4: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Payload {
  @scala.inline
  def apply(
    image1alt: String = null,
    image1src: String = null,
    image2alt: String = null,
    image2src: String = null,
    image3alt: String = null,
    image3src: String = null,
    image4alt: String = null,
    image4src: String = null,
    lang: String = null,
    text1: String = null,
    text2: String = null,
    text3: String = null,
    text4: String = null,
    `type`: String = null
  ): Payload = {
    val __obj = js.Dynamic.literal()
    if (image1alt != null) __obj.updateDynamic("image1alt")(image1alt.asInstanceOf[js.Any])
    if (image1src != null) __obj.updateDynamic("image1src")(image1src.asInstanceOf[js.Any])
    if (image2alt != null) __obj.updateDynamic("image2alt")(image2alt.asInstanceOf[js.Any])
    if (image2src != null) __obj.updateDynamic("image2src")(image2src.asInstanceOf[js.Any])
    if (image3alt != null) __obj.updateDynamic("image3alt")(image3alt.asInstanceOf[js.Any])
    if (image3src != null) __obj.updateDynamic("image3src")(image3src.asInstanceOf[js.Any])
    if (image4alt != null) __obj.updateDynamic("image4alt")(image4alt.asInstanceOf[js.Any])
    if (image4src != null) __obj.updateDynamic("image4src")(image4src.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (text1 != null) __obj.updateDynamic("text1")(text1.asInstanceOf[js.Any])
    if (text2 != null) __obj.updateDynamic("text2")(text2.asInstanceOf[js.Any])
    if (text3 != null) __obj.updateDynamic("text3")(text3.asInstanceOf[js.Any])
    if (text4 != null) __obj.updateDynamic("text4")(text4.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
}

