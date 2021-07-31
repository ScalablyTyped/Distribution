package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.ConfigType
import typings.dayjs.esmMod.PluginFunc
import typings.dayjs.esmMod.QUnitType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quarterOfYearMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/quarterOfYear", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `quarterOfYearMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def add(value: Double, unit: QUnitType): Dayjs = js.native
      
      def endOf(unit: QUnitType): Dayjs = js.native
      
      def isAfter(date: ConfigType): Boolean = js.native
      def isAfter(date: ConfigType, unit: QUnitType): Boolean = js.native
      
      def isBefore(date: ConfigType): Boolean = js.native
      def isBefore(date: ConfigType, unit: QUnitType): Boolean = js.native
      
      def isSame(date: ConfigType): Boolean = js.native
      def isSame(date: ConfigType, unit: QUnitType): Boolean = js.native
      
      def quarter(): Double = js.native
      def quarter(quarter: Double): Dayjs = js.native
      
      def startOf(unit: QUnitType): Dayjs = js.native
      
      def subtract(value: Double, unit: QUnitType): Dayjs = js.native
    }
  }
}
