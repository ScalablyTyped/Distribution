package typings.cornerstoneCore.mod

import typings.cornerstoneCore.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colors {
  
  @JSImport("cornerstone-core", "colors")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Maps scalar values into colors via a lookup table
    * LookupTable is an object that is used by mapper objects to map scalar values into rgba (red-green-blue-alpha transparency) color specification,
    * or rgba into scalar values. The color table can be created by direct insertion of color values, or by specifying hue, saturation, value, and alpha range and generating a table
    */
  @JSImport("cornerstone-core", "colors.LookupTable")
  @js.native
  open class LookupTable () extends StObject {
    
    var AboveRangeColor: js.Array[Double] = js.native
    
    var AlphaRange: js.Array[Double] = js.native
    
    var BelowRangeColor: js.Array[Double] = js.native
    
    var HueRange: js.Array[Double] = js.native
    
    var InputRange: js.Array[Double] = js.native
    
    var NaNColor: js.Array[Double] = js.native
    
    var NumberOfColors: Double = js.native
    
    var Ramp: String = js.native
    
    var SaturationRange: js.Array[Double] = js.native
    
    var Table: js.Array[Any] = js.native
    
    var TableRange: js.Array[Double] = js.native
    
    var UseAboveRangeColor: Boolean = js.native
    
    var UseBelowRangeColor: Boolean = js.native
    
    var ValueRange: js.Array[Double] = js.native
    
    /**
      * Generate lookup table from hue, saturation, value, alpha min/max values. Table is built from linear ramp of each value.
      * @param force true to force the build of the LookupTable. Otherwie, false. This is useful if a lookup table has been defined manually
      * (using SetTableValue) and then an application decides to rebuild the lookup table using the implicit process.
      */
    def build(force: Boolean): Unit = js.native
    
    /**
      * Ensures the out-of-range colors (Below range and Above range) are set correctly.
      */
    def buildSpecialColors(): Unit = js.native
    
    /**
      * Map one value through the lookup table and return the color as an
      * RGBA array of doubles between 0 and 1.
      * @param scalar A double scalar value which will be mapped to a color in the LookupTable
      * @returns An RGBA array of doubles between 0 and 1
      */
    def getColor(scalar: Double): js.Array[Double] = js.native
    
    /**
      * Return the table index associated with a particular value.
      * @param v A double value which table index will be returned.
      * @returns The index in the LookupTable
      */
    def getIndex(v: Double): Double = js.native
    
    /**
      * Similar to GetColor - Map one value through the lookup table and return the color as an
      * RGBA array of doubles between 0 and 1.
      * @param v A double scalar value which will be mapped to a color in the LookupTable
      * @returns An RGBA array of doubles between 0 and 1
      */
    def mapValue(v: Any): js.Array[Double] = js.native
    
    /**
      * Set the range in alpha (using automatic generation). Alpha ranges from [0,1].
      * @param start A double representing the minimum alpha value
      * @param end A double representing the maximum alpha value
      */
    def setAlphaRange(start: Double, end: Double): Unit = js.native
    
    /**
      * Set the range in hue (using automatic generation). Hue ranges between [0,1].
      * @param start A double representing the minimum hue value in a range. Min. is 0
      * @param end A double representing the maximum hue value in a range. Max. is 1
      */
    def setHueRange(start: Double, end: Double): Unit = js.native
    
    /**
      * Specify the number of values (i.e., colors) in the lookup table.
      * @param number The number of colors in he LookupTable
      */
    def setNumberOfTableValues(number: Double): Unit = js.native
    
    /**
      * Set the shape of the table ramp to either 'linear', 'scurve' or 'sqrt'
      * @param ramp A string value representing the shape of the table. Allowed values are 'linear', 'scurve' or 'sqrt'
      */
    def setRamp(ramp: String): Unit = js.native
    
    /**
      * (Not Used) Sets the range of scalars which will be mapped.
      * @param start the minimum scalar value in the range
      * @param end the maximum scalar value in the range
      */
    def setRange(start: Double, end: Double): Unit = js.native
    
    /**
      * Set the range in saturation (using automatic generation). Saturation ranges between [0,1].
      * @param start A double representing the minimum Saturation value in a range. Min. is 0
      * @param end A double representing the maximum Saturation value in a range. Max. is 1
      */
    def setSaturationRange(start: Double, end: Double): Unit = js.native
    
    /**
      * Sets the minimum/maximum scalar values for scalar mapping.
      * Scalar values less than minimum range value are clamped to minimum range value.
      * Scalar values greater than maximum range value are clamped to maximum range value.
      * @param start A double representing the minimum scaler value of the LookupTable
      * @param end A double representing the maximum scaler value of the LookupTable
      */
    def setTableRange(start: Double, end: Any): Unit = js.native
    
    /**
      * Directly load color into lookup table. Use [0,1] double values for color component specification.
      * Make sure that you've either used the Build() method or used SetNumberOfTableValues() prior to using this method.
      * @param index The index in the LookupTable of where to insert the color value
      * @param rgba An array of [0,1] double values for an RGBA color component
      */
    def setTableValue(index: Double, rgba: js.Array[Double], args: Any*): Unit = js.native
    
    /**
      * Set the range in value (using automatic generation). Value ranges between [0,1].
      * @param start A double representing the minimum value in a range. Min. is 0
      * @param end A double representing the maximum value in a range. Max. is 1
      */
    def setValueRange(start: Any, end: Any): Unit = js.native
  }
  
  /**
    * Return a colorMap object with the provided id and colormapData
    * if the Id matches existent colorMap objects (check colormapsData) the colormapData is ignored.
    * if the colormapData is not empty, the colorMap will be added to the colormapsData list. Otherwise, an empty colorMap object is returned.
    * @param id The ID of the colormap
    * @param colormapData - An object that can contain a name, numColors, gama, segmentedData and/or colors
    * @returns The Colormap Object
    */
  inline def getColormap(id: String, colormapData: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getColormap")(id.asInstanceOf[js.Any], colormapData.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Return all available colormaps (id and name)
    * @returns An array of colormaps with an object containing the "id" and display "name"
    */
  inline def getColormapsList(): js.Array[Id] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColormapsList")().asInstanceOf[js.Array[Id]]
}
