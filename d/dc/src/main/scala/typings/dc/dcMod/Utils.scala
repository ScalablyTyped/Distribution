package typings.dc.dcMod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  def add(l: js.Any, r: js.Any): js.Any
  def appendOrSelect(
    parent: Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    selector: String,
    tag: js.Any
  ): Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ]
  def clamp(n: Double, min: Double, max: Double): Double
  def isFloat(n: js.Any): Boolean
  def isInteger(n: js.Any): Boolean
  def isNegligible(n: js.Any): Boolean
  def isNumber(n: js.Any): Boolean
  def nameToId(name: String): String
  def printSingleValue(filter: js.Any): String
  def safeNumber(n: js.Any): Double
  def subtract(l: js.Any, r: js.Any): js.Any
  def uniqueId(): Double
}

object Utils {
  @scala.inline
  def apply(
    add: (js.Any, js.Any) => js.Any,
    appendOrSelect: (Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ], String, js.Any) => Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    clamp: (Double, Double, Double) => Double,
    isFloat: js.Any => Boolean,
    isInteger: js.Any => Boolean,
    isNegligible: js.Any => Boolean,
    isNumber: js.Any => Boolean,
    nameToId: String => String,
    printSingleValue: js.Any => String,
    safeNumber: js.Any => Double,
    subtract: (js.Any, js.Any) => js.Any,
    uniqueId: () => Double
  ): Utils = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), appendOrSelect = js.Any.fromFunction3(appendOrSelect), clamp = js.Any.fromFunction3(clamp), isFloat = js.Any.fromFunction1(isFloat), isInteger = js.Any.fromFunction1(isInteger), isNegligible = js.Any.fromFunction1(isNegligible), isNumber = js.Any.fromFunction1(isNumber), nameToId = js.Any.fromFunction1(nameToId), printSingleValue = js.Any.fromFunction1(printSingleValue), safeNumber = js.Any.fromFunction1(safeNumber), subtract = js.Any.fromFunction2(subtract), uniqueId = js.Any.fromFunction0(uniqueId))
  
    __obj.asInstanceOf[Utils]
  }
}

