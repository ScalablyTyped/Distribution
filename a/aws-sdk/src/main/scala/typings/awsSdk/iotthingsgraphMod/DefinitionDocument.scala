package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinitionDocument extends js.Object {
  /**
    * The language used to define the entity. GRAPHQL is the only valid value.
    */
  var language: DefinitionLanguage = js.native
  /**
    * The GraphQL text that defines the entity.
    */
  var text: DefinitionText = js.native
}

object DefinitionDocument {
  @scala.inline
  def apply(language: DefinitionLanguage, text: DefinitionText): DefinitionDocument = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionDocument]
  }
}

