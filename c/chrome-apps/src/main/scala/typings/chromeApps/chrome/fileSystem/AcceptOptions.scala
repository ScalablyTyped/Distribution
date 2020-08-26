package typings.chromeApps.chrome.fileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptOptions extends js.Object {
  /**
    * This is the optional text description for this option.
    * If not present, a description will be automatically generated;
    * typically containing an expanded list of valid extensions (e.g. 'text/html' may expand to '*.html, *.htm').
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Extensions to accept, e.g. 'jpg', 'gif', 'crx'.
    */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Mime-types to accept, e.g. 'image/jpeg' or 'audio/ *'. One of mimeTypess must contain at least one valid element.
    */
  var mimeTypes: js.UndefOr[js.Array[String]] = js.native
}

object AcceptOptions {
  @scala.inline
  def apply(): AcceptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptOptions]
  }
  @scala.inline
  implicit class AcceptOptionsOps[Self <: AcceptOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setMimeTypesVarargs(value: String*): Self = this.set("mimeTypes", js.Array(value :_*))
    @scala.inline
    def setMimeTypes(value: js.Array[String]): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeTypes: Self = this.set("mimeTypes", js.undefined)
  }
  
}

