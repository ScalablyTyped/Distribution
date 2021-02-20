package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeLocation extends StObject {
  
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
  implicit class RelativeLocationMutableBuilder[Self <: RelativeLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelation(value: Relation): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToMiddleware(value: String): Self = StObject.set(x, "toMiddleware", value.asInstanceOf[js.Any])
  }
}
