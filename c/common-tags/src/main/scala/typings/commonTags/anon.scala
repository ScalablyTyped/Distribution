package typings.commonTags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Conjunction extends StObject {
    
    var conjunction: js.UndefOr[String] = js.native
    
    var separator: js.UndefOr[String] = js.native
    
    var serial: js.UndefOr[Boolean] = js.native
  }
  object Conjunction {
    
    @scala.inline
    def apply(): Conjunction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Conjunction]
    }
    
    @scala.inline
    implicit class ConjunctionMutableBuilder[Self <: Conjunction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConjunction(value: String): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConjunctionUndefined: Self = StObject.set(x, "conjunction", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setSerial(value: Boolean): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
    }
  }
}
