package typings.atAwsDashSdkTypes.buildResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataBearer extends js.Object {
  /**
    * Metadata pertaining to this request.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
}

object MetadataBearer {
  @scala.inline
  def apply($metadata: ResponseMetadata): MetadataBearer = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetadataBearer]
  }
}

