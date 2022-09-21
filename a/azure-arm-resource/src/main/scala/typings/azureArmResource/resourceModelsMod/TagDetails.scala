package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagDetails extends StObject {
  
  /**
    * The total number of resources that use the resource tag. When a tag is initially created and
    * has no associated resources, the value is 0.
    */
  var count: js.UndefOr[TagCount] = js.undefined
  
  /**
    * The tag ID.
    */
  val id: js.UndefOr[String] = js.undefined
  
  /**
    * The tag name.
    */
  var tagName: js.UndefOr[String] = js.undefined
  
  /**
    * The list of tag values.
    */
  var values: js.UndefOr[js.Array[TagValue]] = js.undefined
}
object TagDetails {
  
  inline def apply(): TagDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagDetails]
  }
  
  extension [Self <: TagDetails](x: Self) {
    
    inline def setCount(value: TagCount): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    inline def setValues(value: js.Array[TagValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: TagValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
