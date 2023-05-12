package typings.datastoreCore

import typings.interfaceDatastore.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Datastore extends StObject {
    
    var datastore: typings.interfaceDatastore.mod.Datastore[
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object
      ]
    
    var prefix: Key
  }
  object Datastore {
    
    inline def apply(
      datastore: typings.interfaceDatastore.mod.Datastore[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object
        ],
      prefix: Key
    ): Datastore = {
      val __obj = js.Dynamic.literal(datastore = datastore.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datastore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Datastore] (val x: Self) extends AnyVal {
      
      inline def setDatastore(
        value: typings.interfaceDatastore.mod.Datastore[
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object
            ]
      ): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: Key): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
}
