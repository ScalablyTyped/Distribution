package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinLength extends StObject {
  
  var maxLength: Double
  
  var messageTemplate: js.UndefOr[String] = js.undefined
  
  var minLength: Double
}
object MinLength {
  
  @scala.inline
  def apply(maxLength: Double, minLength: Double): MinLength = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinLength]
  }
  
  @scala.inline
  implicit class MinLengthMutableBuilder[Self <: MinLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTemplateUndefined: Self = StObject.set(x, "messageTemplate", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
  }
}
