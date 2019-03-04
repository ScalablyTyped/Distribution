package typings
package chromeDashAppsLib.chromeNs.instanceIDNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenParams extends js.Object {
  /**
    * Identifies the entity that is authorized to access resources associated with this Instance ID.
    * It can be a project ID from Google developer console.
    */
  var authorizedEntity: java.lang.String
  /**
    * Allows including a small number of string key/value pairs that will
    * be associated with the token and may be used in processing the request.
    */
  var options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Identifies authorized actions that the authorized entity can take.
    * E.g. for sending GCM messages, GCM scope should be used.
    */
  var scope: java.lang.String
}

object TokenParams {
  @scala.inline
  def apply(
    authorizedEntity: java.lang.String,
    scope: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): TokenParams = {
    val __obj = js.Dynamic.literal(authorizedEntity = authorizedEntity, scope = scope)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[TokenParams]
  }
}

