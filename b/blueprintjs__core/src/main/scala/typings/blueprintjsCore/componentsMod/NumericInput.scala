package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.PrevMaxProp
import typings.blueprintjsCore.numericInputMod.INumericInputState
import typings.blueprintjsCore.numericInputMod.NumericInputProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "NumericInput")
@js.native
open class NumericInput protected ()
  extends typings.blueprintjsCore.numericInputMod.NumericInput {
  def this(props: HTMLInputProps & NumericInputProps) = this()
  def this(props: HTMLInputProps & NumericInputProps, context: Any) = this()
}
/* static members */
object NumericInput {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "NumericInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "NumericInput.CONTINUOUS_CHANGE_DELAY")
  @js.native
  def CONTINUOUS_CHANGE_DELAY: Any = js.native
  inline def CONTINUOUS_CHANGE_DELAY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTINUOUS_CHANGE_DELAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "NumericInput.CONTINUOUS_CHANGE_INTERVAL")
  @js.native
  def CONTINUOUS_CHANGE_INTERVAL: Any = js.native
  inline def CONTINUOUS_CHANGE_INTERVAL_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTINUOUS_CHANGE_INTERVAL")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "NumericInput.VALUE_EMPTY")
  @js.native
  def VALUE_EMPTY: String = js.native
  inline def VALUE_EMPTY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_EMPTY")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "NumericInput.VALUE_ZERO")
  @js.native
  def VALUE_ZERO: String = js.native
  inline def VALUE_ZERO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_ZERO")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "NumericInput.defaultProps")
  @js.native
  def defaultProps: NumericInputProps = js.native
  inline def defaultProps_=(x: NumericInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "NumericInput.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(props: NumericInputProps, state: INumericInputState): PrevMaxProp = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PrevMaxProp]
  
  @JSImport("@blueprintjs/core/lib/esm/components", "NumericInput.getStepMaxPrecision")
  @js.native
  def getStepMaxPrecision: Any = js.native
  inline def getStepMaxPrecision_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getStepMaxPrecision")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "NumericInput.roundAndClampValue")
  @js.native
  def roundAndClampValue: Any = js.native
  inline def roundAndClampValue_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roundAndClampValue")(x.asInstanceOf[js.Any])
}
