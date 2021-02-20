package typings.babylonjs

import typings.babylonjs.anon.Rebuild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialDecoratorMod {
  
  @js.native
  sealed trait PropertyTypeForEdition extends StObject
  @JSImport("babylonjs/Materials/Node/nodeMaterialDecorator", "PropertyTypeForEdition")
  @js.native
  object PropertyTypeForEdition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PropertyTypeForEdition with Double] = js.native
    
    /** property is a boolean */
    @js.native
    sealed trait Boolean extends PropertyTypeForEdition
    /* 0 */ val Boolean: typings.babylonjs.nodeMaterialDecoratorMod.PropertyTypeForEdition.Boolean with Double = js.native
    
    /** property is a float */
    @js.native
    sealed trait Float extends PropertyTypeForEdition
    /* 1 */ val Float: typings.babylonjs.nodeMaterialDecoratorMod.PropertyTypeForEdition.Float with Double = js.native
    
    /** property is a list of values */
    @js.native
    sealed trait List extends PropertyTypeForEdition
    /* 3 */ val List: typings.babylonjs.nodeMaterialDecoratorMod.PropertyTypeForEdition.List with Double = js.native
    
    /** property is a Vector2 */
    @js.native
    sealed trait Vector2 extends PropertyTypeForEdition
    /* 2 */ val Vector2: typings.babylonjs.nodeMaterialDecoratorMod.PropertyTypeForEdition.Vector2 with Double = js.native
  }
  
  @JSImport("babylonjs/Materials/Node/nodeMaterialDecorator", "editableInPropertyPage")
  @js.native
  def editableInPropertyPage(displayName: String): js.Function2[/* target */ js.Any, /* propertyKey */ String, Unit] = js.native
  @JSImport("babylonjs/Materials/Node/nodeMaterialDecorator", "editableInPropertyPage")
  @js.native
  def editableInPropertyPage(
    displayName: String,
    propertyType: js.UndefOr[scala.Nothing],
    groupName: js.UndefOr[scala.Nothing],
    options: IEditablePropertyOption
  ): js.Function2[/* target */ js.Any, /* propertyKey */ String, Unit] = js.native
  @JSImport("babylonjs/Materials/Node/nodeMaterialDecorator", "editableInPropertyPage")
  @js.native
  def editableInPropertyPage(displayName: String, propertyType: js.UndefOr[scala.Nothing], groupName: String): js.Function2[/* target */ js.Any, /* propertyKey */ String, Unit] = js.native
  @JSImport("babylonjs/Materials/Node/nodeMaterialDecorator", "editableInPropertyPage")
  @js.native
  def editableInPropertyPage(
    displayName: String,
    propertyType: js.UndefOr[scala.Nothing],
    groupName: String,
    options: IEditablePropertyOption
  ): js.Function2[/* target */ js.Any, /* propertyKey */ String, Unit] = js.native
  @JSImport("babylonjs/Materials/Node/nodeMaterialDecorator", "editableInPropertyPage")
  @js.native
  def editableInPropertyPage(displayName: String, propertyType: PropertyTypeForEdition): js.Function2[/* target */ js.Any, /* propertyKey */ String, Unit] = js.native
  @JSImport("babylonjs/Materials/Node/nodeMaterialDecorator", "editableInPropertyPage")
  @js.native
  def editableInPropertyPage(
    displayName: String,
    propertyType: PropertyTypeForEdition,
    groupName: js.UndefOr[scala.Nothing],
    options: IEditablePropertyOption
  ): js.Function2[/* target */ js.Any, /* propertyKey */ String, Unit] = js.native
  @JSImport("babylonjs/Materials/Node/nodeMaterialDecorator", "editableInPropertyPage")
  @js.native
  def editableInPropertyPage(displayName: String, propertyType: PropertyTypeForEdition, groupName: String): js.Function2[/* target */ js.Any, /* propertyKey */ String, Unit] = js.native
  @JSImport("babylonjs/Materials/Node/nodeMaterialDecorator", "editableInPropertyPage")
  @js.native
  def editableInPropertyPage(
    displayName: String,
    propertyType: PropertyTypeForEdition,
    groupName: String,
    options: IEditablePropertyOption
  ): js.Function2[/* target */ js.Any, /* propertyKey */ String, Unit] = js.native
  
  @js.native
  trait IEditablePropertyListOption extends StObject {
    
    /** label of the option */
    var label: String = js.native
    
    /** value of the option */
    var value: Double = js.native
  }
  object IEditablePropertyListOption {
    
    @scala.inline
    def apply(label: String, value: Double): IEditablePropertyListOption = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEditablePropertyListOption]
    }
    
    @scala.inline
    implicit class IEditablePropertyListOptionMutableBuilder[Self <: IEditablePropertyListOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IEditablePropertyOption extends StObject {
    
    /** max value */
    var max: js.UndefOr[Double] = js.native
    
    /** min value */
    var min: js.UndefOr[Double] = js.native
    
    /** notifiers: indicates which actions to take when the property is changed */
    var notifiers: js.UndefOr[Rebuild] = js.native
    
    /** list of the options for a variable of type list */
    var options: js.UndefOr[js.Array[IEditablePropertyListOption]] = js.native
  }
  object IEditablePropertyOption {
    
    @scala.inline
    def apply(): IEditablePropertyOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditablePropertyOption]
    }
    
    @scala.inline
    implicit class IEditablePropertyOptionMutableBuilder[Self <: IEditablePropertyOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setNotifiers(value: Rebuild): Self = StObject.set(x, "notifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifiersUndefined: Self = StObject.set(x, "notifiers", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[IEditablePropertyListOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: IEditablePropertyListOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IPropertyDescriptionForEdition extends StObject {
    
    /** display name of the property */
    var displayName: String = js.native
    
    /** group of the property - all properties with the same group value will be displayed in a specific section */
    var groupName: String = js.native
    
    /** options for the property */
    var options: IEditablePropertyOption = js.native
    
    /** name of the property */
    var propertyName: String = js.native
    
    /** type of the property */
    var `type`: PropertyTypeForEdition = js.native
  }
  object IPropertyDescriptionForEdition {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IPropertyDescriptionForEditionMutableBuilder[Self <: IPropertyDescriptionForEdition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: IEditablePropertyOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PropertyTypeForEdition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
