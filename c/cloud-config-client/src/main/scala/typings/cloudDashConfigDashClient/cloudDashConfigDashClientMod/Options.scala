package typings.cloudDashConfigDashClient.cloudDashConfigDashClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var agent: js.UndefOr[Agent | typings.node.httpsMod.Agent] = js.undefined
  /** @deprecated use name */
  var application: js.UndefOr[String] = js.undefined
  var auth: js.UndefOr[Auth] = js.undefined
  var context: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var name: String
  var profiles: js.UndefOr[String | js.Array[String]] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    name: String,
    agent: Agent | typings.node.httpsMod.Agent = null,
    application: String = null,
    auth: Auth = null,
    context: StringDictionary[js.Any] = null,
    endpoint: String = null,
    label: String = null,
    profiles: String | js.Array[String] = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(name = name)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (application != null) __obj.updateDynamic("application")(application)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (context != null) __obj.updateDynamic("context")(context)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (label != null) __obj.updateDynamic("label")(label)
    if (profiles != null) __obj.updateDynamic("profiles")(profiles.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    __obj.asInstanceOf[Options]
  }
}

