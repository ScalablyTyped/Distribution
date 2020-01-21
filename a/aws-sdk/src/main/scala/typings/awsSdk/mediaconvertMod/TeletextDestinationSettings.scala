package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeletextDestinationSettings extends js.Object {
  /**
    * Set pageNumber to the Teletext page number for the destination captions for this output. This value must be a three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the entire set of Teletext data, do not use this field.
    */
  var PageNumber: js.UndefOr[stringMin3Max3Pattern1809aFAF09aEAE] = js.native
  /**
    * Specify the page types for this Teletext page. If you don't specify a value here, the service sets the page type to the default value Subtitle (PAGE_TYPE_SUBTITLE). If you pass through the entire set of Teletext data, don't use this field. When you pass through a set of Teletext pages, your output has the same page types as your input.
    */
  var PageTypes: js.UndefOr[listOfTeletextPageType] = js.native
}

object TeletextDestinationSettings {
  @scala.inline
  def apply(PageNumber: stringMin3Max3Pattern1809aFAF09aEAE = null, PageTypes: listOfTeletextPageType = null): TeletextDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (PageNumber != null) __obj.updateDynamic("PageNumber")(PageNumber.asInstanceOf[js.Any])
    if (PageTypes != null) __obj.updateDynamic("PageTypes")(PageTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeletextDestinationSettings]
  }
}

