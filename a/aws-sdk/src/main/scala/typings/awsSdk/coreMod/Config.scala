package typings.awsSdk.coreMod

import typings.awsSdk.configMod.APIVersions
import typings.awsSdk.configServicePlaceholdersMod.ConfigurationServicePlaceholders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/core", "Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
class Config ()
  extends typings.awsSdk.configMod.Config {
  def this(options: typings.awsSdk.configBaseMod.ConfigurationOptions with ConfigurationServicePlaceholders with APIVersions) = this()
}
