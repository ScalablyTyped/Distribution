package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddAttributesActivity extends StObject {
  
  /**
    * A list of 1-50 AttributeNameMapping objects that map an existing attribute to a new attribute.  The existing attributes remain in the message, so if you want to remove the originals, use RemoveAttributeActivity. 
    */
  var attributes: AttributeNameMapping
  
  /**
    * The name of the addAttributes activity.
    */
  var name: ActivityName
  
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
}
object AddAttributesActivity {
  
  inline def apply(attributes: AttributeNameMapping, name: ActivityName): AddAttributesActivity = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAttributesActivity]
  }
  
  extension [Self <: AddAttributesActivity](x: Self) {
    
    inline def setAttributes(value: AttributeNameMapping): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: ActivityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNext(value: ActivityName): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
