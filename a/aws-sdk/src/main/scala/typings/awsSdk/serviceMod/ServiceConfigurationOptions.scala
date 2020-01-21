package typings.awsSdk.serviceMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.configMod.ConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceConfigurationOptions extends ConfigurationOptions {
  /**
    * The endpoint URI to send requests to. The default endpoint is built from the configured region. 
    * The endpoint should be a string like 'https://{service}.{region}.amazonaws.com'.
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * An optional map of parameters to bind to every request sent by this service object. 
    * For more information on bound parameters, see "Working with Services" in the Getting Started Guide.
    */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
}

