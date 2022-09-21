package typings.datadogPprof

import typings.datadogPprof.profileMod.perftools.profiles.IProfile
import typings.datadogPprof.sourcemapperMod.SourceMapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeProfilerMod {
  
  @JSImport("@datadog/pprof/out/src/time-profiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def profile(options: TimeProfilerOptions): js.Promise[IProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IProfile]]
  
  inline def start(): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Unit, name: String): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Unit, name: String, sourceMapper: Unit, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Unit, name: String, sourceMapper: SourceMapper): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Unit, name: String, sourceMapper: SourceMapper, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Unit, name: Unit, sourceMapper: Unit, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Unit, name: Unit, sourceMapper: SourceMapper): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Unit, name: Unit, sourceMapper: SourceMapper, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Microseconds): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Microseconds, name: String): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Microseconds, name: String, sourceMapper: Unit, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Microseconds, name: String, sourceMapper: SourceMapper): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Microseconds, name: String, sourceMapper: SourceMapper, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Microseconds, name: Unit, sourceMapper: Unit, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Microseconds, name: Unit, sourceMapper: SourceMapper): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  inline def start(intervalMicros: Microseconds, name: Unit, sourceMapper: SourceMapper, lineNumbers: Boolean): js.Function1[/* restart */ js.UndefOr[Boolean], IProfile] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalMicros.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any], lineNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* restart */ js.UndefOr[Boolean], IProfile]]
  
  type Microseconds = Double
  
  type Milliseconds = Double
  
  trait TimeProfilerOptions extends StObject {
    
    /** time in milliseconds for which to collect profile. */
    var durationMillis: Milliseconds
    
    /** average time in microseconds between samples */
    var intervalMicros: js.UndefOr[Microseconds] = js.undefined
    
    /**
      * This configuration option is experimental.
      * When set to true, functions will be aggregated at the line level, rather
      * than at the function level.
      * This defaults to false.
      */
    var lineNumbers: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var sourceMapper: js.UndefOr[SourceMapper] = js.undefined
  }
  object TimeProfilerOptions {
    
    inline def apply(durationMillis: Milliseconds): TimeProfilerOptions = {
      val __obj = js.Dynamic.literal(durationMillis = durationMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeProfilerOptions]
    }
    
    extension [Self <: TimeProfilerOptions](x: Self) {
      
      inline def setDurationMillis(value: Milliseconds): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
      
      inline def setIntervalMicros(value: Microseconds): Self = StObject.set(x, "intervalMicros", value.asInstanceOf[js.Any])
      
      inline def setIntervalMicrosUndefined: Self = StObject.set(x, "intervalMicros", js.undefined)
      
      inline def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSourceMapper(value: SourceMapper): Self = StObject.set(x, "sourceMapper", value.asInstanceOf[js.Any])
      
      inline def setSourceMapperUndefined: Self = StObject.set(x, "sourceMapper", js.undefined)
    }
  }
}
