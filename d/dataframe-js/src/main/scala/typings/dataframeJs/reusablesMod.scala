package typings.dataframeJs

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reusablesMod {
  
  @JSImport("dataframe-js/reusables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def arrayEqual(a: Any, b: Any, byOrder: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], byOrder.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def chain(data: Any, operations: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(scala.List(data.asInstanceOf[js.Any]).`++`(operations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[Any]]
  
  inline def hashCode_(str: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashCode")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isArrayOfType(value: Any, ofType: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfType")(value.asInstanceOf[js.Any], ofType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArrayOfType(value: Any, ofType: Any, index: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfType")(value.asInstanceOf[js.Any], ofType.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNumber(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def iter(data: Any, func: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("iter")(data.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def iter(data: Any, func: Any, abort: js.Function0[Boolean]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("iter")(data.asInstanceOf[js.Any], func.asInstanceOf[js.Any], abort.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def makeGenerator(x: Any): Generator[Any, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeGenerator")(x.asInstanceOf[js.Any]).asInstanceOf[Generator[Any, Unit, Any]]
  
  inline def transpose(table: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(table.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def xContains(stringToFilter: Any, patterns: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("xContains")(scala.List(stringToFilter.asInstanceOf[js.Any]).`++`(patterns.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[Any]]
  
  inline def xReplace(stringToReplace: Any, patterns: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("xReplace")(scala.List(stringToReplace.asInstanceOf[js.Any]).`++`(patterns.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def xSplit(stringToSplit: Any, patterns: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("xSplit")(scala.List(stringToSplit.asInstanceOf[js.Any]).`++`(patterns.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
}
