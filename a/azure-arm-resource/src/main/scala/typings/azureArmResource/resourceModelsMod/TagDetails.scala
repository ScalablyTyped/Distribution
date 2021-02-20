package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagDetails extends StObject {
  
  /**
    * The total number of resources that use the resource tag. When a tag is initially created and
    * has no associated resources, the value is 0.
    */
  var count: js.UndefOr[TagCount] = js.native
  
  /**
    * The tag ID.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * The tag name.
    */
  var tagName: js.UndefOr[String] = js.native
  
  /**
    * The list of tag values.
    */
  var values: js.UndefOr[js.Array[TagValue]] = js.native
}
object TagDetails {
  
  @scala.inline
  def apply(): TagDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagDetails]
  }
  
  @scala.inline
  implicit class TagDetailsMutableBuilder[Self <: TagDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: TagCount): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[TagValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: TagValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
