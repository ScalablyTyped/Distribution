package typings.chaiJsonSchema

import typings.tv4.mod.TV4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
        def jsonSchema(value: js.Any, schema: js.Any): Unit = js.native
        def jsonSchema(value: js.Any, schema: js.Any, msg: String): Unit = js.native
        
        def notJsonSchema(value: js.Any, schema: js.Any): Unit = js.native
        def notJsonSchema(value: js.Any, schema: js.Any, msg: String): Unit = js.native
      }
      
      trait ChaiStatic extends StObject {
        
        var tv4: TV4
      }
      object ChaiStatic {
        
        @scala.inline
        def apply(tv4: TV4): ChaiStatic = {
          val __obj = js.Dynamic.literal(tv4 = tv4.asInstanceOf[js.Any])
          __obj.asInstanceOf[ChaiStatic]
        }
        
        @scala.inline
        implicit class ChaiStaticMutableBuilder[Self <: ChaiStatic] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setTv4(value: TV4): Self = StObject.set(x, "tv4", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait LanguageChains extends StObject {
        
        def jsonSchema(schema: js.Any): Unit = js.native
        def jsonSchema(schema: js.Any, msg: String): Unit = js.native
      }
    }
  }
}
