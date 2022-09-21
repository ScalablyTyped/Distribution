package typings.babylonjs

import typings.babylonjs.anon.ActivatePreviewCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialDecoratorMod {
  
  @JSImport("babylonjs/Materials/Node/nodeMaterialDecorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait PropertyTypeForEdition extends StObject
  @JSImport("babylonjs/Materials/Node/nodeMaterialDecorator", "PropertyTypeForEdition")
  @js.native
  object PropertyTypeForEdition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PropertyTypeForEdition & Double] = js.native
    
    /** property is a boolean */
    @js.native
    sealed trait Boolean
      extends StObject
         with PropertyTypeForEdition
    /* 0 */ val Boolean: typings.babylonjs.nodeMaterialDecoratorMod.PropertyTypeForEdition.Boolean & Double = js.native
    
    /** property is a float */
    @js.native
    sealed trait Float
      extends StObject
         with PropertyTypeForEdition
    /* 1 */ val Float: typings.babylonjs.nodeMaterialDecoratorMod.PropertyTypeForEdition.Float & Double = js.native
    
    /** property is a int */
    @js.native
    sealed trait Int
      extends StObject
         with PropertyTypeForEdition
    /* 2 */ val Int: typings.babylonjs.nodeMaterialDecoratorMod.PropertyTypeForEdition.Int & Double = js.native
    
    /** property is a list of values */
    @js.native
    sealed trait List
      extends StObject
         with PropertyTypeForEdition
    /* 4 */ val List: typings.babylonjs.nodeMaterialDecoratorMod.PropertyTypeForEdition.List & Double = js.native
    
    /** property is a Vector2 */
    @js.native
    sealed trait Vector2
      extends StObject
         with PropertyTypeForEdition
    /* 3 */ val Vector2: typings.babylonjs.nodeMaterialDecoratorMod.PropertyTypeForEdition.Vector2 & Double = js.native
  }
  
  inline def editableInPropertyPage(displayName: String): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
  inline def editableInPropertyPage(displayName: String, propertyType: Unit, groupName: String): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
  inline def editableInPropertyPage(displayName: String, propertyType: Unit, groupName: String, options: IEditablePropertyOption): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
  inline def editableInPropertyPage(displayName: String, propertyType: Unit, groupName: Unit, options: IEditablePropertyOption): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
  inline def editableInPropertyPage(displayName: String, propertyType: PropertyTypeForEdition): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
  inline def editableInPropertyPage(displayName: String, propertyType: PropertyTypeForEdition, groupName: String): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
  inline def editableInPropertyPage(
    displayName: String,
    propertyType: PropertyTypeForEdition,
    groupName: String,
    options: IEditablePropertyOption
  ): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
  inline def editableInPropertyPage(
    displayName: String,
    propertyType: PropertyTypeForEdition,
    groupName: Unit,
    options: IEditablePropertyOption
  ): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
  
  trait IEditablePropertyListOption extends StObject {
    
    /** label of the option */
    var label: String
    
    /** value of the option */
    var value: Double
  }
  object IEditablePropertyListOption {
    
    inline def apply(label: String, value: Double): IEditablePropertyListOption = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEditablePropertyListOption]
    }
    
    extension [Self <: IEditablePropertyListOption](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IEditablePropertyOption extends StObject {
    
    /** max value */
    var max: js.UndefOr[Double] = js.undefined
    
    /** min value */
    var min: js.UndefOr[Double] = js.undefined
    
    /** notifiers: indicates which actions to take when the property is changed */
    var notifiers: js.UndefOr[ActivatePreviewCommand] = js.undefined
    
    /** list of the options for a variable of type list */
    var options: js.UndefOr[js.Array[IEditablePropertyListOption]] = js.undefined
  }
  object IEditablePropertyOption {
    
    inline def apply(): IEditablePropertyOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditablePropertyOption]
    }
    
    extension [Self <: IEditablePropertyOption](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setNotifiers(value: ActivatePreviewCommand): Self = StObject.set(x, "notifiers", value.asInstanceOf[js.Any])
      
      inline def setNotifiersUndefined: Self = StObject.set(x, "notifiers", js.undefined)
      
      inline def setOptions(value: js.Array[IEditablePropertyListOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: IEditablePropertyListOption*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  trait IPropertyDescriptionForEdition extends StObject {
    
    /** display name of the property */
    var displayName: String
    
    /** group of the property - all properties with the same group value will be displayed in a specific section */
    var groupName: String
    
    /** options for the property */
    var options: IEditablePropertyOption
    
    /** name of the property */
    var propertyName: String
    
    /** type of the property */
    var `type`: PropertyTypeForEdition
  }
  object IPropertyDescriptionForEdition {
    
    inline def apply(
      displayName: String,
      groupName: String,
      options: IEditablePropertyOption,
      propertyName: String,
      `type`: PropertyTypeForEdition
    ): IPropertyDescriptionForEdition = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPropertyDescriptionForEdition]
    }
    
    extension [Self <: IPropertyDescriptionForEdition](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: IEditablePropertyOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setType(value: PropertyTypeForEdition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
