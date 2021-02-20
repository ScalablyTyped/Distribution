package typings.consolidate

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DictotherOptions
    extends /* otherOptions */ StringDictionary[js.Any] {
    
    var cache: js.UndefOr[Boolean] = js.native
  }
  object DictotherOptions {
    
    @scala.inline
    def apply(): DictotherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictotherOptions]
    }
    
    @scala.inline
    implicit class DictotherOptionsMutableBuilder[Self <: DictotherOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
}
