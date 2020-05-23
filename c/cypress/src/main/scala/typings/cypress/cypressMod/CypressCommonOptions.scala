package typings.cypress.cypressMod

import typings.cypress.anon.PartialResolvedConfigOpti
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
  var config: PartialResolvedConfigOpti
  /**
    * Path to the config file to be used.
    *
    * If `false` is passed, no config file will be used.
    *
    * @default "cypress.json"
    */
  var configFile: String | `false`
  /**
    * Specify environment variables.
    * TODO: isn't this duplicate of config.env?!
    */
  var env: js.Object
  /**
    * Path to a specific project
    */
  var project: String
}

object CypressCommonOptions {
  @scala.inline
  def apply(config: PartialResolvedConfigOpti, configFile: String | `false`, env: js.Object, project: String): CypressCommonOptions = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressCommonOptions]
  }
}

