package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPrioritiesMod extends Shortcut {
  
  /**
    * Provides group of constants to use instead of hardcoding numeric priority values.
    */
  @JSImport("@ckeditor/ckeditor5-utils/src/priorities", JSImport.Default)
  @js.native
  val default: PrioritiesType = js.native
  
  @js.native
  trait PrioritiesType extends StObject {
    
    /**
      * Converts a string with priority name to it's numeric value. If `Number` is given, it just returns it.
      *
      * @param priority Priority to convert.
      * @returns Converted priority.
      */
    def get(): Double = js.native
    def get(priority: PriorityString): Double = js.native
    
    val high: Double = js.native
    
    val highest: Double = js.native
    
    val low: Double = js.native
    
    val lowest: Double = js.native
    
    val normal: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.highest
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.high
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.normal
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.low
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.lowest
    - scala.Double
  */
  type PriorityString = _PriorityString | Double
  
  trait _PriorityString extends StObject
  
  type _To = PrioritiesType
  
  /* This means you don't have to write `default`, but can instead just say `srcPrioritiesMod.foo` */
  override def _to: PrioritiesType = default
}
