package typings.camljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlogCategoryTitle extends js.Object {
  var BlogCategoryTitle: String
  var BlogPostTitle: String
  var Description: String
  var RecycleBinEnabled: String
  var SiteOwnerName: String
  var SiteUrl: String
  var Title: String
  var Url: String
}

object Anon_BlogCategoryTitle {
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
  ): Anon_BlogCategoryTitle = {
    val __obj = js.Dynamic.literal(BlogCategoryTitle = BlogCategoryTitle, BlogPostTitle = BlogPostTitle, Description = Description, RecycleBinEnabled = RecycleBinEnabled, SiteOwnerName = SiteOwnerName, SiteUrl = SiteUrl, Title = Title, Url = Url)
  
    __obj.asInstanceOf[Anon_BlogCategoryTitle]
  }
}

