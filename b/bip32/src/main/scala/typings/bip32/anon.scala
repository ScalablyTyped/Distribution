package typings.bip32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Private extends StObject {
    
    var `private`: Double = js.native
    
    var public: Double = js.native
  }
  object Private {
    
    @scala.inline
    def apply(`private`: Double, public: Double): Private = {
      val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Private]
    }
    
    @scala.inline
    implicit class PrivateMutableBuilder[Self <: Private] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivate(value: Double): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: Double): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
}
