package typings.barnard59Base

import typings.readableStream.mod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globMod {
  
  @JSImport("barnard59-base/glob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(arg: Options): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(arg.asInstanceOf[js.Any]).asInstanceOf[Readable]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify G.IOptions * / any */ trait Options extends StObject {
    
    var pattern: String
  }
  object Options {
    
    inline def apply(pattern: String): Options = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
