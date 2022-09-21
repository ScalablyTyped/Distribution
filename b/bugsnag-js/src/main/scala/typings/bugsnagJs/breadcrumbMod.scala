package typings.bugsnagJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbMod {
  
  @JSImport("bugsnag-js/types/breadcrumb", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Breadcrumb {
    def this(name: String) = this()
    def this(name: String, metaData: js.Object) = this()
    def this(name: String, metaData: js.Object, `type`: String) = this()
    def this(name: String, metaData: Unit, `type`: String) = this()
    def this(name: String, metaData: js.Object, `type`: String, timestamp: String) = this()
    def this(name: String, metaData: js.Object, `type`: Unit, timestamp: String) = this()
    def this(name: String, metaData: Unit, `type`: String, timestamp: String) = this()
    def this(name: String, metaData: Unit, `type`: Unit, timestamp: String) = this()
    
    /* CompleteClass */
    var metaData: js.Object = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var timestamp: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  trait Breadcrumb extends StObject {
    
    var metaData: js.Object
    
    var name: String
    
    var timestamp: String
    
    var `type`: String
  }
  object Breadcrumb {
    
    inline def apply(metaData: js.Object, name: String, timestamp: String, `type`: String): Breadcrumb = {
      val __obj = js.Dynamic.literal(metaData = metaData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Breadcrumb]
    }
    
    extension [Self <: Breadcrumb](x: Self) {
      
      inline def setMetaData(value: js.Object): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
