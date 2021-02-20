package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeygenHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var autofocus: js.UndefOr[Boolean | String] = js.native
  
  var challenge: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean | String] = js.native
  
  var form: js.UndefOr[String] = js.native
  
  var keyParams: js.UndefOr[String] = js.native
  
  var keyType: js.UndefOr[String] = js.native
  
  var keyparams: js.UndefOr[String] = js.native
  
  var keytype: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object KeygenHTMLAttributes {
  
  @scala.inline
  def apply[T](): KeygenHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeygenHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class KeygenHTMLAttributesMutableBuilder[Self <: KeygenHTMLAttributes[_], T] (val x: Self with KeygenHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean | String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
    
    @scala.inline
    def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
