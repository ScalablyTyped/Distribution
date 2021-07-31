package typings.convertSourceMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Multiline extends StObject {
    
    var multiline: js.UndefOr[Boolean] = js.undefined
  }
  object Multiline {
    
    @scala.inline
    def apply(): Multiline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Multiline]
    }
    
    @scala.inline
    implicit class MultilineMutableBuilder[Self <: Multiline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    }
  }
}
