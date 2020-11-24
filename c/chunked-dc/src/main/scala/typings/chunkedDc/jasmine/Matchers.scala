package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matchers
  extends Instantiable3[/* env */ Env, /* actual */ js.Any, /* spec */ Env, js.Any]
     with Instantiable4[/* env */ Env, /* actual */ js.Any, /* spec */ Env, /* isNot */ Boolean, js.Any] {
  
  var Any: typings.chunkedDc.jasmine.Any = js.native
  
  var actual: js.Any = js.native
  
  var env: Env = js.native
  
  var isNot: js.UndefOr[Boolean] = js.native
  
  def message(): js.Any = js.native
  
  var not: Matchers = js.native
  
  var spec: Env = js.native
  
  def toBe(expected: js.Any): Boolean = js.native
  def toBe(expected: js.Any, expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeCloseTo(expected: Double, precision: js.Any): Boolean = js.native
  def toBeCloseTo(expected: Double, precision: js.Any, expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeDefined(): Boolean = js.native
  def toBeDefined(expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeFalsy(): Boolean = js.native
  def toBeFalsy(expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeGreaterThan(expected: Double): Boolean = js.native
  def toBeGreaterThan(expected: Double, expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeLessThan(expected: Double): Boolean = js.native
  def toBeLessThan(expected: Double, expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeNaN(): Boolean = js.native
  
  def toBeNull(): Boolean = js.native
  def toBeNull(expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeTruthy(): Boolean = js.native
  def toBeTruthy(expectationFailOutput: js.Any): Boolean = js.native
  
  def toBeUndefined(): Boolean = js.native
  def toBeUndefined(expectationFailOutput: js.Any): Boolean = js.native
  
  def toContain(expected: js.Any): Boolean = js.native
  def toContain(expected: js.Any, expectationFailOutput: js.Any): Boolean = js.native
  
  def toEqual(expected: js.Any): Boolean = js.native
  def toEqual(expected: js.Any, expectationFailOutput: js.Any): Boolean = js.native
  
  def toHaveBeenCalled(): Boolean = js.native
  
  def toHaveBeenCalledTimes(expected: Double): Boolean = js.native
  
  def toHaveBeenCalledWith(params: js.Any*): Boolean = js.native
  
  def toMatch(expected: String): Boolean = js.native
  def toMatch(expected: String, expectationFailOutput: js.Any): Boolean = js.native
  def toMatch(expected: RegExp): Boolean = js.native
  def toMatch(expected: RegExp, expectationFailOutput: js.Any): Boolean = js.native
  
  def toThrow(): Boolean = js.native
  def toThrow(expected: js.Any): Boolean = js.native
  
  def toThrowError(): Boolean = js.native
  def toThrowError(expected: js.UndefOr[scala.Nothing], message: String): Boolean = js.native
  def toThrowError(expected: js.UndefOr[scala.Nothing], message: RegExp): Boolean = js.native
  def toThrowError(expected: Instantiable1[/* args (repeated) */ js.Any, Error]): Boolean = js.native
  def toThrowError(expected: Instantiable1[/* args (repeated) */ js.Any, Error], message: String): Boolean = js.native
  def toThrowError(expected: Instantiable1[/* args (repeated) */ js.Any, Error], message: RegExp): Boolean = js.native
  def toThrowError(message: String): Boolean = js.native
  def toThrowError(message: RegExp): Boolean = js.native
}
