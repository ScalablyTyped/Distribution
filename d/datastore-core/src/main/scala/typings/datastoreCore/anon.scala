package typings.datastoreCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Datastore extends StObject {
    
    var datastore: typings.datastoreCore.distSrcMountMod.Datastore
    
    var prefix: typings.datastoreCore.distSrcMountMod.Key
  }
  object Datastore {
    
    inline def apply(
      datastore: typings.datastoreCore.distSrcMountMod.Datastore,
      prefix: typings.datastoreCore.distSrcMountMod.Key
    ): Datastore = {
      val __obj = js.Dynamic.literal(datastore = datastore.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datastore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Datastore] (val x: Self) extends AnyVal {
      
      inline def setDatastore(value: typings.datastoreCore.distSrcMountMod.Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: typings.datastoreCore.distSrcMountMod.Key): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: typings.interfaceDatastore.keyMod.Key
    
    var value: js.typedarray.Uint8Array
  }
  object Key {
    
    inline def apply(key: typings.interfaceDatastore.keyMod.Key, value: js.typedarray.Uint8Array): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: typings.interfaceDatastore.keyMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
