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
    add: js.Function2[js.Any, js.Any, js.Any],
    appendOrSelect: js.Function3[
      d3DashSelectionLib.d3DashSelectionMod.Selection[
        _, 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
        d3DashSelectionLib.d3DashSelectionMod.BaseType, 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
      ], 
      java.lang.String, 
      js.Any, 
      d3DashSelectionLib.d3DashSelectionMod.Selection[
        _, 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
        d3DashSelectionLib.d3DashSelectionMod.BaseType, 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
      ]
    ],
    clamp: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double],
    isFloat: js.Function1[js.Any, scala.Boolean],
    isInteger: js.Function1[js.Any, scala.Boolean],
    isNegligible: js.Function1[js.Any, scala.Boolean],
    isNumber: js.Function1[js.Any, scala.Boolean],
    nameToId: js.Function1[java.lang.String, java.lang.String],
    printSingleValue: js.Function1[js.Any, java.lang.String],
    safeNumber: js.Function1[js.Any, scala.Double],
    subtract: js.Function2[js.Any, js.Any, js.Any],
    uniqueId: js.Function0[scala.Double]
  ): Utils = {
    val __obj = js.Dynamic.literal(add = add, appendOrSelect = appendOrSelect, clamp = clamp, isFloat = isFloat, isInteger = isInteger, isNegligible = isNegligible, isNumber = isNumber, nameToId = nameToId, printSingleValue = printSingleValue, safeNumber = safeNumber, subtract = subtract, uniqueId = uniqueId)
  
    __obj.asInstanceOf[Utils]
  }
}

