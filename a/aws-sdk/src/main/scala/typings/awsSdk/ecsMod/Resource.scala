package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * When the doubleValue type is set, the value of the resource must be a double precision floating-point type.
    */
  var doubleValue: js.UndefOr[Double] = js.undefined
  
  /**
    * When the integerValue type is set, the value of the resource must be an integer.
    */
  var integerValue: js.UndefOr[Integer] = js.undefined
  
  /**
    * When the longValue type is set, the value of the resource must be an extended precision floating-point type.
    */
  var longValue: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the resource, such as CPU, MEMORY, PORTS, PORTS_UDP, or a user-defined resource.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * When the stringSetValue type is set, the value of the resource must be a string type.
    */
  var stringSetValue: js.UndefOr[StringList] = js.undefined
  
  /**
    * The type of the resource, such as INTEGER, DOUBLE, LONG, or STRINGSET.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object Resource {
  
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: Integer): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    @scala.inline
    def setLongValue(value: Long): Self = StObject.set(x, "longValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongValueUndefined: Self = StObject.set(x, "longValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStringSetValue(value: StringList): Self = StObject.set(x, "stringSetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringSetValueUndefined: Self = StObject.set(x, "stringSetValue", js.undefined)
    
    @scala.inline
    def setStringSetValueVarargs(value: String*): Self = StObject.set(x, "stringSetValue", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
