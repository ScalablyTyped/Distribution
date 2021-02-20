package typings.bson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Relaxed extends StObject {
    
    var relaxed: js.UndefOr[Boolean] = js.native
  }
  object Relaxed {
    
    @scala.inline
    def apply(): Relaxed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Relaxed]
    }
    
    @scala.inline
    implicit class RelaxedMutableBuilder[Self <: Relaxed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRelaxed(value: Boolean): Self = StObject.set(x, "relaxed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelaxedUndefined: Self = StObject.set(x, "relaxed", js.undefined)
    }
  }
}
