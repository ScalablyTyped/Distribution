package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteServiceActionInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The self-service action identifier. For example, act-fs7abcd89wxyz.
    */
  var Id: typings.awsSdk.servicecatalogMod.Id = js.native
}

object DeleteServiceActionInput {
  @scala.inline
  def apply(Id: Id, AcceptLanguage: AcceptLanguage = null): DeleteServiceActionInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceActionInput]
  }
}

