package typings.camljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Created extends js.Object {
  var Created: String = js.native
  var DefaultViewUrl: String = js.native
  var Description: String = js.native
  var EnableSyndication: String = js.native
  var ItemCount: String = js.native
  var LinkTitle: String = js.native
  var MajorVersionLimit: String = js.native
  var MajorWithMinorVersionsLimit: String = js.native
  var RelativeFolderPath: String = js.native
  var Title: String = js.native
  var ViewSelector: String = js.native
}

object Created {
  @scala.inline
  def apply(
    Created: String,
    DefaultViewUrl: String,
    Description: String,
    EnableSyndication: String,
    ItemCount: String,
    LinkTitle: String,
    MajorVersionLimit: String,
    MajorWithMinorVersionsLimit: String,
    RelativeFolderPath: String,
    Title: String,
    ViewSelector: String
  ): Created = {
    val __obj = js.Dynamic.literal(Created = Created.asInstanceOf[js.Any], DefaultViewUrl = DefaultViewUrl.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], EnableSyndication = EnableSyndication.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], LinkTitle = LinkTitle.asInstanceOf[js.Any], MajorVersionLimit = MajorVersionLimit.asInstanceOf[js.Any], MajorWithMinorVersionsLimit = MajorWithMinorVersionsLimit.asInstanceOf[js.Any], RelativeFolderPath = RelativeFolderPath.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], ViewSelector = ViewSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  @scala.inline
  implicit class CreatedOps[Self <: Created] (val x: Self) extends AnyVal {
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
    def setCreated(value: String): Self = this.set("Created", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultViewUrl(value: String): Self = this.set("DefaultViewUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableSyndication(value: String): Self = this.set("EnableSyndication", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemCount(value: String): Self = this.set("ItemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkTitle(value: String): Self = this.set("LinkTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajorVersionLimit(value: String): Self = this.set("MajorVersionLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajorWithMinorVersionsLimit(value: String): Self = this.set("MajorWithMinorVersionsLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeFolderPath(value: String): Self = this.set("RelativeFolderPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewSelector(value: String): Self = this.set("ViewSelector", value.asInstanceOf[js.Any])
  }
  
}

