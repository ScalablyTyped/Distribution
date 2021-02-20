package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddAttributesActivity extends StObject {
  
  /**
    * A list of 1-50 AttributeNameMapping objects that map an existing attribute to a new attribute.  The existing attributes remain in the message, so if you want to remove the originals, use RemoveAttributeActivity. 
    */
  var attributes: AttributeNameMapping = js.native
  
  /**
    * The name of the addAttributes activity.
    */
  var name: ActivityName = js.native
  
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}
object AddAttributesActivity {
  
  @scala.inline
  def apply(attributes: AttributeNameMapping, name: ActivityName): AddAttributesActivity = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAttributesActivity]
  }
  
  @scala.inline
  implicit class AddAttributesActivityMutableBuilder[Self <: AddAttributesActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeNameMapping): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ActivityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ActivityName): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
