package typings.datadogPprof

import typings.datadogPprof.profileMod.perftools.profiles.IProfile
import typings.datadogPprof.sourcemapperMod.SourceMapper
import typings.datadogPprof.v8TypesMod.AllocationProfileNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heapProfilerMod {
  
  @JSImport("@datadog/pprof/out/src/heap-profiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def profile(): IProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")().asInstanceOf[IProfile]
  inline def profile(ignoreSamplePath: String): IProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any]).asInstanceOf[IProfile]
  inline def profile(ignoreSamplePath: String, sourceMapper: SourceMapper): IProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[IProfile]
  inline def profile(ignoreSamplePath: Unit, sourceMapper: SourceMapper): IProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[IProfile]
  
  inline def start(intervalBytes: Double, stackDepth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalBytes.asInstanceOf[js.Any], stackDepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  
  inline def v8Profile(): AllocationProfileNode = ^.asInstanceOf[js.Dynamic].applyDynamic("v8Profile")().asInstanceOf[AllocationProfileNode]
}
