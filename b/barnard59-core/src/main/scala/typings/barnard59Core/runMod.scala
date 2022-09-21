package typings.barnard59Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runMod {
  
  @JSImport("barnard59-core/lib/run", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pipeline: typings.barnard59Core.libPipelineMod.default): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pipeline.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def default(pipeline: typings.barnard59Core.libPipelineMod.default, opts: Run): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pipeline.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  trait Run extends StObject {
    
    var end: js.UndefOr[Boolean] = js.undefined
    
    var resume: js.UndefOr[Boolean] = js.undefined
  }
  object Run {
    
    inline def apply(): Run = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Run]
    }
    
    extension [Self <: Run](x: Self) {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setResume(value: Boolean): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
      
      inline def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
    }
  }
}
