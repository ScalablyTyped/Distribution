package typings.c8

import typings.c8.mod.Watermark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait All extends StObject {
    
    var all: js.UndefOr[Boolean] = js.undefined
    
    var allowExternal: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var excludeAfterRemap: js.UndefOr[Boolean] = js.undefined
    
    var `extension`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var include: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var omitRelative: js.UndefOr[Boolean] = js.undefined
    
    var reporter: js.Array[String]
    
    var reportsDirectory: js.UndefOr[String] = js.undefined
    
    var resolve: js.UndefOr[String] = js.undefined
    
    var src: js.UndefOr[js.Array[String]] = js.undefined
    
    var tempDirectory: js.UndefOr[String] = js.undefined
    
    var watermarks: js.UndefOr[PartialstatementsWatermar] = js.undefined
    
    var wrapperLength: js.UndefOr[Double] = js.undefined
  }
  object All {
    
    inline def apply(reporter: js.Array[String]): All = {
      val __obj = js.Dynamic.literal(reporter = reporter.asInstanceOf[js.Any])
      __obj.asInstanceOf[All]
    }
    
    extension [Self <: All](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setAllowExternal(value: Boolean): Self = StObject.set(x, "allowExternal", value.asInstanceOf[js.Any])
      
      inline def setAllowExternalUndefined: Self = StObject.set(x, "allowExternal", js.undefined)
      
      inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeAfterRemap(value: Boolean): Self = StObject.set(x, "excludeAfterRemap", value.asInstanceOf[js.Any])
      
      inline def setExcludeAfterRemapUndefined: Self = StObject.set(x, "excludeAfterRemap", js.undefined)
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtension(value: String | js.Array[String]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setExtensionVarargs(value: String*): Self = StObject.set(x, "extension", js.Array(value*))
      
      inline def setInclude(value: String | js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setOmitRelative(value: Boolean): Self = StObject.set(x, "omitRelative", value.asInstanceOf[js.Any])
      
      inline def setOmitRelativeUndefined: Self = StObject.set(x, "omitRelative", js.undefined)
      
      inline def setReporter(value: js.Array[String]): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterVarargs(value: String*): Self = StObject.set(x, "reporter", js.Array(value*))
      
      inline def setReportsDirectory(value: String): Self = StObject.set(x, "reportsDirectory", value.asInstanceOf[js.Any])
      
      inline def setReportsDirectoryUndefined: Self = StObject.set(x, "reportsDirectory", js.undefined)
      
      inline def setResolve(value: String): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setSrc(value: js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value*))
      
      inline def setTempDirectory(value: String): Self = StObject.set(x, "tempDirectory", value.asInstanceOf[js.Any])
      
      inline def setTempDirectoryUndefined: Self = StObject.set(x, "tempDirectory", js.undefined)
      
      inline def setWatermarks(value: PartialstatementsWatermar): Self = StObject.set(x, "watermarks", value.asInstanceOf[js.Any])
      
      inline def setWatermarksUndefined: Self = StObject.set(x, "watermarks", js.undefined)
      
      inline def setWrapperLength(value: Double): Self = StObject.set(x, "wrapperLength", value.asInstanceOf[js.Any])
      
      inline def setWrapperLengthUndefined: Self = StObject.set(x, "wrapperLength", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  statements :c8.c8.Watermark,   functions :c8.c8.Watermark,   branches :c8.c8.Watermark,   lines :c8.c8.Watermark}> */
  trait PartialstatementsWatermar extends StObject {
    
    var branches: js.UndefOr[Watermark] = js.undefined
    
    var functions: js.UndefOr[Watermark] = js.undefined
    
    var lines: js.UndefOr[Watermark] = js.undefined
    
    var statements: js.UndefOr[Watermark] = js.undefined
  }
  object PartialstatementsWatermar {
    
    inline def apply(): PartialstatementsWatermar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialstatementsWatermar]
    }
    
    extension [Self <: PartialstatementsWatermar](x: Self) {
      
      inline def setBranches(value: Watermark): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      inline def setFunctions(value: Watermark): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setLines(value: Watermark): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setStatements(value: Watermark): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    }
  }
}
