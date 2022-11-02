package typings.datadogPprof

import org.scalablytyped.runtime.Instantiable0
import typings.datadogPprof.outSrcCpuProfilerMod.default
import typings.datadogPprof.outSrcTimeProfilerMod.Microseconds
import typings.datadogPprof.outSrcTimeProfilerMod.TimeProfilerOptions
import typings.datadogPprof.outSrcV8TypesMod.AllocationProfileNode
import typings.node.bufferMod.global.Buffer
import typings.pprofFormat.mod.Profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@datadog/pprof", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@datadog/pprof", "CpuProfiler")
  @js.native
  open class CpuProfiler () extends default
  @JSImport("@datadog/pprof", "CpuProfiler")
  @js.native
  val CpuProfiler: Instantiable0[default] = js.native
  
  @JSImport("@datadog/pprof", "SourceMapper")
  @js.native
  /**
    * @param {Array.<string>} sourceMapPaths An array of paths to .map source map
    *  files that should be processed.  The paths should be relative to the
    *  current process's current working directory
    * @param {Logger} logger A logger that reports errors that occurred while
    *  processing the given source map files
    * @constructor
    */
  open class SourceMapper ()
    extends typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper
  /* static members */
  object SourceMapper {
    
    @JSImport("@datadog/pprof", "SourceMapper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(searchDirs: js.Array[String]): js.Promise[typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(searchDirs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper]]
  }
  
  inline def encode(profile: Profile): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(profile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def encodeSync(profile: Profile): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSync")(profile.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  object heap {
    
    @JSImport("@datadog/pprof", "heap")
    @js.native
    val ^ : js.Any = js.native
    
    inline def profile(): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")().asInstanceOf[Profile]
    inline def profile(ignoreSamplePath: String): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any]).asInstanceOf[Profile]
    inline def profile(
      ignoreSamplePath: String,
      sourceMapper: typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper
    ): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Profile]
    inline def profile(
      ignoreSamplePath: Unit,
      sourceMapper: typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper
    ): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Profile]
    @JSImport("@datadog/pprof", "heap.profile")
    @js.native
    def profile_Fheap: js.Function2[
        /* ignoreSamplePath */ js.UndefOr[String], 
        /* sourceMapper */ js.UndefOr[typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper], 
        Profile
      ] = js.native
    
    inline def profile_Fheap_=(
      x: js.Function2[
          /* ignoreSamplePath */ js.UndefOr[String], 
          /* sourceMapper */ js.UndefOr[typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper], 
          Profile
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("profile")(x.asInstanceOf[js.Any])
    
    @JSImport("@datadog/pprof", "heap.start")
    @js.native
    def start: js.Function2[/* intervalBytes */ Double, /* stackDepth */ Double, Unit] = js.native
    inline def start(intervalBytes: Double, stackDepth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalBytes.asInstanceOf[js.Any], stackDepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def start_=(x: js.Function2[/* intervalBytes */ Double, /* stackDepth */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
    
    inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
    @JSImport("@datadog/pprof", "heap.stop")
    @js.native
    def stop_Fheap: js.Function0[Unit] = js.native
    
    inline def stop_Fheap_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stop")(x.asInstanceOf[js.Any])
    
    inline def v8Profile(): AllocationProfileNode = ^.asInstanceOf[js.Dynamic].applyDynamic("v8Profile")().asInstanceOf[AllocationProfileNode]
    @JSImport("@datadog/pprof", "heap.v8Profile")
    @js.native
    def v8Profile_Fheap: js.Function0[AllocationProfileNode] = js.native
    
    inline def v8Profile_Fheap_=(x: js.Function0[AllocationProfileNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v8Profile")(x.asInstanceOf[js.Any])
  }
  
  object time {
    
    @JSImport("@datadog/pprof", "time")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@datadog/pprof", "time.profile")
    @js.native
    def profile: js.Function1[/* options */ TimeProfilerOptions, js.Promise[Profile]] = js.native
    inline def profile(options: TimeProfilerOptions): js.Promise[Profile] = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Profile]]
    inline def profile_=(x: js.Function1[/* options */ TimeProfilerOptions, js.Promise[Profile]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("profile")(x.asInstanceOf[js.Any])
    
    inline def start(): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(intervalMicros: Unit, name: String): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(intervalMicros: Unit, name: String, sourceMapper: Unit, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(
      intervalMicros: Unit,
      name: String,
      sourceMapper: typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper
    ): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(
      intervalMicros: Unit,
      name: String,
      sourceMapper: typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper,
      lineNumbers: Boolean
    ): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(intervalMicros: Unit, name: Unit, sourceMapper: Unit, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(
      intervalMicros: Unit,
      name: Unit,
      sourceMapper: typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper
    ): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(
      intervalMicros: Unit,
      name: Unit,
      sourceMapper: typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper,
      lineNumbers: Boolean
    ): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(intervalMicros: Microseconds): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(intervalMicros: Microseconds, name: String): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(intervalMicros: Microseconds, name: String, sourceMapper: Unit, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(
      intervalMicros: Microseconds,
      name: String,
      sourceMapper: typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper
    ): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(
      intervalMicros: Microseconds,
      name: String,
      sourceMapper: typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper,
      lineNumbers: Boolean
    ): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(intervalMicros: Microseconds, name: Unit, sourceMapper: Unit, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(
      intervalMicros: Microseconds,
      name: Unit,
      sourceMapper: typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper
    ): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    inline def start(
      intervalMicros: Microseconds,
      name: Unit,
      sourceMapper: typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper,
      lineNumbers: Boolean
    ): js.Function1[/* restart */ js.UndefOr[Boolean], Profile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], Profile]]
    @JSImport("@datadog/pprof", "time.start")
    @js.native
    def start_Ftime: js.Function4[
        /* intervalMicros */ js.UndefOr[Microseconds], 
        /* name */ js.UndefOr[String], 
        /* sourceMapper */ js.UndefOr[typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper], 
        /* lineNumbers */ js.UndefOr[Boolean], 
        js.Function1[/* restart */ js.UndefOr[Boolean], Profile]
      ] = js.native
    
    inline def start_Ftime_=(
      x: js.Function4[
          /* intervalMicros */ js.UndefOr[Microseconds], 
          /* name */ js.UndefOr[String], 
          /* sourceMapper */ js.UndefOr[typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper], 
          /* lineNumbers */ js.UndefOr[Boolean], 
          js.Function1[/* restart */ js.UndefOr[Boolean], Profile]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
}
