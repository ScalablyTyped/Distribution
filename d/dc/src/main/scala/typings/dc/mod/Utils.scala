package typings.dc.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils extends StObject {
  
  def add(l: js.Date, r: String): js.Date | Double = js.native
  def add(l: js.Date, r: String, t: String): js.Date | Double = js.native
  def add(l: js.Date, r: String, t: js.Function): js.Date | Double = js.native
  def add(l: js.Date, r: Double): js.Date | Double = js.native
  def add(l: js.Date, r: Double, t: String): js.Date | Double = js.native
  def add(l: js.Date, r: Double, t: js.Function): js.Date | Double = js.native
  def add(l: Double, r: String): js.Date | Double = js.native
  def add(l: Double, r: String, t: String): js.Date | Double = js.native
  def add(l: Double, r: String, t: js.Function): js.Date | Double = js.native
  def add(l: Double, r: Double): js.Date | Double = js.native
  def add(l: Double, r: Double, t: String): js.Date | Double = js.native
  def add(l: Double, r: Double, t: js.Function): js.Date | Double = js.native
  
  def appendOrSelect(parent: Selection_[BaseType, Any, BaseType, Any], selector: String, tag: String): Selection_[BaseType, Any, BaseType, Any] = js.native
  
  def arraysEqual(): Boolean = js.native
  def arraysEqual(a1: js.Array[Any]): Boolean = js.native
  def arraysEqual(a1: js.Array[Any], a2: js.Array[Any]): Boolean = js.native
  def arraysEqual(a1: Null, a2: js.Array[Any]): Boolean = js.native
  
  def clamp(`val`: Double, min: Double, max: Double): Double = js.native
  
  def constant(x: Any): js.Function0[Any] = js.native
  
  def isFloat(n: Any): Boolean = js.native
  
  def isInteger(n: Any): Boolean = js.native
  
  def isNegligible(n: Any): Boolean = js.native
  
  def isNumber(n: Any): Boolean = js.native
  
  def nameToId(name: String): String = js.native
  
  def printSingleValue(filter: Any): String = js.native
  
  def safeNumber(n: Any): Double = js.native
  
  def subtract(l: js.Date, r: String): js.Date | Double = js.native
  def subtract(l: js.Date, r: String, t: String): js.Date | Double = js.native
  def subtract(l: js.Date, r: String, t: js.Function): js.Date | Double = js.native
  def subtract(l: js.Date, r: Double): js.Date | Double = js.native
  def subtract(l: js.Date, r: Double, t: String): js.Date | Double = js.native
  def subtract(l: js.Date, r: Double, t: js.Function): js.Date | Double = js.native
  def subtract(l: Double, r: String): js.Date | Double = js.native
  def subtract(l: Double, r: String, t: String): js.Date | Double = js.native
  def subtract(l: Double, r: String, t: js.Function): js.Date | Double = js.native
  def subtract(l: Double, r: Double): js.Date | Double = js.native
  def subtract(l: Double, r: Double, t: String): js.Date | Double = js.native
  def subtract(l: Double, r: Double, t: js.Function): js.Date | Double = js.native
  
  def uniqueId(): Double = js.native
}
