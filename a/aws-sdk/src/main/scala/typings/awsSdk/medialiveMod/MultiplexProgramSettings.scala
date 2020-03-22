package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexProgramSettings extends js.Object {
  /**
    * Indicates which pipeline is preferred by the multiplex for program ingest.
    */
  var PreferredChannelPipeline: js.UndefOr[typings.awsSdk.medialiveMod.PreferredChannelPipeline] = js.native
  /**
    * Unique program number.
    */
  var ProgramNumber: integerMin0Max65535 = js.native
  /**
    * Transport stream service descriptor configuration for the Multiplex program.
    */
  var ServiceDescriptor: js.UndefOr[MultiplexProgramServiceDescriptor] = js.native
  /**
    * Program video settings configuration.
    */
  var VideoSettings: js.UndefOr[MultiplexVideoSettings] = js.native
}

object MultiplexProgramSettings {
  @scala.inline
  def apply(
    ProgramNumber: integerMin0Max65535,
    PreferredChannelPipeline: PreferredChannelPipeline = null,
    ServiceDescriptor: MultiplexProgramServiceDescriptor = null,
    VideoSettings: MultiplexVideoSettings = null
  ): MultiplexProgramSettings = {
    val __obj = js.Dynamic.literal(ProgramNumber = ProgramNumber.asInstanceOf[js.Any])
    if (PreferredChannelPipeline != null) __obj.updateDynamic("PreferredChannelPipeline")(PreferredChannelPipeline.asInstanceOf[js.Any])
    if (ServiceDescriptor != null) __obj.updateDynamic("ServiceDescriptor")(ServiceDescriptor.asInstanceOf[js.Any])
    if (VideoSettings != null) __obj.updateDynamic("VideoSettings")(VideoSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexProgramSettings]
  }
}

