package typings.dc.dcMod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  def add(l: Double, r: String): Date | Double = js.native
  def add(l: Double, r: String, t: String): Date | Double = js.native
  def add(l: Double, r: String, t: js.Function): Date | Double = js.native
  def add(l: Double, r: Double): Date | Double = js.native
  def add(l: Double, r: Double, t: String): Date | Double = js.native
  def add(l: Double, r: Double, t: js.Function): Date | Double = js.native
  def add(l: Date, r: String): Date | Double = js.native
  def add(l: Date, r: String, t: String): Date | Double = js.native
  def add(l: Date, r: String, t: js.Function): Date | Double = js.native
  def add(l: Date, r: Double): Date | Double = js.native
  def add(l: Date, r: Double, t: String): Date | Double = js.native
  def add(l: Date, r: Double, t: js.Function): Date | Double = js.native
  def appendOrSelect(
    parent: Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    selector: String,
    tag: String
  ): Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
  ] = js.native
  def arraysEqual(): Boolean = js.native
  def arraysEqual(a1: js.Array[_]): Boolean = js.native
  def arraysEqual(a1: js.Array[_], a2: js.Array[_]): Boolean = js.native
  def arraysEqual(a1: Null, a2: js.Array[_]): Boolean = js.native
  def clamp(`val`: Double, min: Double, max: Double): Double = js.native
  def constant(x: js.Any): js.Function0[_] = js.native
  def isFloat(n: js.Any): Boolean = js.native
  def isInteger(n: js.Any): Boolean = js.native
  def isNegligible(n: js.Any): Boolean = js.native
  def isNumber(n: js.Any): Boolean = js.native
  def nameToId(name: String): String = js.native
  def printSingleValue(filter: js.Any): String = js.native
  def safeNumber(n: js.Any): Double = js.native
  def subtract(l: Double, r: String): Date | Double = js.native
  def subtract(l: Double, r: String, t: String): Date | Double = js.native
  def subtract(l: Double, r: String, t: js.Function): Date | Double = js.native
  def subtract(l: Double, r: Double): Date | Double = js.native
  def subtract(l: Double, r: Double, t: String): Date | Double = js.native
  def subtract(l: Double, r: Double, t: js.Function): Date | Double = js.native
  def subtract(l: Date, r: String): Date | Double = js.native
  def subtract(l: Date, r: String, t: String): Date | Double = js.native
  def subtract(l: Date, r: String, t: js.Function): Date | Double = js.native
  def subtract(l: Date, r: Double): Date | Double = js.native
  def subtract(l: Date, r: Double, t: String): Date | Double = js.native
  def subtract(l: Date, r: Double, t: js.Function): Date | Double = js.native
  def uniqueId(): Double = js.native
}

