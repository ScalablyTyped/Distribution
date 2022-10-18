package typings.blueprintjsTable

import typings.blueprintjsTable.libEsmTablePropsMod.TablePropsWithDefaults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmTableUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/tableUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clampNumFrozenColumns(props: TablePropsWithDefaults): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clampNumFrozenColumns")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def clampNumFrozenRows(props: TablePropsWithDefaults): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clampNumFrozenRows")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hasLoadingOption(loadingOptions: js.Array[String], loadingOption: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasLoadingOption")(loadingOptions.asInstanceOf[js.Any], loadingOption.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasLoadingOption(loadingOptions: Unit, loadingOption: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasLoadingOption")(loadingOptions.asInstanceOf[js.Any], loadingOption.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
