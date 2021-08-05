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
    
    inline def apply(property: String, subTypes: js.Array[JsonSubType]): Discriminator = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], subTypes = subTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Discriminator]
    }
    
    extension [Self <: Discriminator](x: Self) {
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setSubTypes(value: js.Array[JsonSubType]): Self = StObject.set(x, "subTypes", value.asInstanceOf[js.Any])
      
      inline def setSubTypesVarargs(value: JsonSubType*): Self = StObject.set(x, "subTypes", js.Array(value :_*))
    }
  }
  
  trait ExcludeOptions extends StObject {
    
    var toClassOnly: js.UndefOr[Boolean] = js.undefined
    
    var toPlainOnly: js.UndefOr[Boolean] = js.undefined
  }
  object ExcludeOptions {
    
    inline def apply(): ExcludeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludeOptions]
    }
    
    extension [Self <: ExcludeOptions](x: Self) {
      
      inline def setToClassOnly(value: Boolean): Self = StObject.set(x, "toClassOnly", value.asInstanceOf[js.Any])
      
      inline def setToClassOnlyUndefined: Self = StObject.set(x, "toClassOnly", js.undefined)
      
      inline def setToPlainOnly(value: Boolean): Self = StObject.set(x, "toPlainOnly", value.asInstanceOf[js.Any])
      
      inline def setToPlainOnlyUndefined: Self = StObject.set(x, "toPlainOnly", js.undefined)
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
    
    inline def apply(): ExposeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExposeOptions]
    }
    
    extension [Self <: ExposeOptions](x: Self) {
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      inline def setToClassOnly(value: Boolean): Self = StObject.set(x, "toClassOnly", value.asInstanceOf[js.Any])
      
      inline def setToClassOnlyUndefined: Self = StObject.set(x, "toClassOnly", js.undefined)
      
      inline def setToPlainOnly(value: Boolean): Self = StObject.set(x, "toPlainOnly", value.asInstanceOf[js.Any])
      
      inline def setToPlainOnlyUndefined: Self = StObject.set(x, "toPlainOnly", js.undefined)
      
      inline def setUntil(value: Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
    }
  }
  
  trait JsonSubType extends StObject {
    
    var name: String
    
    var value: Instantiable1[/* args (repeated) */ js.Any, js.Any]
  }
  object JsonSubType {
    
    inline def apply(name: String, value: Instantiable1[/* args (repeated) */ js.Any, js.Any]): JsonSubType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonSubType]
    }
    
    extension [Self <: JsonSubType](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Instantiable1[/* args (repeated) */ js.Any, js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    inline def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    extension [Self <: TransformOptions](x: Self) {
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      inline def setToClassOnly(value: Boolean): Self = StObject.set(x, "toClassOnly", value.asInstanceOf[js.Any])
      
      inline def setToClassOnlyUndefined: Self = StObject.set(x, "toClassOnly", js.undefined)
      
      inline def setToPlainOnly(value: Boolean): Self = StObject.set(x, "toPlainOnly", value.asInstanceOf[js.Any])
      
      inline def setToPlainOnlyUndefined: Self = StObject.set(x, "toPlainOnly", js.undefined)
      
      inline def setUntil(value: Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
    }
  }
  
  trait TypeHelpOptions extends StObject {
    
    var newObject: js.Any
    
    var `object`: Record[String, js.Any]
    
    var property: String
  }
  object TypeHelpOptions {
    
    inline def apply(newObject: js.Any, `object`: Record[String, js.Any], property: String): TypeHelpOptions = {
      val __obj = js.Dynamic.literal(newObject = newObject.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeHelpOptions]
    }
    
    extension [Self <: TypeHelpOptions](x: Self) {
      
      inline def setNewObject(value: js.Any): Self = StObject.set(x, "newObject", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Record[String, js.Any]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
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
    
    inline def apply(): TypeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeOptions]
    }
    
    extension [Self <: TypeOptions](x: Self) {
      
      inline def setDiscriminator(value: Discriminator): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
      
      inline def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
      
      inline def setKeepDiscriminatorProperty(value: Boolean): Self = StObject.set(x, "keepDiscriminatorProperty", value.asInstanceOf[js.Any])
      
      inline def setKeepDiscriminatorPropertyUndefined: Self = StObject.set(x, "keepDiscriminatorProperty", js.undefined)
    }
  }
}
