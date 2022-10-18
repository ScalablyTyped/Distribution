package typings.babylonjs

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscIInspectableMod {
  
  @js.native
  sealed trait InspectableType extends StObject
  @JSImport("babylonjs/Misc/iInspectable", "InspectableType")
  @js.native
  object InspectableType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InspectableType & Double] = js.native
    
    /**
      * Button
      */
    @js.native
    sealed trait Button
      extends StObject
         with InspectableType
    /* 6 */ val Button: typings.babylonjs.miscIInspectableMod.InspectableType.Button & Double = js.native
    
    /**
      * Checkbox for booleans
      */
    @js.native
    sealed trait Checkbox
      extends StObject
         with InspectableType
    /* 0 */ val Checkbox: typings.babylonjs.miscIInspectableMod.InspectableType.Checkbox & Double = js.native
    
    /**
      * Color3
      */
    @js.native
    sealed trait Color3
      extends StObject
         with InspectableType
    /* 4 */ val Color3: typings.babylonjs.miscIInspectableMod.InspectableType.Color3 & Double = js.native
    
    /**
      * File button
      */
    @js.native
    sealed trait FileButton
      extends StObject
         with InspectableType
    /* 9 */ val FileButton: typings.babylonjs.miscIInspectableMod.InspectableType.FileButton & Double = js.native
    
    /**
      * Options
      */
    @js.native
    sealed trait Options
      extends StObject
         with InspectableType
    /* 7 */ val Options: typings.babylonjs.miscIInspectableMod.InspectableType.Options & Double = js.native
    
    /**
      * Quaternions
      */
    @js.native
    sealed trait Quaternion
      extends StObject
         with InspectableType
    /* 3 */ val Quaternion: typings.babylonjs.miscIInspectableMod.InspectableType.Quaternion & Double = js.native
    
    /**
      * Sliders for numbers
      */
    @js.native
    sealed trait Slider
      extends StObject
         with InspectableType
    /* 1 */ val Slider: typings.babylonjs.miscIInspectableMod.InspectableType.Slider & Double = js.native
    
    /**
      * String
      */
    @js.native
    sealed trait String
      extends StObject
         with InspectableType
    /* 5 */ val String: typings.babylonjs.miscIInspectableMod.InspectableType.String & Double = js.native
    
    /**
      * Tab
      */
    @js.native
    sealed trait Tab
      extends StObject
         with InspectableType
    /* 8 */ val Tab: typings.babylonjs.miscIInspectableMod.InspectableType.Tab & Double = js.native
    
    /**
      * Vector3
      */
    @js.native
    sealed trait Vector3
      extends StObject
         with InspectableType
    /* 2 */ val Vector3: typings.babylonjs.miscIInspectableMod.InspectableType.Vector3 & Double = js.native
  }
  
  trait IInspectable extends StObject {
    
    /**
      * Gets the extensions to accept when using "FileButton" mode.
      * The value should be a comma separated string with the list of extensions to accept e.g., ".jpg, .png, .tga, .dds, .env".
      */
    var accept: js.UndefOr[String] = js.undefined
    
    /**
      * Gets the callback function when using "Button" mode
      */
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Gets the callback function when using "FileButton" mode
      */
    var fileCallback: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.undefined
    
    /**
      * Gets the label to display
      */
    var label: String
    
    /**
      * Gets the maximum value of the property when using in "slider" mode
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * Gets the minimum value of the property when using in "slider" mode
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * Gets the list of options when using "Option" mode
      */
    var options: js.UndefOr[js.Array[IInspectableOptions]] = js.undefined
    
    /**
      * Gets the name of the property to edit
      */
    var propertyName: String
    
    /**
      * Gets the setp to use when using in "slider" mode
      */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * Gets the type of the editor to use
      */
    var `type`: InspectableType
  }
  object IInspectable {
    
    inline def apply(label: String, propertyName: String, `type`: InspectableType): IInspectable = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInspectable]
    }
    
    extension [Self <: IInspectable](x: Self) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setFileCallback(value: /* file */ File => Unit): Self = StObject.set(x, "fileCallback", js.Any.fromFunction1(value))
      
      inline def setFileCallbackUndefined: Self = StObject.set(x, "fileCallback", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOptions(value: js.Array[IInspectableOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: IInspectableOptions*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setType(value: InspectableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IInspectableOptions extends StObject {
    
    /**
      * Defines the visible part of the option
      */
    var label: String
    
    /**
      * Defines if the option should be selected or not
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the value part of the option (returned through the callback)
      */
    var value: Double | String
  }
  object IInspectableOptions {
    
    inline def apply(label: String, value: Double | String): IInspectableOptions = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInspectableOptions]
    }
    
    extension [Self <: IInspectableOptions](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
