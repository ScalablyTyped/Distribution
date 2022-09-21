package typings.dataframeJs

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod {
  
  @JSImport("dataframe-js/group", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dataframe-js/group", "GroupedDataFrame")
  @js.native
  open class GroupedDataFrame protected () extends StObject {
    /**
      * Create a GroupedDataFrame. Used in DataFrame.groupBy('columnName').
      * @param df The DataFrame to group by.
      * @param columnName The column used for the group by.
      * @example
      * df.groupBy('column1');
      * //or
      * groupBy(df, ['column1']);
      */
    def this(df: Any, columnNames: Any, groups: Any, hashes: Any) = this()
    
    /**
      * Create an aggregation from a function.
      * @param func The aggregation function.
      * @param [columnName='aggregation'] The column name created by the aggregation.
      * @returns A new DataFrame with a column 'aggregation' containing the result.
      * @example
      * groupedDF.aggregate(group => group.stat.sum('column1'));
      */
    def aggregate(func: js.Function0[Any]): Any = js.native
    def aggregate(func: js.Function0[Any], columnName: String): Any = js.native
    
    /**
      * Chain maps and filters functions on DataFrame by optimizing their executions.
      * If a function returns boolean, it's a filter. Else it's a map.
      * It can be 10 - 100 x faster than standard chains of .map() and .filter().
      * @param funcs Functions to apply on the DataFrame rows taking the row as parameter.
      * @returns A new DataFrame with modified rows.
      * @example
      * groupedDF.chain(
      *      (row, i) => (i === 0), // filter
      *      row => row.set('column1', 3),  // map
      *      row => row.get('column2') === '5' // filter
      * )
      */
    def chain(funcs: js.Function0[Any]*): Any = js.native
    
    var df: Any = js.native
    
    /**
      * Filter a grouped DataFrame.
      * @param condition A filter function or a column/value object.
      * @returns A new filtered DataFrame.
      * @example
      * groupedDF.filter((row,i) => (i === 0));
      */
    def filter(condition: js.Function0[Any]): Any = js.native
    
    def get(hash: Any): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[Any, Any, Any]] = js.native
    
    /**
      * List GroupedDataFrame groups.
      * @returns An Array containing GroupedDataFrame group names.
      * @example
      * gdf.listGroups()
      */
    def listGroups(): js.Array[Any] = js.native
    
    /**
      * List GroupedDataFrame groups as a hashCode.
      * @returns An Array containing GroupedDataFrame hash codes.
      * @example
      * gdf.listHashCodes()
      */
    def listHashs(): js.Array[Any] = js.native
    
    /**
      * Map on DataFrame groups.
      * @param func The function to apply to each row of each group.
      * @returns A new DataFrame containing the result.
      * @example
      * groupedDF.map((row,i) => row.set('b', row.get('a')*i));
      */
    def map(func: js.Function0[Any]): Any = js.native
    
    /**
      * Melt a DataFrame to make it tidy. It's the reverse of GroupedDataFrame.pivot().
      * @param [variableColumnName='variable'] The column name containing columns.
      * @param [variableColumnName='value'] The column name containing values.
      * @returns The tidy DataFrame.
      * @example
      * df.groupBy('carType').melt('kms')
      */
    def melt(): Any = js.native
    def melt(variableColumnName: String): Any = js.native
    def melt(variableColumnName: String, valueColumnName: String): Any = js.native
    def melt(variableColumnName: Unit, valueColumnName: String): Any = js.native
    
    var on: Any = js.native
    
    /**
      * Pivot a GroupedDataFrame.
      * @param columnToPivot The column which will be transposed as columns.
      * @param [func=(gdf) => gdf.count()] The function to define each column value from a DataFrame.
      * @returns The pivot DataFrame.
      * @example
      * df.groupBy('carType').pivot('carModel', values => values.stat.sum('kms'))
      */
    def pivot(columnToPivot: String): Any = js.native
    def pivot(columnToPivot: String, func: js.Function0[Any]): Any = js.native
    
    /**
      * Display the GroupedDataFrame as String Table.
      * @param [quiet=false] Quiet mode. If true, it doesn't trigger console.log().
      * @returns The GroupedDataFrame as String Table.
      * @example
      * groupedDf.show()
      */
    def show(): String = js.native
    def show(quiet: Boolean): String = js.native
    
    /**
      * Convert GroupedDataFrame into collection (Array) of dictionnaries (Object).
      * @returns An Array containing group: {groupKey, group}.
      * @example
      * groupedDF.toCollection();
      */
    def toCollection(): js.Array[Any] = js.native
  }
  
  inline def groupBy(df: Any, columnNames: Any): GroupedDataFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(df.asInstanceOf[js.Any], columnNames.asInstanceOf[js.Any])).asInstanceOf[GroupedDataFrame]
}
