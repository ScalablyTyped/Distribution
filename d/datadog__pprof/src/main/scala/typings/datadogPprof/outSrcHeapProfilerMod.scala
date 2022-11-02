package typings.datadogPprof

import typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper
import typings.datadogPprof.outSrcV8TypesMod.AllocationProfileNode
import typings.pprofFormat.mod.Profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outSrcHeapProfilerMod {
  
  @JSImport("@datadog/pprof/out/src/heap-profiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def profile(): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")().asInstanceOf[Profile]
  inline def profile(ignoreSamplePath: String): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any]).asInstanceOf[Profile]
  inline def profile(ignoreSamplePath: String, sourceMapper: SourceMapper): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Profile]
  inline def profile(ignoreSamplePath: Unit, sourceMapper: SourceMapper): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Profile]
  
  inline def start(intervalBytes: Double, stackDepth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalBytes.asInstanceOf[js.Any], stackDepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  
  inline def v8Profile(): AllocationProfileNode = ^.asInstanceOf[js.Dynamic].applyDynamic("v8Profile")().asInstanceOf[AllocationProfileNode]
}
