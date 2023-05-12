package typings.chartJs.anon

import typings.chartJs.chartJsStrings.options
import typings.chartJs.distCoreCoreDotadaptersMod.DateAdapter
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.std.Omit
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDateAdapterBase extends StObject {
  
  /**
    * Override default date adapter methods.
    * Accepts type parameter to define options type.
    * @example
    * Chart._adapters._date.override<{myAdapterOption: string}>({
    *   init() {
    *     console.log(this.options.myAdapterOption);
    *   }
    * })
    */
  /* static member */
  @JSName("override")
  def override_options[T /* <: AnyObject */](members: Partial[Omit[DateAdapter[T], options]]): Unit
}
object TypeofDateAdapterBase {
  
  inline def apply(`override`: Partial[Omit[DateAdapter[Any], options]] => Unit): TypeofDateAdapterBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("override")(js.Any.fromFunction1(`override`))
    __obj.asInstanceOf[TypeofDateAdapterBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDateAdapterBase] (val x: Self) extends AnyVal {
    
    inline def setOverride(value: Partial[Omit[DateAdapter[Any], options]] => Unit): Self = StObject.set(x, "override", js.Any.fromFunction1(value))
  }
}
