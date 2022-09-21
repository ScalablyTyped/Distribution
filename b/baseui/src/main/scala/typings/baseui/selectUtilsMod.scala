package typings.baseui

import typings.baseui.anon.PartialSelectProps
import typings.baseui.selectTypesMod.Option
import typings.baseui.selectTypesMod.Options
import typings.baseui.selectTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectUtilsMod {
  
  @JSImport("baseui/select/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandValue(value: Option, props: PartialSelectProps): Option = (^.asInstanceOf[js.Dynamic].applyDynamic("expandValue")(value.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Option]
  
  inline def normalizeOptions(options: Options): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Value]
}
