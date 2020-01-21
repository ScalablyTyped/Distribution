package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockPublicAccessConfigurationMetadata extends js.Object {
  /**
    * The Amazon Resource Name that created or last modified the configuration.
    */
  var CreatedByArn: ArnType = js.native
  /**
    * The date and time that the configuration was created.
    */
  var CreationDateTime: Date = js.native
}

object BlockPublicAccessConfigurationMetadata {
  @scala.inline
  def apply(CreatedByArn: ArnType, CreationDateTime: Date): BlockPublicAccessConfigurationMetadata = {
    val __obj = js.Dynamic.literal(CreatedByArn = CreatedByArn.asInstanceOf[js.Any], CreationDateTime = CreationDateTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlockPublicAccessConfigurationMetadata]
  }
}

