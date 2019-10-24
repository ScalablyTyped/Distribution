package typings.cypress.cypressMod

import typings.cypress.cypressNumbers.`false`
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options available for `cypress.open` and `cypress.run`
  */
trait CypressCommonOptions extends js.Object {
  /**
    * Specify configuration
    */
  var config: Partial[CypressConfiguration]
  /**
    * Path to the config file to be used.
    *
    * If `false` is passed, no config file will be used.
    *
    * @default "cypress.json"
    */
  var configFile: String | `false`
  /**
    * Specify environment variables
    */
  var env: js.Object
  /**
    * Path to a specific project
    */
  var project: String
}

object CypressCommonOptions {
  @scala.inline
  def apply(
    config: Partial[CypressConfiguration],
    configFile: String | `false`,
    env: js.Object,
    project: String
  ): CypressCommonOptions = {
    val __obj = js.Dynamic.literal(config = config, configFile = configFile.asInstanceOf[js.Any], env = env, project = project)
  
    __obj.asInstanceOf[CypressCommonOptions]
  }
}

