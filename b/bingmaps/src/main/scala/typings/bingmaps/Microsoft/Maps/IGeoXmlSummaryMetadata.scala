package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoXmlSummaryMetadata extends js.Object {
  /** The bounds of all the shapes and layers in the XML document. */
  var bounds: js.UndefOr[LocationRect] = js.undefined
  /** The description of the content of the XML document. */
  var description: js.UndefOr[String] = js.undefined
  /** Any additional metadata that the XML document may have. i.e. atom:author */
  var metadata: js.UndefOr[IDictionary[_]] = js.undefined
  /** The title or name of the content of the XML document. */
  var title: js.UndefOr[String] = js.undefined
}

object IGeoXmlSummaryMetadata {
  @scala.inline
  def apply(
    bounds: LocationRect = null,
    description: String = null,
    metadata: IDictionary[_] = null,
    title: String = null
  ): IGeoXmlSummaryMetadata = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (description != null) __obj.updateDynamic("description")(description)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IGeoXmlSummaryMetadata]
  }
}

