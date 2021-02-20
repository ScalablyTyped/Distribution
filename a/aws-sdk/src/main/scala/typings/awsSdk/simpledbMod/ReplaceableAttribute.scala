package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceableAttribute extends StObject {
  
  /**
    * The name of the replaceable attribute.
    */
  var Name: String = js.native
  
  /**
    * A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value pair. The default setting is false.
    */
  var Replace: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of the replaceable attribute.
    */
  var Value: String = js.native
}
object ReplaceableAttribute {
  
  @scala.inline
  def apply(Name: String, Value: String): ReplaceableAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceableAttribute]
  }
  
  @scala.inline
  implicit class ReplaceableAttributeMutableBuilder[Self <: ReplaceableAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "Replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "Replace", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
