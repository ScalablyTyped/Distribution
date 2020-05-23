package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationMetadataEventData extends EventData {
  var metadata: ApplicationMetadata
}

object ApplicationMetadataEventData {
  @scala.inline
  def apply(metadata: ApplicationMetadata, `type`: String): ApplicationMetadataEventData = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMetadataEventData]
  }
}

