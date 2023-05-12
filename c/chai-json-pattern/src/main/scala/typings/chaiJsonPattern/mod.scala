package typings.chaiJsonPattern

import org.scalablytyped.runtime.StringDictionary
import typings.chaiJsonPattern.mod.ChaiJsonPattern.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chai-json-pattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chai-json-pattern", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chai.ChaiPlugin */ Any = js.native
  
  inline def extend(plugin: Plugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object ChaiJsonPattern {
    
    type Plugin = StringDictionary[js.Function1[/* target */ Any, Unit]]
  }
  
  object global {
    
    object Chai {
      
      trait Assertion extends StObject {
        
        def matchPattern(expected: Any): Unit
      }
      object Assertion {
        
        inline def apply(matchPattern: Any => Unit): Assertion = {
          val __obj = js.Dynamic.literal(matchPattern = js.Any.fromFunction1(matchPattern))
          __obj.asInstanceOf[Assertion]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Assertion] (val x: Self) extends AnyVal {
          
          inline def setMatchPattern(value: Any => Unit): Self = StObject.set(x, "matchPattern", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
