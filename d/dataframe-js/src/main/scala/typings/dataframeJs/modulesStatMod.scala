package typings.dataframeJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesStatMod {
  
  /**
    * Stat module for DataFrame, providing basic statistical metrics for numeric columns.
    */
  @JSImport("dataframe-js/modules/stat", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Stat {
    /**
      * Start the Stat module.
      * @param df An instance of DataFrame.
      */
    def this(df: Any) = this()
  }
  
  /**
    * Stat module for DataFrame, providing basic statistical metrics for numeric columns.
    */
  @js.native
  trait Stat extends StObject {
    
    def _castAsNumber(columnName: Any): Any = js.native
    
    /**
      * Compute the mean value into a numeric column.
      * Alias from mean.
      * @param columnName The column to evaluate, containing Numbers.
      * @returns The mean value into the column.
      * @example
      * df.stat.min('column1')
      */
    def average(columnName: String): Double = js.native
    
    var df: Any = js.native
    
    /**
      * Compute the maximal value into a numeric column.
      * @param columnName The column to evaluate, containing Numbers.
      * @returns The maximal value into the column.
      * @example
      * df.stat.max('column1')
      */
    def max(columnName: String): Double = js.native
    
    /**
      * Compute the mean value into a numeric column.
      * @param columnName The column to evaluate,isNumber(n.get(columnName)) ? p + Number( containing Numbers.
      * @returns The mean value into the column.
      * @example
      * df.stat.mean('column1')
      */
    def mean(columnName: String): Double = js.native
    
    /**
      * Compute the minimal value into a numeric column.
      * @param columnName The column to evaluate, containing Numbers.
      * @returns The minimal value into the column.
      * @example
      * df.stat.min('column1')
      */
    def min(columnName: String): Double = js.native
    
    var name: String = js.native
    
    /**
      * Compute the standard deviation into a numeric column.
      * @param columnName The column to evaluate, containing Numbers.
      * @param [population=false] Population mode. If true, provide the population standard deviation, not the sample one.
      * @returns The standard deviation into the column.
      * @example
      * df.stat.sd('column1')
      */
    def sd(columnName: String): Double = js.native
    def sd(columnName: String, population: Boolean): Double = js.native
    
    /**
      * Compute all the stats available with the Stat module on a numeric column.
      * @param columnName The column to evaluate, containing Numbers.
      * @returns An dictionnary containing all statistical metrics available.
      * @example
      * df.stat.stats('column1')
      */
    def stats(columnName: String): Any = js.native
    
    /**
      * Compute the sum of a numeric column.
      * @param columnName The column to evaluate, containing Numbers.
      * @returns The sum of the column.
      * @example
      * df.stat.sum('column1')
      */
    def sum(columnName: String): Double = js.native
    
    /**
      * Compute the variance into a numeric column.
      * @param columnName The column to evaluate, containing Numbers.
      * @param [population=false] Population mode. If true, provide the population variance, not the sample one.
      * @returns The variance into the column.
      * @example
      * df.stat.var('column1')
      */
    def `var`(columnName: String): Double = js.native
    def `var`(columnName: String, population: Boolean): Double = js.native
  }
}
