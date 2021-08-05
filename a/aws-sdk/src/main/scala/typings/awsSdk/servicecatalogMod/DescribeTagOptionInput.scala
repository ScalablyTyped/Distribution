package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagOptionInput extends StObject {
  
  /**
    * The TagOption identifier.
    */
  var Id: TagOptionId
}
object DescribeTagOptionInput {
  
  inline def apply(Id: TagOptionId): DescribeTagOptionInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagOptionInput]
  }
  
  extension [Self <: DescribeTagOptionInput](x: Self) {
    
    inline def setId(value: TagOptionId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
