package typings.csvtojson9Fxy25kk

import typings.csvtojson9Fxy25kk.anon.OnCompleted
import typings.csvtojson9Fxy25kk.anon.Onfulfilled
import typings.csvtojson9Fxy25kk.converterDTsMod.Converter
import typings.csvtojson9Fxy25kk.converterDTsMod.PreFileLineCallback
import typings.csvtojson9Fxy25kk.converterDTsMod.PreRawDataCallback
import typings.csvtojson9Fxy25kk.parametersDTsMod.CellParser
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseRuntimeDTsMod {
  
  @JSImport(".csvtojson-9Fxy25kk/v2/ParseRuntime.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initParseRuntime(converter: Converter): ParseRuntime = ^.asInstanceOf[js.Dynamic].applyDynamic("initParseRuntime")(converter.asInstanceOf[js.Any]).asInstanceOf[ParseRuntime]
  
  trait ParseRuntime extends StObject {
    
    /**
      * Converter function for a column. Populated at runtime.
      */
    var columnConv: js.Array[CellParser | Null]
    
    var columnValueSetter: js.Array[js.Function]
    
    var csvLineBuffer: js.UndefOr[Buffer] = js.undefined
    
    /**
      * Inferred delimiter
      */
    var delimiter: String | js.Array[String]
    
    var ended: Boolean
    
    /**
      * Inferred eol
      */
    var eol: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var hasError: Boolean
    
    var headerFlag: js.Array[Any]
    
    var headerTitle: js.Array[String]
    
    var headerType: js.Array[Any]
    
    /**
      * Inferred headers
      */
    var headers: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * If need convert ignoreColumn from column name(string) to column index (number). Parser needs column index.
      */
    var needProcessIgnoreColumn: Boolean
    
    /**
      * If need convert includeColumn from column name(string) to column index (number). Parser needs column index.
      */
    var needProcessIncludeColumn: Boolean
    
    var parsedLineNumber: Double
    
    var preFileLineHook: js.UndefOr[PreFileLineCallback] = js.undefined
    
    var preRawDataHook: js.UndefOr[PreRawDataCallback] = js.undefined
    
    /**
      * the indexes of columns to reserve, undefined means reserve all, [] means hide all
      */
    var selectedColumns: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * after first chunk of data being processed and emitted, started will become true.
      */
    var started: Boolean
    
    var subscribe: js.UndefOr[OnCompleted] = js.undefined
    
    var `then`: js.UndefOr[Onfulfilled] = js.undefined
  }
  object ParseRuntime {
    
    inline def apply(
      columnConv: js.Array[CellParser | Null],
      columnValueSetter: js.Array[js.Function],
      delimiter: String | js.Array[String],
      ended: Boolean,
      hasError: Boolean,
      headerFlag: js.Array[Any],
      headerTitle: js.Array[String],
      headerType: js.Array[Any],
      needProcessIgnoreColumn: Boolean,
      needProcessIncludeColumn: Boolean,
      parsedLineNumber: Double,
      started: Boolean
    ): ParseRuntime = {
      val __obj = js.Dynamic.literal(columnConv = columnConv.asInstanceOf[js.Any], columnValueSetter = columnValueSetter.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], headerFlag = headerFlag.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerType = headerType.asInstanceOf[js.Any], needProcessIgnoreColumn = needProcessIgnoreColumn.asInstanceOf[js.Any], needProcessIncludeColumn = needProcessIncludeColumn.asInstanceOf[js.Any], parsedLineNumber = parsedLineNumber.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseRuntime]
    }
    
    extension [Self <: ParseRuntime](x: Self) {
      
      inline def setColumnConv(value: js.Array[CellParser | Null]): Self = StObject.set(x, "columnConv", value.asInstanceOf[js.Any])
      
      inline def setColumnConvVarargs(value: (CellParser | Null)*): Self = StObject.set(x, "columnConv", js.Array(value*))
      
      inline def setColumnValueSetter(value: js.Array[js.Function]): Self = StObject.set(x, "columnValueSetter", value.asInstanceOf[js.Any])
      
      inline def setColumnValueSetterVarargs(value: js.Function*): Self = StObject.set(x, "columnValueSetter", js.Array(value*))
      
      inline def setCsvLineBuffer(value: Buffer): Self = StObject.set(x, "csvLineBuffer", value.asInstanceOf[js.Any])
      
      inline def setCsvLineBufferUndefined: Self = StObject.set(x, "csvLineBuffer", js.undefined)
      
      inline def setDelimiter(value: String | js.Array[String]): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterVarargs(value: String*): Self = StObject.set(x, "delimiter", js.Array(value*))
      
      inline def setEnded(value: Boolean): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setHeaderFlag(value: js.Array[Any]): Self = StObject.set(x, "headerFlag", value.asInstanceOf[js.Any])
      
      inline def setHeaderFlagVarargs(value: Any*): Self = StObject.set(x, "headerFlag", js.Array(value*))
      
      inline def setHeaderTitle(value: js.Array[String]): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      inline def setHeaderTitleVarargs(value: String*): Self = StObject.set(x, "headerTitle", js.Array(value*))
      
      inline def setHeaderType(value: js.Array[Any]): Self = StObject.set(x, "headerType", value.asInstanceOf[js.Any])
      
      inline def setHeaderTypeVarargs(value: Any*): Self = StObject.set(x, "headerType", js.Array(value*))
      
      inline def setHeaders(value: js.Array[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: Any*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setNeedProcessIgnoreColumn(value: Boolean): Self = StObject.set(x, "needProcessIgnoreColumn", value.asInstanceOf[js.Any])
      
      inline def setNeedProcessIncludeColumn(value: Boolean): Self = StObject.set(x, "needProcessIncludeColumn", value.asInstanceOf[js.Any])
      
      inline def setParsedLineNumber(value: Double): Self = StObject.set(x, "parsedLineNumber", value.asInstanceOf[js.Any])
      
      inline def setPreFileLineHook(value: (/* line */ String, /* lineNumber */ Double) => String | js.Thenable[String]): Self = StObject.set(x, "preFileLineHook", js.Any.fromFunction2(value))
      
      inline def setPreFileLineHookUndefined: Self = StObject.set(x, "preFileLineHook", js.undefined)
      
      inline def setPreRawDataHook(value: /* csvString */ String => String | js.Thenable[String]): Self = StObject.set(x, "preRawDataHook", js.Any.fromFunction1(value))
      
      inline def setPreRawDataHookUndefined: Self = StObject.set(x, "preRawDataHook", js.undefined)
      
      inline def setSelectedColumns(value: js.Array[Double]): Self = StObject.set(x, "selectedColumns", value.asInstanceOf[js.Any])
      
      inline def setSelectedColumnsUndefined: Self = StObject.set(x, "selectedColumns", js.undefined)
      
      inline def setSelectedColumnsVarargs(value: Double*): Self = StObject.set(x, "selectedColumns", js.Array(value*))
      
      inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setSubscribe(value: OnCompleted): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
      
      inline def setThen(value: Onfulfilled): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
    }
  }
}
