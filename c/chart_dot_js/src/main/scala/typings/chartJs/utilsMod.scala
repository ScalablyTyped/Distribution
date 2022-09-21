package typings.chartJs

import org.scalablytyped.runtime.TopLevel
import typings.chartJs.chartJsStrings._DeepPartialObject
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  type DeepPartial[T] = js.UndefOr[T | DeepPartialObject[T] | DeepPartialArray[Any]]
  
  @js.native
  trait DeepPartialArray[T]
    extends StObject
       with Array[DeepPartial[T]]
  
  type DeepPartialObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? chart.js.chart.js/types/utils.DeepPartial<T[P]>}
    */ _DeepPartialObject & TopLevel[T]
  
  type DistributiveArray[T] = js.Array[T]
  
  type UnionToIntersection[U] = Any
}
