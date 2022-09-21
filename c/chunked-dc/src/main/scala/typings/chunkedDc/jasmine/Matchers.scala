package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matchers
  extends StObject
     with Instantiable3[/* env */ Env, /* actual */ scala.Any, /* spec */ Env, scala.Any]
     with Instantiable4[/* env */ Env, /* actual */ scala.Any, /* spec */ Env, /* isNot */ Boolean, scala.Any] {
  
  var Any: typings.chunkedDc.jasmine.Any = js.native
  
  var actual: scala.Any = js.native
  
  var env: Env = js.native
  
  var isNot: js.UndefOr[Boolean] = js.native
  
  def message(): scala.Any = js.native
  
  var not: Matchers = js.native
  
  var spec: Env = js.native
  
  def toBe(expected: scala.Any): Boolean = js.native
  def toBe(expected: scala.Any, expectationFailOutput: scala.Any): Boolean = js.native
  
  def toBeCloseTo(expected: Double, precision: scala.Any): Boolean = js.native
  def toBeCloseTo(expected: Double, precision: scala.Any, expectationFailOutput: scala.Any): Boolean = js.native
  
  def toBeDefined(): Boolean = js.native
  def toBeDefined(expectationFailOutput: scala.Any): Boolean = js.native
  
  def toBeFalsy(): Boolean = js.native
  def toBeFalsy(expectationFailOutput: scala.Any): Boolean = js.native
  
  def toBeGreaterThan(expected: Double): Boolean = js.native
  def toBeGreaterThan(expected: Double, expectationFailOutput: scala.Any): Boolean = js.native
  
  def toBeLessThan(expected: Double): Boolean = js.native
  def toBeLessThan(expected: Double, expectationFailOutput: scala.Any): Boolean = js.native
  
  def toBeNaN(): Boolean = js.native
  
  def toBeNull(): Boolean = js.native
  def toBeNull(expectationFailOutput: scala.Any): Boolean = js.native
  
  def toBeTruthy(): Boolean = js.native
  def toBeTruthy(expectationFailOutput: scala.Any): Boolean = js.native
  
  def toBeUndefined(): Boolean = js.native
  def toBeUndefined(expectationFailOutput: scala.Any): Boolean = js.native
  
  def toContain(expected: scala.Any): Boolean = js.native
  def toContain(expected: scala.Any, expectationFailOutput: scala.Any): Boolean = js.native
  
  def toEqual(expected: scala.Any): Boolean = js.native
  def toEqual(expected: scala.Any, expectationFailOutput: scala.Any): Boolean = js.native
  
  def toHaveBeenCalled(): Boolean = js.native
  
  def toHaveBeenCalledTimes(expected: Double): Boolean = js.native
  
  def toHaveBeenCalledWith(params: scala.Any*): Boolean = js.native
  
  def toMatch(expected: String): Boolean = js.native
  def toMatch(expected: String, expectationFailOutput: scala.Any): Boolean = js.native
  def toMatch(expected: js.RegExp): Boolean = js.native
  def toMatch(expected: js.RegExp, expectationFailOutput: scala.Any): Boolean = js.native
  
  def toThrow(): Boolean = js.native
  def toThrow(expected: scala.Any): Boolean = js.native
  
  def toThrowError(): Boolean = js.native
  def toThrowError(expected: Instantiable1[/* args (repeated) */ scala.Any, js.Error]): Boolean = js.native
  def toThrowError(expected: Instantiable1[/* args (repeated) */ scala.Any, js.Error], message: String): Boolean = js.native
  def toThrowError(expected: Instantiable1[/* args (repeated) */ scala.Any, js.Error], message: js.RegExp): Boolean = js.native
  def toThrowError(expected: Unit, message: String): Boolean = js.native
  def toThrowError(expected: Unit, message: js.RegExp): Boolean = js.native
  def toThrowError(message: String): Boolean = js.native
  def toThrowError(message: js.RegExp): Boolean = js.native
}
