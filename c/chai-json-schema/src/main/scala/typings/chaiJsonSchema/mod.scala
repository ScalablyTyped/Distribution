package typings.chaiJsonSchema

import org.scalablytyped.runtime.Shortcut
import typings.tv4.mod.TV4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-json-schema", JSImport.Namespace)
  @js.native
  val ^ : /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chai.ChaiPlugin */ Any = js.native
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chai.ChaiPlugin */ Any
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chai.ChaiPlugin */ Any = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
        def jsonSchema(value: Any, schema: Any): Unit = js.native
        def jsonSchema(value: Any, schema: Any, msg: String): Unit = js.native
        
        def notJsonSchema(value: Any, schema: Any): Unit = js.native
        def notJsonSchema(value: Any, schema: Any, msg: String): Unit = js.native
      }
      
      trait ChaiStatic extends StObject {
        
        var tv4: TV4
      }
      object ChaiStatic {
        
        inline def apply(tv4: TV4): ChaiStatic = {
          val __obj = js.Dynamic.literal(tv4 = tv4.asInstanceOf[js.Any])
          __obj.asInstanceOf[ChaiStatic]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: ChaiStatic] (val x: Self) extends AnyVal {
          
          inline def setTv4(value: TV4): Self = StObject.set(x, "tv4", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait LanguageChains extends StObject {
        
        def jsonSchema(schema: Any): Unit = js.native
        def jsonSchema(schema: Any, msg: String): Unit = js.native
      }
    }
  }
}
