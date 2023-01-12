package typings.bunyanDebugStream

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.bunyanDebugStream.anon.Consumed
import typings.bunyanDebugStream.anon.DebugStream
import typings.bunyanDebugStream.bunyanDebugStreamBooleans.`false`
import typings.bunyanDebugStream.bunyanDebugStreamStrings.auto
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Writable
import typings.node.ttyMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bunyan-debug-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: BunyanDebugStreamOptions): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[WritableStream]
  
  inline def create(options: BunyanDebugStreamOptions): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[WritableStream]
  
  @js.native
  trait BunyanDebugStream extends Writable {
    
    /* private */ var _basepath: Any = js.native
    
    /* private */ var _colors: Any = js.native
    
    /* private */ var _entryToString: Any = js.native
    
    /* private */ var _indent: Any = js.native
    
    /* private */ var _out: Any = js.native
    
    /* private */ var _prefixers: Any = js.native
    
    /* private */ var _processName: Any = js.native
    
    /* private */ var _runStringifier: Any = js.native
    
    /* private */ var _showDate: Any = js.native
    
    /* private */ var _showLevel: Any = js.native
    
    /* private */ var _showLoggerName: Any = js.native
    
    /* private */ var _showMetadata: Any = js.native
    
    /* private */ var _showPid: Any = js.native
    
    /* private */ var _showPrefixes: Any = js.native
    
    /* private */ var _stringifiers: Any = js.native
    
    /* private */ var _useColor: Any = js.native
    
    def _write(entry: Any, _encoding: String, done: js.Function0[Unit]): Unit = js.native
    
    var options: BunyanDebugStreamOptions = js.native
  }
  
  trait BunyanDebugStreamOptions extends StObject {
    
    var basepath: js.UndefOr[String] = js.undefined
    
    var basepathReplacement: js.UndefOr[String] = js.undefined
    
    var colors: js.UndefOr[(NumberDictionary[String | js.Array[String]]) | `false` | Null] = js.undefined
    
    var forceColor: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[String] = js.undefined
    
    var maxExceptionLines: js.UndefOr[Double | auto] = js.undefined
    
    var out: js.UndefOr[WriteStream] = js.undefined
    
    var prefixers: js.UndefOr[StringDictionary[Stringifier | Null]] = js.undefined
    
    var processName: js.UndefOr[String] = js.undefined
    
    var showDate: js.UndefOr[Boolean | (js.Function2[/* time */ js.Date, /* entry */ Any, String])] = js.undefined
    
    var showLevel: js.UndefOr[Boolean] = js.undefined
    
    var showLoggerName: js.UndefOr[Boolean] = js.undefined
    
    var showMetadata: js.UndefOr[Boolean] = js.undefined
    
    var showPid: js.UndefOr[Boolean] = js.undefined
    
    var showPrefixes: js.UndefOr[Boolean | (js.Function1[/* prefixes */ js.Array[String], String])] = js.undefined
    
    var showProcess: js.UndefOr[Boolean] = js.undefined
    
    var stringifiers: js.UndefOr[StringDictionary[Stringifier | Null]] = js.undefined
  }
  object BunyanDebugStreamOptions {
    
    inline def apply(): BunyanDebugStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BunyanDebugStreamOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BunyanDebugStreamOptions] (val x: Self) extends AnyVal {
      
      inline def setBasepath(value: String): Self = StObject.set(x, "basepath", value.asInstanceOf[js.Any])
      
      inline def setBasepathReplacement(value: String): Self = StObject.set(x, "basepathReplacement", value.asInstanceOf[js.Any])
      
      inline def setBasepathReplacementUndefined: Self = StObject.set(x, "basepathReplacement", js.undefined)
      
      inline def setBasepathUndefined: Self = StObject.set(x, "basepath", js.undefined)
      
      inline def setColors(value: (NumberDictionary[String | js.Array[String]]) | `false`): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsNull: Self = StObject.set(x, "colors", null)
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setForceColor(value: Boolean): Self = StObject.set(x, "forceColor", value.asInstanceOf[js.Any])
      
      inline def setForceColorUndefined: Self = StObject.set(x, "forceColor", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setMaxExceptionLines(value: Double | auto): Self = StObject.set(x, "maxExceptionLines", value.asInstanceOf[js.Any])
      
      inline def setMaxExceptionLinesUndefined: Self = StObject.set(x, "maxExceptionLines", js.undefined)
      
      inline def setOut(value: WriteStream): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setPrefixers(value: StringDictionary[Stringifier | Null]): Self = StObject.set(x, "prefixers", value.asInstanceOf[js.Any])
      
      inline def setPrefixersUndefined: Self = StObject.set(x, "prefixers", js.undefined)
      
      inline def setProcessName(value: String): Self = StObject.set(x, "processName", value.asInstanceOf[js.Any])
      
      inline def setProcessNameUndefined: Self = StObject.set(x, "processName", js.undefined)
      
      inline def setShowDate(value: Boolean | (js.Function2[/* time */ js.Date, /* entry */ Any, String])): Self = StObject.set(x, "showDate", value.asInstanceOf[js.Any])
      
      inline def setShowDateFunction2(value: (/* time */ js.Date, /* entry */ Any) => String): Self = StObject.set(x, "showDate", js.Any.fromFunction2(value))
      
      inline def setShowDateUndefined: Self = StObject.set(x, "showDate", js.undefined)
      
      inline def setShowLevel(value: Boolean): Self = StObject.set(x, "showLevel", value.asInstanceOf[js.Any])
      
      inline def setShowLevelUndefined: Self = StObject.set(x, "showLevel", js.undefined)
      
      inline def setShowLoggerName(value: Boolean): Self = StObject.set(x, "showLoggerName", value.asInstanceOf[js.Any])
      
      inline def setShowLoggerNameUndefined: Self = StObject.set(x, "showLoggerName", js.undefined)
      
      inline def setShowMetadata(value: Boolean): Self = StObject.set(x, "showMetadata", value.asInstanceOf[js.Any])
      
      inline def setShowMetadataUndefined: Self = StObject.set(x, "showMetadata", js.undefined)
      
      inline def setShowPid(value: Boolean): Self = StObject.set(x, "showPid", value.asInstanceOf[js.Any])
      
      inline def setShowPidUndefined: Self = StObject.set(x, "showPid", js.undefined)
      
      inline def setShowPrefixes(value: Boolean | (js.Function1[/* prefixes */ js.Array[String], String])): Self = StObject.set(x, "showPrefixes", value.asInstanceOf[js.Any])
      
      inline def setShowPrefixesFunction1(value: /* prefixes */ js.Array[String] => String): Self = StObject.set(x, "showPrefixes", js.Any.fromFunction1(value))
      
      inline def setShowPrefixesUndefined: Self = StObject.set(x, "showPrefixes", js.undefined)
      
      inline def setShowProcess(value: Boolean): Self = StObject.set(x, "showProcess", value.asInstanceOf[js.Any])
      
      inline def setShowProcessUndefined: Self = StObject.set(x, "showProcess", js.undefined)
      
      inline def setStringifiers(value: StringDictionary[Stringifier | Null]): Self = StObject.set(x, "stringifiers", value.asInstanceOf[js.Any])
      
      inline def setStringifiersUndefined: Self = StObject.set(x, "stringifiers", js.undefined)
    }
  }
  
  type Stringifier = js.Function2[/* obj */ Any, /* options */ DebugStream, js.UndefOr[String | Consumed | Null]]
}
