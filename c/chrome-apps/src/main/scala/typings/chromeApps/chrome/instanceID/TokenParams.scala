package typings.chromeApps.chrome.instanceID

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenParams extends js.Object {
  /**
    * Identifies the entity that is authorized to access resources associated with this Instance ID.
    * It can be a project ID from Google developer console.
    */
  var authorizedEntity: String
  /**
    * Allows including a small number of string key/value pairs that will
    * be associated with the token and may be used in processing the request.
    */
  var options: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Identifies authorized actions that the authorized entity can take.
    * E.g. for sending GCM messages, GCM scope should be used.
    */
  var scope: String
}

object TokenParams {
  @scala.inline
  def apply(authorizedEntity: String, scope: String, options: StringDictionary[String] = null): TokenParams = {
    val __obj = js.Dynamic.literal(authorizedEntity = authorizedEntity.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenParams]
  }
}

