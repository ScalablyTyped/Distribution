package typings.classTransformer

import org.scalablytyped.runtime.Instantiable1
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exposeExcludeOptionsMod {
  
  trait Discriminator extends StObject {
    
    var property: String
    
    var subTypes: js.Array[JsonSubType]
  }
  object Discriminator {
    
    @scala.inline
    def apply(property: String, subTypes: js.Array[JsonSubType]): Discriminator = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], subTypes = subTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Discriminator]
    }
    
    @scala.inline
    implicit class DiscriminatorMutableBuilder[Self <: Discriminator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTypes(value: js.Array[JsonSubType]): Self = StObject.set(x, "subTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTypesVarargs(value: JsonSubType*): Self = StObject.set(x, "subTypes", js.Array(value :_*))
    }
  }
  
  trait ExcludeOptions extends StObject {
    
    var toClassOnly: js.UndefOr[Boolean] = js.undefined
    
    var toPlainOnly: js.UndefOr[Boolean] = js.undefined
  }
  object ExcludeOptions {
    
    @scala.inline
    def apply(): ExcludeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludeOptions]
    }
    
    @scala.inline
    implicit class ExcludeOptionsMutableBuilder[Self <: ExcludeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToClassOnly(value: Boolean): Self = StObject.set(x, "toClassOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToClassOnlyUndefined: Self = StObject.set(x, "toClassOnly", js.undefined)
      
      @scala.inline
      def setToPlainOnly(value: Boolean): Self = StObject.set(x, "toPlainOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToPlainOnlyUndefined: Self = StObject.set(x, "toPlainOnly", js.undefined)
    }
  }
  
  trait ExposeOptions extends StObject {
    
    var groups: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var since: js.UndefOr[Double] = js.undefined
    
    var toClassOnly: js.UndefOr[Boolean] = js.undefined
    
    var toPlainOnly: js.UndefOr[Boolean] = js.undefined
    
    var until: js.UndefOr[Double] = js.undefined
  }
  object ExposeOptions {
    
    @scala.inline
    def apply(): ExposeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExposeOptions]
    }
    
    @scala.inline
    implicit class ExposeOptionsMutableBuilder[Self <: ExposeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      @scala.inline
      def setToClassOnly(value: Boolean): Self = StObject.set(x, "toClassOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToClassOnlyUndefined: Self = StObject.set(x, "toClassOnly", js.undefined)
      
      @scala.inline
      def setToPlainOnly(value: Boolean): Self = StObject.set(x, "toPlainOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToPlainOnlyUndefined: Self = StObject.set(x, "toPlainOnly", js.undefined)
      
      @scala.inline
      def setUntil(value: Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
    }
  }
  
  trait JsonSubType extends StObject {
    
    var name: String
    
    var value: Instantiable1[/* args (repeated) */ js.Any, js.Any]
  }
  object JsonSubType {
    
    @scala.inline
    def apply(name: String, value: Instantiable1[/* args (repeated) */ js.Any, js.Any]): JsonSubType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonSubType]
    }
    
    @scala.inline
    implicit class JsonSubTypeMutableBuilder[Self <: JsonSubType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Instantiable1[/* args (repeated) */ js.Any, js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransformOptions extends StObject {
    
    var groups: js.UndefOr[js.Array[String]] = js.undefined
    
    var since: js.UndefOr[Double] = js.undefined
    
    var toClassOnly: js.UndefOr[Boolean] = js.undefined
    
    var toPlainOnly: js.UndefOr[Boolean] = js.undefined
    
    var until: js.UndefOr[Double] = js.undefined
  }
  object TransformOptions {
    
    @scala.inline
    def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    @scala.inline
    implicit class TransformOptionsMutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      @scala.inline
      def setToClassOnly(value: Boolean): Self = StObject.set(x, "toClassOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToClassOnlyUndefined: Self = StObject.set(x, "toClassOnly", js.undefined)
      
      @scala.inline
      def setToPlainOnly(value: Boolean): Self = StObject.set(x, "toPlainOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToPlainOnlyUndefined: Self = StObject.set(x, "toPlainOnly", js.undefined)
      
      @scala.inline
      def setUntil(value: Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
    }
  }
  
  trait TypeHelpOptions extends StObject {
    
    var newObject: js.Any
    
    var `object`: Record[String, js.Any]
    
    var property: String
  }
  object TypeHelpOptions {
    
    @scala.inline
    def apply(newObject: js.Any, `object`: Record[String, js.Any], property: String): TypeHelpOptions = {
      val __obj = js.Dynamic.literal(newObject = newObject.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeHelpOptions]
    }
    
    @scala.inline
    implicit class TypeHelpOptionsMutableBuilder[Self <: TypeHelpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewObject(value: js.Any): Self = StObject.set(x, "newObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: Record[String, js.Any]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeOptions extends StObject {
    
    var discriminator: js.UndefOr[Discriminator] = js.undefined
    
    /**
      * Is false by default.
      */
    var keepDiscriminatorProperty: js.UndefOr[Boolean] = js.undefined
  }
  object TypeOptions {
    
    @scala.inline
    def apply(): TypeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeOptions]
    }
    
    @scala.inline
    implicit class TypeOptionsMutableBuilder[Self <: TypeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiscriminator(value: Discriminator): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
      
      @scala.inline
      def setKeepDiscriminatorProperty(value: Boolean): Self = StObject.set(x, "keepDiscriminatorProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepDiscriminatorPropertyUndefined: Self = StObject.set(x, "keepDiscriminatorProperty", js.undefined)
    }
  }
}
