package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeDefinition extends StObject {
  
  /**
    * <p>A name for the attribute.</p>
    */
  var AttributeName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The data type for the attribute, where:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>S</code> - the attribute is of type String</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>N</code> - the attribute is of type Number</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>B</code> - the attribute is of type Binary</p>
    *             </li>
    *          </ul>
    */
  var AttributeType: js.UndefOr[ScalarAttributeType | String] = js.undefined
}
object AttributeDefinition {
  
  inline def apply(): AttributeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeDefinition] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setAttributeType(value: ScalarAttributeType | String): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    inline def setAttributeTypeUndefined: Self = StObject.set(x, "AttributeType", js.undefined)
  }
}
