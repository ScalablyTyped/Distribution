package typings.c3.anon

import typings.c3.c3Booleans.`true`
import typings.c3.mod.ArrayOrString
import typings.c3.mod.AxisName
import typings.c3.mod.ChartType
import typings.c3.mod.Primitive
import typings.c3.mod.PrimitiveArray
import typings.d3Color.mod.HSLColor
import typings.d3Color.mod.RGBColor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axes extends StObject {
  
  /** Match data IDs to their axes. */
  var axes: js.UndefOr[Record[String, AxisName]] = js.undefined
  
  /** Array of arrays of data IDs. IDs that share a sub-array will be categorized together. */
  var categories: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  /** If classes given, the classes specifed by `data.classes` will be updated. Keys should be data IDs and values should be classes to assign. */
  var classes: js.UndefOr[Record[String, String]] = js.undefined
  
  /** Match data IDs to the colors to render that data as. */
  var colors: js.UndefOr[Record[String, String | RGBColor | HSLColor]] = js.undefined
  
  /** A list of columns, where the first element in each column is the ID and the remaining elements are data. If `data`, `url`, `json`, or 'rows' are provided, this will be ignored. */
  var columns: js.UndefOr[js.Array[Array[String | Primitive]]] = js.undefined
  
  /** Data to load. */
  var data: js.UndefOr[typings.c3.mod.Data] = js.undefined
  
  /** Called when loading completes. */
  var done: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * An object to convert to data to load. Can be in the column form
    * (`{key1: [val1, val2, ...]; ...}`) or in the row form (`[{key1: val1; key2: val2}, ...]`).
    * If `data` or `url` are provided this will be ignored.
    */
  var json: js.UndefOr[(Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])] = js.undefined
  
  /** If json is provided and is in row form, these keys are used to pull the data from each row. */
  var keys: js.UndefOr[Value] = js.undefined
  
  /** Match loaded data IDs with display names. */
  var names: js.UndefOr[Record[String, String]] = js.undefined
  
  /** A list of rows, where the first row is the column names and the remaining rows are data.  If `data`, `url`, or `json` are provided this will be ignored.  */
  var rows: js.UndefOr[js.Array[PrimitiveArray]] = js.undefined
  
  /** Select the plot type for the loaded data. */
  var `type`: js.UndefOr[ChartType] = js.undefined
  
  /** Select the plot types for each individual data by ID. */
  var types: js.UndefOr[Record[String, ChartType]] = js.undefined
  
  /** ID of data to remove, or list of IDs of data to remove, or `true` to remove all data. */
  var unload: js.UndefOr[`true` | ArrayOrString] = js.undefined
  
  /** API url to load data from. If `data` is provided this will be ignored. */
  var url: js.UndefOr[String] = js.undefined
  
  /** Match x columns to the corresponding data columns. */
  var xs: js.UndefOr[Record[String, String]] = js.undefined
}
object Axes {
  
  inline def apply(): Axes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axes]
  }
  
  extension [Self <: Axes](x: Self) {
    
    inline def setAxes(value: Record[String, AxisName]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setCategories(value: js.Array[js.Array[String]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: js.Array[String]*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setClasses(value: Record[String, String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColors(value: Record[String, String | RGBColor | HSLColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColumns(value: js.Array[Array[String | Primitive]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: (Array[String | Primitive])*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setData(value: typings.c3.mod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setJson(value: (Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setJsonVarargs(value: (Record[String, Primitive])*): Self = StObject.set(x, "json", js.Array(value*))
    
    inline def setKeys(value: Value): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setNames(value: Record[String, String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setRows(value: js.Array[PrimitiveArray]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: PrimitiveArray*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setType(value: ChartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypes(value: Record[String, ChartType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setUnload(value: `true` | ArrayOrString): Self = StObject.set(x, "unload", value.asInstanceOf[js.Any])
    
    inline def setUnloadUndefined: Self = StObject.set(x, "unload", js.undefined)
    
    inline def setUnloadVarargs(value: String*): Self = StObject.set(x, "unload", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setXs(value: Record[String, String]): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    
    inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
  }
}
