package typings.codeExcerpt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("code-excerpt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: String, line: Double): js.UndefOr[js.Array[CodeExcerpt]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[CodeExcerpt]]]
  inline def default(source: String, line: Double, options: Options): js.UndefOr[js.Array[CodeExcerpt]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], line.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[CodeExcerpt]]]
  
  trait CodeExcerpt extends StObject {
    
    var line: Double
    
    var value: String
  }
  object CodeExcerpt {
    
    inline def apply(line: Double, value: String): CodeExcerpt = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeExcerpt]
    }
    
    extension [Self <: CodeExcerpt](x: Self) {
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var around: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAround(value: Double): Self = StObject.set(x, "around", value.asInstanceOf[js.Any])
      
      inline def setAroundUndefined: Self = StObject.set(x, "around", js.undefined)
    }
  }
}
