package typings.datadogPprof

import typings.datadogPprof.profileMod.perftools.profiles.IProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cpuProfilerMod {
  
  @JSImport("@datadog/pprof/out/src/cpu-profiler", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CpuProfiler {
    
    /* CompleteClass */
    override def profile(): js.UndefOr[IProfile] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait CpuProfiler extends StObject {
    
    def profile(): js.UndefOr[IProfile]
  }
  object CpuProfiler {
    
    inline def apply(profile: () => js.UndefOr[IProfile]): CpuProfiler = {
      val __obj = js.Dynamic.literal(profile = js.Any.fromFunction0(profile))
      __obj.asInstanceOf[CpuProfiler]
    }
    
    extension [Self <: CpuProfiler](x: Self) {
      
      inline def setProfile(value: () => js.UndefOr[IProfile]): Self = StObject.set(x, "profile", js.Any.fromFunction0(value))
    }
  }
}
