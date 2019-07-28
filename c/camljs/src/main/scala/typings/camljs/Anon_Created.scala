package typings.camljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Created extends js.Object {
  var Created: String
  var DefaultViewUrl: String
  var Description: String
  var EnableSyndication: String
  var ItemCount: String
  var LinkTitle: String
  var MajorVersionLimit: String
  var MajorWithMinorVersionsLimit: String
  var RelativeFolderPath: String
  var Title: String
  var ViewSelector: String
}

object Anon_Created {
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
  ): Anon_Created = {
    val __obj = js.Dynamic.literal(Created = Created, DefaultViewUrl = DefaultViewUrl, Description = Description, EnableSyndication = EnableSyndication, ItemCount = ItemCount, LinkTitle = LinkTitle, MajorVersionLimit = MajorVersionLimit, MajorWithMinorVersionsLimit = MajorWithMinorVersionsLimit, RelativeFolderPath = RelativeFolderPath, Title = Title, ViewSelector = ViewSelector)
  
    __obj.asInstanceOf[Anon_Created]
  }
}

