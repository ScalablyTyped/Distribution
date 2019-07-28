package typings.d3DashDsv

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashDsvMod {
  type DSVRaw[T /* <: js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof T ]: string | undefined}
    */ typings.d3DashDsv.d3DashDsvStrings.DSVRaw with js.Any
  type DSVRowAny = StringDictionary[js.Any]
  type DSVRowString[Columns /* <: String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in Columns ]: string | undefined}
    */ typings.d3DashDsv.d3DashDsvStrings.DSVRowString with js.Any
}
