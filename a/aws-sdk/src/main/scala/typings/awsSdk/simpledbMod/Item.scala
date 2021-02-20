package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends StObject {
  
  /**
    * 
    */
  var AlternateNameEncoding: js.UndefOr[String] = js.native
  
  /**
    * A list of attributes.
    */
  var Attributes: AttributeList = js.native
  
  /**
    * The name of the item.
    */
  var Name: String = js.native
}
object Item {
  
  @scala.inline
  def apply(Attributes: AttributeList, Name: String): Item = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateNameEncoding(value: String): Self = StObject.set(x, "AlternateNameEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateNameEncodingUndefined: Self = StObject.set(x, "AlternateNameEncoding", js.undefined)
    
    @scala.inline
    def setAttributes(value: AttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
