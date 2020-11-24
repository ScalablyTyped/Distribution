package typings.contentfulManagement.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.contentfulManagement.webhookMod.EqualityConstraint
  - typings.contentfulManagement.webhookMod.InConstraint
  - typings.contentfulManagement.webhookMod.RegexpConstraint
  - typings.contentfulManagement.webhookMod.NotConstraint
*/
trait WebhookFilter extends js.Object
object WebhookFilter {
  
  @scala.inline
  def EqualityConstraint(equals: js.Tuple2[Doc, String]): WebhookFilter = {
    val __obj = js.Dynamic.literal(equals = equals.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookFilter]
  }
  
  @scala.inline
  def InConstraint(in: js.Tuple2[Doc, Array[String]]): WebhookFilter = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookFilter]
  }
  
  @scala.inline
  def RegexpConstraint(regexp: js.Tuple2[Doc, Pattern]): WebhookFilter = {
    val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookFilter]
  }
  
  @scala.inline
  def NotConstraint(not: EqualityConstraint | InConstraint | RegexpConstraint): WebhookFilter = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookFilter]
  }
}
