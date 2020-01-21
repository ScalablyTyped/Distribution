package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceActionInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * A map that defines the self-service action.
    */
  var Definition: js.UndefOr[ServiceActionDefinitionMap] = js.native
  /**
    * The self-service action description.
    */
  var Description: js.UndefOr[ServiceActionDescription] = js.native
  /**
    * The self-service action identifier.
    */
  var Id: typings.awsSdk.servicecatalogMod.Id = js.native
  /**
    * The self-service action name.
    */
  var Name: js.UndefOr[ServiceActionName] = js.native
}

object UpdateServiceActionInput {
  @scala.inline
  def apply(
    Id: Id,
    AcceptLanguage: AcceptLanguage = null,
    Definition: ServiceActionDefinitionMap = null,
    Description: ServiceActionDescription = null,
    Name: ServiceActionName = null
  ): UpdateServiceActionInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (Definition != null) __obj.updateDynamic("Definition")(Definition.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceActionInput]
  }
}

