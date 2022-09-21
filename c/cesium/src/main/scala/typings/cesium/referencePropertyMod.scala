package typings.cesium

import typings.cesium.mod.EntityCollection
import typings.cesium.mod.ReferenceProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referencePropertyMod {
  
  @JSImport("cesium/Source/DataSources/ReferenceProperty", JSImport.Default)
  @js.native
  open class default protected () extends ReferenceProperty {
    def this(targetCollection: EntityCollection, targetId: String, targetPropertyNames: js.Array[String]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/DataSources/ReferenceProperty", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new instance given the entity collection that will
      * be used to resolve it and a string indicating the target entity id and property.
      * The format of the string is "objectId#foo.bar", where # separates the id from
      * property path and . separates sub-properties.  If the reference identifier or
      * or any sub-properties contains a # . or \ they must be escaped.
      * @returns A new instance of ReferenceProperty.
      */
    inline def fromString(targetCollection: EntityCollection, referenceString: String): ReferenceProperty = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(targetCollection.asInstanceOf[js.Any], referenceString.asInstanceOf[js.Any])).asInstanceOf[ReferenceProperty]
  }
}
