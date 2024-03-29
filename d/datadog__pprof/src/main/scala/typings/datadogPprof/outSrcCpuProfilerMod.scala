package typings.datadogPprof

import typings.pprofFormat.mod.Profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outSrcCpuProfilerMod {
  
  @JSImport("@datadog/pprof/out/src/cpu-profiler", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CpuProfiler {
    
    /* CompleteClass */
    override def profile(): js.UndefOr[Profile] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait CpuProfiler extends StObject {
    
    def profile(): js.UndefOr[Profile]
  }
  object CpuProfiler {
    
    inline def apply(profile: () => js.UndefOr[Profile]): CpuProfiler = {
      val __obj = js.Dynamic.literal(profile = js.Any.fromFunction0(profile))
      __obj.asInstanceOf[CpuProfiler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CpuProfiler] (val x: Self) extends AnyVal {
      
      inline def setProfile(value: () => js.UndefOr[Profile]): Self = StObject.set(x, "profile", js.Any.fromFunction0(value))
    }
  }
}
