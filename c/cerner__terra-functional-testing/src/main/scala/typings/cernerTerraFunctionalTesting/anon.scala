package typings.cernerTerraFunctionalTesting

import typings.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Colorcontrast extends StObject {
    
    /**
      * True for all themes except clinical-lowlight-theme.
      * The lowlight theme adheres to a non-default color contrast ratio and fails the default ratio check.
      * The color-contrast ratio check is disabled for lowlight theme testing.
      */
    var `color-contrast`: EnabledBoolean
    
    /**
      * This rule was introduced in axe-core v3.3 and causes failures in many Terra components.
      * The solution to address this failure vary by component. It is being disabled until a solution is identified in the future.
      *
      * Reference: https://github.com/cerner/terra-framework/issues/991
      */
    var `scrollable-region-focusable`: Enabled
  }
  object Colorcontrast {
    
    inline def apply(`color-contrast`: EnabledBoolean, `scrollable-region-focusable`: Enabled): Colorcontrast = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("color-contrast")(`color-contrast`.asInstanceOf[js.Any])
      __obj.updateDynamic("scrollable-region-focusable")(`scrollable-region-focusable`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colorcontrast]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Colorcontrast] (val x: Self) extends AnyVal {
      
      inline def `setColor-contrast`(value: EnabledBoolean): Self = StObject.set(x, "color-contrast", value.asInstanceOf[js.Any])
      
      inline def `setScrollable-region-focusable`(value: Enabled): Self = StObject.set(x, "scrollable-region-focusable", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: `false`
  }
  object Enabled {
    
    inline def apply(): Enabled = {
      val __obj = js.Dynamic.literal(enabled = false)
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: `false`): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnabledBoolean extends StObject {
    
    var enabled: Boolean
  }
  object EnabledBoolean {
    
    inline def apply(enabled: Boolean): EnabledBoolean = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnabledBoolean]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnabledBoolean] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@cerner/terra-functional-testing.@cerner/terra-functional-testing.<global>.Terra.ValidationOptions, 'rules'> */
  trait OmitValidationOptionsrule extends StObject {
    
    var mismatchTolerance: js.UndefOr[Double] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
  }
  object OmitValidationOptionsrule {
    
    inline def apply(): OmitValidationOptionsrule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitValidationOptionsrule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitValidationOptionsrule] (val x: Self) extends AnyVal {
      
      inline def setMismatchTolerance(value: Double): Self = StObject.set(x, "mismatchTolerance", value.asInstanceOf[js.Any])
      
      inline def setMismatchToleranceUndefined: Self = StObject.set(x, "mismatchTolerance", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
}
