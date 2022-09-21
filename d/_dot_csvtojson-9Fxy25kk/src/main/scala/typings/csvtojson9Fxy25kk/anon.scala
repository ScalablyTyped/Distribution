package typings.csvtojson9Fxy25kk

import org.scalablytyped.runtime.StringDictionary
import typings.csvtojson9Fxy25kk.csverrorDTsMod.default
import typings.csvtojson9Fxy25kk.csvtojson9Fxy25kkStrings.array
import typings.csvtojson9Fxy25kk.csvtojson9Fxy25kkStrings.csv
import typings.csvtojson9Fxy25kk.csvtojson9Fxy25kkStrings.json
import typings.csvtojson9Fxy25kk.csvtojson9Fxy25kkStrings.line
import typings.csvtojson9Fxy25kk.parametersDTsMod.CellParser
import typings.csvtojson9Fxy25kk.parametersDTsMod.ColumnParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Err extends StObject {
    
    var err: String
    
    var extra: js.UndefOr[String] = js.undefined
    
    var line: Double
  }
  object Err {
    
    inline def apply(err: String, line: Double): Err = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Err]
    }
    
    extension [Self <: Err](x: Self) {
      
      inline def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setExtra(value: String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnCompleted extends StObject {
    
    var onCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* err */ default, Unit]] = js.undefined
    
    var onNext: js.UndefOr[js.Function2[/* data */ Any, /* lineNumber */ Double, Unit | js.Thenable[Unit]]] = js.undefined
  }
  object OnCompleted {
    
    inline def apply(): OnCompleted = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnCompleted]
    }
    
    extension [Self <: OnCompleted](x: Self) {
      
      inline def setOnCompleted(value: () => Unit): Self = StObject.set(x, "onCompleted", js.Any.fromFunction0(value))
      
      inline def setOnCompletedUndefined: Self = StObject.set(x, "onCompleted", js.undefined)
      
      inline def setOnError(value: /* err */ default => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnNext(value: (/* data */ Any, /* lineNumber */ Double) => Unit | js.Thenable[Unit]): Self = StObject.set(x, "onNext", js.Any.fromFunction2(value))
      
      inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
    }
  }
  
  trait Onfulfilled extends StObject {
    
    def onfulfilled(value: js.Array[Any]): Any
    
    def onrejected(err: js.Error): Any
  }
  object Onfulfilled {
    
    inline def apply(onfulfilled: js.Array[Any] => Any, onrejected: js.Error => Any): Onfulfilled = {
      val __obj = js.Dynamic.literal(onfulfilled = js.Any.fromFunction1(onfulfilled), onrejected = js.Any.fromFunction1(onrejected))
      __obj.asInstanceOf[Onfulfilled]
    }
    
    extension [Self <: Onfulfilled](x: Self) {
      
      inline def setOnfulfilled(value: js.Array[Any] => Any): Self = StObject.set(x, "onfulfilled", js.Any.fromFunction1(value))
      
      inline def setOnrejected(value: js.Error => Any): Self = StObject.set(x, "onrejected", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<.csvtojson-9Fxy25kk..csvtojson-9Fxy25kk/v2/Parameters.d.ts.CSVParseParam> */
  trait PartialCSVParseParam extends StObject {
    
    var alwaysSplitAtEOL: js.UndefOr[Boolean] = js.undefined
    
    var checkColumn: js.UndefOr[Boolean] = js.undefined
    
    var checkType: js.UndefOr[Boolean] = js.undefined
    
    var colParser: js.UndefOr[StringDictionary[String | CellParser | ColumnParam]] = js.undefined
    
    var delimiter: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var downstreamFormat: js.UndefOr[line | array] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    var escape: js.UndefOr[String] = js.undefined
    
    var flatKeys: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreColumns: js.UndefOr[js.RegExp] = js.undefined
    
    var ignoreEmpty: js.UndefOr[Boolean] = js.undefined
    
    var includeColumns: js.UndefOr[js.RegExp] = js.undefined
    
    var maxRowLength: js.UndefOr[Double] = js.undefined
    
    var needEmitAll: js.UndefOr[Boolean] = js.undefined
    
    var noheader: js.UndefOr[Boolean] = js.undefined
    
    var nullObject: js.UndefOr[Boolean] = js.undefined
    
    var output: js.UndefOr[json | csv | line] = js.undefined
    
    var quote: js.UndefOr[String] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object PartialCSVParseParam {
    
    inline def apply(): PartialCSVParseParam = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCSVParseParam]
    }
    
    extension [Self <: PartialCSVParseParam](x: Self) {
      
      inline def setAlwaysSplitAtEOL(value: Boolean): Self = StObject.set(x, "alwaysSplitAtEOL", value.asInstanceOf[js.Any])
      
      inline def setAlwaysSplitAtEOLUndefined: Self = StObject.set(x, "alwaysSplitAtEOL", js.undefined)
      
      inline def setCheckColumn(value: Boolean): Self = StObject.set(x, "checkColumn", value.asInstanceOf[js.Any])
      
      inline def setCheckColumnUndefined: Self = StObject.set(x, "checkColumn", js.undefined)
      
      inline def setCheckType(value: Boolean): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
      
      inline def setCheckTypeUndefined: Self = StObject.set(x, "checkType", js.undefined)
      
      inline def setColParser(value: StringDictionary[String | CellParser | ColumnParam]): Self = StObject.set(x, "colParser", value.asInstanceOf[js.Any])
      
      inline def setColParserUndefined: Self = StObject.set(x, "colParser", js.undefined)
      
      inline def setDelimiter(value: String | js.Array[String]): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDelimiterVarargs(value: String*): Self = StObject.set(x, "delimiter", js.Array(value*))
      
      inline def setDownstreamFormat(value: line | array): Self = StObject.set(x, "downstreamFormat", value.asInstanceOf[js.Any])
      
      inline def setDownstreamFormatUndefined: Self = StObject.set(x, "downstreamFormat", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setFlatKeys(value: Boolean): Self = StObject.set(x, "flatKeys", value.asInstanceOf[js.Any])
      
      inline def setFlatKeysUndefined: Self = StObject.set(x, "flatKeys", js.undefined)
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIgnoreColumns(value: js.RegExp): Self = StObject.set(x, "ignoreColumns", value.asInstanceOf[js.Any])
      
      inline def setIgnoreColumnsUndefined: Self = StObject.set(x, "ignoreColumns", js.undefined)
      
      inline def setIgnoreEmpty(value: Boolean): Self = StObject.set(x, "ignoreEmpty", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEmptyUndefined: Self = StObject.set(x, "ignoreEmpty", js.undefined)
      
      inline def setIncludeColumns(value: js.RegExp): Self = StObject.set(x, "includeColumns", value.asInstanceOf[js.Any])
      
      inline def setIncludeColumnsUndefined: Self = StObject.set(x, "includeColumns", js.undefined)
      
      inline def setMaxRowLength(value: Double): Self = StObject.set(x, "maxRowLength", value.asInstanceOf[js.Any])
      
      inline def setMaxRowLengthUndefined: Self = StObject.set(x, "maxRowLength", js.undefined)
      
      inline def setNeedEmitAll(value: Boolean): Self = StObject.set(x, "needEmitAll", value.asInstanceOf[js.Any])
      
      inline def setNeedEmitAllUndefined: Self = StObject.set(x, "needEmitAll", js.undefined)
      
      inline def setNoheader(value: Boolean): Self = StObject.set(x, "noheader", value.asInstanceOf[js.Any])
      
      inline def setNoheaderUndefined: Self = StObject.set(x, "noheader", js.undefined)
      
      inline def setNullObject(value: Boolean): Self = StObject.set(x, "nullObject", value.asInstanceOf[js.Any])
      
      inline def setNullObjectUndefined: Self = StObject.set(x, "nullObject", js.undefined)
      
      inline def setOutput(value: json | csv | line): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
}
