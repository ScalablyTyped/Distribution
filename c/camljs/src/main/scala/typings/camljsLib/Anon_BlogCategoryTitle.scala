package typings
package camljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlogCategoryTitle extends js.Object {
  var BlogCategoryTitle: java.lang.String
  var BlogPostTitle: java.lang.String
  var Description: java.lang.String
  var RecycleBinEnabled: java.lang.String
  var SiteOwnerName: java.lang.String
  var SiteUrl: java.lang.String
  var Title: java.lang.String
  var Url: java.lang.String
}

object Anon_BlogCategoryTitle {
  @scala.inline
  def apply(
    BlogCategoryTitle: java.lang.String,
    BlogPostTitle: java.lang.String,
    Description: java.lang.String,
    RecycleBinEnabled: java.lang.String,
    SiteOwnerName: java.lang.String,
    SiteUrl: java.lang.String,
    Title: java.lang.String,
    Url: java.lang.String
  ): Anon_BlogCategoryTitle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BlogCategoryTitle")(BlogCategoryTitle)
    __obj.updateDynamic("BlogPostTitle")(BlogPostTitle)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("RecycleBinEnabled")(RecycleBinEnabled)
    __obj.updateDynamic("SiteOwnerName")(SiteOwnerName)
    __obj.updateDynamic("SiteUrl")(SiteUrl)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[Anon_BlogCategoryTitle]
  }
}

