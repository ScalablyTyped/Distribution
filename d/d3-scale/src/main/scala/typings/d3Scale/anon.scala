package typings.d3Scale

import typings.d3Scale.d3ScaleStrings.`implicit`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Name extends StObject {
    
    var name: `implicit` = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: `implicit`): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: `implicit`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToString extends StObject
  
  @js.native
  trait ValueOf extends StObject
}
