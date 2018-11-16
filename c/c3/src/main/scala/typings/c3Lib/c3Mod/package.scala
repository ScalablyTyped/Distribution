package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object c3Mod {
  type ArrayOrString = js.Array[java.lang.String] | java.lang.String
  type FormatFunction = js.Function4[
    /* v */ js.Any, 
    /* id */ java.lang.String, 
    /* i */ scala.Double, 
    /* j */ scala.Double, 
    scala.Unit
  ]
  type PrimitiveArray = js.Array[java.lang.String | scala.Boolean | scala.Double | scala.Null]
}
