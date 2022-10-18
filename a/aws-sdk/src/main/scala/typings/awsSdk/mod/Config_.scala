package typings.awsSdk.mod

import typings.awsSdk.libConfigMod.APIVersions
import typings.awsSdk.libConfigServicePlaceholdersMod.ConfigurationServicePlaceholders
import typings.awsSdk.libCoreMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk", "Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
open class Config_ () extends Config {
  def this(options: typings.awsSdk.libConfigBaseMod.ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions) = this()
}
