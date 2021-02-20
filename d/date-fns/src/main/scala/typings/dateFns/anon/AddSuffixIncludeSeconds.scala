package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSuffixIncludeSeconds extends StObject {
  
  var addSuffix: js.UndefOr[Boolean] = js.native
  
  var includeSeconds: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[typings.dateFns.Locale] = js.native
}
object AddSuffixIncludeSeconds {
  
  @scala.inline
  def apply(): AddSuffixIncludeSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSuffixIncludeSeconds]
  }
  
  @scala.inline
  implicit class AddSuffixIncludeSecondsMutableBuilder[Self <: AddSuffixIncludeSeconds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSuffix(value: Boolean): Self = StObject.set(x, "addSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSuffixUndefined: Self = StObject.set(x, "addSuffix", js.undefined)
    
    @scala.inline
    def setIncludeSeconds(value: Boolean): Self = StObject.set(x, "includeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSecondsUndefined: Self = StObject.set(x, "includeSeconds", js.undefined)
    
    @scala.inline
    def setLocale(value: typings.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
