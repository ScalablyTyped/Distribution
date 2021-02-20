package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectAttributesActivity extends StObject {
  
  /**
    * A list of the attributes to select from the message.
    */
  var attributes: AttributeNames = js.native
  
  /**
    * The name of the selectAttributes activity.
    */
  var name: ActivityName = js.native
  
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}
object SelectAttributesActivity {
  
  @scala.inline
  def apply(attributes: AttributeNames, name: ActivityName): SelectAttributesActivity = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectAttributesActivity]
  }
  
  @scala.inline
  implicit class SelectAttributesActivityMutableBuilder[Self <: SelectAttributesActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeNames): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: AttributeName*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ActivityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ActivityName): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
