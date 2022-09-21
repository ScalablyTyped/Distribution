package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationLocaleMod {
  
  object default {
    
    @JSImport("baseui/pagination/locale", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/pagination/locale", "default.next")
    @js.native
    def next: String = js.native
    inline def next_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("next")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/pagination/locale", "default.preposition")
    @js.native
    def preposition: String = js.native
    inline def preposition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preposition")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/pagination/locale", "default.prev")
    @js.native
    def prev: String = js.native
    inline def prev_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prev")(x.asInstanceOf[js.Any])
  }
  
  trait PaginationLocale extends StObject {
    
    var next: String
    
    var preposition: String
    
    var prev: String
  }
  object PaginationLocale {
    
    inline def apply(next: String, preposition: String, prev: String): PaginationLocale = {
      val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], preposition = preposition.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationLocale]
    }
    
    extension [Self <: PaginationLocale](x: Self) {
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setPreposition(value: String): Self = StObject.set(x, "preposition", value.asInstanceOf[js.Any])
      
      inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    }
  }
}
