package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attribute extends StObject {
  
  /**
    * 
    */
  var AlternateNameEncoding: js.UndefOr[String] = js.native
  
  /**
    * 
    */
  var AlternateValueEncoding: js.UndefOr[String] = js.native
  
  /**
    * The name of the attribute.
    */
  var Name: String = js.native
  
  /**
    * The value of the attribute.
    */
  var Value: String = js.native
}
object Attribute {
  
  @scala.inline
  def apply(Name: String, Value: String): Attribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateNameEncoding(value: String): Self = StObject.set(x, "AlternateNameEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateNameEncodingUndefined: Self = StObject.set(x, "AlternateNameEncoding", js.undefined)
    
    @scala.inline
    def setAlternateValueEncoding(value: String): Self = StObject.set(x, "AlternateValueEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateValueEncodingUndefined: Self = StObject.set(x, "AlternateValueEncoding", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
