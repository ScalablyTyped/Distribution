package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  /**
    * The name of the attribute. The name must contain between 1 and 128 characters and name may contain letters (uppercase and lowercase), numbers, hyphens, underscores, forward slashes, back slashes, or periods.
    */
  var name: String
  
  /**
    * The ID of the target. You can specify the short form ID for a resource or the full Amazon Resource Name (ARN).
    */
  var targetId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the target with which to attach the attribute. This parameter is required if you use the short form ID for a resource instead of the full ARN.
    */
  var targetType: js.UndefOr[TargetType] = js.undefined
  
  /**
    * The value of the attribute. The value must contain between 1 and 128 characters and may contain letters (uppercase and lowercase), numbers, hyphens, underscores, periods, at signs (@), forward slashes, back slashes, colons, or spaces. The value cannot contain any leading or trailing whitespace.
    */
  var value: js.UndefOr[String] = js.undefined
}
object Attribute {
  
  @scala.inline
  def apply(name: String): Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    @scala.inline
    def setTargetType(value: TargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
