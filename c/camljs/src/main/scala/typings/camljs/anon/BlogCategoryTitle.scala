package typings.camljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlogCategoryTitle extends js.Object {
  var BlogCategoryTitle: String = js.native
  var BlogPostTitle: String = js.native
  var Description: String = js.native
  var RecycleBinEnabled: String = js.native
  var SiteOwnerName: String = js.native
  var SiteUrl: String = js.native
  var Title: String = js.native
  var Url: String = js.native
}

object BlogCategoryTitle {
  @scala.inline
  def apply(
    BlogCategoryTitle: String,
    BlogPostTitle: String,
    Description: String,
    RecycleBinEnabled: String,
    SiteOwnerName: String,
    SiteUrl: String,
    Title: String,
    Url: String
  ): BlogCategoryTitle = {
    val __obj = js.Dynamic.literal(BlogCategoryTitle = BlogCategoryTitle.asInstanceOf[js.Any], BlogPostTitle = BlogPostTitle.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], RecycleBinEnabled = RecycleBinEnabled.asInstanceOf[js.Any], SiteOwnerName = SiteOwnerName.asInstanceOf[js.Any], SiteUrl = SiteUrl.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlogCategoryTitle]
  }
  @scala.inline
  implicit class BlogCategoryTitleOps[Self <: BlogCategoryTitle] (val x: Self) extends AnyVal {
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
    def setBlogCategoryTitle(value: String): Self = this.set("BlogCategoryTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlogPostTitle(value: String): Self = this.set("BlogPostTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecycleBinEnabled(value: String): Self = this.set("RecycleBinEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setSiteOwnerName(value: String): Self = this.set("SiteOwnerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSiteUrl(value: String): Self = this.set("SiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
  }
  
}

