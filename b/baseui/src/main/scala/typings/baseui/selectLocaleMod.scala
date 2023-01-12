package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectLocaleMod {
  
  object default {
    
    @JSImport("baseui/select/locale", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/select/locale", "default.create")
    @js.native
    def create: String = js.native
    inline def create_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/select/locale", "default.noResultsMsg")
    @js.native
    def noResultsMsg: String = js.native
    inline def noResultsMsg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noResultsMsg")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/select/locale", "default.placeholder")
    @js.native
    def placeholder: String = js.native
    inline def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
  }
  
  trait SelectLocale extends StObject {
    
    var create: String
    
    var noResultsMsg: String
    
    var placeholder: String
  }
  object SelectLocale {
    
    inline def apply(create: String, noResultsMsg: String, placeholder: String): SelectLocale = {
      val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], noResultsMsg = noResultsMsg.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectLocale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectLocale] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: String): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setNoResultsMsg(value: String): Self = StObject.set(x, "noResultsMsg", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
}
