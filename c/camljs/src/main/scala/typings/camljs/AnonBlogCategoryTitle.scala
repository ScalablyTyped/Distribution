package typings.camljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlogCategoryTitle extends js.Object {
  var BlogCategoryTitle: String
  var BlogPostTitle: String
  var Description: String
  var RecycleBinEnabled: String
  var SiteOwnerName: String
  var SiteUrl: String
  var Title: String
  var Url: String
}

object AnonBlogCategoryTitle {
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
  ): AnonBlogCategoryTitle = {
    val __obj = js.Dynamic.literal(BlogCategoryTitle = BlogCategoryTitle.asInstanceOf[js.Any], BlogPostTitle = BlogPostTitle.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], RecycleBinEnabled = RecycleBinEnabled.asInstanceOf[js.Any], SiteOwnerName = SiteOwnerName.asInstanceOf[js.Any], SiteUrl = SiteUrl.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlogCategoryTitle]
  }
}

