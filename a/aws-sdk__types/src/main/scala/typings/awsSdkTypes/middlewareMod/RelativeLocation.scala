package typings.awsSdkTypes.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeLocation extends js.Object {
  
  /**
    * Specify the relation to be before or after a know middleware.
    */
  var relation: Relation = js.native
  
  /**
    * A known middleware name to indicate inserting middleware's location.
    */
  var toMiddleware: String = js.native
}
object RelativeLocation {
  
  @scala.inline
  def apply(relation: Relation, toMiddleware: String): RelativeLocation = {
    val __obj = js.Dynamic.literal(relation = relation.asInstanceOf[js.Any], toMiddleware = toMiddleware.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeLocation]
  }
  
  @scala.inline
  implicit class RelativeLocationOps[Self <: RelativeLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRelation(value: Relation): Self = this.set("relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToMiddleware(value: String): Self = this.set("toMiddleware", value.asInstanceOf[js.Any])
  }
}
