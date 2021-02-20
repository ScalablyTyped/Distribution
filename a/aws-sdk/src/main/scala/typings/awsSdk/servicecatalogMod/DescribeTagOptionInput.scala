package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTagOptionInput extends StObject {
  
  /**
    * The TagOption identifier.
    */
  var Id: TagOptionId = js.native
}
object DescribeTagOptionInput {
  
  @scala.inline
  def apply(Id: TagOptionId): DescribeTagOptionInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagOptionInput]
  }
  
  @scala.inline
  implicit class DescribeTagOptionInputMutableBuilder[Self <: DescribeTagOptionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: TagOptionId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
