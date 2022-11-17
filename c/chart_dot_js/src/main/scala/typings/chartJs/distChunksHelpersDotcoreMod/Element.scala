package typings.chartJs.distChunksHelpersDotcoreMod

import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element[T, O] extends StObject {
  
  @JSName("$animations")
  var $animations: Record[/* keyof T */ String, Animation] = js.native
  
  var active: Boolean = js.native
  
  /**
    * Gets the current or final value of each prop. Can return extra properties (whole object).
    * @param props - properties to get
    * @param [final] - get the final value (animation target)
    */
  def getProps[P /* <: js.Array[/* keyof T */ String] */](props: P): Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any
  ] = js.native
  def getProps[P /* <: js.Array[/* keyof T */ String] */](props: P, `final`: Boolean): Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any
  ] = js.native
  def getProps[P /* <: String */](props: js.Array[P]): Partial[Record[P, Any]] = js.native
  def getProps[P /* <: String */](props: js.Array[P], `final`: Boolean): Partial[Record[P, Any]] = js.native
  
  def hasValue(): Boolean = js.native
  
  var options: O = js.native
  
  def tooltipPosition(useFinalPosition: Boolean): Point1 = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
