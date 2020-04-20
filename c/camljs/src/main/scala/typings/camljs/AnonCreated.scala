package typings.camljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreated extends js.Object {
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

object AnonCreated {
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
  ): AnonCreated = {
    val __obj = js.Dynamic.literal(Created = Created.asInstanceOf[js.Any], DefaultViewUrl = DefaultViewUrl.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], EnableSyndication = EnableSyndication.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], LinkTitle = LinkTitle.asInstanceOf[js.Any], MajorVersionLimit = MajorVersionLimit.asInstanceOf[js.Any], MajorWithMinorVersionsLimit = MajorWithMinorVersionsLimit.asInstanceOf[js.Any], RelativeFolderPath = RelativeFolderPath.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], ViewSelector = ViewSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreated]
  }
}

