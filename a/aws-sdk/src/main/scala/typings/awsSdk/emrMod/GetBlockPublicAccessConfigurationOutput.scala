package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlockPublicAccessConfigurationOutput extends js.Object {
  /**
    * A configuration for Amazon EMR block public access. The configuration applies to all clusters created in your account for the current Region. The configuration specifies whether block public access is enabled. If block public access is enabled, security groups associated with the cluster cannot have rules that allow inbound traffic from 0.0.0.0/0 or ::/0 on a port, unless the port is specified as an exception using PermittedPublicSecurityGroupRuleRanges in the BlockPublicAccessConfiguration. By default, Port 22 (SSH) is an exception, and public access is allowed on this port. You can change this by updating the block public access configuration to remove the exception.
    */
  var BlockPublicAccessConfiguration: typings.awsSdk.emrMod.BlockPublicAccessConfiguration = js.native
  /**
    * Properties that describe the AWS principal that created the BlockPublicAccessConfiguration using the PutBlockPublicAccessConfiguration action as well as the date and time that the configuration was created. Each time a configuration for block public access is updated, Amazon EMR updates this metadata.
    */
  var BlockPublicAccessConfigurationMetadata: typings.awsSdk.emrMod.BlockPublicAccessConfigurationMetadata = js.native
}

object GetBlockPublicAccessConfigurationOutput {
  @scala.inline
  def apply(
    BlockPublicAccessConfiguration: BlockPublicAccessConfiguration,
    BlockPublicAccessConfigurationMetadata: BlockPublicAccessConfigurationMetadata
  ): GetBlockPublicAccessConfigurationOutput = {
    val __obj = js.Dynamic.literal(BlockPublicAccessConfiguration = BlockPublicAccessConfiguration.asInstanceOf[js.Any], BlockPublicAccessConfigurationMetadata = BlockPublicAccessConfigurationMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlockPublicAccessConfigurationOutput]
  }
}

