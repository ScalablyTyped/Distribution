package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoXmlSummaryMetadata extends js.Object {
  /** The bounds of all the shapes and layers in the XML document. */
  var bounds: js.UndefOr[LocationRect] = js.native
  /** The description of the content of the XML document. */
  var description: js.UndefOr[String] = js.native
  /** Any additional metadata that the XML document may have. i.e. atom:author */
  var metadata: js.UndefOr[IDictionary[_]] = js.native
  /** The title or name of the content of the XML document. */
  var title: js.UndefOr[String] = js.native
}

object IGeoXmlSummaryMetadata {
  @scala.inline
  def apply(): IGeoXmlSummaryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlSummaryMetadata]
  }
  @scala.inline
  implicit class IGeoXmlSummaryMetadataOps[Self <: IGeoXmlSummaryMetadata] (val x: Self) extends AnyVal {
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
    def setBounds(value: LocationRect): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setMetadata(value: IDictionary[_]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

