package typings.bootstrapTouchspin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TouchSpinOptions. All options are optional
  */
@js.native
trait TouchSpinOptions extends js.Object {
  
  /**
    * Boost at every nth step.
    */
  var boostat: js.UndefOr[Double] = js.native
  
  /**
    * If enabled, the the spinner is continually becoming faster as holding the button.
    */
  var booster: js.UndefOr[Boolean] = js.native
  
  /**
    * Class(es) of down button.
    */
  var buttondown_class: js.UndefOr[String] = js.native
  
  /**
    * Class(es) of up button.
    */
  var buttonup_class: js.UndefOr[String] = js.native
  
  /**
    * Number of decimal points.
    */
  var decimals: js.UndefOr[Double] = js.native
  
  /**
    * How to force the value to be divisible by step value: 'none' | 'round' | 'floor' | 'ceil'
    */
  var forcestepdivisibility: js.UndefOr[String] = js.native
  
  /**
    * Applied when no explicit value is set on the input with the value attribute.
    * Empty string means that the value remains empty on initialization.
    */
  var initval: js.UndefOr[Double | String] = js.native
  
  /**
    * Maximum value.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Maximum step when boosted.
    */
  var maxboostedstep: js.UndefOr[Double | Boolean] = js.native
  
  /**
    * Minimum value.
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * Enables the mouse wheel to change the value of the input.
    */
  var mousewheel: js.UndefOr[Boolean] = js.native
  
  /**
    * Text after the input.
    */
  var postfix: js.UndefOr[String] = js.native
  
  /**
    * Extra class(es) for postfix.
    */
  var postfix_extraclass: js.UndefOr[String] = js.native
  
  /**
    * Text before the input.
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * Extra class(es) for prefix.
    */
  var prefix_extraclass: js.UndefOr[String] = js.native
  
  /**
    * Incremental/decremental step on up/down change.
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * Refresh rate of the spinner in milliseconds.
    */
  var stepinterval: js.UndefOr[Double] = js.native
  
  /**
    * Time in milliseconds before the spinner starts to spin.
    */
  var stepintervaldelay: js.UndefOr[Double] = js.native
  
  /**
    * Enables the traditional up/down buttons.
    */
  var verticalbuttons: js.UndefOr[Boolean] = js.native
  
  /**
    * Class of the down button with vertical buttons mode enabled.
    */
  var verticaldownclass: js.UndefOr[String] = js.native
  
  /**
    * Class of the up button with vertical buttons mode enabled.
    */
  var verticalupclass: js.UndefOr[String] = js.native
}
object TouchSpinOptions {
  
  @scala.inline
  def apply(): TouchSpinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchSpinOptions]
  }
  
  @scala.inline
  implicit class TouchSpinOptionsOps[Self <: TouchSpinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoostat(value: Double): Self = this.set("boostat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoostat: Self = this.set("boostat", js.undefined)
    
    @scala.inline
    def setBooster(value: Boolean): Self = this.set("booster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooster: Self = this.set("booster", js.undefined)
    
    @scala.inline
    def setButtondown_class(value: String): Self = this.set("buttondown_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtondown_class: Self = this.set("buttondown_class", js.undefined)
    
    @scala.inline
    def setButtonup_class(value: String): Self = this.set("buttonup_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonup_class: Self = this.set("buttonup_class", js.undefined)
    
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimals: Self = this.set("decimals", js.undefined)
    
    @scala.inline
    def setForcestepdivisibility(value: String): Self = this.set("forcestepdivisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForcestepdivisibility: Self = this.set("forcestepdivisibility", js.undefined)
    
    @scala.inline
    def setInitval(value: Double | String): Self = this.set("initval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitval: Self = this.set("initval", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxboostedstep(value: Double | Boolean): Self = this.set("maxboostedstep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxboostedstep: Self = this.set("maxboostedstep", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMousewheel(value: Boolean): Self = this.set("mousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMousewheel: Self = this.set("mousewheel", js.undefined)
    
    @scala.inline
    def setPostfix(value: String): Self = this.set("postfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostfix: Self = this.set("postfix", js.undefined)
    
    @scala.inline
    def setPostfix_extraclass(value: String): Self = this.set("postfix_extraclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostfix_extraclass: Self = this.set("postfix_extraclass", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPrefix_extraclass(value: String): Self = this.set("prefix_extraclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix_extraclass: Self = this.set("prefix_extraclass", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setStepinterval(value: Double): Self = this.set("stepinterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepinterval: Self = this.set("stepinterval", js.undefined)
    
    @scala.inline
    def setStepintervaldelay(value: Double): Self = this.set("stepintervaldelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepintervaldelay: Self = this.set("stepintervaldelay", js.undefined)
    
    @scala.inline
    def setVerticalbuttons(value: Boolean): Self = this.set("verticalbuttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalbuttons: Self = this.set("verticalbuttons", js.undefined)
    
    @scala.inline
    def setVerticaldownclass(value: String): Self = this.set("verticaldownclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticaldownclass: Self = this.set("verticaldownclass", js.undefined)
    
    @scala.inline
    def setVerticalupclass(value: String): Self = this.set("verticalupclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalupclass: Self = this.set("verticalupclass", js.undefined)
  }
}
