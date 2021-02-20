package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iInspectableMod {
  
  @js.native
  sealed trait InspectableType extends StObject
  @JSImport("babylonjs/Misc/iInspectable", "InspectableType")
  @js.native
  object InspectableType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InspectableType with Double] = js.native
    
    /**
      * Checkbox for booleans
      */
    @js.native
    sealed trait Checkbox extends InspectableType
    /* 0 */ val Checkbox: typings.babylonjs.iInspectableMod.InspectableType.Checkbox with Double = js.native
    
    /**
      * Color3
      */
    @js.native
    sealed trait Color3 extends InspectableType
    /* 4 */ val Color3: typings.babylonjs.iInspectableMod.InspectableType.Color3 with Double = js.native
    
    /**
      * Quaternions
      */
    @js.native
    sealed trait Quaternion extends InspectableType
    /* 3 */ val Quaternion: typings.babylonjs.iInspectableMod.InspectableType.Quaternion with Double = js.native
    
    /**
      * Sliders for numbers
      */
    @js.native
    sealed trait Slider extends InspectableType
    /* 1 */ val Slider: typings.babylonjs.iInspectableMod.InspectableType.Slider with Double = js.native
    
    /**
      * String
      */
    @js.native
    sealed trait String extends InspectableType
    /* 5 */ val String: typings.babylonjs.iInspectableMod.InspectableType.String with Double = js.native
    
    /**
      * Vector3
      */
    @js.native
    sealed trait Vector3 extends InspectableType
    /* 2 */ val Vector3: typings.babylonjs.iInspectableMod.InspectableType.Vector3 with Double = js.native
  }
  
  @js.native
  trait IInspectable extends StObject {
    
    /**
      * Gets the label to display
      */
    var label: String = js.native
    
    /**
      * Gets the maximum value of the property when using in "slider" mode
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * Gets the minimum value of the property when using in "slider" mode
      */
    var min: js.UndefOr[Double] = js.native
    
    /**
      * Gets the name of the property to edit
      */
    var propertyName: String = js.native
    
    /**
      * Gets the setp to use when using in "slider" mode
      */
    var step: js.UndefOr[Double] = js.native
    
    /**
      * Gets the type of the editor to use
      */
    var `type`: InspectableType = js.native
  }
  object IInspectable {
    
    @scala.inline
    def apply(label: String, propertyName: String, `type`: InspectableType): IInspectable = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInspectable]
    }
    
    @scala.inline
    implicit class IInspectableMutableBuilder[Self <: IInspectable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setType(value: InspectableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
