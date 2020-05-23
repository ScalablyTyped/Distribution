package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.facebook
import typings.cathoQuantum.cathoQuantumStrings.twitter
import typings.cathoQuantum.cathoQuantumStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: js.UndefOr[facebook | twitter | youtube] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: facebook | twitter | youtube = null, title: String = null, url: String = null): Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

