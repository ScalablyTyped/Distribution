package typings.chromeDashApps.chromeNs.instanceIDNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTokenParams extends js.Object {
  /**
    * The authorized entity that is used to obtain the token.
    */
  var authorizedEntity: String
  /**
    * The scope that is used to obtain the token.
    */
  var scope: String
}

object DeleteTokenParams {
  @scala.inline
  def apply(authorizedEntity: String, scope: String): DeleteTokenParams = {
    val __obj = js.Dynamic.literal(authorizedEntity = authorizedEntity, scope = scope)
  
    __obj.asInstanceOf[DeleteTokenParams]
  }
}

