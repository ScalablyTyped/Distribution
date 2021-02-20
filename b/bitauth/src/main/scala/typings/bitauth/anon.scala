package typings.bitauth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Created extends StObject {
    
    var created: Double = js.native
    
    var priv: String = js.native
    
    var pub: String = js.native
    
    var sin: String = js.native
  }
  object Created {
    
    @scala.inline
    def apply(created: Double, priv: String, pub: String, sin: String): Created = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], priv = priv.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any], sin = sin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Created]
    }
    
    @scala.inline
    implicit class CreatedMutableBuilder[Self <: Created] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriv(value: String): Self = StObject.set(x, "priv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPub(value: String): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSin(value: String): Self = StObject.set(x, "sin", value.asInstanceOf[js.Any])
    }
  }
}
