package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletableAttribute extends StObject {
  
  /**
    * The name of the attribute.
    */
  var Name: String
  
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object DeletableAttribute {
  
  @scala.inline
  def apply(Name: String): DeletableAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletableAttribute]
  }
  
  @scala.inline
  implicit class DeletableAttributeMutableBuilder[Self <: DeletableAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
