package typings
package chromeDashAppsLib.chromeNs.instanceIDNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTokenParams extends js.Object {
  /**
    * The authorized entity that is used to obtain the token.
    */
  var authorizedEntity: java.lang.String
  /**
    * The scope that is used to obtain the token.
    */
  var scope: java.lang.String
}

object DeleteTokenParams {
  @scala.inline
  def apply(authorizedEntity: java.lang.String, scope: java.lang.String): DeleteTokenParams = {
    val __obj = js.Dynamic.literal(authorizedEntity = authorizedEntity, scope = scope)
  
    __obj.asInstanceOf[DeleteTokenParams]
  }
}

