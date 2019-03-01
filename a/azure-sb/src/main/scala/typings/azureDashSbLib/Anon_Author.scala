package typings
package azureDashSbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Author extends js.Object {
  var ContentRootElement: java.lang.String
  var author: js.UndefOr[Anon_Name] = js.undefined
  var id: java.lang.String
  var link: java.lang.String
  var published: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.DateString
  var title: java.lang.String
  var updated: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.DateString
}

object Anon_Author {
  @scala.inline
  def apply(
    ContentRootElement: java.lang.String,
    id: java.lang.String,
    link: java.lang.String,
    published: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.DateString,
    title: java.lang.String,
    updated: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.DateString,
    author: Anon_Name = null
  ): Anon_Author = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContentRootElement")(ContentRootElement)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("published")(published)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("updated")(updated)
    if (author != null) __obj.updateDynamic("author")(author)
    __obj.asInstanceOf[Anon_Author]
  }
}

