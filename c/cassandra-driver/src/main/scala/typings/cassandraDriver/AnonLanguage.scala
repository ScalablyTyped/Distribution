package typings.cassandraDriver

import typings.cassandraDriver.typesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLanguage extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var readConsistency: js.UndefOr[consistencies] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var writeConsistency: js.UndefOr[consistencies] = js.undefined
}

object AnonLanguage {
  @scala.inline
  def apply(
    language: String = null,
    name: String = null,
    readConsistency: consistencies = null,
    source: String = null,
    writeConsistency: consistencies = null
  ): AnonLanguage = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (readConsistency != null) __obj.updateDynamic("readConsistency")(readConsistency.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (writeConsistency != null) __obj.updateDynamic("writeConsistency")(writeConsistency.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLanguage]
  }
}

