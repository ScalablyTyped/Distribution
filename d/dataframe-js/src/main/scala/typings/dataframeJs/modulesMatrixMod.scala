package typings.dataframeJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesMatrixMod {
  
  /**
    * Matrix module for DataFrame, providing basic mathematical matrix computations.
    */
  @JSImport("dataframe-js/modules/matrix", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Matrix {
    /**
      * Start the Matrix module.
      * @param df An instance of DataFrame.
      */
    def this(df: typings.dataframeJs.dataframeMod.default) = this()
  }
  
  /**
    * Matrix module for DataFrame, providing basic mathematical matrix computations.
    */
  @js.native
  trait Matrix extends StObject {
    
    /**
      * Provide an elements pairwise addition of two DataFrames having the same dimensions.
      * @param df The second DataFrame to add.
      * @returns A new DataFrame resulting to the addition two DataFrames.
      * @example
      * df.matrix.add(df2)
      */
    def add(df: typings.dataframeJs.dataframeMod.default): typings.dataframeJs.dataframeMod.default = js.native
    
    var df: typings.dataframeJs.dataframeMod.default = js.native
    
    /**
      * Multiply one DataFrame n x p and a second p x n.
      * @param df The second DataFrame to multiply.
      * @returns A new n x n DataFrame resulting to the product of two DataFrame.
      * @example
      * df.matrix.dot(df)
      */
    def dot(df: typings.dataframeJs.dataframeMod.default): typings.dataframeJs.dataframeMod.default = js.native
    
    /**
      * Check if two DataFrames are commutative, if both have the same dimensions.
      * @param df The second DataFrame to check.
      * @param [reverse = false] Revert the second DataFrame before the comparison.
      * @returns True if they are commutative, else false.
      * @example
      * df.matrix.isCommutative(df2)
      */
    def isCommutative(df: typings.dataframeJs.dataframeMod.default): Boolean = js.native
    def isCommutative(df: typings.dataframeJs.dataframeMod.default, reverse: Boolean): Boolean = js.native
    
    var name: String = js.native
    
    /**
      * Provide a scalar product between a number and a DataFrame.
      * @param number The number to multiply.
      * @returns A new DataFrame resulting to the scalar product.
      * @example
      * df.matrix.product(6)
      */
    def product(number: Double): typings.dataframeJs.dataframeMod.default = js.native
  }
}
