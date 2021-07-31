package typings.backboneLocalstorage

import typings.backboneLocalstorage.mod.backboneAugmentingMod.LocalStorage
import typings.backboneLocalstorage.mod.backboneAugmentingMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object backboneAugmentingMod {
    
    @JSImport("backbone", "LocalStorage")
    @js.native
    class LocalStorage protected () extends StObject {
      def this(name: String) = this()
      def this(name: String, serializer: Serializer) = this()
      
      // Clear localStorage for specific collection.
      def _clear(): Unit = js.native
      
      def _itemName(id: js.Any): String = js.native
      
      def _storageSize(): Double = js.native
      
      // Add a model, giving it a (hopefully)-unique GUID, if it doesn't already
      // have an id of it's own.
      def create(model: js.Any): js.Any = js.native
      
      // Delete a model from `this.data`, returning it.
      def destroy[T](model: T): T = js.native
      
      // Retrieve a model from `this.data` by id.
      def find(model: js.Any): js.Any = js.native
      
      // Return the array of all models currently in storage.
      def findAll(): js.Any = js.native
      
      def localStorage(): js.Any = js.native
      
      var name: String = js.native
      
      var records: js.Array[String] = js.native
      
      def save(): Unit = js.native
      
      var serializer: Serializer = js.native
      
      // Update a model by replacing its copy in `this.data`.
      def update(model: js.Any): js.Any = js.native
    }
    
    trait Serializer extends StObject {
      
      def deserialize(data: js.Any): js.Any
      
      def serialize(item: js.Any): js.Any
    }
    object Serializer {
      
      @scala.inline
      def apply(deserialize: js.Any => js.Any, serialize: js.Any => js.Any): Serializer = {
        val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
        __obj.asInstanceOf[Serializer]
      }
      
      @scala.inline
      implicit class SerializerMutableBuilder[Self <: Serializer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeserialize(value: js.Any => js.Any): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSerialize(value: js.Any => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      }
    }
  }
  
  object global {
    
    /* was `typeof Backbone.LocalStorage` */
    @JSGlobal("Store")
    @js.native
    class Store protected () extends LocalStorage {
      def this(name: String) = this()
      def this(name: String, serializer: Serializer) = this()
    }
  }
}
