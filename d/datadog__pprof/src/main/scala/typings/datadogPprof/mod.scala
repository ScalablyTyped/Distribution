package typings.datadogPprof

import org.scalablytyped.runtime.Instantiable0
import typings.datadogPprof.cpuProfilerMod.default
import typings.datadogPprof.profileMod.perftools.profiles.IProfile
import typings.datadogPprof.timeProfilerMod.Microseconds
import typings.datadogPprof.timeProfilerMod.TimeProfilerOptions
import typings.datadogPprof.v8TypesMod.AllocationProfileNode
import typings.node.bufferMod.global.Buffer
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
    extends typings.datadogPprof.sourcemapperMod.SourceMapper
  /* static members */
  object SourceMapper {
    
    @JSImport("@datadog/pprof", "SourceMapper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(searchDirs: js.Array[String]): js.Promise[typings.datadogPprof.sourcemapperMod.SourceMapper] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(searchDirs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.datadogPprof.sourcemapperMod.SourceMapper]]
  }
  
  inline def encode(profile: IProfile): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(profile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def encodeSync(profile: IProfile): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSync")(profile.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  object heap {
    
    @JSImport("@datadog/pprof", "heap")
    @js.native
    val ^ : js.Any = js.native
    
    inline def profile(): IProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")().asInstanceOf[IProfile]
    inline def profile(ignoreSamplePath: String): IProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any]).asInstanceOf[IProfile]
    inline def profile(ignoreSamplePath: String, sourceMapper: typings.datadogPprof.sourcemapperMod.SourceMapper): IProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[IProfile]
    inline def profile(ignoreSamplePath: Unit, sourceMapper: typings.datadogPprof.sourcemapperMod.SourceMapper): IProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[IProfile]
    @JSImport("@datadog/pprof", "heap.profile")
    @js.native
    def profile_Fheap: js.Function2[
        /* ignoreSamplePath */ js.UndefOr[String], 
        /* sourceMapper */ js.UndefOr[typings.datadogPprof.sourcemapperMod.SourceMapper], 
        IProfile
      ] = js.native
    
    inline def profile_Fheap_=(
      x: js.Function2[
          /* ignoreSamplePath */ js.UndefOr[String], 
          /* sourceMapper */ js.UndefOr[typings.datadogPprof.sourcemapperMod.SourceMapper], 
          IProfile
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
    def profile: js.Function1[/* options */ TimeProfilerOptions, js.Promise[IProfile]] = js.native
    inline def profile(options: TimeProfilerOptions): js.Promise[IProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IProfile]]
    inline def profile_=(x: js.Function1[/* options */ TimeProfilerOptions, js.Promise[IProfile]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("profile")(x.asInstanceOf[js.Any])
    
    inline def start(): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(intervalMicros: Unit, name: String): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(intervalMicros: Unit, name: String, sourceMapper: Unit, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(
      intervalMicros: Unit,
      name: String,
      sourceMapper: typings.datadogPprof.sourcemapperMod.SourceMapper
    ): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(
      intervalMicros: Unit,
      name: String,
      sourceMapper: typings.datadogPprof.sourcemapperMod.SourceMapper,
      lineNumbers: Boolean
    ): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(intervalMicros: Unit, name: Unit, sourceMapper: Unit, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(intervalMicros: Unit, name: Unit, sourceMapper: typings.datadogPprof.sourcemapperMod.SourceMapper): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(
      intervalMicros: Unit,
      name: Unit,
      sourceMapper: typings.datadogPprof.sourcemapperMod.SourceMapper,
      lineNumbers: Boolean
    ): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(intervalMicros: Microseconds): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(intervalMicros: Microseconds, name: String): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(intervalMicros: Microseconds, name: String, sourceMapper: Unit, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(
      intervalMicros: Microseconds,
      name: String,
      sourceMapper: typings.datadogPprof.sourcemapperMod.SourceMapper
    ): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(
      intervalMicros: Microseconds,
      name: String,
      sourceMapper: typings.datadogPprof.sourcemapperMod.SourceMapper,
      lineNumbers: Boolean
    ): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(intervalMicros: Microseconds, name: Unit, sourceMapper: Unit, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(
      intervalMicros: Microseconds,
      name: Unit,
      sourceMapper: typings.datadogPprof.sourcemapperMod.SourceMapper
    ): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    inline def start(
      intervalMicros: Microseconds,
      name: Unit,
      sourceMapper: typings.datadogPprof.sourcemapperMod.SourceMapper,
      lineNumbers: Boolean
    ): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
    @JSImport("@datadog/pprof", "time.start")
    @js.native
    def start_Ftime: js.Function4[
        /* intervalMicros */ js.UndefOr[Microseconds], 
        /* name */ js.UndefOr[String], 
        /* sourceMapper */ js.UndefOr[typings.datadogPprof.sourcemapperMod.SourceMapper], 
        /* lineNumbers */ js.UndefOr[Boolean], 
        js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]
      ] = js.native
    
    inline def start_Ftime_=(
      x: js.Function4[
          /* intervalMicros */ js.UndefOr[Microseconds], 
          /* name */ js.UndefOr[String], 
          /* sourceMapper */ js.UndefOr[typings.datadogPprof.sourcemapperMod.SourceMapper], 
          /* lineNumbers */ js.UndefOr[Boolean], 
          js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
}
