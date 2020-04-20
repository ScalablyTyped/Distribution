package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInfo extends js.Object {
  /**
  		 * The version of Azure that the instance is running on, if applicable.
  		 */
  var azureVersion: Double
  /**
  		 * The ID of the engine edition of the instance.
  		 */
  var engineEditionId: Double
  /**
  		 * Whether the instance is running in the cloud (Azure) or not.
  		 */
  var isCloud: Boolean
  /**
  		 * options for all new server properties.
  		 */
  var options: StringDictionary[js.Any]
  /**
  		 * The Operating System version string of the machine running the instance.
  		 */
  var osVersion: String
  /**
  		 * The edition of the instance.
  		 */
  var serverEdition: String
  /**
  		 * String describing the product level of the server.
  		 */
  var serverLevel: String
  /**
  		 * The major version of the instance.
  		 */
  var serverMajorVersion: Double
  /**
  		 * The minor version of the instance.
  		 */
  var serverMinorVersion: Double
  /**
  		 * The build of the instance.
  		 */
  var serverReleaseVersion: Double
  /**
  		 * String containing the full server version text.
  		 */
  var serverVersion: String
}

object ServerInfo {
  @scala.inline
  def apply(
    azureVersion: Double,
    engineEditionId: Double,
    isCloud: Boolean,
    options: StringDictionary[js.Any],
    osVersion: String,
    serverEdition: String,
    serverLevel: String,
    serverMajorVersion: Double,
    serverMinorVersion: Double,
    serverReleaseVersion: Double,
    serverVersion: String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(azureVersion = azureVersion.asInstanceOf[js.Any], engineEditionId = engineEditionId.asInstanceOf[js.Any], isCloud = isCloud.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], serverEdition = serverEdition.asInstanceOf[js.Any], serverLevel = serverLevel.asInstanceOf[js.Any], serverMajorVersion = serverMajorVersion.asInstanceOf[js.Any], serverMinorVersion = serverMinorVersion.asInstanceOf[js.Any], serverReleaseVersion = serverReleaseVersion.asInstanceOf[js.Any], serverVersion = serverVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
}

