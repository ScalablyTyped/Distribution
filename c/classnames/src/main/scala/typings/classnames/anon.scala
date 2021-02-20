package typings.classnames

import typings.classnames.bindMod.ClassNamesBind
import typings.classnames.typesMod.ClassNamesFn
import typings.classnames.typesMod.ClassValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Default extends StObject {
    
    var default: ClassNamesBind = js.native
  }
  object Default {
    
    @scala.inline
    def apply(default: ClassNamesBind): Default = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: ClassNamesBind): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefaultClassNamesFn extends StObject {
    
    def default(classes: ClassValue*): String = js.native
    @JSName("default")
    var default_Original: ClassNamesFn = js.native
  }
}
