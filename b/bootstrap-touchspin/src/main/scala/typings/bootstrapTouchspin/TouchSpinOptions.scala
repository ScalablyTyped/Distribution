package typings.bootstrapTouchspin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TouchSpinOptions. All options are optional
  */
trait TouchSpinOptions extends StObject {
  
  /**
    * Boost at every nth step.
    */
  var boostat: js.UndefOr[Double] = js.undefined
  
  /**
    * If enabled, the the spinner is continually becoming faster as holding the button.
    */
  var booster: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Class(es) of down button.
    */
  var buttondown_class: js.UndefOr[String] = js.undefined
  
  /**
    * Class(es) of up button.
    */
  var buttonup_class: js.UndefOr[String] = js.undefined
  
  /**
    * Number of decimal points.
    */
  var decimals: js.UndefOr[Double] = js.undefined
  
  /**
    * How to force the value to be divisible by step value: 'none' | 'round' | 'floor' | 'ceil'
    */
  var forcestepdivisibility: js.UndefOr[String] = js.undefined
  
  /**
    * Applied when no explicit value is set on the input with the value attribute.
    * Empty string means that the value remains empty on initialization.
    */
  var initval: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Maximum value.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum step when boosted.
    */
  var maxboostedstep: js.UndefOr[Double | Boolean] = js.undefined
  
  /**
    * Minimum value.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Enables the mouse wheel to change the value of the input.
    */
  var mousewheel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Text after the input.
    */
  var postfix: js.UndefOr[String] = js.undefined
  
  /**
    * Extra class(es) for postfix.
    */
  var postfix_extraclass: js.UndefOr[String] = js.undefined
  
  /**
    * Text before the input.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * Extra class(es) for prefix.
    */
  var prefix_extraclass: js.UndefOr[String] = js.undefined
  
  /**
    * Incremental/decremental step on up/down change.
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * Refresh rate of the spinner in milliseconds.
    */
  var stepinterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Time in milliseconds before the spinner starts to spin.
    */
  var stepintervaldelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Enables the traditional up/down buttons.
    */
  var verticalbuttons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Class of the down button with vertical buttons mode enabled.
    */
  var verticaldownclass: js.UndefOr[String] = js.undefined
  
  /**
    * Class of the up button with vertical buttons mode enabled.
    */
  var verticalupclass: js.UndefOr[String] = js.undefined
}
object TouchSpinOptions {
  
  inline def apply(): TouchSpinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchSpinOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchSpinOptions] (val x: Self) extends AnyVal {
    
    inline def setBoostat(value: Double): Self = StObject.set(x, "boostat", value.asInstanceOf[js.Any])
    
    inline def setBoostatUndefined: Self = StObject.set(x, "boostat", js.undefined)
    
    inline def setBooster(value: Boolean): Self = StObject.set(x, "booster", value.asInstanceOf[js.Any])
    
    inline def setBoosterUndefined: Self = StObject.set(x, "booster", js.undefined)
    
    inline def setButtondown_class(value: String): Self = StObject.set(x, "buttondown_class", value.asInstanceOf[js.Any])
    
    inline def setButtondown_classUndefined: Self = StObject.set(x, "buttondown_class", js.undefined)
    
    inline def setButtonup_class(value: String): Self = StObject.set(x, "buttonup_class", value.asInstanceOf[js.Any])
    
    inline def setButtonup_classUndefined: Self = StObject.set(x, "buttonup_class", js.undefined)
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    inline def setForcestepdivisibility(value: String): Self = StObject.set(x, "forcestepdivisibility", value.asInstanceOf[js.Any])
    
    inline def setForcestepdivisibilityUndefined: Self = StObject.set(x, "forcestepdivisibility", js.undefined)
    
    inline def setInitval(value: Double | String): Self = StObject.set(x, "initval", value.asInstanceOf[js.Any])
    
    inline def setInitvalUndefined: Self = StObject.set(x, "initval", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxboostedstep(value: Double | Boolean): Self = StObject.set(x, "maxboostedstep", value.asInstanceOf[js.Any])
    
    inline def setMaxboostedstepUndefined: Self = StObject.set(x, "maxboostedstep", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMousewheel(value: Boolean): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    inline def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
    
    inline def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
    
    inline def setPostfixUndefined: Self = StObject.set(x, "postfix", js.undefined)
    
    inline def setPostfix_extraclass(value: String): Self = StObject.set(x, "postfix_extraclass", value.asInstanceOf[js.Any])
    
    inline def setPostfix_extraclassUndefined: Self = StObject.set(x, "postfix_extraclass", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setPrefix_extraclass(value: String): Self = StObject.set(x, "prefix_extraclass", value.asInstanceOf[js.Any])
    
    inline def setPrefix_extraclassUndefined: Self = StObject.set(x, "prefix_extraclass", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStepinterval(value: Double): Self = StObject.set(x, "stepinterval", value.asInstanceOf[js.Any])
    
    inline def setStepintervalUndefined: Self = StObject.set(x, "stepinterval", js.undefined)
    
    inline def setStepintervaldelay(value: Double): Self = StObject.set(x, "stepintervaldelay", value.asInstanceOf[js.Any])
    
    inline def setStepintervaldelayUndefined: Self = StObject.set(x, "stepintervaldelay", js.undefined)
    
    inline def setVerticalbuttons(value: Boolean): Self = StObject.set(x, "verticalbuttons", value.asInstanceOf[js.Any])
    
    inline def setVerticalbuttonsUndefined: Self = StObject.set(x, "verticalbuttons", js.undefined)
    
    inline def setVerticaldownclass(value: String): Self = StObject.set(x, "verticaldownclass", value.asInstanceOf[js.Any])
    
    inline def setVerticaldownclassUndefined: Self = StObject.set(x, "verticaldownclass", js.undefined)
    
    inline def setVerticalupclass(value: String): Self = StObject.set(x, "verticalupclass", value.asInstanceOf[js.Any])
    
    inline def setVerticalupclassUndefined: Self = StObject.set(x, "verticalupclass", js.undefined)
  }
}
