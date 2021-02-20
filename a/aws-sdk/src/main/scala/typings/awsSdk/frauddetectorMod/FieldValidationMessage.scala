package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldValidationMessage extends StObject {
  
  /**
    * The message content.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * The field name.
    */
  var fieldName: js.UndefOr[String] = js.native
  
  /**
    * The message ID.
    */
  var identifier: js.UndefOr[String] = js.native
  
  /**
    * The message title.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The message type.
    */
  var `type`: js.UndefOr[String] = js.native
}
object FieldValidationMessage {
  
  @scala.inline
  def apply(): FieldValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldValidationMessage]
  }
  
  @scala.inline
  implicit class FieldValidationMessageMutableBuilder[Self <: FieldValidationMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
