package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  def add(l: js.Any, r: js.Any): js.Any
  def appendOrSelect(
    parent: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    selector: java.lang.String,
    tag: js.Any
  ): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ]
  def clamp(n: scala.Double, min: scala.Double, max: scala.Double): scala.Double
  def isFloat(n: js.Any): scala.Boolean
  def isInteger(n: js.Any): scala.Boolean
  def isNegligible(n: js.Any): scala.Boolean
  def isNumber(n: js.Any): scala.Boolean
  def nameToId(name: java.lang.String): java.lang.String
  def printSingleValue(filter: js.Any): java.lang.String
  def safeNumber(n: js.Any): scala.Double
  def subtract(l: js.Any, r: js.Any): js.Any
  def uniqueId(): scala.Double
}

object Utils {
  @scala.inline
  def apply(
    add: (js.Any, js.Any) => js.Any,
    appendOrSelect: (d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ], java.lang.String, js.Any) => d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    clamp: (scala.Double, scala.Double, scala.Double) => scala.Double,
    isFloat: js.Any => scala.Boolean,
    isInteger: js.Any => scala.Boolean,
    isNegligible: js.Any => scala.Boolean,
    isNumber: js.Any => scala.Boolean,
    nameToId: java.lang.String => java.lang.String,
    printSingleValue: js.Any => java.lang.String,
    safeNumber: js.Any => scala.Double,
    subtract: (js.Any, js.Any) => js.Any,
    uniqueId: () => scala.Double
  ): Utils = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), appendOrSelect = js.Any.fromFunction3(appendOrSelect), clamp = js.Any.fromFunction3(clamp), isFloat = js.Any.fromFunction1(isFloat), isInteger = js.Any.fromFunction1(isInteger), isNegligible = js.Any.fromFunction1(isNegligible), isNumber = js.Any.fromFunction1(isNumber), nameToId = js.Any.fromFunction1(nameToId), printSingleValue = js.Any.fromFunction1(printSingleValue), safeNumber = js.Any.fromFunction1(safeNumber), subtract = js.Any.fromFunction2(subtract), uniqueId = js.Any.fromFunction0(uniqueId))
  
    __obj.asInstanceOf[Utils]
  }
}

