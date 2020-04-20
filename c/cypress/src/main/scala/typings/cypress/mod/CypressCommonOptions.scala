package typings.cypress.mod

import typings.cypress.PartialCypressConfigurati
import typings.cypress.cypressBooleans.`false`
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
  var config: PartialCypressConfigurati
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
  def apply(config: PartialCypressConfigurati, configFile: String | `false`, env: js.Object, project: String): CypressCommonOptions = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressCommonOptions]
  }
}

